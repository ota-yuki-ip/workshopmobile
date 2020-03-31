package jp.co.interprism.leaveapp.infrastructure.承認;

import jp.co.interprism.leaveapp.domain.社員.社員;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum 承認者IDリスト固定 {
    _承認者IDリスト(new int[]{1, 10});

    private final int[] 承認者IDリスト;


    public List<社員> get承認者リストby承認者IDリスト() {
        List<社員> 承認者リスト = new ArrayList<>();
        for (int id : this.承認者IDリスト) {
            承認者リスト.add(社員.get社員By社員ID(id));
        }
        return 承認者リスト;
    }
}
