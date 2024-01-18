package com.tutorial;

class Mahasiswa {
    //data member
    String nama;
    String NIM;

    //constructor
    Mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    // method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama    : " + this.nama);
        System.out.println("NIM     : " + this.NIM);
    }
    
    // method tanpa return dan dengan parameter
    void setNama (String nama){
        this.nama = nama;
    }
    //method dengan return tapi tidak ada parameter
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }
    
    // method dengan return dan degnan parameter
    String sayHi(String message){
        return message + " hahaha , nama saya adalah " + this.nama;
    }


}

public class App {
    public static void main(String[] args)  {
        Mahasiswa mahasiswa1 = new Mahasiswa("Budi", "12345");
        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        // method
        mahasiswa1.show();
        mahasiswa1.setNama("Bobon");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("Say");
        System.out.println(data);
    }
}
