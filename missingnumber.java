import java.util.*;

class missingnumber{

  int  numbermissed(int []arr,int rangestart,int rangeend){
    int sum1=0,sum2=0,arr2[]=new int[arr.length+1];
    for(int i=0;i<arr.length;i++){
      sum1=sum1+arr[i];
    }
  
    int j=0,count=rangestart;
    while(j<=(arr.length)){
      arr2[j]=count;
      count=count+1;
      j++;
    }
    for(int i=0;i<arr2.length;i++){
      sum2=sum2+arr2[i];
    }
    
    int num=sum2-sum1;
    return num;
    
  }

  public static void main(String [] args){
   missingnumber m=new missingnumber();
    System.out.println("enter the range start :");
    Scanner in=new Scanner(System.in);
    int start=in.nextInt();// i.e 1
    System.out.println("enter the range  end:");
    int end=in.nextInt();// i.e 15
    int arr[]={1,2,3,4,5,6,7,9,10,11,12,13,14,15};
    
    System.out.println("number missed is "+m.numbermissed(arr,start,end));
    
  }
  
}
