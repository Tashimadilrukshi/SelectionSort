import java.util.Scanner;

class SelectionSort {

    //sorting the array
    
    public static int[] sorting(int a[]){
        for(int j=0;j<a.length-1;j++){
            int index=j;
            for(int i=j+1;i<a.length;i++){
                if(a[i]<a[index]){
                    index=i;
                }
            }
            int min=a[index];
            a[index]=a[j];
            a[j]=min;
            
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        
        System.out.println();
        
        //get returned array to a new array
        int[] newArray = sorting(a);
        
        //display the sorted array
        for(int i=0;i<n;i++){
            System.out.println(newArray[i]);
        }
        
        
    }
}
