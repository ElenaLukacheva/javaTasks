package example0;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Voids {
    public static void main(String[] args) {
        String name = "VLAD";
        int age = 33;
        System.out.println(name);
        Boolean has18 = false;
        name = concatNameAndAge(name, age);
        System.out.println(name);
        int resultMethod =sum(age, 40);
        System.out.println(resultMethod);
        sayHello("Привет сосед");
    }
    public static void sayHello(String name){
        String result = concatNameAndAge(name, 23);
        System.out.println(result);
}
    public static String concatNameAndAge(String nameToConcat, int ageToConcat){
       String result = nameToConcat + " " + ageToConcat;
       result = result.toLowerCase();
        return result;
    }

    public static int sum(int a, int b){
        return a+b;
    }


}
