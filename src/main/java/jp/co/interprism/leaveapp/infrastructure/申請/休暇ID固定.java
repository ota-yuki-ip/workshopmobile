package jp.co.interprism.leaveapp.infrastructure.申請;

import jp.co.interprism.leaveapp.domain.ID.ID;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum 休暇ID固定 {
    _休暇ID固定(new ID(777));

    private final ID _休暇ID;
}
