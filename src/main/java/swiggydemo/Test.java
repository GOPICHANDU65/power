package swiggydemo;

public class Test {
    public static void main(String[] args) {
        SwiggyService service=new SwiggyService();
        RestuarantList list= service.getRestuarantList();
        RestuarantService restuarantService= new RestuarantService();
        Restuarant getList= restuarantService.restuarantBiFunction.apply(list,"pista House");
        System.out.println(getList);
    }
}
