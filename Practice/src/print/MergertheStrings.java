package print;

public class MergertheStrings {

	public static void main(String[] args) {
		
		System.out.println(mergeStrings("abc","def"));
	}
	static String mergeStrings(String a, String b) {
    char arr[]=new char[a.length()+b.length()];
    char a1[]=a.toCharArray();
    char b1[]=b.toCharArray();
    int n1=0;
    int n2=0;
		for (int i=0;i<arr.length;i=i+2)
		{	
			arr[i]=a.charAt(n1);
			n1++;
		}
		for (int j=1;j<arr.length;j=j+2)
		{	
			arr[j]=b.charAt(n2);
			n2++;
		}
		String mergedString=new String(arr);
		
 return mergedString;
    }

}
