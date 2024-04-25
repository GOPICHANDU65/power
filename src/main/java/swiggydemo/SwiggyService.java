package swiggydemo;

import java.util.ArrayList;
import java.util.List;

public class SwiggyService {
        public RestuarantList getRestuarantList(){
            Restuarant restuarantService=new Restuarant();
            restuarantService.restuarantName="pista House";
            restuarantService.restuarantNo="976543346";
            restuarantService.rating="4.5";

            Dish biriyani=new Dish("Biriyani");
            Dish butterNaans=new Dish("ButterNanns");
            Dish muttonBiriyani=new Dish("MuttonBiriyani");

            List<Dish> PistaHouseDishes=new ArrayList<>();
            PistaHouseDishes.add(biriyani);
            PistaHouseDishes.add(butterNaans);
            PistaHouseDishes.add(muttonBiriyani);
            restuarantService.dishList=PistaHouseDishes;

            Restuarant restuarantService1=new Restuarant();
            restuarantService1.restuarantName="Food plaza";
            restuarantService1.restuarantNo="47567978";
            restuarantService1.rating="4.7";

            Dish chickenBiriyani=new Dish("chickenBiriyani");
            Dish prawnBiriyani=new Dish("prawnBiriyani");
            Dish fishBiriyani=new Dish("fishBiriyani");

            List<Dish>FoodPlazaDish=new ArrayList<>();
            FoodPlazaDish.add(chickenBiriyani);
            FoodPlazaDish.add(prawnBiriyani);
            FoodPlazaDish.add(fishBiriyani);
            restuarantService1.dishList=FoodPlazaDish;

            List<Restuarant>restaurantServices=new ArrayList<>();
            restaurantServices.add(restuarantService);
            restaurantServices.add(restuarantService1);
            RestuarantList restuarantList= new RestuarantList();
            restuarantList.restuarantList=restaurantServices;

            return restuarantList;
        }

}
