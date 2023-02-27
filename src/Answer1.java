public class Answer1 {
    public static void main(String[] args) {
        int n=10;
        for (int i = 0; i < n; i++) {
            // Loop For A
            for (int j = 0; j < n; j++) {
                if (i==(n-1)/2 || i+j == (n-1)/2 || j-i == (n-1)/2 || j==0 && i >(n-1)/2 || j==n-1 && i >(n-1)/2 ){
                    System.out.print("PW");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            // Loop For B
            for (int j = 0; j < n; j++) {
                if (j==0 || i==0 && j < (n-1)/2 ||i==(n-1)/2 && j < (n-1)/2 ||i==(n-1) && j < (n-1)/2 || j-i ==(n-1)/2 &&  j>=(n-1)/2 && j<=((n-1)/2)+2 || j+i ==((n-1)/2)+4 && i<(n-1)/2 && j>=(n-1)/2 && j<=((n-1)/2)+2  || j+i ==(n)+3 && j<=((n-1)/2)+2 || j-i==0 && j>=(n-1)/2 && j<=(n-4) ){
                    System.out.print("PW");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            // Loop For C
            for (int j = 0; j < n; j++) {
                if (i+j==(n-1)/2 || j-i==((n-1)/2)-(n-1) || i==0 && j> (n-1)/2 || i==(n-1) && j> (n-1)/2){
                    System.out.print("PW");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("       ");
            // Loop For D
            for (int j = 0; j < n; j++) {
                if (i==0 && j<n/2 || i==n-1 && j<n/2 || j==0  || i==j-n/2 && j > n/2 || i-(n-1)/2 == n-j && j>n/2){
                    System.out.print("PW");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            // Loop For E
            for (int j = 0; j < n; j++) {
                if (i==0 || i==n-1 || j==0  || i==n/2){
                    System.out.print("PW");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            // Loop For F
            for (int j = 0; j < n; j++) {
                if (i==0 || j==0  || i==n/2){
                    System.out.print("PW");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            // Loop For G
            for (int j = 0; j < n; j++) {
                if (i==0 || j==0 || i==n/2 && j>n/2 || i==n-1 && j<(n+2)/2 || j==n-1 && i>n/2 || j==n/2 && i>(n-1)/2){
                    System.out.print("PW");
                }else {
                    System.out.print("  ");
                }
            }
            // Loop For H
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j==0 || i==n/2 || j==n-1){
                    System.out.print("PW");
                }else {
                    System.out.print("  ");
                }
            }
            // On End Of J Loop
            System.out.println("  ");
        }
    }
}
