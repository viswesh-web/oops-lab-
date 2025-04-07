Class Product { String name; double price; String category; 
Product() { 
this.name = "Unknown"; 
this.price = 0.0; 
this.category "General"; 
Product(String name, double price) { 
this.name name; 
this.price = price; 
this.category "General"; 
Product(String name, double price, String category) { 
} 
this.name = name; 
this.price = price; 
this.category category; 
void display() { 
System.out.println("Product Name: 
System.out.println("Price: $" + price); 
System.out.println("Category: 
+ name); 
+ category); 
public static void main(String[] args) { 
Product p1 = new Product(); 
Product p2 = new Product("Laptop", 1200.50); 
Product p3 = new Product("Smartphone", 800.99, "Electronics"); 
p1.display(); 
p2.display(); p3.display();
