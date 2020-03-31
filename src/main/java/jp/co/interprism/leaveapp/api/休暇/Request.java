package jp.co.interprism.leaveapp.api.休暇;

import jp.co.interprism.leaveapp.domain.休暇.休暇;
import jp.co.interprism.leaveapp.domain.休暇.種別.休暇種別;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

import java.text.SimpleDateFormat;
import java.util.Date;

@Setter
@Getter
public class Request {
    private int 申請ID;
    private String 休暇開始日;
    private String 休暇終了日;
    private 休暇種別 休暇種別;
    private String 事由;

    @SneakyThrows
    public Date 日付に変換(String 日付String) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        return sdf.parse(日付String);
    }

    public void フィールド表示(休暇 _休暇) {
        for (Object filed : _休暇.getClass().getFields()) {
            System.out.println(filed);
        }
        System.out.println("===");

        System.out.println("@申請ID");
        System.out.println(_休暇.get_申請ID());
        System.out.println();

        System.out.println("@休暇開始日");
        System.out.println(_休暇.get_休暇開始日());
        System.out.println();

        System.out.println("@休暇終了日");
        System.out.println(_休暇.get_休暇終了日());
        System.out.println();

        System.out.println("@休暇種別");
        System.out.println(_休暇.get_休暇種別());
        System.out.println(_休暇.get_休暇種別().get_休暇種別().get休暇種別());
        System.out.println();

        System.out.println("@事由");
        System.out.println(_休暇.get_事由());
        System.out.println();
    }
}
