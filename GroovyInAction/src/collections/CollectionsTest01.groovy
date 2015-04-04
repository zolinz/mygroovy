package collections;

import static org.junit.Assert.*;

import org.junit.Test;

class CollectionsTest01 {

	@Test
	public void test() {
		
		def a = 0..10
		assert a instanceof Range
		
		assert a.contains(5)
		
		a = new IntRange(0,10)
		assert a.contains(5)
		//assert (0.0..1.0).contains(0.5)
		def today = new Date()
		def yesterday = today-1
		assert (yesterday..today).size() == 2
		assert ('a'..'c').contains('b')
		def log = ''
		for (element in 5..9){
			log += element
		}
		assert log == '56789'
		log = ''
		for (element in 9..5){
			log += element
		}
		assert log == '98765'
		log = ''
		(9..<5).each {
			element ->
			log += element
		}
		assert log == '987'
	}

}
