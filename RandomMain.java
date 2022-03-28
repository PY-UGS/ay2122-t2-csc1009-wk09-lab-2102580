public class RandomMain {
    

    public static final int MAX = 15;
    public static void main(String[] args){

        RandomCharacter random = new RandomCharacter();

        System.out.println("Random Lowercase Letters: ");
        for(int j = 0; j<MAX; j++){
            System.out.print(random.getRandomLowerCaseLetter());
        }

        System.out.println("\n ");

        System.out.println("Random UpperCase Letters: ");
        for(int j = 0; j<MAX; j++){
            System.out.print(random.getRandomUpperCaseLetter());
        }

        System.out.println("\n ");
        System.out.println("Random Digit Character: ");
        for(int j = 0; j<MAX; j++){
            System.out.print(random.getRandomDigitCharacter());
        }

        System.out.println("\n ");
        System.out.println("Random Characters: ");
        for(int j = 0; j<MAX; j++){
            System.out.print(random.getRandomCharacter());
        }



    }
}
