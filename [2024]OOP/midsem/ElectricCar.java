class Vehicle {
    double speed;
    int capacity;

    public Vehicle(double speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    public void displayInfo() {
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Capacity: " + capacity + " persons");
    }
}

class Car extends Vehicle {
    int number_of_doors;
    String fuel_type;

    public Car(double speed, int capacity, int number_of_doors, String fuel_type) {
        super(speed, capacity);
        this.number_of_doors = number_of_doors;
        this.fuel_type = fuel_type;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + number_of_doors);
        System.out.println("Fuel type: " + fuel_type);
    }
}

class ElectricCar extends Car {
    double battery_capacity;
    double charging_time;

    public ElectricCar(double speed, int capacity, int number_of_doors, String fuel_type, double battery_capacity, double charging_time) {
        super(speed, capacity, number_of_doors, fuel_type);
        this.battery_capacity = battery_capacity;
        this.charging_time = charging_time;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery capacity: " + battery_capacity + " kWh");
        System.out.println("Charging time: " + charging_time + " hours");
    }

    public static void main(String[] args) {
        ElectricCar car1 = new ElectricCar(10, 5, 4, "Diesel", 100, 1.5);
        ElectricCar car2 = new ElectricCar(60, 5, 4, "Petrol", 250, 2);

        System.out.println("Car 1:");
        car1.displayInfo();

        System.out.println("\nCar 2:");
        car2.displayInfo();
    }
}
