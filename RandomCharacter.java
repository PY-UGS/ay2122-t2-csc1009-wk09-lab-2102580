import java.util.Random;




public class RandomCharacter{

    Random s = new Random();

    public char getRandomLowerCaseLetter(){
        char c = (char)(s.nextInt(26) + 'a');
        return c;
    }

    public char getRandomUpperCaseLetter(){
        char c = (char)(s.nextInt(26) + 'A');
        return c;
    }

    public char getRandomDigitCharacter(){
        int n = s.nextInt(10);
        char c = Character.forDigit(n, 10);
        return c;

    }

    public char getRandomCharacter(){
        int choice = s.nextInt(3);
        if(choice == 0){

            return getRandomLowerCaseLetter();
        }

        else if(choice == 1){
             
            return getRandomUpperCaseLetter();
        }

        else if(choice == 2){
            return getRandomDigitCharacter();
        }
        else {
            return '0';
        }
    }
}