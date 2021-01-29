package IQ_CodingTasks_Solutions;

public class Numbers_Odd_Even {



    public  static int identifyOddEven(int  n ) {

        if(n%2 == 0){
            System.out.println("You entered an even number: " + n);
        }else{
            System.out.println("You entered an odd number: " + n);
        }

        return n;
    }

    public  static  String  identifyOddEven2( int  n ) {

        return  n%2==0 ? "Even" : "odd" ;

    }



    public static void main(String[] args) {
        identifyOddEven(15);

        System.out.println(identifyOddEven2(10));
    }

}
/*
    Write  a method which can identifies given number is even or odd

EX:

identify(5) ->  "Odd"

identify(6) ->  "Even"



Solution :

public  static  String  identifyOddEven( int  n ) {

return  n%2==0 ? "Even" : "odd" ;

}

 */