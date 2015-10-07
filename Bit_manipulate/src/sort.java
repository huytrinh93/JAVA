import java.util.Random;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[10];
		
		int i = 0;
		Random rand = new Random();
		for(i=0;i<array1.length;i++)
		{
			array1[i]=rand.nextInt(100);
		}
		int[] array2 = array1.clone();
		int[] array3 = array1.clone();
		int[] array4 = array1.clone();
		printArray(array1);
		array2 = BubbleSort(array2);
		printArray(array2);
		array3 = InsertionSort(array3);
		printArray(array3);
		array4 = SelectionSort(array4);
		printArray(array4);
	}
	
	private static void swap (int i , int j, int[] arrayExample)
	{
		int temp = arrayExample[i];
		arrayExample[i]=arrayExample[j];
		arrayExample[j]=temp;
	}
	
	private static void printArray(int[] arrayExample)
	{
		System.out.print("\n");
		if(arrayExample != null)
		{
			for(int i=0;i<arrayExample.length;i++)
			{
				System.out.print(arrayExample[i]+" ");
			}
		}
		else 
			System.out.print("end");
	}
	
	private static int[] BubbleSort(int[] array){
		System.out.println("Bubble");
		int[] arrayTest=array;
		for(int i = 0 ; i<arrayTest.length ; i++)
		{
			for (int j=0;j<(arrayTest.length-1);j++)
			{
				if(arrayTest[j] > arrayTest[j+1])
				{
					swap(j,j+1,arrayTest);
					printArray(arrayTest);
				}
			}
		}
		return arrayTest;
	}
	
	private static int[] SelectionSort(int[] array){
		System.out.println("Selection");
		int smallest_index=0;
		
		for(int i = 0; i <array.length;i++)
		{
			int smallest=array[i];
			smallest_index=i;
			for(int j=i+1 ; j<array.length ; j++)
			{
				if(array[j]<smallest)
					{
						smallest=array[j];
						smallest_index=j;
					}
			}
			swap(i,smallest_index,array);
			
		}
		return array;
	}
	
	private static int[] InsertionSort(int[] array){
		System.out.println("Insertion");
        for (int j = 1; j < array.length; j++) {
            int index = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > index ) ) {
            	array [i+1] = array [i];
                i--;
            }
            array[i+1] = index;
            printArray(array);
        }
        return array;
	}
	
	private static int[] MergeSort(int[] array){
		
		return null;
	}
}
