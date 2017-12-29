package jp.techacademy.yuuto.hasegawa.javalog;

import android.util.Log;

/**
 * Created by hasegawayuto on 2017/12/29.
 */

class BigDog extends Dog {
    static String to_jp = "大型犬";

    public BigDog(String name, int age) {
        super(name, age);
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは大型犬クラスです。");
    }
}
