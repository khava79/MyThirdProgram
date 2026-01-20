package task5;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();
        
        addAndManage(farm, new Cow());
        addAndManage(farm, new Chicken());
    }
    
    private static void addAndManage(Farm farm, FarmAnimal animal) {
        farm.setAnimal(animal);
        farm.manage();
    }
}
