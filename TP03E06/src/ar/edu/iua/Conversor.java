package ar.edu.iua;

public class Conversor {

    private int count;
    private int i;
    private int[] aux;
    private String auxStr;

    public Conversor() {
        i = 0;
        count = 1;
        auxStr = "";
    }


    private int toBinary(int num) {
        if(num < 2) {
            auxStr += num;
            return num;
        } else {
            auxStr += num%2;
            return toBinary(num/2);
        }

    }


    public int getBinaryNum(int num) {
        auxStr = "";
        toBinary(num);

        String tmp = "";
        for(i=auxStr.length()-1; i>=0; i--)
            tmp += auxStr.charAt(i);

        return Integer.parseInt(tmp);

    }


    public int getOnesInBinaryRepresentOfDecNum(int num) {
        if(num == 0)
            return 0;

        if(num > 2) {
            if(num%2 == 1)
                count++;
            return getOnesInBinaryRepresentOfDecNum(num/2);
        }

        int tmp = count;
        count = 1;
        return tmp;
    }


}
