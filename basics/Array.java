public class Array{
	public static void main(String[] arg){
		int[] a = new int[4];
		int[] b = new int[0];

		a[0]=7;
		a[1]=3;
		a[2]=15;
		a[3]=9;

		System.out.println(sumAll(a));
		System.out.println(arrayToString(a));
		System.out.println(arrayToString(b));
		System.out.println(minValue(a));
		System.out.println(minIndex(a));
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
}
