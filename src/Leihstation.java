public class Leihstation{
    int stellPlätze = 20;
    int[] plätze = new int[stellPlätze];

    public void neuesFahrrad(int fahrradNummer){
        for (int i=0;i<plätze.length();i++){
            if(plätze[i] != null){
                plätze[i] = fahrradnummer;
                break;
            }
        }
    }
    public int fahrradAusleihen(){
        for (int i=0;i<plätze.length();i++){
            if(plätze[i] != null){
                return plätze[i];
            }
        }
    }
    public boolean istVerfügbar(){
        for (int i=0;i<plätze.length();i++){
            if(plätze[i] != null){
                return true;
            }
            return false;
    }

}