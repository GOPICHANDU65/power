package synchronizedblockdemo;

public class Vechicle extends Thread {
    int liters;
    String status;
    String type;
    PetrolStation petrolStation;
    public Vechicle(PetrolStation petrolStation){
        this.petrolStation = petrolStation;
    }

    public Vechicle(int liters, String status, String type, PetrolStation petrolStation) {
        this.liters = liters;
        this.status = status;
        this.type = type;
        this.petrolStation = petrolStation;
    }

    public  void run(){
        if (type.equals("petrol")){
            System.out.println("Vehicle Name  : "+Thread.currentThread().getName());
            petrolStation.synchronizedblockPetrol(Thread.currentThread().getName(), this.liters);
        }else {
            System.out.println("Vehicle Name  : "+Thread.currentThread().getName());
            petrolStation.synchronizedblockDiesel(Thread.currentThread().getName(),this.liters);
        }

    }
}