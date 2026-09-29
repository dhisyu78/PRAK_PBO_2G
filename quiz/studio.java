package quiz;

public class studio {
    
    private String namaStudio;
    private double Tarifsewaperjam;

    public studio(String namaStudio, double Tarifsewaperjam) {
        this.namaStudio = namaStudio;
        this.Tarifsewaperjam = Tarifsewaperjam;
    }

    public String getNamaStudio() {
        return namaStudio;
    }

    public double getTarifsewaperjam() {
        return Tarifsewaperjam;
    }

    public void setNamaStudio(String namaStudio) {
        this.namaStudio = namaStudio;
    }

    public void setTarifsewaperjam(double Tarifsewaperjam) {
        this.Tarifsewaperjam = Tarifsewaperjam;
    }

    public void tampilkanInfoStudio() {
        System.out.println("Nama Studio: " + namaStudio);
        System.out.println("Tarif Sewa per Jam: " + Tarifsewaperjam);
    }

}
