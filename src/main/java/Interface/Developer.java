package Interface;

public class Developer extends Person implements SoftwareEngineer{

    public String toString() {
        String name = "Max";
        return "My name is " + name;
    }

    @Override
    public void writeCode() {
        System.out.println("Here's some code: c++;");
    }
}
