import java.util.Arrays;


public class SortAnArray {
	public static void main(String[] args) {
		 int[] A1 = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
	     int[] A2 = {2, 1, 8, 3};
	     int[] temp={2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
	     Arrays.sort(temp);
	     sortArray(A1,A2,temp);
	}

	private static void sortArray(int[] a1, int[] a2, int[] temp) {
		int indexOfMainArray=0;
		int numberOfOccurances;
		boolean[] visited=new boolean[a1.length];
		
		for (int i = 0; i < visited.length; i++) {
			visited[i]=false;
		}
		
		for (int i = 0; i < a2.length; i++) {				
			int firstOccurance=findFirstOccurance(temp,a2[i]);
			int lastOccurance=findLastOccurance(temp,a2[i]);
			if(firstOccurance!=-1&&lastOccurance!=-1){
				markVisitedArray(visited,firstOccurance,lastOccurance);
				numberOfOccurances=lastOccurance-firstOccurance+1;
				indexOfMainArray=updateMainArray(a1,numberOfOccurances,indexOfMainArray);
			}
		}
		for (int i = 0; i < visited.length; i++) {
			if(!visited[i]){
				a1[indexOfMainArray]=temp[i];
				indexOfMainArray++;
			}
		}
	}

	private static int updateMainArray(int[] a1, int numberOfOccurances,
			int indexOfMainArray) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void markVisitedArray(boolean[] visited, int firstOccurance,
			int lastOccurance) {
		// TODO Auto-generated method stub
		
	}

	private static int findLastOccurance(int[] temp, int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int findFirstOccurance(int[] temp, int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
