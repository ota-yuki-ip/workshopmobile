package jp.co.interprism.leaveapp.domain.部署;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum 部署 {
    経理部(new 部署名("経理部")),
    総務部(new 部署名("総務部")),
    管理部_社内(new 部署名("管理部(社内)")),
    管理部_役所(new 部署名("管理部(役所)")),
    インフラ(new 部署名("インフラ")),
    ブログ(new 部署名("ブログ"));

    @Getter
    private final 部署名 部署名;
}
