package students.eugene_trambovich.lesson_6.level_1;

public class NumberUtils {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}

class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEvenTest();
        numberUtilsTest.isOddTest();
    }

    NumberUtils numberUtils = new NumberUtils();

    boolean checkResult(boolean expectedResult, boolean actualResult) {
        return expectedResult == actualResult;
    }

    public void isEvenTest() {
        System.out.println("Test number is even : " + checkResult(true, numberUtils.isEven(4)));
    }

    public void isOddTest() {
        System.out.println("Test number is odd : " + checkResult(false, numberUtils.isEven(5)));
    }
}
