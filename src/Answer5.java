public class Answer5 {
    public static void main(String[] args) {
        int n=10;
        //For Saurabh
        for (int i = 0; i < n; i++) {
            // Loop For S
            for (int j = 0; j < n; j++) {
                if (i==0||j==0 && i<n/2 || i==n/2 || j==n-1 && i>n/2 || i==n-1){
                    System.out.print("PW");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            // Loop For A
            for (int j = 0; j < n; j++) {
                if (i==(n-1)/2 || i+j == (n-1)/2 || j-i == (n-1)/2 || j==0 && i >(n-1)/2 || j==n-1 && i >(n-1)/2 ){
                    System.out.print("PW");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            // Loop For U
            for (int j = 0; j < n; j++) {
                if (i==(n-1)  || j==0 || j==n-1  ){
                    System.out.print("PW");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            // Loop For R
            for (int j = 0; j < n; j++) {
                if (j==0 || i==0 && j < (n-1)/2
                        ||i==(n-1)/2 && j < (n-1)/2
                        || j-i ==(n-1)/2 && j>=(n-1)/2 && j<=((n-1)/2)+2
                        || j+i ==((n-1)/2)+4 && i<(n-1)/2 && j>=(n-1)/2 && j<=((n-1)/2)+2
                        || j-i==0 && j>=(n-1)/2
                ){
                    System.out.print("PW");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
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
        System.out.println("\n\n\n");
        // For Sharma
        for (int i = 0; i < n; i++) {
            // Loop For S
            for (int j = 0; j < n; j++) {
                if (i==0||j==0 && i<n/2 || i==n/2 || j==n-1 && i>n/2 || i==n-1){
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
            System.out.print("  ");
            // Loop For A
            for (int j = 0; j < n; j++) {
                if (i==(n-1)/2 || i+j == (n-1)/2 || j-i == (n-1)/2 || j==0 && i >(n-1)/2 || j==n-1 && i >(n-1)/2 ){
                    System.out.print("PW");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            // Loop For R
            for (int j = 0; j < n; j++) {
                if (j==0 || i==0 && j < (n-1)/2
                        ||i==(n-1)/2 && j < (n-1)/2
                        || j-i ==(n-1)/2 && j>=(n-1)/2 && j<=((n-1)/2)+2
                        || j+i ==((n-1)/2)+4 && i<(n-1)/2 && j>=(n-1)/2 && j<=((n-1)/2)+2
                        || j-i==0 && j>=(n-1)/2
                ){
                    System.out.print("PW");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            // Loop For U
            for (int j = 0; j < n; j++) {
                if (j==0 || j==n-1  || i==j && j<n/2 || i==n-1-j && j>(n-1)/2){
                    System.out.print("PW");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            // Loop For A
            for (int j = 0; j < n; j++) {
                if (i==(n-1)/2 || i+j == (n-1)/2 || j-i == (n-1)/2 || j==0 && i >(n-1)/2 || j==n-1 && i >(n-1)/2 ){
                    System.out.print("PW");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // On End Of J Loop
            System.out.println("  ");
        }

    }
}
