package bdbt_bada_project.SpringApplication;

public class Zwierzeta {
    private Integer nrZwierzecia;
    private String plec;
    private float waga;
    private float wzrost;
    private float dlugosc;
    private String kolor;
    private Integer chip;
    private Integer wiek;
    private String gatunek;
    private String rasaZwierzecia;
    private String dataPrzyjecia;
    private Integer nrSchroniska;
    private Integer numerAdopcji;

    public Zwierzeta() {

    }

    public Zwierzeta(int nrZwierzecia, String plec, float waga, float wzrost, float dlugosc, String kolor, int chip, int wiek, String gatunek, String rasaZwierzecia, String dataPrzyjecia, int nrSchroniska, int numerAdopcji) {
        this.nrZwierzecia = nrZwierzecia;
        this.plec = plec;
        this.waga = waga;
        this.wzrost = wzrost;
        this.dlugosc = dlugosc;
        this.kolor = kolor;
        this.chip = chip;
        this.wiek = wiek;
        this.gatunek = gatunek;
        this.rasaZwierzecia = rasaZwierzecia;
        this.dataPrzyjecia = dataPrzyjecia;
        this.nrSchroniska = nrSchroniska;
        this.numerAdopcji = numerAdopcji;
    }

    public int getNrZwierzecia() {
        return nrZwierzecia;
    }

    public String getPlec() {
        return plec;
    }

    public float getWaga() {
        return waga;
    }

    public float getWzrost() {
        return wzrost;
    }

    public float getDlugosc() {
        return dlugosc;
    }

    public String getKolor() {
        return kolor;
    }

    public int getChip() {
        return chip;
    }

    public int getWiek() {
        return wiek;
    }

    public String getGatunek() {
        return gatunek;
    }

    public String getRasaZwierzecia() {
        return rasaZwierzecia;
    }

    public String getDataPrzyjecia() {
        return dataPrzyjecia;
    }

    public int getNrSchroniska() {
        return nrSchroniska;
    }

    public int getNumerAdopcji() {
        return numerAdopcji;
    }

    public void setNrZwierzecia(int nrZwierzecia) {
        this.nrZwierzecia = nrZwierzecia;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public void setWaga(float waga) {
        this.waga = waga;
    }

    public void setWzrost(float wzrost) {
        this.wzrost = wzrost;
    }

    public void setDlugosc(float dlugosc) {
        this.dlugosc = dlugosc;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public void setRasaZwierzecia(String rasaZwierzecia) {
        this.rasaZwierzecia = rasaZwierzecia;
    }

    public void setDataPrzyjecia(String dataPrzyjecia) {
        this.dataPrzyjecia = dataPrzyjecia;
    }

    public void setNrSchroniska(int nrSchroniska) {
        this.nrSchroniska = nrSchroniska;
    }

    public void setNumerAdopcji(int numerAdopcji) {
        this.numerAdopcji = numerAdopcji;
    }

    @Override
    public String toString() {
        return "Zwierzeta{" +
                "nrZwierzecia=" + nrZwierzecia +
                ", plec='" + plec + '\'' +
                ", waga=" + waga +
                ", wzrost=" + wzrost +
                ", dlugosc=" + dlugosc +
                ", kolor='" + kolor + '\'' +
                ", chip=" + chip +
                ", wiek=" + wiek +
                ", gatunek='" + gatunek + '\'' +
                ", rasaZwierzecia='" + rasaZwierzecia + '\'' +
                ", dataPrzyjecia='" + dataPrzyjecia + '\'' +
                ", nrSchroniska=" + nrSchroniska +
                ", numerAdopcji=" + numerAdopcji +
                '}';
    }


}
