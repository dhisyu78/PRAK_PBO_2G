package jobsheet9.pegawai;

public class ElectricityBill implements Payable {
    private int kwh;
    private String category;

    public ElectricityBill(int kwh, String category) {
        this.kwh = kwh;
        this.category = category;
    }

    @Override
    public int getPaymentAmount() {
        return kwh * 100;
    }

    public String getBillInfo() {
        return "Electricity category = " + category
                + "\nUsage = " + kwh + " kWh"
                + "\nPayment = " + getPaymentAmount();
    }