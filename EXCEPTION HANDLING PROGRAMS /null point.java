} 
Example { 
public static void main(String[] args) { 
} 
try { 
String str = null; 
System.out.println(str.length()); 
} catch (NullPointerException e) { 
} 
System.out.println("Cannot access methods on a null object!"); 
} 
}
