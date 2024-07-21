//Class representing person
public class Person {
    //Variable declaration
    String name;
    int age;
    String address;
    
    //Create constructor
    Person(String name, int age, String address)
    {
       this.name = name;
       this.age = age;
        this.address = address;      
    }
    //Creating method for persons details
    public void personDetails(){
        System.out.println("Name is: " +name);
        System.out.println("Age is: " +age);
        System.out.println("Address is: " +address);
    } 
    
    //pass the current instance of object
    public static void printCurrentInstance(Person person)
    {
        person.personDetails();
    }
    
    //Methods that accepts a persons object and calls the print CurrentInstance
    public void myDetails(Person person){
        printCurrentInstance(person);
    }
    //Main method that calls the method myDetails
    public static void main(String[]args){
        //Create details with Agnes Linda's details
        Person recobj = new Person("Agnes Linda", 19, "Kiambu201");
    //Create objects and call myDetails method
    recobj.myDetails(recobj);
}
}