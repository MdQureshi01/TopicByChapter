package arrays_collections;

public class Printing_TwoDimensionalArrays {

	public static void main(String[] args) {
	
		int a [] []= { {2, 4, 5}, {3, 4, 7}, {5, 2, 1} }; //[2] [3]
		
	for(int i=0;i<a.length; i++)                           // outer for loop stands for row.
        {
   for(int j=0;j<a.length; j++)                           // Inner for loop stands for column.
        {

System.out.println(a[i][j]);                     
  }
  }

}
}

