// void means 'no type' OR 'no return'

// for return values:
// public static TYPE NAME(){
//   STATEMENTS
//   return EXPRESSION;
// }


class Square4 {

public static double square(double x){
        return x * x;
}

public static void main(String[] arguments){
        System.out.println(square(5));
        System.out.println(square(2));
}

}
