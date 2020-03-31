package jp.co.interprism.leaveapp.api.申請;

import jp.co.interprism.leaveapp.domain.カテゴリ.カテゴリ;
import jp.co.interprism.leaveapp.domain.社員.社員;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

import java.text.SimpleDateFormat;
import java.util.Date;


@Getter
@Setter
public class Request {
    private String カテゴリ;
    private int 申請者ID;
    private String 申請日;
    private String 申請期限;


    public カテゴリ StringToカテゴリ(String カテゴリString) {
        return jp.co.interprism.leaveapp.domain.カテゴリ.カテゴリ.valueOf(カテゴリString);
    }

    public 社員 申請者idTo社員(int 社員ID) {
        return 社員.get社員By社員ID(社員ID);
    }

    @SneakyThrows
    public Date 日付に変換(String 日付String) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        return sdf.parse(日付String);
    }
}
