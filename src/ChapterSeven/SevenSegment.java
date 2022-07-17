package ChapterSeven;

public class SevenSegment {

    static int[][] arrays = new int[5][4];

    public static void main(String[] args) throws InterruptedException, IllegalAccessException {
        input("1111111");
        display();
    }

    static void display() throws InterruptedException {
        for (int[] i : arrays){
            for (int j : i){
                if(j == 1){
                    System.out.print("* ");
                }
                else System.out.print("  ");

                Thread.sleep(300);
            }
            System.out.println();
        }
    }

    public static void fill(){
        arrays[0][0] = 1;
        arrays[0][1] = 1;
        arrays[0][2] = 1;
        arrays[0][3] = 1;

    }

    public static void fillB(){
        arrays[0][3] = 1;
        arrays[1][3] = 1;
        arrays[2][3] = 1;

    }

    public static void fillC(){

        arrays[2][3] = 1;
        arrays[3][3] = 1;
        arrays[4][3] = 1;

    }

    public static void fillD(){
        arrays[4][0] = 1;
        arrays[4][1] = 1;
        arrays[4][2] = 1;
        arrays[4][3] = 1;
    }
    public static void fillE(){
        arrays[2][0] = 1;
        arrays[3][0] = 1;
        arrays[4][0] = 1;
    }

    public static void fillF(){
        arrays[0][0] = 1;
        arrays[1][0] = 1;
        arrays[2][0] = 1;
    }

    public static void fillG() throws InterruptedException {
        arrays[2][0] = 1;
        arrays[2][1] = 1;
        arrays[2][2] = 1;
        arrays[2][3] = 1;
    }

    static void input(String input) throws IllegalAccessException, InterruptedException {
        if (input.length() > 8){
         input = input.substring(0,1);
        }
        char [] fill = input.toCharArray();
        for(char i : fill){
            if(!(i == '1' || i == '0')){
             throw new IllegalAccessException("Only 1's and 0's are accepted");
            }
        }

        for(int i = 0; i < input.length(); i++ ){
            if(input.charAt(i) == '1'){
                switch (i){
                    case 0-> fill();
                    case 1-> fillB();
                    case 2-> fillC();
                    case 3-> fillD();
                    case 4-> fillE();
                    case 5-> fillF();
                    case 6-> fillG();
                }
            }
        }
    }




}





