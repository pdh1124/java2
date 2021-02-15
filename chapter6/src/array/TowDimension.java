package array;

public class TowDimension {

	public static void main(String[] args) {
		
		int[][] arr = {{2,7,9}, {4,5,6,3}};
		
		System.out.println(arr.length); //2 행의 갯수
		System.out.println(arr[0].length); //3 {2,7,9}의 갯수
		System.out.println(arr[1].length); //3 {4,5,6}의 갯수
		
		
		//다 출력하고 싶으면
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
