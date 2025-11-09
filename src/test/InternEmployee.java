package test;

public class InternEmployee implements Employee {
    private double baseSalary;

    public InternEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return EmployeeType.INTERN.adjustBaseSalary(baseSalary);
    }

    @Override
    public EmployeeType getEmployeeType() {
        return EmployeeType.INTERN;
    }

    @Override
    public String toString() {
        return "InternEmployee{" +
                "baseSalary=" + baseSalary +
                '}';
    }
}
