package learningRecursion;

public class SimpleRecursion {
	static int count;
	public static void main(String[] args) {
        long t1=System.currentTimeMillis();
        System.out.println(fi(0l,1l,10));
        //System.out.println(fi(10));
        long t2=System.currentTimeMillis();
        System.out.println(t2-t1);
        System.out.println(count);
    }
    static long fi(long start,long next,int n)
    {
    	count++;
        if(n==1||n==0)
        {
            return next;
        }
        return fi(next,start+next,--n);
    }
    
    static long fi(int n)
    {
    	if(n==0||n==1)
    	{
    		return n;
    	}
    	return fi(n-1)+fi(n-2);	
    }
}
