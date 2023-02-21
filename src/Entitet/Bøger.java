package Entitet;

public class Bøger {

    private int idbog;
    private String titel;
    private String forfatter;

    public Bøger(int idbog, String titel, String forfatter) {
        this.idbog = idbog;
        this.titel = titel;
        this.forfatter = forfatter;
    }

    public int getIdbog() {
        return idbog;
    }

    public void setIdbog(int idbog) {
        this.idbog = idbog;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getForfatter() {
        return forfatter;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }

    @Override
    public String toString() {
        return "Bøger{" +
                "idbog=" + idbog +
                ", titel='" + titel + '\'' +
                ", forfatter='" + forfatter + '\'' +
                '}';
    }
}
