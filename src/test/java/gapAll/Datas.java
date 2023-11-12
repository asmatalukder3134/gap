package gapAll;




public class Datas {

	public static void main(String[] args) {
		String n1="asma talukder has 2 cats";
		String[] ar=n1.split(" ");
		String rev="";
		for(String a:ar) {
			StringBuffer sb=new StringBuffer(a);
			sb.reverse();
			rev=rev+sb.toString()+" ";
		}System.out.print(rev);
		System.out.print("");
	}
}
