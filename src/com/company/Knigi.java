package com.company;

public class Knigi {
    private String zaglavie;
    private String avtor;
    private String izdatelstvo;
    private int godinaNaIzdavane;
    private int ISBNnumber;

    public Knigi(){

    }
    public Knigi(String zaglavie, String avtor, String izdatelstvo, int godinaNaIzdavane, int ISBNnumber) {
        this.zaglavie = zaglavie;
        this.avtor = avtor;
        this.izdatelstvo = izdatelstvo;
        this.godinaNaIzdavane = godinaNaIzdavane;
        this.ISBNnumber = ISBNnumber;
    }

    //override toString
    public String toString()
    {
        return zaglavie + " " + avtor + " " + izdatelstvo + " " + godinaNaIzdavane + " " + ISBNnumber;
    }

    //getters and setters

    public String getZaglavie() {return zaglavie; }

    public void setZaglavie(String zaglavie) {this.zaglavie = zaglavie; }

    public String getAvtor() {return avtor; }

    public void setAvtor(String avtor) {this.avtor = avtor; }

    public String getIzdatelstvo() {return izdatelstvo; }

    public void setIzdatelstvo(String izdatelstvo) {this.izdatelstvo = izdatelstvo; }

    public int getGodinaNaIzdavane() {return godinaNaIzdavane; }

    public void setGodinaNaIzdavane(int godinaNaIzdavane) { this.godinaNaIzdavane = godinaNaIzdavane; }

    public int getISBNnumber() {return ISBNnumber; }

    public void setISBNnumber(int ISBNnumber) {this.ISBNnumber = ISBNnumber; }

}
