package equalshashcode;

public class Address {
    public String street;
    public String pincode;
    public String area;
    public String state;
    public String city;

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", pincode='" + pincode + '\'' +
                ", area='" + area + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println(" Getclass "+ this.getClass());
        if (this==o) {
            return true;
        }
       if (this.getClass() !=o.getClass()) {
           return false;
       }
        Address address = (Address) o;
        return this.street.equals(address.street) &&
                this.pincode.equals(address.pincode)
                && this.area.equals(address.area) &&
                this.state.equals(address.state) &&
                this.city.equals(address.city);
    }
    @Override
    public int hashCode() {
        return   this.area.hashCode()+
                 this.state.hashCode()+
                 this.pincode.hashCode()+
                 this.street.hashCode()+
                 this.city.hashCode();
    }
    }

