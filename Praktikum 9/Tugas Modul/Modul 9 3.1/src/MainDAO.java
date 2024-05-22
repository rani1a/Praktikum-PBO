/**
 * Penulis : Rania
 * NIM : 24060122120013
 * Tanggal : 22 Mei 2024
 * File: MainDAO.java
 * Deskripsi: Main program untuk akses DAO
 */

public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person("Rania");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

