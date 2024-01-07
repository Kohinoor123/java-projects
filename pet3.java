class pet3
{
    public static void main(String[] args)
    {
        int i,j,a=0,b=1,sum=0;
       // String msg="";
        for(i=1; i<=5; i++)
        {
            for( j=1; j<=i; j++)
            {
                sum=a+b;
                b=a;
                a=sum;
                System.out.print(sum+"\t");
                
            }
            System.out.println();
        }
    }
}