public class Array{
	public static void main(String[] arg){
		int[] a = new int[4];
		int[] b = new int[0];

		a[0]=7;
		a[1]=3;
		a[2]=15;
		a[3]=9;

		double[][] h = new double[2][3];
		h[0][0] = 1;
		h[0][1] = 2;
		h[0][2] = 3;
		h[1][0] = 6;
		h[1][1] = 5;
		h[1][2] = 4;

		System.out.println(sumAll(a));
		System.out.println(arrayToString(a));
		System.out.println(arrayToString(b));
		System.out.println(minValue(a));
		System.out.println(minIndex(a));
		System.out.println(transpose(h, 2, 3));
	}

	public static int sumAll(int[] x){
		int sum = 0;
		for(int i=0; i<x.length; i++){
			sum+=x[i];
		}
		return sum;
	}

	public static String arrayToString(int[] x){
		String sum = "[";
		if(x.length>0){
			sum += x[0];	
		}
		for(int i=1; i<x.length; i++){
			sum+=(", "+x[i]);
		}
		sum += "]";
		return sum;
	}

	public static int minValue(int[] x){
		int min = x[0];
		for(int i=1; i<x.length; i++){
			if(min > x[i]){
				min = x[i];
			}
		}
			return min;
	}

	public static int minIndex(int[] x){
		int min = x[0];
		int index = 0;
		for(int i=1; i<x.length; i++){
			if(min > x[i]){
				min = x[i];
				index = i;
			}
		}
			return index;
	}

	public static int remove(int[] a, int n, int pos){
		int result = a[pos];
		for(int i=pos; i<n; i++){
			a[i] = a[i+1];
		}
		return result;
	}

	public static	double matrixToString(double x, n, m){

	}

	public static double[][] transpose(double[][] x, int n, int m){
		double[][] result = new double[m][n];
		for(int row=0; row<n; row++){
			for(int col=0; col<m; col++){
				result[col][row] = x[row][col];
			}
		}
		return result;
	}


	public static boolean isTriangular(double [][] x, int n){
		boolean isLowerTriangular = true;
		for(int row=0; row<n-1; row++){
			for(int col=row+1; col<n; col++){
				if(x[row][col] != 0){
					isLowerTriangular = false;
				}
			}
		}
		boolean isUpperTriangular = true;
		for(int row=1; row<n; row++){
			for(int col=0; col<row; col++){
				if(x[row][col] != 0){
					isUpperTriangular = false;
				}
			}
		}
		return isUpperTriangular || isLowerTriangular;
	}

}
