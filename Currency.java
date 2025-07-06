import java.util.Scanner;

public class Currency {
     public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Welcome to Currency Converter");
        System.out.println("Choose the source Currency (IND,USD,EUR)");
        String SourceCurrency=sc.next().toUpperCase();
        System.out.println("Choose the  Target Currency (IND,USD,EUR)");
        String targetCurrency=sc.next().toUpperCase();

        System.out.println("Enter the Amount");
        double am=sc.nextDouble();

        double convertAmount=convert(SourceCurrency, targetCurrency, am);
        
        if(convertAmount!=-1){
            System.out.println("Converted Amount is "+convertAmount+" "+targetCurrency);
        }
        else{
            System.out.println("Sorry! Conversion Failed");
        }
        sc.close();
}

 
public static double convert(String from,String to,double amount){
    if(from.equals("IND") && to.equals("USD")){
        return amount*0.012;
    }
    else if(from.equals("USD") && to.equals("IND")){
        return amount*83.5;
    }
    else if(from.equals("EUR") && to.equals("IND")){
        return amount*90.0;

    }
    else if(from.equals("IND") && to.equals("EUR")){
        return amount*0.011;
    }
    else{
        return -1;  
      }
    }
        
    }

    



