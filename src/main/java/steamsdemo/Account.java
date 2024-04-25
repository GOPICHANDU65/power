package steamsdemo;

import java.util.List;
import java.util.Objects;

public class Account {
    public String accountNumber;
    public String ifscCode;
    public double balance;

    public Address address;
    public User user;

    List<AccountDetails>accountDetailsList;

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", balance=" + balance +
                ", address=" + address +
                ", user=" + user +
                ", accountDetailsList=" + accountDetailsList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }



}
