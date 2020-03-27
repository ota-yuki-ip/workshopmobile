package jp.co.interprism.leaveapp.infrastructure.申請.休暇;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum 休暇ID固定 {
    _休暇ID固定(new 休暇ID(777));

    private final 休暇ID _休暇ID;
}
