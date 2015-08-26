/**
 * 
 * @author sahil
 *
 */
public class SearchSortedMatrix {

	public static void main(String[] args) {
		int[][] arr={{1,2,3},{2,3,4},{3,4,5}};
		System.out.println(searchInMatrix(arr,1));
	}

	private static boolean searchInMatrix(int[][] arr, int x) {
		int noOfRows=arr.length;
		int noOfCols=arr[0].length;
		
		int rowIndex=0, colIndex=noOfCols-1;
		while(rowIndex<noOfRows&&colIndex>=0){
			if(arr[rowIndex][colIndex]==x){
				return true;
			}
			else if(arr[rowIndex][colIndex]>x){
				colIndex--;
			}
			else{
				rowIndex++;
			}
		}
		
		return false;
	}

}
