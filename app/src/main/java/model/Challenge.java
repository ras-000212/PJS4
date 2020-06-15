package model;

public class Challenge {

    private int id_challenge = 1; //nécessaire??
    private String name_challenge;
    private String description_challenge;
    private String type_challenge;
    private int xp_challenge;
    private String img;

    public Challenge(int id, String name, String description, String type, int xp){
         this.id_challenge = id;
         this.description_challenge = description;
         this.name_challenge = name;
         this.type_challenge = type;
         this.xp_challenge = xp;
    }

    public int getId_challenge() {
        return this.id_challenge;
    }

    public String getName_challenge(){
        return this.name_challenge;
    }

    public String getDescription_challenge(){
        return this.description_challenge;
    }

    public String getType_challenge(){
        return this.type_challenge;
    }

    public int getXp_challenge(){
        return this.xp_challenge;
    }

    public String toString(){
        String s = "DetailChallenge numéro " + this.id_challenge + " " + this.name_challenge + "catégorie: " + this.type_challenge + " Objectif: " + this.description_challenge + " " + this.xp_challenge + " XP";
        return s;
    }
}
