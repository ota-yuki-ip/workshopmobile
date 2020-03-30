package jp.co.interprism.leaveapp

import jp.co.interprism.leaveapp.domain.休暇.種別.休暇種別
import jp.co.interprism.leaveapp.infrastructure.申請.申請ID固定
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import spock.lang.Specification
import spock.lang.Unroll

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@Unroll
@WebMvcTest
class 休暇ApiSpec extends Specification {
    @Autowired
    MockMvc mvc

    static final String apipath = "/leave-app-make";

    def "コンパイルエラーちぇっく"() {
        setup:
        def builder = MockMvcRequestBuilders
        when:
        def result = mvc.perform(builder)
        then:
        result.andExpect(status().is4xxClientError())
    }

    def "休暇作成のテスト"() {
        setup:
        def builder = MockMvcRequestBuilders
                .get(apipath)
                .param("申請ID", 申請ID固定._申請ID固定.get_申請ID().get申請ID().toString())
                .param("休暇開始日", 日付string.date20200327.date)
                .param("休暇終了日", 日付string.date20200331.date)
                .param("休暇種別", 休暇種別.有給休暇_全休.name())
                .param("事由", "てすと" )

        when:
        def result = mvc.perform(builder)

        then:
        result.andDo(MockMvcResultHandlers.print());
        result.andExpect(status().isOk())

    }


    enum 日付string {
        date20200327("2020/3/27"),
        date20200331("2020/3/31"),
        ;

        日付string(String date) { this.date = date }
        private final String date;
    }

}
