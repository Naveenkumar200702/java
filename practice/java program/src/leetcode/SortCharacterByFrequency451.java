package leetcode;
import java.util.*;
public class SortCharacterByFrequency451 {
	public String frequencySort(String s) {
        char[] array=s.toCharArray();
        int[] count=new int[array.length];
        char[] alphabet=new char[array.length];
        int size=0;
        int start=0;
        int value=1;
        Arrays.sort(array);
        //sorting 
        // for(int i=0;i<array.length;i++)
        // {
        //     for(int j=i+1;j<array.length;j++)
        //     {
        //         if(array[i]>array[j])
        //         {
        //             char temp=array[i];
        //             array[i]=array[j];
        //             array[j]=temp;
        //         }
        //     }
        // } 
        //finding the frequency
        while(start<array.length)
        {
            alphabet[size]=array[start];
            for(int j=start+1;j<array.length;j++)
            {
                if(array[start]==array[j])
                {
                    value++;
                    start=j;
                }
            }
            count[size++]=value;
            value=1;
            start++;
        }
        String str="";
        //for sorting based on frequency
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(count[i]<count[j])
                {
                    int temp=count[i];
                    count[i]=count[j];
                    count[j]=temp;
                    char temp1=alphabet[i];
                    alphabet[i]=alphabet[j];
                    alphabet[j]=temp1;
                }
            }
            String str1=""+alphabet[i];
          //  str+=str1.repeat(count[i]);
        } 
       //for output
        // String str="";
        // for(int i=0;i<size;i++)
        // {
        //     String str1=""+alphabet[i];
        //     str+=str1.repeat(count[i]);   
        // }
        return str;
    }
}
