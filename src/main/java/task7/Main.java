package task7;

public class Main {
    public static void main(String[] args) {
        AmusementPark park = new AmusementPark();
        
        addAndOperate(park, new RollerCoaster());
        addAndOperate(park, new Carousel());
    }
    
    private static void addAndOperate(AmusementPark park, Attraction attraction) {
        park.setAttraction(attraction);
        park.operateAttraction();
    }
}
