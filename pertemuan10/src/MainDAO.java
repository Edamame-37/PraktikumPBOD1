/*
 * File      : MainDAO.java
 * Deskripsi : Main program untuk akses DAO
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 12 Mei 2026
 */
public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());

        try {
            m.getPersonDAO().savePerson(person);
            System.out.println("Data berhasil disimpan!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}