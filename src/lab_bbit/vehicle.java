package lab_bbit;

enum landVehicle {
    CAR, BUS, LORRY, MACHINERY
}

enum waterVehicle {
    DHOW, FERRY, SHIP
}

enum airVehicle {
    PASSENGER, CARGO
}

class vehicle {

    String manufacturer, capacity, fuelType, vehicleType;
    float fuelAmount;

    vehicle(String m, String c, String f, float amount, String vtype) {
        manufacturer = m;
        capacity = c;
        fuelType = f;
        fuelAmount = amount;
        vehicleType = vtype;
    }

    void display() {
        System.out.println("Vehicle type: " + vehicleType);
        System.out.println("manufacturer: " + manufacturer);
        System.out.println("capacity: " + capacity);
        System.out.println("cost of running: " + fuelAmount + fuelType);
    }

}

class landVehicles extends vehicle {

    String noWheels, fuelUsed;

    public landVehicles(String m, String c, String f, float amount, String vtype, String wheels, String fuel) {
        super(m, c, f, amount, vtype);
        noWheels = wheels;
        fuelUsed = fuel;
    }

    @Override
    void display() {
        super.display();
        System.out.println("fuel used: " + fuelUsed);
        System.out.println("number of wheels: " + noWheels);
    }
}

class airVehicles extends vehicle {

    public airVehicles(String m, String c, String f, float amount, String vtype) {
        super(m, c, f, amount, vtype);
    }

}

class waterVehicles extends vehicle {

    public waterVehicles(String m, String c, String f, float amount, String vtype) {
        super(m, c, f, amount, vtype);
    }
}

class VehicleDemo {

    public static void main(String[] args) {
        landVehicles lVehicles;
        lVehicles = new landVehicles("Benz", "4", "/km", 1000, landVehicle.CAR.toString(), "4", "petrol");
        lVehicles.display();
    }
}

