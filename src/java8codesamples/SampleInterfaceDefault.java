package java8codesamples;


 interface multiply {
	
	default int mulitplybyzero(){
		return 0;
	}
}
 
 class mathoperation implements multiply {
	 
	 int a,b;
	 public mathoperation(int a, int b){
		 this.a = a;
		 this.b = b;
	 }
	 public int multiply(){
		 return a*b;
	 }
	 
 }
public class SampleInterfaceDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			mathoperation mo = new mathoperation(2,2);
			System.out.println(mo.mulitplybyzero());
			System.out.println(mo.multiply());
	}

}
