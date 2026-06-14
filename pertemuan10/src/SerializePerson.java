/*
 * File      : SerializePerson.java
 * Deskripsi : Program untuk serialisasi objek Person
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 12 Mei 2026
 */

import java.io.*;

class PersonSerializable implements Serializable {
    private String name;

    public PersonSerializable(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class SerializePerson {
    public static void main(String[] args) {
        PersonSerializable person = new PersonSerializable("Panji");

        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("Selesai menulis objek person");
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}