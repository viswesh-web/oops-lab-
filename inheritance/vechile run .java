class Car { 
void drive() { 
System.out.println("Car is moving"); 
} 
} 
class Electriccar extends Car { 
} 
void chargeBattery() { 
System.out.println("Electric car is charging"); 
class Tesla extends ElectricCar { 
} 
void autopilot() { 
System.out.println("Tesla is driving in autopilot mode"); 
public class VehicleDemo { 
public static void main(String[] args) { 
Tesla myTesla = new Tesla(); 
myTesla.drive(); 
myTesla.chargeBattery(); myTesla.autopilot(); 
} 
