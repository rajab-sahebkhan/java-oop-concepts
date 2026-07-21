
// Encapsulation = private data + controlled access

class Students {
    private String name;   // hidden data
    private int age;

    // constructor
    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter (read)
    public String getName() {
        return name;
    }

    // setter (write with control)
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

public class EncapsulationandGettersSetters {
    public static void main(String[] args) {
        Students s = new Students("Rajab", 22);

        s.setAge(25);                 // modify safely preventing bad data by only setting if valid
        System.out.println(s.getName()); // allows reading pvt data
    }
}
