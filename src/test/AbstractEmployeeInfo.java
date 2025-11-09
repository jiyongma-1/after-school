package test;

public abstract class AbstractEmployeeInfo {
    private static int idCounter = 100;

    protected String employeeId;
    protected String name;
    protected Employee employee;

    public AbstractEmployeeInfo(String name, Employee employee) {
        this.employeeId = "E" + (++idCounter);
        this.name = name;
        this.employee = employee;
    }

    public void printInfo() {
        System.out.println("[사원정보]");
        System.out.println("사번: " + employeeId);
        System.out.println("이름: " + name);
        System.out.println("고용형태: " + employee.getEmployeeType());
        System.out.println("급여: " + employee.calculateSalary());

        if (employee instanceof FullTimeEmployee) {
            System.out.println("보너스: " + ((FullTimeEmployee) employee).getBonus());
        } else {
            System.out.println("보너스: 없음");
        }
    }

}
