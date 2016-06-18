package hack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {

	public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        Scanner s=new Scanner(System.in);
        ArrayList<String> ar=new ArrayList<String>();
        for (int i = 0; i < N; i++) {
        	ar.add(s.next());
        }
        for (int j=0;j<ar.size();j++)
        {
        	for(int k=1;k<ar.size();k++)
        	{
        		if (ar.get(j).length()==ar.get(k).length())
        		{char ch[]=new char[ar.get(j).length()];
        			ch=ar.get(j).toCharArray();
        		}
        	}
        }
        
          

        
    }
}