// Person class
class Person {
    private String name;
    private int age;
    private String address;
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter for age
    public int getAge() {
        return age;
    }
    
    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
    
    // Getter for address
    public String getAddress() {
        return address;
    }
    
    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }
}


public class Ques3 {
    public static void main(String[] args) {
  
        Person person = new Person();
        
        person.setName("John Doe");
        person.setAge(25);
        person.setAddress("123 Main Street");
        
       
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}

