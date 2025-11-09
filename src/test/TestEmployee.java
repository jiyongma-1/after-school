package test;

public class TestEmployee {
    public static void main(String[] args) {
//        Employee fullTimeEmployee = new FullTimeEmployee(3000, 500);
//        Employee contractEmployee = new ContractEmployee(2500);
//        Employee internEmployee = new InternEmployee(1500);

        Employee[] employees = {new FullTimeEmployee(3000, 500), new ContractEmployee(2500), new InternEmployee(1500)};

//        System.out.println("FULL_TIME Salary: " + fullTimeEmployee.calculateSalary());
//        System.out.println("CONTRACT Salary: " + contractEmployee.calculateSalary());
//        System.out.println("INTERN Salary: " + internEmployee.calculateSalary());

        for (Employee emp : employees) {
            System.out.println(emp.getEmployeeType() + " Salary: " + emp.calculateSalary());
        }

        System.out.println();

//        System.out.println(fullTimeEmployee.toString());
//        System.out.println(contractEmployee.toString());
//        System.out.println(internEmployee.toString());

        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }

        System.out.println();

        for (Employee emp : employees) {
            if (emp instanceof FullTimeEmployee) {
                System.out.println(emp.getClass().getSimpleName() + " 보너스를 받음: " + ((FullTimeEmployee) emp).getBonus());
            }
        }
    }

}
