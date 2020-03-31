package jp.co.interprism.leaveapp.infrastructure.承認;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum 承認ID固定 {
    _承認ID固定(new 承認ID(555));

    private final 承認ID _承認ID;
}
