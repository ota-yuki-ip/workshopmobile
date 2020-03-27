package jp.co.interprism.leaveapp.domain.カテゴリ;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum カテゴリ {
    _休暇(new カテゴリ名("休暇"));

    @Getter
    private final カテゴリ名 _カテゴリ名;
}
