public class Main{
     
     // instance variables: these are unique for every object that you make 
     private int age;
     private String name;
    
    // we access or update instance variables with the help of this keyword
    public Main(int age, String name)
    {
        this.age=age;
        this.name=name;
    }
    
    public void displayInfo() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public static void main(String[] args)
    {
        Main obj1 = new Main(19,"Kunal");
        Main obj2 = new Main(20,"ABC");
       
       obj1.displayInfo();
       obj2.displayInfo();
       
    }
}