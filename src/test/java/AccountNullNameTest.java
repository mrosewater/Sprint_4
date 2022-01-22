import org.junit.Assert;

import org.junit.Test;

public class AccountNullNameTest {

    private String name = null;

    @Test
    public void nullNameShouldReturnException() {
        Account account = new Account(name);
        Assert.assertThrows(NullPointerException.class, () -> account.checkNameToEmboss(name));
    }

}
