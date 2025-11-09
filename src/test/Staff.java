package test;

public class Staff extends AbstractEmployeeInfo {

    private boolean isActive;

    public Staff(String name, Employee employee) {
        super(name, employee);
        this.isActive = true;
    }

    public void terminate() {
        this.isActive = false;
    }

    public boolean isActive() {
        return isActive;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("재직 상태: " + (isActive ? "재직 중" : "퇴사"));
    }
}
