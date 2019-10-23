import javax.swing.*;

public class UnderGradDriver {
    public static void main(String[]args) {

        JOptionPane.showInputDialog("Name: ");
        JOptionPane.showInputDialog("Age: ");
        JOptionPane.showInputDialog("Subjects: ");
        JOptionPane.showInputDialog("Category: ");


        String name;
        int age;
        String subjects;
        String category;


        JOptionPane.showMessageDialog("Name: " + name + "\n" +
                                                        "Age: " + age + "\n" +
                                                        "Subjects: " + subjects + "\n" +
                                                        "Category: " + category + "\n" );
    }
}
