package equalshashcode;

public class EqualsHashCodeDemoTest {
    public static void main(String[] args) {
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
        System.out.println(" reflexive start here and end");
        System.out.println(address.equals(test));
        System.out.println(" symmetric start here and end");
        System.out.println(address.equals(address1));
        System.out.println(address1.equals(address));
        System.out.println(address.equals(" "));
        System.out.println("address " +address.hashCode());
        System.out.println("address1 " +address1.hashCode());
    }
}
