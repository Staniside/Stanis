package com.company;

public class TestBiblioteka {
    public TestBiblioteka(){
    }

    public static void main(String[] args) {
        Biblioteka b = new Biblioteka();
        b.AddKniga("chervenata shapchica", "az", "izdatelstvoto", 1923, 182642);
        b.DaiInfoZaKnigi();
        //nqmam vreme za da opravq metoda za iztrivaneto
    }
}
