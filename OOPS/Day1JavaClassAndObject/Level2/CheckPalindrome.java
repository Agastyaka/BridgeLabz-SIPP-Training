class PalindromeChecker{
    String text;
    public boolean Palindrome(){
        int start =0;
        int end=text.length()-1;
        while(start<end){
            if(text.charAt(start)!=text.charAt(end)){
                return false;
               

            }
            start ++;
            end --;
        }
        return true;

    }
    public void display(){
        System.out.println("the text is palindrome "+Palindrome());
    }
}


public class CheckPalindrome {
    public static void main(String[] args) {
        PalindromeChecker no1= new PalindromeChecker();
        no1.text="rar";
         PalindromeChecker no2= new PalindromeChecker();
         no2.text="rahul";
         no1.display();
         no2.display();

    }


    
}