package MODEL;

public class Assiduite {
    private int ID_Assiduite;
    private int ID_Etudiant;
    private int ID_UE;
    private String Date_Assiduite;
    private boolean Present;

    public Assiduite(int ID_Assiduite, int ID_Etudiant, int ID_UE, String Date_Assiduite, boolean Present) {
        this.ID_Assiduite = ID_Assiduite;
        this.ID_Etudiant = ID_Etudiant;
        this.ID_UE = ID_UE;
        this.Date_Assiduite = Date_Assiduite;
        this.Present = Present;
    }

    public int getID_Assiduite() {
        return ID_Assiduite;
    }

    public void setID_Assiduite(int ID_Assiduite) {
        this.ID_Assiduite = ID_Assiduite;
    }

    public int getID_Etudiant() {
        return ID_Etudiant;
    }

    public void setID_Etudiant(int ID_Etudiant) {
        this.ID_Etudiant = ID_Etudiant;
    }

    public int getID_UE() {
        return ID_UE;
    }

    public void setID_UE(int ID_UE) {
        this.ID_UE = ID_UE;
    }

    public String getDate_Assiduite() {
        return Date_Assiduite;
    }

    public void setDate_Assiduite(String Date_Assiduite) {
        this.Date_Assiduite = Date_Assiduite;
    }

    public boolean isPresent() {
        return Present;
    }

    public void setPresent(boolean Present) {
        this.Present = Present;
    }
}
