package task8;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();
        
        addAndShow(museum, new Manuscript());
        addAndShow(museum, new Sculpture());
    }
    
    private static void addAndShow(Museum museum, Exhibit exhibit) {
        museum.setExhibit(exhibit);
        museum.showExhibit();
    }
}
