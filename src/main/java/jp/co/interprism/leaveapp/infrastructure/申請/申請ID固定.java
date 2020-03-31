package jp.co.interprism.leaveapp.infrastructure.申請;

import jp.co.interprism.leaveapp.domain.ID.ID;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum 申請ID固定 {
    _申請ID固定(new ID(999));

    @Getter
    private final ID _申請ID;
}
