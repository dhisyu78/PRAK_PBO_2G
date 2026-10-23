package jobsheet9.pegawai;

public class PermanentEmployee extends Employee implements Payable {
    private int salary;

    public PermanentEmployee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Status = Permanent Employee\n";
        info += "Salary = " + salary;
        return info;
    }

    @Override
    public int getPaymentAmount() {
        return salary + 25;
    }
}