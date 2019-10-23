public class Categorizable {

    private String name;
    private int age;
    private String subjects;
    private String Category;
    private String supervisor;



    public void Student(String n, int a) {
         name = n;
         age = a;
    }

    public void PostGrad(String n, int a) {
        name = n;
        age = a;
    }

    public void UnderGrad(String n, int a) {
        name = n;
        age = a;
    }

    public Categorizable(String n, int a) {
        name = n;
        age = a;
    }

    //Mutator Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public void setCategory(String category) {
        this.Category = category;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public Categorizable(String name, int age, String subjects, String category, String supervisor) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
        this.Category = category;
        this.supervisor = supervisor;
    }


    //Accessor Methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSubjects() {
        return subjects;
    }

    public String getSupervisor() {
        return supervisor;

}
}