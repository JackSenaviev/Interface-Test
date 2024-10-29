public class Employee implements Person {
    private String name;
    private int age;
    private String gender;

    public Employee(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getGender() {
        return gender;
    }

    public int yearsWorked() {
        return Math.max(0, age - 20);
    }

    public void getName() {
        System.out.println("Employee Name: " + name);
    }
}
