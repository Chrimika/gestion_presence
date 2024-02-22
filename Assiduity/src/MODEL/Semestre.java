package MODEL;

public class Semestre {
    private int ID_Semestre;
    private String Nom_Semestre;
    private String Date_Debut;
    private String Date_Fin;

    public Semestre(int ID_Semestre, String Nom_Semestre, String Date_Debut, String Date_Fin) {
        this.ID_Semestre = ID_Semestre;
        this.Nom_Semestre = Nom_Semestre;
        this.Date_Debut = Date_Debut;
        this.Date_Fin = Date_Fin;
    }

    public int getID_Semestre() {
        return ID_Semestre;
    }

    public void setID_Semestre(int ID_Semestre) {
        this.ID_Semestre = ID_Semestre;
    }

    public String getNom_Semestre() {
        return Nom_Semestre;
    }

    public void setNom_Semestre(String Nom_Semestre) {
        this.Nom_Semestre = Nom_Semestre;
    }

    public String getDate_Debut() {
        return Date_Debut;
    }

    public void setDate_Debut(String Date_Debut) {
        this.Date_Debut = Date_Debut;
    }

    public String getDate_Fin() {
        return Date_Fin;
    }

    public void setDate_Fin(String Date_Fin) {
        this.Date_Fin = Date_Fin;
    }
}
