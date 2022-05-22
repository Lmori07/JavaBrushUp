
public class javaCore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myNum = 7;
		String website ="Jose Morillo Academy";
		
		System.out.println(website);
		System.out.println(myNum +" this is the value stored in myNume variable");
		
		//Arrays
		int[] arr = new int [5];
		arr[0] =1;
		arr[1] =2;
		arr[2] =3;
		arr[3] =4;
		arr[4] =5;
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i] +" this is the value stored in " + i + " position");
		}
		
		//Enhanced for loop
		String[] name = {"Jose","Osvaldo","Morillo","Villar"};
		
		for(String s:name) {
			System.out.println(s +" this is one of the value stored in name array");
		}
		
		
	}

}
