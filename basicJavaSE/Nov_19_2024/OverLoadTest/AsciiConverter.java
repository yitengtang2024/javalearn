package OverLoadTest;

public class AsciiConverter{
  public void print(int ascii){
    if (ascii >=65 && ascii <=90){
      System.out.println("Capital letter: "+ (char)ascii);
    }else{
      System.out.println("Invalid ASCII value");
    }
  }

  public void print(char uppercase){
    if (uppercase>='A'&& uppercase<='Z'){
      System.out.println("The corresponding lowercase is "+ (char)(uppercase +32));
    }else{
      System.out.println("Invalid uppercaser letter!");
    }
  }
  public static void main(String[] args) {
    AsciiConverter converter = new AsciiConverter();

    converter.print(66);

    converter.print('B');
  }
}
