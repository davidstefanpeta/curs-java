public class Drum {
    String punctPlecare;
    Sring destinatie;
    float distanta;
    int timp;
    float oraPlecare;
    float oraSosire;
    int trafic;
}
public void calatorie() {
    oraSosire = oraPlecare + timp + trafic;
    System.out.println("Ora la care o sa ajungeti este: " + oraSosire);
}