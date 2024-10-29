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

    @Override
    public void getInfo() {
        System.out.println("Employee Info:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Years Worked: " + yearsWorked());
    }

    public int yearsWorked() {
        return Math.max(0, age - 20);
    }
}
