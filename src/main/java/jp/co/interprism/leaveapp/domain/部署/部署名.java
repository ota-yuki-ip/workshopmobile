package jp.co.interprism.leaveapp.domain.部署;

import jp.co.interprism.leaveapp.domain.ID.ID;
import jp.co.interprism.leaveapp.domain.名前.名前;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class 部署名 {
    private final ID 部署ID;
    private final 名前 部署名;
}
