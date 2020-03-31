package jp.co.interprism.leaveapp


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import spock.lang.Specification
import spock.lang.Unroll

import static jp.co.interprism.leaveapp.domain.カテゴリ.カテゴリ._休暇
import static jp.co.interprism.leaveapp.infrastructure.承認.承認者固定._承認平野圭一
import static jp.co.interprism.leaveapp.infrastructure.承認.承認者IDリスト固定._承認者IDリスト
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@Unroll
@WebMvcTest
class 休暇申請ApiSpec extends Specification {
    @Autowired
    MockMvc mvc

    static final String apipath = "/leave-app_";

    def "コンパイルエラーちぇっく"() {
        setup:
        def builder = MockMvcRequestBuilders
        when:
        def result = mvc.perform(builder)
        then:
        result.andExpect(status().is4xxClientError())
    }


    def "休暇申請作成のテスト"() {
        setup:
        def builder = MockMvcRequestBuilders
                .get(apipath)

                /* 申請 */
                .param("カテゴリ", _休暇.name())
                .param("申請者ID", _承認平野圭一.get承認者社員ID().toString())
                .param("申請日", 日付string.date20200327.date)
                .param("申請期限", 日付string.date20200430.date)

                /* 休暇 */
                .param("休暇開始日", 日付string.date20200331.date)
                .param("休暇終了日", 日付string.date20200401.date)
                .param("休暇種別", 休暇種別.leave.value)
                .param("事由", "てすと")

                /* 承認 */
                .param("承認者IDリスト", _承認者IDリスト.get承認者IDリスト())

        when:
        def result = mvc.perform(builder)

        then:
        result.andDo(MockMvcResultHandlers.print());
        result.andExpect(status().isOk())

    }

    enum 日付string {
        date20200327("2020/3/27"),
        date20200331("2020/3/31"),
        date20200401("2020/4/1"),
        date20200430("2020/4/30"),
        ;

        日付string(String date) { this.date = date }
        private final String date;
    }

    enum 休暇種別 {
        leave("有給休暇_全休");

        休暇種別(String value) { this.value = value }
        private final String value;
    }

}
