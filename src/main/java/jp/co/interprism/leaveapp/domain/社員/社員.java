package jp.co.interprism.leaveapp.domain.社員;

import jp.co.interprism.leaveapp.domain.名前.名前;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
public enum 社員 {
    _青木規彰(new 社員クラス(1, new 名前("青木規彰"))),
    _平野圭一(new 社員クラス(10, new 名前("平野圭一")));

    @Getter
    private final 社員クラス _社員クラス;

    /**
     * IDから社員のデータを取得する（stream利用）
     *
     * @param id
     * @return
     */
    public static 社員 get社員情報By社員ID(int id) {
        return Arrays.stream(社員.values())
                .filter(data -> data.get_社員クラス().get社員ID().equals(id))
                .findFirst()
                .orElse(null);
    }
}
