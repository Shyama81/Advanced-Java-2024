package corejava;

public class WrapperTest {
	/*
	 * ---------------------Wrapper Class ----------------
	 * every primitive data types has respective class is known as wrapper class 
	 * 
	 * primitive type    wrapper class
	 * -------------     -----------
	 * byte               Byte
	 * short              Short
	 * int                Integer
	 * long               Long 
	 * float              Float
	 * double             Double 
	 * char               Character
	 * boolean            Boolean
	 * 
	 
	 */
	public static void main(String[] args) {
		int a=400;
		Integer k= 800;
		/*
		 * k. garyo bahne wrapper ma k ma k convert aauxa 
		 * 
		 * ------------auto boxing------------
		 *   change primitive type to wrapper type
		 */
		int p= 200 ;
		Integer t=p;  // p. garyo bhane mathi ko jastai hunxa =yo auto boxing 
		
		//------------auto-unboxing : change wrapper to primitive -----
		
		Double d= 1445.6675;
		double m=d; //auto-unboxing
		System.out.println(Integer.toBinaryString(900));
		System.out.println(Integer.toOctalString(p));
		
	}
	

}
