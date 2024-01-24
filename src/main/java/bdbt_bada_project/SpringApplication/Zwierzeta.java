package bdbt_bada_project.SpringApplication;

public class Zwierzeta {
    private int Nr_zwierzecia;
    private String Plec;
    private float Waga;
    private float Wzrost;
    private float Dlugosc;
    private String Kolor;
    private Boolean Chip;
    private int Wiek;
    private String Gatunek;
    private String Rasa_zwierzecia;
    private String Data_przyjecia;
    private int Nr_schroniska;
    private int Numer_adopcji;

    public Zwierzeta(){
    }
    public Zwierzeta(int Nr_zwierzecia, String Plec, float Waga, float Wzrost, float Dlugosc, String Kolor, Boolean Chip, int Wiek, String Gatunek, String Rasa_zwierzecia, String Data_przyjecia, int Nr_schroniska, int Numer_adopcji) {
        this.Nr_zwierzecia = Nr_zwierzecia;
        this.Plec = Plec;
        this.Waga = Waga;
        this.Wzrost = Wzrost;
        this.Dlugosc = Dlugosc;
        this.Kolor = Kolor;
        this.Chip = Chip;
        this.Wiek = Wiek;
        this.Gatunek = Gatunek;
        this.Rasa_zwierzecia = Rasa_zwierzecia;
        this.Data_przyjecia = Data_przyjecia;
        this.Nr_schroniska = Nr_schroniska;
        this.Numer_adopcji = Numer_adopcji;
    }

    public int getNr_zwierzecia() {
        return Nr_zwierzecia;
    }

    public String getPlec() {
        return Plec;
    }

    public float getWaga() {
        return Waga;
    }

    public float getWzrost() {
        return Wzrost;
    }

    public float getDlugosc() {
        return Dlugosc;
    }

    public String getKolor() {
        return Kolor;
    }

    public Boolean getChip() {
        return Chip;
    }

    public int getWiek() {
        return Wiek;
    }

    public String getGatunek() {
        return Gatunek;
    }

    public String getRasa_zwierzecia() {
        return Rasa_zwierzecia;
    }

    public String getData_przyjecia() {
        return Data_przyjecia;
    }

    public int getNr_schroniska() {
        return Nr_schroniska;
    }

    public int getNumer_adopcji() {
        return Numer_adopcji;
    }

    public void setNr_zwierzecia(int Nr_zwierzecia) {
        this.Nr_zwierzecia = Nr_zwierzecia;
    }

    public void setPlec(String Plec) {
        this.Plec = Plec;
    }

    public void setWaga(float Waga) {
        this.Waga = Waga;
    }

    public void setWzrost(float Wzrost) {
        this.Wzrost = Wzrost;
    }

    public void setDlugosc(float Dlugosc) {
        this.Dlugosc = Dlugosc;
    }

    public void setKolor(String Kolor) {
        this.Kolor = Kolor;
    }

    public void setChip(Boolean Chip) {
        this.Chip = Chip;
    }

    public void setWiek(int Wiek) {
        this.Wiek = Wiek;
    }

    public void setGatunek(String Gatunek) {
        this.Gatunek = Gatunek;
    }

    public void setRasa_zwierzecia(String Rasa_zwierzecia) {
        this.Rasa_zwierzecia = Rasa_zwierzecia;
    }

    public void setData_przyjecia(String Data_przyjecia) {
        this.Data_przyjecia = Data_przyjecia;
    }

    public void setNr_schroniska(int Nr_schroniska) {
        this.Nr_schroniska = Nr_schroniska;
    }

    public void setNumer_adopcji(int Numer_adopcji) {
        this.Numer_adopcji = Numer_adopcji;
    }

    @Override
    public String toString() {
        return "Zwierzeta{" +
                "Nr_zwierzecia=" + Nr_zwierzecia +
                ", Plec='" + Plec + '\'' +
                ", Waga=" + Waga +
                ", wzrost=" + Wzrost +
                ", dlugosc=" + Dlugosc +
                ", kolor='" + Kolor + '\'' +
                ", chip=" + Chip +
                ", wiek=" + Wiek +
                ", gatunek='" + Gatunek + '\'' +
                ", Rasa_zwierzecia='" + Rasa_zwierzecia + '\'' +
                ", Data_przyjecia='" + Data_przyjecia + '\'' +
                ", Nr_schroniska=" + Nr_schroniska +
                ", Numer_adopcji=" + Numer_adopcji +
                '}';
    }
}
