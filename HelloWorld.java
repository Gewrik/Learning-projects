import java.util.*;
// Programm that prints "hello world!" randomly picking characters.
public class HelloWorld {
   
  public static String greeting(){
    String[] greet = new String[12];
    Random rand = new Random();
    char charar;
    
    while(!String.join("", greet).equals("hello world!")){
    charar = (char)rand.nextInt(32,122);  
    switch (charar){
      case 'h': 
        greet[0]="h";
        break;
      case 'e':
        greet[1]="e";
        break;
      case 'l':
        greet[2]="l";
        greet[3]="l";
        greet[9]="l";
        break;
      case 'o':
        greet[4]="o";
        greet[7]="o";
        break;
      case ' ':
        greet[5]=" ";
        break;
      case 'w':
        greet[6]="w";
        break;
      case 'r':
        greet[8]="r";
        break;
      case 'd':
        greet[10]="d";
        break;
      case '!':
        greet[11]="!";
        break;
    }
    }
    return String.join("", greet);
  }
}