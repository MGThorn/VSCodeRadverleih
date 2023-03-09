public class Benutzer{
    String name;
    int kundenNummer;

    public Benutzer(String name, int kundenNummer){
        this.name = name;
        this.kundenNummer = kundenNummer;
    }

    public String getName(){
        return name;
    }
    public int getKundenNummer(){
        return kundenNummer;
    }

}