package Assignment;


/* Programme for print the middle element when string is odd
and print two element when string is even.*/



public class MiddleElementInString {

    public  String getMiddle( String str ) {
        int position;
        int length;

        if(str.length() % 2 == 0){
            position = str.length() / 2 - 1;
            length=2;
            System.out.println(str.substring(position,position + length));
            return str.substring(position);
        }else{
            position = str.length() / 2;
            length = 1;
            System.out.println(str.substring(position, position + length));
            return str.substring(position, position + length);
        }
    }
    public static void main(String[] args) {
        String str ="ABCDEF";
        MiddleElementInString middleElementInString = new MiddleElementInString();
        middleElementInString.getMiddle(str);

    }
}
