package swiggydemo;

import java.util.Iterator;
import java.util.function.BiFunction;

public class RestuarantService {
        //    public Restuarant selectRestuarant(RestuarantList restuarantList, String restuarentName) {
//        for (int i = 0; i < restuarantList.restuarantList.size(); i++) {
//            if (restuarantList.restuarantList.get(i).restuarantName.equals(restuarentName)) {
//                return restuarantList.restuarantList.get(i);
//            }
//        }
//        return null;
//    }
        BiFunction<RestuarantList,String,Restuarant> restuarantBiFunction=(restuarentList, restuarantName)->{
            Iterator<Restuarant> restuarantIterator=restuarentList.restuarantList.iterator();
            for (;restuarantIterator.hasNext();){
                Restuarant restaurant=restuarantIterator.next();
                if (restaurant.restuarantName.equals(restuarantName)){
                    System.out.println(restaurant.restuarantName);
                    return restaurant;
                }
            }
            return null;
        };
}
