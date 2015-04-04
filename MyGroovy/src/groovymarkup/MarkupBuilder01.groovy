package groovymarkup

class MarkupBuilder01 {

	static main(args) {
		def xmlBuilder = new groovy.xml.MarkupBuilder()
		xmlBuilder.'Bikes' {
			'bike' 'Honda'
		}
	}

}
