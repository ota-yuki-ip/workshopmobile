package jp.co.interprism.leaveapp.domain.休暇;

import jp.co.interprism.leaveapp.domain.ID.ID;
import jp.co.interprism.leaveapp.domain.休暇.種別.休暇種別;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class 休暇 {
    private final ID _申請ID;
    private final Date _休暇開始日;
    private final Date _休暇終了日;
    private final 休暇種別 _休暇種別;
    private final String _事由;
}
