package print;
import java.io.*;
import java.util.*;

public class ArbitrageDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      sc.nextLine();
      double x;
      String a[]=new String[3];
      double f[]=new double[n];
      for (int i=0;i<n;i++)
      {
    	  double profit=100000;
      a=sc.nextLine().split(" ");
      for (int j=0;j<3;j++)
      {
    	  x=Double.parseDouble(a[j]);
    	profit=profit/x;  
      }
      if (profit>100000)
      {
    	  f[i]=profit-100000;
      }
      else
      {
    	  f[i]=0;
      }
	  }
      for (int l=0;l<n;l++)
      {
    	  System.out.println((int)f[l]);
      }
	}
}

