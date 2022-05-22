
public class javaCore1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String is an object //String literal
		String s = "Hello World";
		String s1 = "Hello World";
		
		//new will allocate new memory space for that object no matter there is another one
		//with same value.
		String s2 = new String("Hello World");
		String s3 = new String("Hello World");
		
		String s4 = "Jose Osvaldo Morillo Villar";
		String[] StringSplited = s4.split(" ");
		for(String ss4:StringSplited) {
			System.out.println(ss4 +" this is one of the value stored in the string array");
		}
		
	}

}
