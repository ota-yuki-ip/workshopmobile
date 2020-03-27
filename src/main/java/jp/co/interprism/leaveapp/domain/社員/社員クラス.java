package jp.co.interprism.leaveapp.domain.社員;

import jp.co.interprism.leaveapp.domain.名前.名前;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class 社員クラス {
    private final Integer 社員ID;
    private final 名前 社員名;
}
