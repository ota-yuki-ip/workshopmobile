package jp.co.interprism.leaveapp.api.休暇申請;

import jp.co.interprism.leaveapp.domain.カテゴリ.カテゴリ;
import jp.co.interprism.leaveapp.domain.休暇.休暇;
import jp.co.interprism.leaveapp.domain.休暇.種別.休暇種別;
import jp.co.interprism.leaveapp.domain.申請.申請;
import jp.co.interprism.leaveapp.domain.社員.社員;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

import java.text.SimpleDateFormat;
import java.util.Date;


@Getter
@Setter
public class Request {
    // 申請書

    /*
     * 申請
     */
    private String カテゴリ;
    private int 申請者ID;
    private String 申請日;
    private String 申請期限;

    /*
     * 休暇
     */
    private String 休暇開始日;
    private String 休暇終了日;
    private String 休暇種別;
    private String 事由;
//
//    /*
//     * 承認
//     */
//    private String _承認者IDリスト;
//    private String _承認日;
//
//    /*
//     * 承認後報告
//     */
////    private String _承認者IDリスト;
//    private String _部署IDリスト;
//
//
//
    /*  メソッド  */

    /*
     * 申請
     */
    public カテゴリ getカテゴリ(){
        return 文字列からカテゴリの作成(this.カテゴリ);
    }
    public カテゴリ 文字列からカテゴリの作成(String カテゴリ) {
        return jp.co.interprism.leaveapp.domain.カテゴリ.カテゴリ.valueOf(カテゴリ);
    }

    public 社員 get申請者ID(){
        return get社員by社員ID(this.申請者ID);
    }

    public Date get申請日(){
        return 日付に変換(this.申請日);
    }

    public Date get申請期限(){
        return 日付に変換(this.申請期限);
    }


    /*
     * 休暇
     */
    public Date get休暇開始日(){
        return 日付に変換(this.休暇開始日);
    }
    public Date get休暇終了日(){
        return 日付に変換(this.休暇終了日);
    }

    public 休暇種別 get休暇種別(){
        return 文字列から休暇種別の作成(this.休暇種別);
    }
    public 休暇種別 文字列から休暇種別の作成(String 休暇種別) {
        return jp.co.interprism.leaveapp.domain.休暇.種別.休暇種別.valueOf(休暇種別);
    }


//    /*
//     * 承認
//     */
//    private String _承認者IDリスト;
//    private String _承認日;
//
//    /*
//     * 承認後報告
//     */
////    private String _承認者IDリスト;
//    private String _部署IDリスト;



    public 社員 get社員by社員ID(int id) {
        return 社員.get社員By社員ID(id);
    }

    @SneakyThrows
    public Date 日付に変換(String 日付String) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        return sdf.parse(日付String);
    }

//    public List<社員> get承認者リストby承認者IDリスト() {
//        List<社員> 承認者リスト = new ArrayList<>();
//        for (int id : this.承認者IDリスト) {
//            承認者リスト.add(社員.get社員By社員ID(id));
//        }
//        return 承認者リスト;
//    }

    /*
     * 〇〇表示
     */
    public void 申請表示(申請 _申請){
        System.out.println("===============");
        System.out.println("申請ID(固定値) " + _申請.get_申請ID());
        System.out.println("カテゴリ       " + _申請.get_カテゴリ().get_カテゴリ名().getカテゴリ());
        System.out.println("申請者社員ID   " + _申請.get_申請者().get_社員クラス().get社員ID());
        System.out.println("申請者社員名   " + _申請.get_申請者().get_社員クラス().get社員名().get_名前());
        System.out.println("申請日         " + _申請.get_申請日());
        System.out.println("申請期限       " + _申請.get_申請期限());
        System.out.println("===============");
    }

    public void 休暇表示(休暇 _休暇){

        System.out.println("===============");
        System.out.println("申請ID(固定値) " + _休暇.get_申請ID());
        System.out.println("休暇開始日     " + _休暇.get_休暇開始日());
        System.out.println("休暇終了日     " + _休暇.get_休暇終了日());
        System.out.println("休暇種別       " + _休暇.get_休暇種別());
        System.out.println("事由          " + _休暇.get_事由());
        System.out.println("===============");
    }
}
