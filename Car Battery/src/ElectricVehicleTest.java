import static org.junit.jupiter.api.Assertions.*;

class ElectricVehicleTest {

    @org.junit.jupiter.api.Test
    void drivePass() {
        double expectedAmountInBattery = 90;
        ElectricVehicle tesla = new ElectricVehicle(100,
                100,1,
                "tesla",
                "Y",
                "");
        boolean result = tesla.drive(10);
        double actualKilowatHoursInBattery = tesla.getKilowatHoursInBattery();

        assertTrue(result);
        assertEquals(expectedAmountInBattery, actualKilowatHoursInBattery);

    }

    @org.junit.jupiter.api.Test
    void driveFail() {
        double expectedCharge = 100;
        ElectricVehicle tesla = new ElectricVehicle(100,100,
                1,"","","");
        boolean result = tesla.drive(105);
        double actualChargeInBattery = tesla.getKilowatHoursInBattery();

        assertFalse(result);
        assertEquals(expectedCharge,actualChargeInBattery);
    }


    @org.junit.jupiter.api.Test
    void chargePass() {
        double expectedCharge = 100;
        ElectricVehicle tesla = new ElectricVehicle(0,100,5,
                "","","");

        boolean result = tesla.charge(100);
        double actualChargeInBattery = tesla.getKilowatHoursInBattery();

        assertTrue(result);
        assertEquals(expectedCharge,actualChargeInBattery);
    }

    @org.junit.jupiter.api.Test
    void chargeFail() {
        double expectedCharge = 100;
        ElectricVehicle tesla = new ElectricVehicle(100,100,5,
                "","","");

        boolean result = tesla.charge(100);
        double actualChargeInBattery = tesla.getKilowatHoursInBattery();

        assertFalse(result);
        assertEquals(expectedCharge,actualChargeInBattery);
    }
}