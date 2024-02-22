package MODEL;

public class UE {
    private int ID_UE;
    private String Nom_UE;
    private int ID_Semestre;
    private int ID_Niveau;
    private int ID_Filiere;
    private int ID_Annee;

    public UE(int ID_UE, String Nom_UE, int ID_Semestre, int ID_Niveau, int ID_Filiere, int ID_Annee) {
        this.ID_UE = ID_UE;
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

}
