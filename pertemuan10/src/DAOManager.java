/*
 * File      : DAOManager.java
 * Deskripsi : Pengelola DAO dalam program
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 12 Mei 2026
 */
public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}