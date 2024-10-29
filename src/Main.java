public class Main {
    public static void main(String[] args) {

        Student student = new Student("Peter", 21, "Male");
        System.out.println("Student Info:");
        student.getName();
        System.out.println("Age: " + student.getAge());
        System.out.println("Gender: " + student.getGender());


        Employee employee = new Employee("Paul", 35, "Male");
        System.out.println("\nEmployee Info:");
        employee.getName();
        System.out.println("Age: " + employee.getAge());
        System.out.println("Gender: " + employee.getGender());
        System.out.println("Years Worked: " + employee.yearsWorked());

    }
}
