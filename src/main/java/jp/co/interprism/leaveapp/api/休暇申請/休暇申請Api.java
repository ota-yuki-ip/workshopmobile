package jp.co.interprism.leaveapp.api.休暇申請;


import jp.co.interprism.leaveapp.domain.カテゴリ.カテゴリ;
import jp.co.interprism.leaveapp.domain.休暇.休暇;
import jp.co.interprism.leaveapp.domain.休暇.種別.休暇種別;
import jp.co.interprism.leaveapp.domain.申請.申請;
import jp.co.interprism.leaveapp.domain.社員.社員;
import jp.co.interprism.leaveapp.infrastructure.申請.申請ID固定;
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

    @RequestMapping(value = "/leave-app_", method = RequestMethod.GET)
    public Map invoke(Request request) {
        Map<String, Object> res = new HashMap<>();


        // 申請のドメイン部分をつくる
        // "申請書"というEntityを作成
        // -> 申請IDが発行されるまでの仮Entity
        // -> 申請IDと申請書でEntityを作成?

        // 承認のドメイン部分をつくる
        // 休暇のドメイン部分をつくる


        /*
         * 申請IDの生成
         */
        int _申請ID = 申請ID固定._申請ID固定.get_申請ID().get申請ID();


        /*
         * 申請
         */

        カテゴリ _カテゴリ = request.getカテゴリ();
        社員 _申請者 = request.get申請者ID();
        Date _申請日 = request.get申請日();
        Date _申請期限 = request.get申請期限();

        申請 _申請 = new 申請(_申請ID, _カテゴリ, _申請者, _申請日, _申請期限);
        request.申請表示(_申請);



        /*
         * 休暇
         */
        Date _休暇開始日 = request.get休暇開始日();
        Date _休暇終了日 = request.get休暇終了日();
        休暇種別 _休暇種別 = request.get休暇種別();
        String _事由 = request.get事由();

        休暇 _休暇 = new 休暇(_申請ID, _休暇開始日, _休暇終了日, _休暇種別, _事由);
        request.休暇表示(_休暇);




        /*
         * 承認
         */

        return res;
    }
}
