/**
 * Penulis : Rania
 * NIM : 24060122120013
 * Tanggal : 22 Mei 2024
 * File: DAOManager.java
 * Deskripsi: pengelola DAO dalam program
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
