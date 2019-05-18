public class PovesteaBisericilorDinBucuresti {
    public static void main(String[] args) {
        Biserica bisericaSfIosif = new Biserica();
        Biserica catedralaMantuiriiNeamului = new Biserica();
        bisericaSfIosif.nume = "Catedrala Romano-catolica Sf Iosif";
        bisericaSfIosif.capacitate = 600;
        bisericaSfIosif.latitudine = 24.012546;
        bisericaSfIosif.longitudine = 86.14579;
        bisericaSfIosif.tipReligie = "Catolica";
        bisericaSfIosif.program = "10:00 - 19:00";
        bisericaSfIosif.buget = 1000;
        bisericaSfIosif.rating = 5;
        bisericaSfIosif.oameniPrezenti = 155;
        catedralaMantuiriiNeamului.nume = "Catedrala Mantuirii Neamului";
        catedralaMantuiriiNeamului.capacitate = 2000;
        catedralaMantuiriiNeamului.latitudine = 105.68889;
        catedralaMantuiriiNeamului.longitudine = 731.258468;
        catedralaMantuiriiNeamului.tipReligie = "Ortodoxa";
        catedralaMantuiriiNeamului.program = "11:00-21:00";
        catedralaMantuiriiNeamului.buget = 10000;
        catedralaMantuiriiNeamului.rating = 3;
        catedralaMantuiriiNeamului.oameniPrezenti = 10000;

        bisericaSfIosif.faSlujba();
        catedralaMantuiriiNeamului.primesteOameni(5000);

    }
}
