package steamsdemo;

import java.util.Objects;

public class Address {

    public String doorNo;
    public String street;
    public String pincode;
    public String village;

    @Override
    public String toString() {
        return "Address{" +
                "doorNo='" + doorNo + '\'' +
                ", street='" + street + '\'' +
                ", pincode='" + pincode + '\'' +
                ", village='" + village + '\'' +
                '}';
    }

}