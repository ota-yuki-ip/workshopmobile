package jp.co.interprism.leaveapp.api.休暇;

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
public class 休暇Api {

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
        request.フィールド表示(_休暇);

        return res;
    }
}
