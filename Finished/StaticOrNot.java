package Finished;
/*
Утильный калькулятор
*/

public class StaticOrNot {

    public static int staticVOne;
    public int nonStaticVOne;

    static void staticOne() {
    StaticOrNot staticOrNot = new StaticOrNot();
    staticOrNot.nonStaticOne();
    }

    static void staticTwo() {

    }

    void nonStaticOne() {
    nonStaticVOne++;
    }

    void nonStaticTwo() {

    }
}

