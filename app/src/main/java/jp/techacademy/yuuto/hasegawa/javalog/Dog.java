package jp.techacademy.yuuto.hasegawa.javalog;

/**
 * Created by hasegawayuto on 2017/12/29.
 */
import android.util.Log;

public class Dog extends Animal implements Movable{
    static String to_jp = "犬";

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void introduce() {
        Log.d("javatest", "これは犬クラスです。");
    }

    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }

    @Override
    public void move() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った。");
    }
}
