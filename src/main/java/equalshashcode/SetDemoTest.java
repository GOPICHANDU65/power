package equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class SetDemoTest {
    public static void main(String[] args) {
        Set<Car>carSet = new HashSet<>();
        Car car = new Car();
        car.company="BMW";
        Car car1 = new Car();
        car1.company="BMW";
        carSet.add(car);
        carSet.add(car1);
        System.out.println(carSet);
        Address address = new Address();
        Address test = address;
        address.area="kphb";
        address.city="Hyderabad";
        address.pincode="762228";
        address.state="TG";
        address.street="wineshop area";
        Address address1=new Address();
        address1.area="kphb";
        address1.city="Hyderabad";
        address1.pincode="762228";
        address1.state="TG";
        address1.street="wineshop area";
        Set<Address>addressSet=new HashSet<>();
        addressSet.add(address);
        addressSet.add(address1);
        System.out.println(addressSet);
    }
}
