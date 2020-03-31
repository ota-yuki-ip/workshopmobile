package jp.co.interprism.leaveapp.domain.承認.承認者;

import jp.co.interprism.leaveapp.domain.ID.ID;
import jp.co.interprism.leaveapp.domain.承認.ステータス;
import jp.co.interprism.leaveapp.domain.社員.社員;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class 承認者 {
    private final ID 承認ID;
    private final 社員 社員;
    private final Date 最終更新日;
    private final ステータス 承認者ステータス;
    private final コメント コメント;
}
