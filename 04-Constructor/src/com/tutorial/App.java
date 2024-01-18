package com.tutorial;

//constructor dengan parameter
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;

    Mahasiswa (String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mahasiswa1 = new Mahasiswa("Jojo","12345", "Teknik Elektro");
        Mahasiswa mahasiswa2 = new Mahasiswa("Budi","54321", "Teknik Kimia");

    }
}
