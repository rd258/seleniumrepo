package programsprac;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers= {10,20,8,18,69,65};
		
		int max=0;
		
		for(int i=0; i<numbers.length-1;i++)
		{
			if(numbers[i+1]-numbers[i]>max)
			{
				max=numbers[i+1]-numbers[i];
			}
	
		}
		System.out.println(max);
		
	}

}
