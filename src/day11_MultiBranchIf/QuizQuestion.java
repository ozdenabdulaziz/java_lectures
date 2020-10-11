package day11_MultiBranchIf;

public class QuizQuestion {

    public static void main(String[] args) {

        int ivar = 100;
        double dvar = 200;
        float fvar = 300f;

        ivar = (int)fvar;   // explicit casting
        fvar = ivar;        // implicit casting ==== fvar is bigger from ivar since you don;t need to (float), it's completet outomatical
        dvar = fvar; // implicit casting
        fvar = (float) dvar;    // explicit casting
        dvar = ivar;    //implicit casting
        ivar =(int) dvar;   // explicit casting

        System.out.println("\n============================\n");

        System.out.println("Result A" + 0 + 1);
        System.out.println("Result B" + (1) + (2));

    }

}
