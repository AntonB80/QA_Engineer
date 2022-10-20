public class Laptop{
    
    public String model;
    public int price;
    public int id;
    public Employee owner;
    
    public Laptop(){};
    
    public Laptop(String model, int price, int id){
        this.model = model;
        this.price = price;
        this.id = id;
    }
    
    public void printInfo(){
        System.out.printf("Model = %s, price = %d, id = %d \n", this.model, this.price, this.id);
    }
    
    public void setOwner(Employee owner) {
        this.owner = owner;
        owner.Laptop = this;
    } 
}