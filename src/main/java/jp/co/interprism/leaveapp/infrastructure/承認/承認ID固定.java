package jp.co.interprism.leaveapp.infrastructure.承認;

import jp.co.interprism.leaveapp.domain.ID.ID;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum 承認ID固定 {
    _承認ID固定(new ID(555));

    private final ID _承認ID;
}
