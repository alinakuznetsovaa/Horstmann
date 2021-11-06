package Horstmann.chapter3;

public class Employee implements Measurable {

    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }


    public static double average(Measurable[] objects){
        double sum = 0;
        for(int i = 0; i < objects.length; i++)
            sum+=objects[i].getMeasure();

        return sum/objects.length;

    }

    public static Measurable largest(Measurable[] objects){
        Employee employee = (Employee) objects[0];
        Employee tmp;
        for(int i = 1; i < objects.length; i++) {
            tmp = (Employee)objects[i];
            if (employee.getMeasure() < tmp.getMeasure())
                employee = tmp;
        }
        return employee;
    }

    @Override
    public String toString() {
        return "Employee[ " +
                "name = '" + name + '\'' +
                ", salary = " + salary +
                ']';
    }

    public String getName() {
        return name;
    }
}
