package groovymarkup

import java.lang.annotation.ElementType;

class MyNodeBuilder {

	static main(args) {
		def builder = NodeBuilder.newInstance()
		def xmlns = new groovy.xml.NamespaceBuilder(builder)

		def xsd = xmlns.namespace('http://www.w3.org/2001/XMLSchema' , 'xsd')

		def root = xsd.schema(xmlns:['zo' : 'zoli.com'])

			element(name:'bikes', type:'bikesType')

			
			
			//println root
		
	}
}
