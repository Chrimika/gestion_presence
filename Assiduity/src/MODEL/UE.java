package MODEL;

import DB_CONN.Conn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UE {
    private int ID_UE;
    private String Nom_UE;
    private int ID_Semestre;
    private int ID_Niveau;
    private int ID_Filiere;
    private int ID_Annee;

    public UE(String Nom_UE, int ID_Semestre, int ID_Niveau, int ID_Filiere, int ID_Annee) {
        this.Nom_UE = Nom_UE;
        this.ID_Semestre = ID_Semestre;
        this.ID_Niveau = ID_Niveau;
        this.ID_Filiere = ID_Filiere;
        this.ID_Annee = ID_Annee;
    }

    public int getID_UE() {
        return ID_UE;
    }

    public void setID_UE(int ID_UE) {
        this.ID_UE = ID_UE;
    }

    public String getNom_UE() {
        return Nom_UE;
    }

    public void setNom_UE(String Nom_UE) {
        this.Nom_UE = Nom_UE;
    }

    public int getID_Semestre() {
        return ID_Semestre;
    }

    public void setID_Semestre(int ID_Semestre) {
        this.ID_Semestre = ID_Semestre;
    }

    public int getID_Niveau() {
        return ID_Niveau;
    }

    public void setID_Niveau(int ID_Niveau) {
        this.ID_Niveau = ID_Niveau;
    }

    public int getID_Filiere() {
        return ID_Filiere;
    }

    public void setID_Filiere(int ID_Filiere) {
        this.ID_Filiere = ID_Filiere;
    }

    public int getID_Annee() {
        return ID_Annee;
    }

    public void setID_Annee(int ID_Annee) {
        this.ID_Annee = ID_Annee;
    }

    public static UE selectUE(String nomUe, Connection connection) {
        UE ue = null;
        String sql = "SELECT * FROM ue WHERE Nom_UE = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nomUe);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    ue = new UE(
                            resultSet.getString("Nom_UE"),
                            resultSet.getInt("ID_Semestre"),
                            resultSet.getInt("ID_Niveau"),
                            resultSet.getInt("ID_Filiere"),
                            resultSet.getInt("ID_Annee")
                    );
                    ue.setID_UE(resultSet.getInt("ID_UE"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ue;
    }


    public static void insertUe(UE ue, Connection connection) throws SQLException {
        // Utilisation d'une requête préparée pour éviter les injections SQL
        String query = "INSERT INTO UE (Nom_UE, ID_Semestre, ID_Niveau, ID_Filiere, ID_Annee) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, ue.getNom_UE());
            preparedStatement.setInt(2, ue.getID_Semestre());
            preparedStatement.setInt(3, ue.getID_Niveau());
            preparedStatement.setInt(4, ue.getID_Filiere());
            preparedStatement.setInt(5, ue.getID_Annee());

            // Exécution de la requête
            preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void updateUe(UE ue, Connection connection) throws SQLException {
        // Utilisation d'une requête préparée pour éviter les injections SQL
        String query = "UPDATE UE SET Nom_UE = ?, ID_Semestre = ?, ID_Niveau = ?, ID_Filiere = ?, ID_Annee = ? WHERE ID_UE = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, ue.getNom_UE());
            preparedStatement.setInt(2, ue.getID_Semestre());
            preparedStatement.setInt(3, ue.getID_Niveau());
            preparedStatement.setInt(4, ue.getID_Filiere());
            preparedStatement.setInt(5, ue.getID_Annee());
            preparedStatement.setInt(6, ue.getID_UE());

            // Exécution de la requête
            preparedStatement.executeUpdate();
        }
    }

    public static void deleteUe(UE ue, Connection connection) {
        // Utilisation d'une instruction SQL paramétrée pour éviter les injections SQL
        String sql = "DELETE FROM ue WHERE ID_UE = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            // Paramétrage de la valeur du paramètre dans l'instruction SQL
            statement.setInt(1, ue.getID_UE());

            // Exécution de la requête de suppression
            int rowsAffected = statement.executeUpdate();

            // Vérification du nombre de lignes affectées pour confirmer la suppression
            if (rowsAffected > 0) {
                System.out.println("UE supprimée avec succès.");
            } else {
                System.out.println("Aucune UE trouvée avec cet ID.");
            }
        } catch (SQLException e) {
            // Gestion des erreurs SQL
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws SQLException {
        UE ue = new UE("ICT-207", 1, 1, 1, 1);
        UE.insertUe(ue, Conn.conn());
    }
}
