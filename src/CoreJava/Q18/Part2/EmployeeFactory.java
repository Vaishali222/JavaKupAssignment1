package CoreJava.Q18.Part2;

@FunctionalInterface
public interface EmployeeFactory {
    Employee getEmployee(String name, Integer age, String city);
}
