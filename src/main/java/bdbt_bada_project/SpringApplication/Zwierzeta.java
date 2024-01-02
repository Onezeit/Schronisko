package bdbt_bada_project.SpringApplication;

public class Zwierzeta {
    private int nrZwierzecia;
    private String plec;
    private float waga;
    private float wzrost;
    private float dlugosc;
    private String kolor;
    private int chip;
    private int wiek;
    private String gatunek;
    private String rasaZwierzecia;
    private String dataPrzyjecia;
    private int nrSchroniska;
    private int numerAdopcji;

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
}
