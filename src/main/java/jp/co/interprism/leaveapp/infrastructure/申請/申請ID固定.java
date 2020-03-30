package jp.co.interprism.leaveapp.infrastructure.申請;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum 申請ID固定 {
    _申請ID固定(new 申請ID(999));

    @Getter
    private final 申請ID _申請ID;
}
