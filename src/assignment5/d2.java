package assignment5;

public class d2 {
    public static void main(String args[]) {
        int n1=0,n2=1,n3,i,count=10;
        System.out.print(n1+" "+n2);

        int[] fibbonaci = new int[10];
        fibbonaci[0] = n1;
        fibbonaci[1] =n2;
        for(i=2;i<count;++i){
            n3=n1+n2;
            fibbonaci[i] = n3;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        System.out.println("\n");
        for (i = 9; i>=0; i--){
            System.out.print(fibbonaci[i] + " ");
        }

    }
}
