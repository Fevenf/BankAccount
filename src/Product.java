public class Product {
//the product cost, the quantity of product to purchase, and 
//the product name. Create a constructor that can accept all 3 attributes as the parameters.
    public double cost;
    public int quantity;
    public String name;



    public Product(Double cost, int quantity, String name){
        this.cost = cost;
        this.quantity = quantity;
        this.name = name;
    
    }

    // //A totalCost() method that prints the total cost when multiple products are purchased.
    public double totalCost(){
        double tcost;
        tcost = quantity * cost;
        System.out.println(" Total cost is " + tcost);
        return (tcost);
        
        
    }

    //A printProduct() method that prints how much one unit of the product costs and how many units were purchased.
    public void printProduct(){
        System.out.println(this.name + " costs " + this.cost + "  and " + this.quantity + " units were purchased ");
       
    }

}