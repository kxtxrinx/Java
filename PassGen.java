public class PassGen {

    public static String generate(){
        String[] aWords = {"cat","pet","sun","rise"};
        char[] aChar = {'z','y','x','j','w'};
        int[] aNumber = {1,2,3,4,5,6,7,8,9};

        //will be optimized soon!!
        String password = "" + aNumber[getRandomNumber(aNumber)] + aChar[getRandomChar(aChar)] + aChar[getRandomChar(aChar)] + aNumber[getRandomNumber(aNumber)] + aWords[getRandomWord(aWords)] + aChar[getRandomChar(aChar)] + aNumber[getRandomNumber(aNumber)] + aNumber[getRandomNumber(aNumber)] + aNumber[getRandomNumber(aNumber)] + aNumber[getRandomNumber(aNumber)];

        return password;
    }

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


    public static void main(String[]args){

        System.out.println(PassGen.generate());


    }
}
