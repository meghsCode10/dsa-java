
public class pattern1 {
    public static void main(String[] args) {

        //intro to nested loop
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //     System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Inverted star pattern
        // for(int i= 1; i<=4;i++){
        //     for(int j=1; j<=(4-i+1);j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Half pyramid pattern
        // for(int line = 1; line<= 4; line++){
        //     for (int n = 1; n<=line; n++){
        //         System.out.print(n);
        //     }
        //     System.out.println();
        // }

        //Character pattern
        char ch  ='A';
        for(int line = 1; line<= 4; line++){
            for (int n = 1; n<=line; n++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
