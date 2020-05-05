package kompjuterIya.lesson040520;

public class Main {
    public static void main(String[] args) {
        CandySet setForMan = new CandySetForMen(new String[]{"Bitter chocolate", "With liquor", "Grillage", "With Nuts"}, "Square", 16);
        setForMan.findAmountOfOfEachSort();
        setForMan.congratulation();

        CandySet setForWoman = new CandySetForWomen(new String[]{"Milk chocolate", "With nuts", "With pralines"}, "Heart", 24);
        setForWoman.findAmountOfOfEachSort();
        setForWoman.congratulation();

        CandySet setForKid = new CandySetForChildren(new String[]{"Milk chocolate", "With nuts", "With pralines", "Lollipop", "Marmalade"}, "House", 25);
        setForKid.findAmountOfOfEachSort();
        setForKid.congratulation();
    }
}
