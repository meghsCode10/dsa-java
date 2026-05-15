public class pattern2 {

    public static void Hollow_Rect(int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.println("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_pyramind(int n) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inv_halfpyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyd_pyramind(int n){
        int count=0;
        for(int i= 1; i<=n; i++){
            for(int j=1; j<= i; j++){
                count++;
                System.out.print(count);
            }
            System.out.println();
        }
    }

    public static void triPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(((i+j)%2 == 0)){
                    System.out.print(1);
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){

        //first half

        for(int i=1; i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=1; j<=(2*(n-i));j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        //second half
        for(int i=n; i>=1; i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=1; j<=(2*(n-i));j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void solid_rhombus(int n){
        for(int i=1;i <=n; i++){
            for(int j=1; j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){

            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int j=1; j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void diamond(int n){
    //first half
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<= (n-i);j++){
                System.out.print( " ");
            }

            //stars
            for(int j=1; j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

          //second half
        for(int i=n; i>=1; i--){
             //spaces
             for(int j=1; j<= (n-i);j++){
                System.out.print( " ");
            }

            //stars
            for(int j=1; j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
   

    

    public static void main(String[] args) {
        // Hollow_Rect(4,5);
        // inverted_pyramind(4);
        // inv_halfpyramid(5);
        // floyd_pyramind(5);
        // triPyramid(5);
        // butterfly(4);
        // solid_rhombus(5);
        // hollow_rhombus(5);
           diamond(4);
    }
}
