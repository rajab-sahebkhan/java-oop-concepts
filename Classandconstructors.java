class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Method
    void introduce() {
        System.out.println("The name of this student is " + name + " and they are " + age + " years old.");
    }
}

public class Classandconstructors {
    public static void main(String[] args){

        //Creating objects
        Student s1 = new Student("Rajab", 23);
        Student s2 = new Student("Sargam", 22);

        //Calling method
        s1.introduce();
        s2.introduce();
    }
}
