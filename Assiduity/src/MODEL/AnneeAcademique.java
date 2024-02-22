package MODEL;

public class AnneeAcademique {
    private int ID_Annee;
    private String Annee_Debut;
    private String Annee_Fin;

    public AnneeAcademique(int ID_Annee, String Annee_Debut, String Annee_Fin) {
        this.ID_Annee = ID_Annee;
        this.Annee_Debut = Annee_Debut;
        this.Annee_Fin = Annee_Fin;
    }

    public int getID_Annee() {
        return ID_Annee;
    }

    public void setID_Annee(int ID_Annee) {
        this.ID_Annee = ID_Annee;
    }

    public String getAnnee_Debut() {
        return Annee_Debut;
    }

    public void setAnnee_Debut(String Annee_Debut) {
        this.Annee_Debut = Annee_Debut;
    }

    public String getAnnee_Fin() {
        return Annee_Fin;
    }

    public void setAnnee_Fin(String Annee_Fin) {
        this.Annee_Fin = Annee_Fin;
    }
}
