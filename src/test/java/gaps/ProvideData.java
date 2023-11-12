package gaps;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProvideData {
	
	@DataProvider(name="ex")
	public Object[][] provideDatas() {
		Object[][]ar=new Object[2][2];
		ar[0][0]="asam";
		ar[0][1]="23";
		ar[1][0]="alo";
		ar[1][1]="34";
		return ar;
		//return new Object [][] {{"asma","123"},{"alo","234"}};
		
	}

@Test(dataProvider="ex")
public void exes(String uname,String pw) {
	System.out.println(uname);
	System.out.println(pw);
}
//@DataProvider(name = "data-provider")
public Object[][] dataProviderMethod() {
  return new Object[][]{{"data one"}, {"data two"}};
}

//@Test(dataProvider = "data-provider")
public void testMethod(String data) {
  System.out.println("Data is: " + data);
}
}

