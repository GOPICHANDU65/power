package steamsdemo;

import java.util.Date;
import java.util.Objects;

public class AccountDetails {
    public Date transferDate;
    public double Amount;

    public double getAmount() {
        return Amount;
    }

    public Date valueDate;
    public String description;

    public String getTnxType() {
        return tnxType;
    }

    public String tnxType;

    @Override
    public String toString() {
        return "AccountDetails{" +
                "transferDate=" + transferDate +
                ", Amount=" + Amount +
                ", valueDate=" + valueDate +
                ", description='" + description + '\'' +
                ", tnxType='" + tnxType + '\'' +
                '}';
    }

}
