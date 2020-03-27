package jp.co.interprism.leaveapp.api.申請;

import jp.co.interprism.leaveapp.infrastructure.申請.申請ID固定;
import jp.co.interprism.leaveapp.domain.カテゴリ.カテゴリ;
import jp.co.interprism.leaveapp.domain.申請.申請;
import jp.co.interprism.leaveapp.domain.社員.社員;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@AllArgsConstructor
public class 申請Api {
    @RequestMapping(value = "/leave-app-init-make", method = RequestMethod.GET)
    public Map invoke(Request request) {
        Map<String, Object> res = new HashMap<>();


        int _申請ID = 申請ID固定._申請ID固定.get_申請ID().get申請ID();
        カテゴリ _カテゴリ = request.StringToカテゴリ(request.getカテゴリ());
        社員 _社員 = request.申請者idTo社員(request.get申請者ID());
        Date _申請日 = request.日付に変換(request.get申請日());
        Date _申請期限 = request.日付に変換(request.get申請期限());

        申請 _申請 = new 申請(
                _申請ID,
                _カテゴリ,
                _社員,
                _申請日,
                _申請期限
        );

        System.out.println("@申請ID");
        System.out.println(_申請.get_申請ID());
        System.out.println();

        System.out.println("@カテゴリ");
        System.out.println(_申請.get_カテゴリ());
//        System.out.println(_申請.get_カテゴリ().get_カテゴリ名());
//        System.out.println(_申請.get_カテゴリ().get_カテゴリ名().toString());
        System.out.println(_申請.get_カテゴリ().get_カテゴリ名().getカテゴリ());
        System.out.println();

        System.out.println("@申請者");
        System.out.println(_申請.get_申請者());
        System.out.println(_申請.get_申請者().get_社員クラス().get社員ID());
        System.out.println(_申請.get_申請者().get_社員クラス().get社員名().get_名前());
        System.out.println();

        System.out.println("@申請日");
        System.out.println(_申請.get_申請日());
        System.out.println();

        System.out.println("@申請期限");
        System.out.println(_申請.get_申請期限());

        return res;
    }

}
