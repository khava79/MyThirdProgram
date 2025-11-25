package task7;

import org.w3c.dom.Attr;

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
