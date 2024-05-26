class DivisionByZeroException extends Exception{
 public DivisionByZeroException(String message){
  super(message);
 }
}
public class DivisionByZero{
 public static void main(String[]args){
  try{int numerator=10;
  int denominator=0;
  if(denominator==0){
   throw new DivisionByZeroException("Division By Zero Error");
  }
 int result=numerator/denominator;
 System.out.println("Result:"+result);
 }
 catch(DivisionByZeroException e){
 System.out.println("Exceeption caught :"+ e.getmessage());
 }
 finally{
  System.out.println("Finally block executed");


 }



 }
}
