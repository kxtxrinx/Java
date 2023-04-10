import java.util.Scanner;
public class PassGen {

    private static String[] aWords = {"cat","pet","sun","rise","sus","peep","uh","btw","less"};
    private static char[] aChar = {'z','y','x','j','w','X','Z','W','J','F'};
    private static int[] aNumber = {1,2,3,4,5,6,7,8,9};

    //more optimized version!! can be better tho :)
    public static String generate(int passLength){
        StringBuilder sb = new StringBuilder(); // sb == password

        for(int i=0;i<passLength;i++){
            int opt = (int)(Math.random()*3);
            if (opt == 0){
                sb.append(aWords[(int)(Math.random()*aWords.length)]);
            }else if (opt == 1){
                sb.append(aChar[(int)(Math.random()*aChar.length)]);
            }else{
                sb.append(aNumber[(int)(Math.random()*aNumber.length)]);
            }
        }
        return sb.toString();
    }

    /*
    public static int getRandomWord(String[] aWords){
        int posW = (int)(Math.random()*aWords.length);
        return posW;
    }

    public static int getRandomChar(char[] aChar){
        int posC = (int)(Math.random()*aChar.length);
        return posC;
    }

    public static int getRandomNumber(int[] aNumber){
        int posN = (int)(Math.random()*aNumber.length);
        return posN;
    }
     */


    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int passLength = 0;
        do{
            System.out.println("How long do you want your pass to be?");
            passLength = s.nextInt();
            if(passLength<0){
                System.out.println("Please, enter an integer number greater than 0");
            }
        }while(passLength<1);

        System.out.println(PassGen.generate(passLength)); //pass generation

        if(passLength<5){
            System.out.println("Uh...it's kinda weak, be carefull out there");
        }else if(passLength>=5 && passLength<=8){
            System.out.println("Not that bad, but could be better.");
        }else{
            System.out.println("Yeah that's definitely a pretty strong pass!! Don't leak it :)");
        }

        s.close();

    }
}
