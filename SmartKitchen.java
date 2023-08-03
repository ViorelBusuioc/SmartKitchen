public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public void orderFood() {
        iceBox.orderFood();
    }

    public void doDishes() {
        dishWasher.doDishes();
    }

    public void brewCoffee() {
        brewMaster.brewCoffee();
    }

    public void doKitchenWork() {
        orderFood();
        doDishes();
        brewCoffee();
    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishWasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean setRefrigerator, boolean setDishWasher, boolean setCoffeeMaker) {
        iceBox.setHasWorkToDo(setRefrigerator);
        brewMaster.setHasWorkToDo(setCoffeeMaker);
        dishWasher.setHasWorkToDo(setDishWasher);

    }

    @Override
    public String toString() {
        return "SmartKitchen{" +
                "brewMaster.hasWorkToDo = " + brewMaster.isHasWorkToDo() +
                ", dishWasher.hasWorkToDo = " + dishWasher.isHasWorkToDo() +
                ", iceBox.hasWorkToTo = " + iceBox.isHasWorkToDo() +
                '}';
    }
}
