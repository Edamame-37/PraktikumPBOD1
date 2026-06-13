import java.io.*;

// 1. Ubah nama class di sini
class PersonSerial implements Serializable {
    private String name;
    
    public PersonSerial(String n) {
        name = n;
    }
    
    public String getName() {
        return name;
    }
}

public class SerializePerson {
    public static void main(String[] args) {
        // 2. Ubah tipe data objeknya di sini
        PersonSerial person = new PersonSerial("Panji");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}