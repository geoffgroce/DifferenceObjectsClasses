package advancedJavaDiscussion1;

//This program is to show the differences between
//classes and objects.

//CLASS:
//A class is a blueprint/template used to create objects
class Pizza {

 //Properties (variables) - define what a Pizza has
 String size;
 String crustType;
 String toppings;

 //Constructor:
 //Used to create and initialize objects
 Pizza(String size, String crustType, String toppings) {
     this.size = size;
     this.crustType = crustType;
     this.toppings = toppings;
 }

 //Method (behavior):
 //Defines what a Pizza can do
 void displayPizza() {
     System.out.println("Pizza Size: " + size);
     System.out.println("Crust Type: " + crustType);
     System.out.println("Toppings: " + toppings);
     System.out.println("--------------------------");
 }
}

//The main class
public class DifferenceOnjectsClasses {

	public static void main(String[] args) {

        //OBJECTS:
        //Objects are instances of a class.
        //They were created using the class "Pizza"

        //Creating object 1 (pizza1)
        Pizza pizza1 = new Pizza("Large", "Thin Crust", "Pepperoni");

        //Creating object 2 (pizza2)
        Pizza pizza2 = new Pizza("Medium", "Stuffed Crust", "Cheese");

        //Creating object 3 (pizza3)
        Pizza pizza3 = new Pizza("Small", "Regular Crust", "Veggies");

        //Each object has its own unique data,
        //but all follow the structure defined by the Pizza class

        //Calling method using objects
        pizza1.displayPizza();
        pizza2.displayPizza();
        pizza3.displayPizza();

        // ============================
        // DIFFERENCE SUMMARY:
        // ============================

        // CLASS:
        // Pizza -> blueprint/template
        // Defines properties (size, crustType, toppings) and behavior (displayPizza)

        // OBJECT:
        // pizza1, pizza2, pizza3 -> real instances created from the class
        // Each object stores its own values

    }
}