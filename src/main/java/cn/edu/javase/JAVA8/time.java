package cn.edu.javase.JAVA8;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class time {

	public static void main(String[] args) {
		final Clock clock = Clock.systemUTC();
		System.out.println( clock.instant() );
		System.out.println( clock.millis() );
		final LocalDate date = LocalDate.now();
		final LocalDate dateFromClock = LocalDate.now( clock );

		System.out.println( date );
		System.out.println( dateFromClock );

		// Get the local date and local time
		final LocalTime time = LocalTime.now();
		final LocalTime timeFromClock = LocalTime.now( clock );

		System.out.println( time );
		System.out.println( timeFromClock );
		final LocalDateTime from = LocalDateTime.of( 2014, Month.APRIL, 16, 0, 0, 0 );
		final LocalDateTime to = LocalDateTime.of( 2015, Month.APRIL, 16, 23, 59, 59 );

		final Duration duration = Duration.between( from, to );
		System.out.println( "Duration in days: " + duration.toDays() );
		System.out.println( "Duration in hours: " + duration.toHours() );
		
		long[] arrayOfLong = new long [ 20000 ];        
System.out.println("---------------------------------------------------------");
        Arrays.parallelSetAll( arrayOfLong, 
            index -> ThreadLocalRandom.current().nextInt( 1000000 ) );
        Arrays.stream( arrayOfLong ).limit( 10 ).forEach( 
            i -> System.out.print( i + " " ) );
        System.out.println();

        Arrays.parallelSort( arrayOfLong );     
        Arrays.stream( arrayOfLong ).limit( 10 ).forEach( 
            i -> System.out.print( i + " " ) );
        System.out.println();
        String[] players = {"Rafael Nadal", "Novak Djokovic",   
        	    "Stanislas Wawrinka", "David Ferrer",  
        	    "Roger Federer", "Andy Murray",  
        	    "Tomas Berdych", "Juan Martin Del Potro",  
        	    "Richard Gasquet", "John Isner"}; 
        Arrays.sort(players, (String s1, String s2) -> {return s1.compareTo(s2); });
		
	}
}
