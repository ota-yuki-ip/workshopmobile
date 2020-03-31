package jp.co.interprism.leaveapp.domain.申請;

import jp.co.interprism.leaveapp.domain.ID.ID;
import jp.co.interprism.leaveapp.domain.カテゴリ.カテゴリ;
import jp.co.interprism.leaveapp.domain.社員.社員;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class 申請 {
    private final ID _申請ID;
    private final カテゴリ _カテゴリ;
    private final 社員 _申請者;
    private final Date _申請日;
    private final Date _申請期限;
}
