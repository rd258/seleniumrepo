package programsprac;

import java.util.ArrayList;
import java.util.Arrays;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//compare two arrays and create another array
		
		int[] array1= {10,20,30,40,50};
		
		int[] array2= {6,20,16,40,50};
		
		
		ArrayList<Integer> li = new ArrayList<Integer>();
		
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;j++)
			{
				if(array1[i]==array2[j])
				{
					li.add(array1[i]);
				}
			}
		}
		
		
		
		//convert arraylist to array
		 Object[] obj= li.toArray();
		 
		 
		 for( Object o: obj)
		 {
			 System.out.println(o);
		 }
		

	}

}
