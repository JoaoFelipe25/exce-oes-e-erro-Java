package Exceptions;
import java.util.ArrayList;
import java.util.List;

public class ArrayExceptionExample {

    static void getNames(List<String> names) throws IndexOutOfBoundsException{

       
        int i = 10;

        if(names.size() <= i){

             throw new IndexOutOfBoundsException ("Index fora do array");
        }

        String name = names.get(i);

        System.out.println(name);
    }
    
    public static void main(String[] args) {
        
        List<String> names = new ArrayList<String>();

        names.add("cassiano");
        names.add("cassi");
        names.add("cao");


        getNames(names);

    }

}
