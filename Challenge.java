public class Challenge{
    
     public static void main(String []args){
        int MAX=10000000;
        boolean[] isPrime=new boolean[MAX];
        int[] primes=new int[100003];
        int[][] frequencies=new int[10][10];
        int count=0;
        for(int i=0;i<MAX;i++){
            isPrime[i]=true;
        }
        for(int i=2;i<MAX && count<100003;i++){
            if(isPrime[i]){
                primes[count]=i;
                count++;
            }
            for(int j=2*i;j<MAX;j+=i)
                isPrime[j]=false;
        }
        for(int i=0,id=count-1;i<1000;i++,id--){
            String s=Integer.toString(primes[id]);
            int len=s.length();
            for(int j=len-1,pos=0;j>=0;j--,pos++){
                char ch=s.charAt(j);
                frequencies[pos][ch-'0']++;
            }
        }
        System.out.println("                              Frequency");
        System.out.print("Position  ");
        for(int i=0;i<10;i++)
            System.out.printf("%5d",i);
        System.out.println("");
        for(int i=0;i<10;i++){
            System.out.printf("%8d",i+1);
            System.out.print("  ");
            for(int j=0;j<10;j++)
                System.out.printf("%5d",frequencies[i][j]);
            System.out.println("");
        }
     }
}