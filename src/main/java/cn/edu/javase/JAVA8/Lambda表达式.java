package cn.edu.javase.JAVA8;

import java.util.Arrays;

public class Lambda表达式 {
    public static void main(String[] args) {

        Arrays.asList( "a", "b", "d" ).forEach((String e) -> System.out.println( e ) );
        int[] a=new int[]{1,2,3};
        Arrays.asList( "a", "b", "d" ).forEach( e -> {
            System.out.print( e );
            System.out.print( e );
        } );
        String separator = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separator ) );
        final String separator1 = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separator1 ) );
        /*System.out.println(Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
            int result = e1.compareTo( e2 );
            return result;
        } ));*/
    }

}
