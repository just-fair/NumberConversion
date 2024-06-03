
package numberconversion;

import java.util.Scanner;

public class NumberConversion {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        try{
            //Variable declaration
            int decimal=0;
            String binary="";
            String octal="";
            String hexadecimal="";
            
            //Input
            System.out.print("Enter Decimal Value: ");
            decimal=scan.nextInt();
            
            //Handle if input is 0
            if(decimal==0){
                binary="0";
                octal="0";
                hexadecimal="0";
                
                System.out.println("Binary: "+binary);
                System.out.println("Octal: "+octal);
                System.out.println("Hexadecimal: "+hexadecimal);
                
                return;
            }
            
            //Handle if input is negative number
            if(decimal<0){
                decimal= decimal * -1;
            }
            
            
           
            //Convert Decimal to Binary
            int inptDecimal=decimal;
            while(inptDecimal!=0){
                binary+=inptDecimal%2;
                inptDecimal/=2;      
            }
           
            //Convert Decimal to Octal
            inptDecimal=decimal;
            while(inptDecimal!=0){
                octal+=inptDecimal%8;
                inptDecimal/=8;      
            }
            
            //Convert Decimal to Hexadecimal
            inptDecimal=decimal;
            while(inptDecimal!=0){
                int remainder=inptDecimal%16;

                switch(remainder){
                    case 10:
                        hexadecimal+='A';
                        break;

                    case 11:
                        hexadecimal+='B';
                        break;

                    case 12:
                        hexadecimal+='C';
                        break;

                    case 13:
                        hexadecimal+='D';
                        break;

                    case 14:
                        hexadecimal+='E';
                        break;

                    case 15:
                        hexadecimal+='F';
                        break;

                    default:
                        hexadecimal+=remainder;
                        break;
                }

                inptDecimal/=16;      
           }
           
           
           //Reverse the value
           binary=reverseString(binary);
           octal=reverseString(octal);
           hexadecimal=reverseString(hexadecimal);
        
           System.out.println("Binary: "+binary);
           System.out.println("Octal: "+octal);
           System.out.println("Hexadecimal: "+hexadecimal);
          
            
        }
        catch(Exception e){
            System.out.println("Invalid input");
           
        }finally{
            scan.close();
        }
        
    }
    
    //Function reverse ng String
    public static String reverseString(String number){
        String value="";
           for(int i=number.length()-1; i>=0; i--){
               value+=number.charAt(i);
           }
           
          return value;
    }
    
}
