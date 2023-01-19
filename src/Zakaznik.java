public class Zakaznik {
    private String pocetProdeju;
    private String jmeno;

    public Zakaznik(String pocetProdeju, String jmeno) {
        this.pocetProdeju = pocetProdeju;
        this.jmeno = jmeno;
    }
    public void zvysPocetProdeju(int cislo){
        if (cislo>=0){

        }

    }

    public String getPocetProdeju() {
        return pocetProdeju;
    }

    public void setPocetProdeju(String pocetProdeju) {
        this.pocetProdeju = pocetProdeju;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
}
