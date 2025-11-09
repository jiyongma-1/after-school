package test;

import java.util.Scanner;

public class TestEmployee2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- 사원 정보 입력 ---");
            System.out.println("프로그램을 종료하려면 0을 입력하세요.");

            System.out.print("사원 이름을 입력하세요: ");
            String name = sc.nextLine().trim();
            if (name.equals("0")) break;

            System.out.println("고용 형태를 선택하세요: (1) 정규직 (2) 계약직 (3) 인턴");
            int typeChoice;
            while (true) {
                System.out.print("선택 (1~3): ");
                if (!sc.hasNextInt()) {
                    sc.nextLine();
                    System.out.println("숫자를 입력하세요.");
                    continue;
                }
                typeChoice = sc.nextInt();
                sc.nextLine();
                if (typeChoice >= 1 && typeChoice <= 3) break;
                System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }

            System.out.print("기본급을 입력하세요: ");
            double baseSalary = sc.nextDouble();

            Employee emp = null;
            switch (typeChoice) {
                case 1:
                    System.out.print("보너스를 입력하세요: ");
                    double bonus = sc.nextDouble();
                    emp = new FullTimeEmployee(baseSalary, bonus);
                    break;
                case 2:
                    emp = new ContractEmployee(baseSalary);
                    break;
                case 3:
                    emp = new InternEmployee(baseSalary);
                    break;
            }

            sc.nextLine();

            Staff staff = new Staff(name, emp);
            System.out.println();
            staff.printInfo();
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
