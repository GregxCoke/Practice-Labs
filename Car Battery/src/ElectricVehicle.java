public class ElectricVehicle {
    private double kilowatHoursInBattery;
    private double maxKilowatHoursInBattery;
    private double kilometersPerKilowatHour;
    private String make;
    private String model;
    private String color;

    public ElectricVehicle(double kilowatHoursInBattery,
                           double maxKilowatHoursInBattery,
                           double kilometersPerKilowatHour,
                           String make,
                           String model,
                           String color) {
        this.kilowatHoursInBattery = kilowatHoursInBattery;
        this.maxKilowatHoursInBattery = maxKilowatHoursInBattery;
        this.kilometersPerKilowatHour = kilometersPerKilowatHour;
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public double getKilowatHoursInBattery() {
        return kilowatHoursInBattery;
    }

    public double getMaxKilowatHoursInBattery() {
        return maxKilowatHoursInBattery;
    }

    public double getKilometersPerKilowatHour() {
        return kilometersPerKilowatHour;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean drive(double kilometers) {
        double maxDistance = kilowatHoursInBattery * kilometersPerKilowatHour;
        if (kilometers <= maxDistance) {
            kilowatHoursInBattery -= kilometers / kilometersPerKilowatHour;
            return true;
        } else {
            return false;
        }

    }
    public boolean charge(double kilowatHoursToCharge) {
        double remainingCapacity = maxKilowatHoursInBattery - kilowatHoursInBattery;
        if (kilowatHoursToCharge <= remainingCapacity) {
            kilowatHoursInBattery += kilowatHoursToCharge;
            return true;
        } else {
            return false;
        }
    }

    }
