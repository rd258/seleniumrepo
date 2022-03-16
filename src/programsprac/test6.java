package programsprac;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] numbers= {6,4,9,5,3};
		
		int temp;
		
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]>numbers[j])
				{
					temp=numbers[i];
				   numbers[i]=numbers[j];
				   numbers[j]= temp;
				}
			}
		
		}
		
		for(int num:numbers)
		{
			System.out.println(num);
		}

	}

}
