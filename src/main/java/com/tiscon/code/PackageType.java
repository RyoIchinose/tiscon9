package com.tiscon.code;

/**
 * 荷物の種類コード。
 *
 * @author Oikawa Yumi
 */
public enum PackageType implements CodeEnum {

    /** 段ボール */
    BOX(1, "段ボール"),
    /** ベッド */
    BED(2, "ベッド"),
    /** 自転車 */
    BICYCLE(3, "自転車"),
    /** 洗濯機 */
    WASHING_MACHINE(4, "洗濯機"),
     /**  セミダブルベッド*/
     BED2(5, "セミダブルベッド"),
     /** ダブルベッド */
     BED3(6, "ダブルベッド"),
     /** ダブルベッド */
     TABLE(7, "ダイニングテーブル");
   
   

    /** 荷物のラベル */
    private final String label;
    /** 荷物のラベルのコード */
    private final int code;

    /**
     * コンストラクタ。
     *
     * @param code  コード値
     * @param label ラベル
     */
    PackageType(int code, String label) {
        this.label = label;
        this.code = code;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public int getCode() {
        return code;
    }
}
