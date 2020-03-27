package jp.co.interprism.leaveapp.infrastructure.申請;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum 申請ID固定 {
    // _青木規彰(new 社員名(1, new 名前("青木規彰")));
    _申請ID固定(new 申請ID(999));

    @Getter
    private final 申請ID _申請ID;
}
