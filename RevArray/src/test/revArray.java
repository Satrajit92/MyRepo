package test;

public class revArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		int length=arr.length;
		//System.out.println(length);
		int temp;
		for(int k=0;k<length;k++) {
			int first=0;
		 int last=length-1;
		
		
		    while(first<last)
		{
			temp=arr[k][first];
			arr[k][first]=arr[k][last];
			arr[k][last]=temp;
			first++;
			last--;
			
		}
		}	
		
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				System.out.println(arr[i][j]);
				
				
			}
		}
		
		
	}

}
