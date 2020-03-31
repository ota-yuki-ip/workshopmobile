package jp.co.interprism.leaveapp.infrastructure.承認;

import jp.co.interprism.leaveapp.domain.社員.社員;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum 承認者固定 {
    _承認青木規彰(社員._青木規彰),
    _承認平野圭一(社員._平野圭一),
    ;

    private final 社員 _承認者;

    public int get承認者社員ID() {
        return this.get_承認者().get_社員クラス().get社員ID().getID();
    }
}
