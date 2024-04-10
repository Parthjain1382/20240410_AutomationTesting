package Aspire;

public class Pojo {
    private String name;
    private int age;

    public Pojo(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public static void main(String[] args) {
        // Main method implementation
        Pojo pojo = new Pojo("Pranay", 21);
        System.out.println("Name: " + pojo.getName());
        System.out.println("Age: " + pojo.getAge());
    }
}
