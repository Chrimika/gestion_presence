package MODEL;

public class Enseignant {
    public int ID_Enseignant;
    public String nom;
    public String password;
    public int ID_UE;

    public Enseignant(int ID_Enseignant, String nom, String password, int ID_UE){
        this.ID_Enseignant = ID_Enseignant;
        this.nom = nom;
        this.password = password;
        this.ID_UE = ID_UE;
    }


}
