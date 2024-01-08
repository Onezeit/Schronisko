package bdbt_bada_project.SpringApplication;

public class Zwierzeta {
    private Integer Nr_zwierzecia;
    private String Plec;
    private float Waga;
    private float Wzrost;
    private float Dlugosc;
    private String Kolor;
    private Boolean Chip;
    private Integer Wiek;
    private String Gatunek;
    private String Rasa_zwierzecia;
    private String Data_przyjecia;
    private Integer Nr_schroniska;
    private Integer Numer_adopcji;

    public Zwierzeta(){
    }
    public Zwierzeta(Integer Nr_zwierzecia, String Plec, float Waga, float Wzrost, float Dlugosc, String Kolor, Boolean Chip, Integer Wiek, String Gatunek, String Rasa_zwierzecia, String Data_przyjecia, Integer Nr_schroniska, Integer Numer_adopcji) {
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

    public Integer getNr_zwierzecia() {
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

    public Integer getWiek() {
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

    public Integer getNr_schroniska() {
        return Nr_schroniska;
    }

    public Integer getNumer_adopcji() {
        return Numer_adopcji;
    }

    public void setNr_zwierzecia(Integer Nr_zwierzecia) {
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

    public void setWiek(Integer Wiek) {
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

    public void setNr_schroniska(Integer Nr_schroniska) {
        this.Nr_schroniska = Nr_schroniska;
    }

    public void setNumer_adopcji(Integer Numer_adopcji) {
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
