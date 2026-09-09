package com.example.java26;

public class records {
    record vInfo(String vName, int eNr){}
    // Ett record används för att lagra flera relaterade värden i ett objekt.
    static void main (){

        IO.println("Voting registration");

        vInfo [] vInfo = new vInfo[4];

        for (int i = 0; i < vInfo.length; i++) {
            String name = IO.readln("Voter name: ");
            int eNr = Integer.parseInt(IO.readln("Voter envelope number: "));
            if (checkNumber(eNr, vInfo)) {
                vInfo VoterInfo = new vInfo(name, eNr);
                vInfo[i] = VoterInfo;
            }
            else  {
                IO.println("Invalid voter envelope number!");
                i--;
            }
        }


        for (int i = 0; i < vInfo.length; i++){
            IO.println("Voter: " + vInfo[i].vName() +
                    ", Envelope number: " + vInfo[i].eNr());
        }

    }
    static boolean checkNumber(int eNr, vInfo[] vInfo) {
        for (int i = 0; i < vInfo.length; i++){
            if (vInfo[i] != null && vInfo[i].eNr == eNr ){
                return false;
            }
        }
        return true;
    }

}
