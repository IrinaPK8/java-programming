package day53_inheritance.final_keyword;

public final class TestData {
            // TestData class as a list of Constants
            // values of below variables cannot be changed
    public static final String ADMIN_USERNAME = "admin";
    public static final String ADMIN_PASSWORD = "123";
    public static final int MAX_WAIT_TIME = 60;
    public static final boolean STOP_IF_FAIL = true;
}

        /* class Child extends TestData {
               CANNOT EXTEND/INHERIT FROM FINAL CLASS
        }*/
