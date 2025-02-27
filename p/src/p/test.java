package p;

public class test {
public static void main(String[] args) {
	//rev
	String a="ram";
	String rev="";
	 char arr[]=a.toCharArray();
	 for(int i=a.length()-1;i>=0;i--)
	 {
		
		rev=rev +a.charAt(i);
	 }
	 System.out.println(rev);
}
}
