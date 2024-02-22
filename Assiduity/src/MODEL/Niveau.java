package MODEL;

public class Niveau {
    private int ID_Niveau;
    private String Nom_Niveau;

    public Niveau(int ID_Niveau, String Nom_Niveau) {
        this.ID_Niveau = ID_Niveau;
        this.Nom_Niveau = Nom_Niveau;
    }

    public int getID_Niveau() {
        return ID_Niveau;
    }

    public void setID_Niveau(int ID_Niveau) {
        this.ID_Niveau = ID_Niveau;
    }

    public String getNom_Niveau() {
        return Nom_Niveau;
    }

    public void setNom_Niveau(String Nom_Niveau) {
        this.Nom_Niveau = Nom_Niveau;
    }
}
