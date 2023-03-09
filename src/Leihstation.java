public class Leihstation {
    int stellPlätze = 20;
    int[] plätze = new int[stellPlätze];

    public void neuesFahrrad(int fahrradNummer) {
        for (int i = 0; i < plätze.length; i++) {
            if (plätze[i] != 0) {
                plätze[i] = fahrradNummer;
                break;
            }
        }
    }

    public int fahrradAusleihen(){
        for (int i=0;i<plätze.length;i++){
            if(plätze[i] != 0){
                return plätze[i];
            }
        }
        return 65965986;
    }

    public boolean istVerfügbar() {
        for (int i = 0; i < plätze.length; i++) {
            if (plätze[i] != 0) {
                return true;
            }
        }
        return false;
    }
}