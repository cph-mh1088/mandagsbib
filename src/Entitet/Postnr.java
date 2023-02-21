package Entitet;

public class Postnr {

    private int postnr;
    private String byNavn;

    public Postnr(int postnr, String byNavn) {
        this.postnr = postnr;
        this.byNavn = byNavn;
    }

    public int getPostnr() {
        return postnr;
    }

    public void setPostnr(int postnr) {
        this.postnr = postnr;
    }

    public String getByNavn() {
        return byNavn;
    }

    public void setByNavn(String byNavn) {
        this.byNavn = byNavn;
    }

    @Override
    public String toString() {
        return "Postnr{" +
                "postnr=" + postnr +
                ", byNavn='" + byNavn + '\'' +
                '}';
    }
}
