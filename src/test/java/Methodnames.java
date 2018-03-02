import org.testng.annotations.Test;

public class Methodnames {

	@Test
	public void name(){
		
		String mname=Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(mname);
	}
	
	@Test
	public void values(){
		String vname=Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(vname);
	}
	
	
}
