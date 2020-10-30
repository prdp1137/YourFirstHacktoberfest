// Write a program in Java to allow users to enter an arithmetic expression and display the result!
public class Problem4 {
     
      public static void main(String[] args) {
       
          double firstNum;      double secondNum;     double value;  char operator;     
                   
          TextIO.putln("Enter expressions");
          TextIO.putln("using any of the operators +, -, *, /.");
          TextIO.putln("To end, enter a 0.");
          TextIO.putln();
          
          while (true) {
              
            
              TextIO.put("? ");
              firstNum = TextIO.getDouble();
              if (firstNum == 0)
                 break;
              operator = TextIO.getChar();
              secondNum = TextIO.getlnDouble();
              
              
              switch (operator) {
                  case '+':
                     value = firstNum + secondNum;
                     break;
                  case '-':
                     value = firstNum - secondNum;
                     break;
                  case '*':
                     value = firstNum * secondNum;
                     break;
                  case '/':
                     value = firstNum / secondNum;
                     break;
                  default:
                     TextIO.putln("Unknown operator: " + operator);
                     continue; 
              } 
              
             
              
              TextIO.putln("Value is " + value);
              TextIO.putln();
                        
          } 
          
          TextIO.putln("Good bye");
       
       }  

    }  
