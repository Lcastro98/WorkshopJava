package Exercise17;

public class Main17 {
    public static void main(String[] args) {
        Appliance appliances[] = new Appliance[10];
        appliances[0] = new WashingMachine(10000D, 5);
        appliances[1] = new WashingMachine(20000D, 9);
        appliances[2] = new WashingMachine(30000D, 20);
        appliances[3] = new WashingMachine();
        appliances[4] = new WashingMachine();
        appliances[5] = new Television(10000D, 4);
        appliances[6] = new Television(124523D, 5);
        appliances[7] = new Television(4534341D, 10);
        appliances[8] = new Television();
        appliances[9] = new Television();

        Double washingMachines = 0D;
        Double televisions = 0D;
        Double allAppliances = 0D;

        for (Appliance appliance: appliances){

            if (appliance instanceof WashingMachine){
                washingMachines += appliance.finalPrice();

            } else if(appliance instanceof Television){
                televisions += appliance.finalPrice();
            }
            allAppliances = washingMachines + televisions;
        }
        System.out.println("Sumatoria precio lavadoras: " + washingMachines);
        System.out.println("Sumatoria precio televisores: " + televisions);
        System.out.println("Sumatoria precio electrodomesticos: " + allAppliances);

    }
}
