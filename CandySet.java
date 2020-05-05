package kompjuterIya.lesson040520;

//Задание
//У нас есть заказ от кондитерской фабрики - сформировать подарочные наборы конфет нескольких типов
// - мужской (на 23 февраля), женский (на 8 марта), детский (на новый год)

//Задачи:
//1. Описать иерархию (структуру) всех данных на листочке или на компьютере
// (как удобнее, главное чтобы всё было перед глазами).
//2. Перенести всё с листа в IDE, создать объекты для проверки


public abstract class CandySet {
    String[] candy;
    String boxShape;
    int amountOfCandies;

    public void findAmountOfOfEachSort() {
        int amountOfEachSort = amountOfCandies / candy.length;
        System.out.println("\nSet contains " + amountOfEachSort + " candies of each sort");
    }

    public void congratulation() {
        System.out.println("Happy Holiday!");
    }
}

class CandySetForMen extends CandySet {
    CandySetForMen(String[] candy, String boxShape, int amountOfCandies) {
        this.candy = candy;
        this.boxShape = boxShape;
        this.amountOfCandies = amountOfCandies;
    }

    public void congratulation() {
        System.out.println("Congratulations on men's day!");
    }
}

class CandySetForWomen extends CandySet {
    CandySetForWomen(String[] candy, String boxShape, int amountOfCandies) {
        this.candy = candy;
        this.boxShape = boxShape;
        this.amountOfCandies = amountOfCandies;
    }

    public void congratulation() {
        System.out.println("Congratulations on women's day!");
    }
}

class CandySetForChildren extends CandySet {
    CandySetForChildren(String[] candy, String boxShape, int amountOfCandies) {
        this.candy = candy;
        this.boxShape = boxShape;
        this.amountOfCandies = amountOfCandies;
    }

    public void congratulation() {
        System.out.println("Happy New Year!");
    }
}

