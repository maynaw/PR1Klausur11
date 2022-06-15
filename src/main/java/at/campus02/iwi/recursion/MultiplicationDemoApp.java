package at.campus02.iwi.recursion;

public class MultiplicationDemoApp {

    public int multiplicate(int number1, int number2) {
        if(number1 == 0 || number2 == 0)
            return 0;
        else if (number1 == 1)
            return number2;
        else return number1 +(multiplicate(number1, number2-1));
    }


}
