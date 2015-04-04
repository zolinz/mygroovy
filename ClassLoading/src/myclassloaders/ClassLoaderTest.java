package myclassloaders;

public class ClassLoaderTest {

	public static void main(String[] args) {
		System.out.println(String.class.getClassLoader());
		System.out.println(ClassLoaderTest.class.getClassLoader());
	}

}
