 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int loop1 = 1;
          for (int i = 1; i<= number; i++) {;
          loop1 *= i;}
          return loop1;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {

        String result = phrase.substring(0, 1); 
        int pos = phrase.indexOf(' '); 
        while (pos != -1) {
            if (phrase.charAt(pos + 1) != ' ') { 
                result += phrase.substring(pos + 1, pos + 2); 
                pos = phrase.indexOf(' ', pos + 1); //Finds the next space sign
            }
        } 
    return result.toUpperCase();
              

     }
      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      
      public String encrypt(String word) {
          char[] chencrypt = new char[word.length()];
          for(int i = 0; i < word.length(); i++) {
              if (word.charAt(i) == 'x') {
                 chencrypt[i] = 'a';}
                  else if (word.charAt(i) == 'y') {
                    chencrypt[i] = 'b';}
                     else if (word.charAt(i) == 'z') {
                         chencrypt[i] = 'c';}
                           else chencrypt[i] = (char)(word.charAt(i) + 3);}
          String answer = new String(chencrypt);
          return answer;
          
      }
}
