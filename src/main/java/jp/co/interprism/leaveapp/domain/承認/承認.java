package jp.co.interprism.leaveapp.domain.承認;

import jp.co.interprism.leaveapp.domain.承認.承認者.承認者;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Getter
public class 承認 {
    private final int 申請ID;
    private final int 承認ID;
    private final List<承認者> 承認者リスト;
    private final Date 承認日;
    private final ステータス 申請承認ステータス;
}
