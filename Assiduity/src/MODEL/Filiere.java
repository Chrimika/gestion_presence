package MODEL;

public class Filiere {
    /*Niveau, Filière, Année Académique, Étudiant, Assiduité*/
    private int ID_Filiere;
    private String Nom_Filiere;

    public Filiere(int ID_Filiere, String Nom_Filiere) {
        this.ID_Filiere = ID_Filiere;
        this.Nom_Filiere = Nom_Filiere;
    }

    public int getID_Filiere() {
        return ID_Filiere;
    }

    public void setID_Filiere(int ID_Filiere) {
        this.ID_Filiere = ID_Filiere;
    }

    public String getNom_Filiere() {
        return Nom_Filiere;
    }

    public void setNom_Filiere(String Nom_Filiere) {
        this.Nom_Filiere = Nom_Filiere;
    }
}
