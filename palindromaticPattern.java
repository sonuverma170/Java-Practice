public class palindromaticPattern {


public static void main(String[] args) {
    
    int n=4, i,j;
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n-i;j++)
        {
            System.out.println("  ");  
        }
    
for(j=i;j>=1;j--)
{
    System.out.print(j);
}
for(j=1;j<=i;j++)
{
    System.out.print(j);
}

    }}
    
}
