package dynamicobject;

import static org.junit.Assert.*;

import org.junit.Test;

class ParameterTest {

	
	class Summer {
		def sumWithDefaults(a, b, c=0){
		return a + b + c
		}
		def sumWithList(List args){
		return args.inject(0){sum,i -> sum += i}
		}
		def sumWithOptionals(a, b, Object[] optionals){
		return a + b + sumWithList(optionals.toList())
		}
		def sumNamed(Map args){
		['a','b','c'].each{args.get(it,0)}
		return args.a + args.b + args.c
		}
		}
	
	@Test
	public void test() {
		def summer = new Summer()
		assert 2 == summer.sumWithDefaults(1,1)
		assert 3 == summer.sumWithDefaults(1,1,1)
		
		assert 2 == summer.sumWithList([1,1])
		assert 3 == summer.sumWithList([1,1,1])
		
		assert 2 == summer.sumWithOptionals(1,1)
		assert 3 == summer.sumWithOptionals(1,1,1)
		
		assert 2 == summer.sumNamed(a:1, b:1)
		assert 3 == summer.sumNamed(a:1, b:1, c:1)
		assert 1 == summer.sumNamed(c:1)
		
	}

}
