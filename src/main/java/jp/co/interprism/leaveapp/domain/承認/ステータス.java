package jp.co.interprism.leaveapp.domain.承認;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ステータス {
    承認中,
    承認,
    非承認;
}
