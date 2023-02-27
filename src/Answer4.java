public class Answer4 {
    public static void main(String[] args) {
        int n=9;
        for (int i = 0; i < n; i++) {
            // Loop For P
            for (int j = 0; j < n; j++) {
                if (j==0 || i==0 && j < (n-1)/2 ||i==(n-1)/2 && j < (n-1)/2 || j-i ==(n-1)/2 &&  j>=(n-1)/2 && j<=((n-1)/2)+2 || j+i ==((n-1)/2)+4 && i<(n-1)/2 && j>=(n-1)/2 && j<=((n-1)/2)+2){
                    System.out.print("pw");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            // Loop For W
            for (int j = 0; j < n; j++) {
                if (i+j==n && j<(n+1)/2 || i==j && j>n/2 || j==0 || j==n-1){
                    System.out.print("pw");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("          ");

            // Loop For s
            for (int j = 0; j < n; j++) {
                if (j==0 && i <n/2 || j==n-1 && i>n/2 || i==0 || i==n/2 || i ==n-1){
                    System.out.print("pw");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            // Loop For k
            for (int j = 0; j < n; j++) {
                if (j==0 || i==j+n/2 || i==(n/2)-j){
                    System.out.print("pw");
                }else {
                    System.out.print("  ");
                }
            }

            // Loop For L
            for (int j = 0; j < n; j++) {
                if (j==n/2 ||i==0 || i==n-1 ){
                    System.out.print("pw");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // Loop For L
            for (int j = 0; j < n; j++) {
                if (j==0 || i==n-1 ){
                    System.out.print("pw");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            // Loop For L
            for (int j = 0; j < n; j++) {
                if (j==0 || i==n-1 ){
                    System.out.print("pw");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            // Loop For s
            for (int j = 0; j < n; j++) {
                if (j==0 && i <n/2 || j==n-1 && i>n/2 || i==0 || i==n/2 || i ==n-1){
                    System.out.print("pw");
                }else {
                    System.out.print("  ");
                }
            }

            //ON END OF J I LOOP
            System.out.println("  ");
        }

    }
}
