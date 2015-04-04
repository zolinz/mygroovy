package myGroovy01

class Customer {
	String name;
	Integer age;
		
	static main(args) {
		def customer = new Customer(name:"zolika" , age:40);
		println "bloody hell you are old!!!" + customer.name
	}

}
