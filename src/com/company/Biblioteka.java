package com.company;

import java.util.List;

public class Biblioteka {
    private String name;
    private List<Knigi> nalichniKnigi;

    //ctor
    public Biblioteka(){
    }

    public Biblioteka(String name, List<Knigi> nalichniKnigi) {
        this.name = name;
        this.nalichniKnigi = nalichniKnigi;
    }

    public Biblioteka (String name){
        this.name = name;
    }

    //dobavq kniga
    public void AddKniga(String ime, String avtor, String izdatelstvoto, int godina, int ISBN) {
        Knigi kniga = new Knigi(ime, avtor, izdatelstvoto, godina, ISBN);
        nalichniKnigi.add(kniga);
    }

    //izvajda info za knigi
    public void DaiInfoZaKnigi(){
        for (Object kniga: nalichniKnigi) {
            System.out.println(kniga.toString());
        }
    }

    //tursi kniga po avtor
    public void SearchForKniga(String avtor){
        for (Knigi kniga: nalichniKnigi){
            if (kniga.getAvtor().equals(avtor)){
                System.out.println(kniga.toString());
            }
        }
    }

    //po sushtiq nachin izvejdame info za dadena kniga po drugi kriterii

    //iztrivane na kniga
    public void DeleteKniga(String name, String avtor, int ISBN){
        for (int i = 0; i < nalichniKnigi.size(); i++) {
             if (nalichniKnigi.get(i).getAvtor().equals(avtor) &&
                 nalichniKnigi.get(i).getZaglavie().equals(avtor) &&
                 nalichniKnigi.get(i).getISBNnumber() == ISBN){
                 nalichniKnigi.remove(i);
             }

        }
    }



    //get & set
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<Knigi> getNalichniKnigi() { return nalichniKnigi; }

    public void setNalichniKnigi(List<Knigi> nalichniKnigi) { this.nalichniKnigi = nalichniKnigi; }


}
