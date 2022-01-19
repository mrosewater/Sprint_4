import org.junit.Assert;
import org.junit.Test;

public class AccountNullNameTest {

    private String name;

    @Test(expected = NullPointerException.class)
    public void nullNameShouldReturnException() {
        Account account = new Account(name);
        account.checkNameToEmboss(name);
    }

}
