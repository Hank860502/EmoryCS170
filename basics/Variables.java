public class Variables{
	public static void main(String[] arg){
		System.out.println(multN(4));
	}

	public static int multN(int n){
		int result = 1;
		for(int i=1; i<=n; i++){
			result = result*i;
		}
		return result;
	}	
}