package steamsdemo;

public class User {

    public  String name;
    public int age;

    public Address address;


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
