package at.campus02.iwi.cookathome;

public class CookSubscription {
    int age;
    boolean vegan;
    boolean veggie;
    int activePerWeek;

    public String firstBox(int age, boolean vegan, boolean veggie, int activePerWeek) {
        String fishBox = "Fish", veggieBox = "Veggie", veganBox = "Vegan";
        if (vegan == true) {
            return veganBox;
        } else if (veggie == true) {
            return veggieBox;
        } else if (activePerWeek >= 4 && age <=60 ){
            return fishBox;
        }else if (vegan == false && veggie == false && activePerWeek <4 && age<=20 ||age>60){
            return veggieBox;
        }
        else return veganBox;
    }
//a

}
