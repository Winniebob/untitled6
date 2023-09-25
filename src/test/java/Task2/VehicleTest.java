package Task2;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testClass(){
        Car car = new Car("Hyundai", "MotoX2", 2006);

        assertTrue(car instanceof Vehicle);
    }
    @Test
    void testNumWheelsCar(){
        Car car = new Car("Hyundai", "MotoX2", 2006);

        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void testNumWheelsMoto(){
        Motorcycle motorcycle = new Motorcycle("Hyundia", "Cherroki",2023);

        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    void testCarSpeed(){
        Car car = new Car("Hyundai", " MotoX23", 2022);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void testMotoSpeed(){
        Motorcycle motorcycle = new Motorcycle("Hyundia", "Cherroki",2023);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }
    @Test
    void testParkingCar(){
        Car car = new Car("Hyundai", " MotoX23", 2022);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
    @Test
    void testParkingMoto(){
        Motorcycle motorcycle = new Motorcycle("Hyundia", "Cherroki",2023);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }


}