public class TypeInferenceExample {

    public static void main(String[] args){
        StringLengthLambda stringLengthLambda = s -> s.length();
        System.out.println(stringLengthLambda.getLength("Hello World!"));

        printLengthLambda(s -> s.length());
    }

    static void printLengthLambda(StringLengthLambda stringLengthLambda){
        System.out.println(stringLengthLambda.getLength("Hello World!"));
    }

    interface StringLengthLambda{
        int getLength(String s);
    }

}
