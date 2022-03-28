import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


//import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class TestCharacter {
    

    static RandomCharacter rand;

    @BeforeAll
    public static void setup(){
        rand = new RandomCharacter();
    }

    @Test
    void getRandomLowerCaseLetter(){
        char test = rand.getRandomLowerCaseLetter();
        assertTrue(Character.isLowerCase(test));
    }

    @Test
    void getRandomUpperCaseLetter(){
        char test = rand.getRandomUpperCaseLetter();
        assertTrue(Character.isUpperCase(test));
    }

    @Test
    void getRandomDigitCharacter(){
        char test = rand.getRandomDigitCharacter();
        assertTrue(Character.isDigit(test));
    }

    @Test
    void getRandomCharacter(){
        char test = rand.getRandomCharacter();
        assertTrue(Character.isLetterOrDigit(test));
    }

    @Test
    void getPrime(){
        
         int test = (int) rand.getRandomDigitCharacter() -'0';
         boolean isItPrime = true;
         System.out.println("Generated number: " + test );
 
         if (test <= 1) {
            isItPrime = false;
        } 
        else {
            for (int i = 2; i <= test/2; i++) {
                if (test % i == 0){
                    isItPrime = false;
                    break;
                }
            }
        }
        
          
         assertTrue(isItPrime);
        }
        
    
}
