Dops > 
VehicleMain.java 
class Vehicle { 
void fuelType() { 
System.out.println("Most vehicles use fuel."); 
} 
} 
class Petrolcar extends Vehicle { 
void fuelType() { 
System.out.println("This car uses Petrol."); 
} 
} 
class Electriccar extends Vehicle { 
void fuelType() { 
System.out.println("This car is Electric and uses a battery."); 
} 
} 
public class VehicleMain { 
public static void main(String[] args) { 
Vehicle v1 = new PetrolCar(); 
Vehicle v2 = new ElectricCar(); 
v1.fuelType(); 
v2.fuelType(); 
} 
}
