package arrays_collections;

public class ValuesofArray_MultiDimensions {

	public static void main(String[] args) {
		
		int a [] []= { {2, 4, 5}, {3, 4, 7}, {5, 2, 1} };
    
		  /*a [0] [0] = 2;
	        a [0] [1] = 4;
	        a [0] [2] = 5;
	        a [1] [0] = 3;
	        a [1] [1] = 4;
	        a [1] [2] = 7;
	        a [2] [0] = 5;
	        a [2] [1] = 2;
	        a [2] [2] = 1;  */ 
		
//System.out.println(a[2][1]);          //print out the values of third row second column.
		
//System.out.println(a.length);         //print out the length of the arrays.

	for(int i=0;i<2; i++)                               // outer for loop stands for row.
{

for(int j=0;j<3; j++)                              // Inner for loop stands for column.
{

System.out.println(a[i][j]);

}
}
	}
}


