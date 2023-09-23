public class Main{
    //below is static variable also known as a class variable, is a variable that belongs to the class itself rather than to any particular instance (object) of the class. Value of a static variable remains same for all the objects.
    
    public static int count=0;
    
    public  Main()  // constructor
    {
        count++;
    }
    
    public static void main(String[] args)
    {
        Main obj1 = new Main();
        Main obj2 = new Main();
        Main obj3 = new Main();
        
        System.out.print("Number of instance variables: "+Main.count);
    }
}