package dynamicobject;

import static org.junit.Assert.*;

import org.junit.Test;

class Test01 {
	class PretendFieldCounter {
		public count = 0
		Object get (String name) {
			return 'pretend value'
		}
		void set (String name, Object value) {
			count++
		}
	}


	class SomeClass {
		void publicVoidMethod(){
		}

		def publicUntypedMethod(){
			return 'hi'
		}

		String publicTypedMethod(){
			return 'ho'
		}
	}



	@Test
	public void test01() {

		def pretender = new PretendFieldCounter()
		assert pretender.isNoField == 'pretend value'
		assert pretender.count == 0
		pretender.isNoFieldEither = 'just to increase counter'
		assert pretender.count == 1
	}

	@Test
	public void test02(){
		def some = new SomeClass()
		some.publicVoidMethod()
		assert 'hi' == some.publicUntypedMethod()
		assert 'ho' == some.publicTypedMethod()
	}


	@Test
	public void test03(){
		def map = [a:[b:[c:1]]]
		assert map.a.b.c == 1
		if (map && map.a && map.a.x){
			assert map.a.x.c == null
		}
		
		try {
			assert map.a.x.c == null
			} catch (NullPointerException npe){
			}
			assert map?.a?.x?.c == null
	}
}
