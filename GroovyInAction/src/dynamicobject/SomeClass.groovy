package dynamicobject

class SomeClass {
	
	static void main(args) {
		def some = new SomeClass()
		some.publicVoidMethod()
		assert 'hi' == some.publicUntypedMethod()
		assert 'ho' == some.publicTypedMethod()
		combinedMethod()
	}
	void publicVoidMethod(){
	}
	
	def publicUntypedMethod(){
		return 'hi'
	}
	
	String publicTypedMethod(){
		return 'ho'
	}
	
	protected static final void combinedMethod(){
	}
	
}
