package jp.co.interprism.leaveapp.api.休暇申請;

import jp.co.interprism.leaveapp.domain.休暇.休暇;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@AllArgsConstructor
public class 休暇申請Api {

    @RequestMapping(value = "/leave-app-make", method = RequestMethod.GET)
    public Map invoke(Request request) {
        Map<String, Object> res = new HashMap<>();

        Date _休暇開始日 = request.日付に変換(request.get休暇開始日());
        Date _休暇終了日 = request.日付に変換(request.get休暇終了日());


        休暇 _休暇 = new 休暇(
                request.get申請ID(),
                _休暇開始日,
                _休暇終了日,
                request.get休暇種別(),
                request.get事由()
        );

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

        return res;
    }
}
