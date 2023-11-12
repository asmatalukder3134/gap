package gaps;

import org.testng.annotations.Test;

public class Axcess {

	public static boolean main(String ss,String[] word ) {
		String s="ilovegreen",words[]= {"i","love","green","apple"};
		StringBuilder sb=new StringBuilder();
		for(String str:words) {
			sb.append(str);
			if(sb.toString().equals(s)){
				return true;
			}
		}
		return false;
	
	
	}
	//@Test
public boolean exe(String uname) {
		  uname="asma Talukder";
			String uname1="asma_Talukder";
			String uname2="asma@Talukder";
			String uname3="asma/Talukder";
			String uname4="asma:Talukder";

	if(uname.contains("-")||uname.contains("@")||uname.contains("/")||uname.contains(":"))
	{return false;}
	return true;
}


}
