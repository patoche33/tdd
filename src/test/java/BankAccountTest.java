import org.example.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    @Test
    public void TestDeposit(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(5);
        assertEquals(5, bankAccount.getBalance());
    }

    @Test
    public void TestWithdraw(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(2);
        bankAccount.withdraw(2);
        assertEquals(0, bankAccount.getBalance());
    }

    @Test
    public void TestGetBalance(){
        BankAccount bankAccount = new BankAccount();
        assertEquals(0, bankAccount.getBalance());
    }

    @Test
    public void TestWithdrawException(){
        BankAccount bankAccount = new BankAccount();
        assertThrows(IllegalArgumentException.class,()->  bankAccount.withdraw(3));
    }
}
