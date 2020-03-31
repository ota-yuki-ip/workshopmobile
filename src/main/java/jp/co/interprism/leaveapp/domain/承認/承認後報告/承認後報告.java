package jp.co.interprism.leaveapp.domain.承認.承認後報告;

import jp.co.interprism.leaveapp.domain.ID.ID;
import jp.co.interprism.leaveapp.domain.社員.社員;
import jp.co.interprism.leaveapp.domain.部署.部署;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class 承認後報告 {
    private final ID 承認ID;
    private final List<社員> 報告先社員リスト;
    private final List<部署> 報告先部署リスト;
}
