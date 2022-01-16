import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountTest {
    private String name;
    private boolean expectedResult;

    public AccountTest(String name, boolean expectedResult) {
        this.name = name;
        this.expectedResult = expectedResult;

    }
    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                //валидное имя
                {"Тимоти Шаламе", true},
                //ноль символов
                {"", false},
                //меньше 3х символов
                {"Т", false},
                //3 символа
                {"Т Ш", true},
                //19 символов
                {"Тииииииимоти Шаламе", true},
                //больше 19 символов
                {"Тиииииииимоти Шаламе", false},
                //больше одного пробела
                {"Тиииииииимоти  Шаламе", false},
                //пробел в начале
                {" Тиииииииимоти Шаламе", false},
                //пробел в конце
                {"Тиииииииимоти Шаламе ", false}
        };
    }
    @Test
    public void shouldCheckName() {
        Account account = new Account(name);
        Assert.assertEquals(expectedResult, account.checkNameToEmboss(name));
    }
}
