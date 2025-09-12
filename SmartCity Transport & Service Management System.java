public class  {
    public static void main(String[] args) {
        
        Bus[] buses = new Bus[2];
        Metro[] metros = new Metro[2];
        Taxi[] taxis = new Taxi[2];
        EVChargingStation[] stations = new EVChargingStation[2];

       
        buses[0] = new Bus("B101", "John");
        buses[1] = new Bus("B102", "Alice");

        
        metros[0] = new Metro("M201", "Robert");
        metros[1] = new Metro("M202", "Emma");

        
        taxis[0] = new Taxi("T301", "David");
        taxis[1] = new Taxi("T302", "Sophia");

       
        stations[0] = new EVChargingStation("EV01", "Downtown");
        stations[1] = new EVChargingStation("EV02", "Airport");

        
        System.out.println("------ Bus Info ------");
        for (Bus b : buses) {
            b.displayInfo();
        }

        System.out.println("\n------ Metro Info ------");
        for (Metro m : metros) {
            m.displayInfo();
        }

        System.out.println("\n------ Taxi Info ------");
        for (Taxi t : taxis) {
            t.displayInfo();
        }

        System.out.println("\n------ EV Charging Station Info ------");
        for (EVChargingStation s : stations) {
            s.displayInfo();
        }
    }
}


interface TransportService {
    void displayInfo();
    void scheduleService(String time);
}


abstract class Vehicle implements TransportService {
    String id;
    String driverName;

    Vehicle(String id, String driverName) {
        this.id = id;
        this.driverName = driverName;
    }
}


class Bus extends Vehicle {
    Bus(String id, String driverName) {
        super(id, driverName);
    }

    public void displayInfo() {
        System.out.println("Bus ID: " + id + ", Driver: " + driverName);
    }

    public void scheduleService(String time) {
        System.out.println("Bus " + id + " scheduled at " + time);
    }
}


class Metro extends Vehicle {
    Metro(String id, String driverName) {
        super(id, driverName);
    }

    public void displayInfo() {
        System.out.println("Metro ID: " + id + ", Driver: " + driverName);
    }

    public void scheduleService(String time) {
        System.out.println("Metro " + id + " scheduled at " + time);
    }
}


class Taxi extends Vehicle {
    Taxi(String id, String driverName) {
        super(id, driverName);
    }

    public void displayInfo() {
        System.out.println("Taxi ID: " + id + ", Driver: " + driverName);
    }

    public void scheduleService(String time) {
        System.out.println("Taxi " + id + " scheduled at " + time);
    }
}


class EVChargingStation implements TransportService {
    String stationId;
    String location;

    EVChargingStation(String stationId, String location) {
        this.stationId = stationId;
        this.location = location;
    }

    public void displayInfo() {
        System.out.println("EV Station ID: " + stationId + ", Location: " + location);
    }

    public void scheduleService(String time) {
        System.out.println("EV Station " + stationId + " available at " + time);
    }
}
