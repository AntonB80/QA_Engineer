public class Person {
    
    public String name;
    public int age;
    public String sex;


   public Person() {};

   public Person(String name) {
       this.name = name;
   }
   
   public Person(String name, int age) {
       this.name = name;
       if(age <= 0){
           this.age = 18;
       }
       else {
           this.age = age;
       }
   }
   
   public Person(String name, int age, String sex) {
       this.name = name;
       
       if(age <= 0){
           this.age = 18;
       }
       else {
           this.age = age;
       }
       
       if((sex == "male") || (sex == "female")) {
           this. sex = sex;
       }
       else {
           this.sex = null;
       }
   }
   
   public void setAge (int age){
        
        if(age <= 0){
           this.age = 18;
       }
       else {
           this.age = age;
       }
   }
   
   public int getAge(){
       return this.age;
   }
   
   public void print(){
       System.out.printf("Name = %s, age = %d, sex = %s \n", this.name, this.age, this.sex);
   }
    
}