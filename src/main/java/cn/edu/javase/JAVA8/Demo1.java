package cn.edu.javase.JAVA8;

import java.util.function.Supplier;

public class Demo1 {
	private interface Defaulable {
	    // Interfaces now allow default methods, the implementer may or 
	    // may not implement (override) them.
		static String Required() { 
	        return "Default implementation"; 
	    }
		default String notRequired() { 
	        return "Default implementation"; 
	    }        
	}
	private interface DefaulableFactory {
	    // Interfaces now allow static methods
	    static Defaulable create( Supplier< Defaulable > supplier ) {
	        return supplier.get();
	    }
	}
	private static class DefaultableImpl implements Defaulable {
	}
	private static class OverridableImpl implements Defaulable {
		static String Required() { 
	        return "Default implementation"; 
	    }
		@Override
		public String notRequired() {
			// TODO Auto-generated method stub
			return Defaulable.super.notRequired();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Defaulable create = DefaulableFactory.create(DefaultableImpl::new);
		System.out.println(create.notRequired());
	}
}
