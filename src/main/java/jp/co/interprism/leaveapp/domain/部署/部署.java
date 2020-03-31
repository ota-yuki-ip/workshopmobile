package jp.co.interprism.leaveapp.domain.部署;

import jp.co.interprism.leaveapp.domain.ID.ID;
import jp.co.interprism.leaveapp.domain.名前.名前;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum 部署 {
    経理部(new 部署名(new ID(1), new 名前("経理部"))),
    総務部(new 部署名(new ID(2), new 名前("総務部"))),
    管理部_社内(new 部署名(new ID(3), new 名前("管理部(社内)"))),
    管理部_役所(new 部署名(new ID(4), new 名前("管理部(役所)"))),
    インフラ(new 部署名(new ID(5), new 名前("インフラ"))),
    ブログ(new 部署名(new ID(6), new 名前("ブログ")));

    private final 部署名 部署名;

    /**
     * IDから部署のデータを取得する（stream利用）
     *
     * @param id int
     * @return 部署
     */
    public static 部署 get部署by部署ID(int id) {
        return Arrays.stream(部署.values())
                .filter(data -> data.get部署名().get部署ID().getID().equals(id))
                .findFirst()
                .orElse(null);
    }
}
