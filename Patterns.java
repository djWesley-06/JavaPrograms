public class Patterns {
    public int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }
    public void pattern1(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pattern2(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++) {
                System.out.print("*");
                for (int k = j+1; k < n - i-1; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void pattern3(int n){
        for(int i = n;i>=1;i--){
            for(int j = 1;j<=i;j++) {
                System.out.print("*");
                for (int k = j+1; k < n - i-1; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void pattern4(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++) {
                System.out.print(j+" ");
                for (int k = j+1; k < n - i-1; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void pattern5(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++) {
                System.out.print("*");
                for (int k = j+1; k < n - i-1; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = n-1;i>=1;i--){
            for(int j = 1;j<=i;j++) {
                System.out.print("*");
                for (int k = j+1; k < n - i-1; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public void pattern6(int n){
        for(int i = 1;i<=n;i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for(int k =1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern7(int n){
        for(int i = n;i>=1;i--) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for(int k =1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern8(int n){
        for(int i = 1;i<=n;i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for(int k = 1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern9(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 2 * i - 1; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern10(int n){
        for(int i = 1;i<=n;i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for(int k =1; k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pattern11(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1;k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pattern12(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1;k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1;i<=n;i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for(int k =1; k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern13(int n){
        for(int i = 1;i<=n;i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void pattern14(int n){
        for(int i = n;i>=1;i--) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void pattern15(int n){
        for(int i = 1;i<=n;i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = n-1;i>=1;i--) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void pattern16(int n){
        for(int i = 0;i<n;i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for(int k = 0;k<=i;k++){
                System.out.print(((factorial(i))/((factorial(i-k))*factorial(k)))+" ");
            }
            System.out.println();
        }
    }
    public void pattern17(int n){
        int k = 1;
        for(int i = 1;i<=n;i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for(k = i;k>=1;k--) {
                System.out.print(k);
            }
            for(int l = k+2;l<=i;l++){
                System.out.print(l);
            }

            System.out.println();
        }
    }
    public void pattern18(int n){
        int k = 1;
        for(int i = 1;i<=n-1;i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for(k = i;k>=1;k--) {
                System.out.print(k);
            }
            for(int l = k+2;l<=i;l++){
                System.out.print(l);
            }

            System.out.println();
        }
        for(int i = n;i>=1;i--) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for(k = i;k>=1;k--) {
                System.out.print(k);
            }
            for(int l = k+2;l<=i;l++){
                System.out.print(l);
            }

            System.out.println();
        }
    }



}
