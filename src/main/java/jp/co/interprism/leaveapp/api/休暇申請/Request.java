package jp.co.interprism.leaveapp.api.休暇申請;

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
}
