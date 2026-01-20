package task7;


public class Main {
    public static void main(String[] args) {
        AmusementPark park = new AmusementPark();

        Attraction rc = new RollerCoaster();
        park.setAttraction(rc);
        park.operateAttraction();


        Attraction carousel = new Carousel();
        park.setAttraction(carousel);
        park.operateAttraction();
    }
}
