public class Main {

    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen();

//        smartKitchen.addWater();
//        smartKitchen.loadDishWasher();
//        smartKitchen.pourMilk();
        smartKitchen.setKitchenState(true,true,false);
//        smartKitchen.orderFood();
//        smartKitchen.brewCoffee();
//        smartKitchen.doDishes();
        smartKitchen.doKitchenWork();
        System.out.println(smartKitchen);

    }
}
