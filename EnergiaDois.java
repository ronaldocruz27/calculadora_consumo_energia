package energiadois;
import java.util.Scanner;
public class EnergiaDois {
       public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
                
        System.out.println("Digite a quantidade de kWh usada:");
        float k;
        k=ler.nextFloat();
        
        System.out.println("Escolha o seu tipo de instalação de rede elétrica:");
        System.out.println("1: para residência");
        System.out.println("2: para comercial");
        System.out.println("3: para industrial");
        
        float v;
        float v1=0.40f;
        float v2=0.55f;
        float v3=0.60f;
        float v4=0.65f;
     
     System.out.println("Digite o código para o tipo de instalação correspondente:");
     int numero =ler.nextInt();
     switch(numero){
         case 1:
            if(k<=500){
            v=v1*k;
            System.out.println("O valor da fatura é R$"+v);
            }else{
            v=v4*k;
            System.out.println("O valor da fatura é R$"+v);}
            break;
         case 2:
            if(k<=1000){
            v=v2*k;
            System.out.println("O valor da fatura é R$"+v);
            }else{
            v=v3*k;
            System.out.println("O valor da fatura é R$"+v);}
            break;
         case 3:
            if(k<=5000){
            v=v2*k;
            System.out.println("O valor da fatura é R$"+v);
            }else{
            v=v3*k;
            System.out.println("O valor da fatura é R$"+v);}
            break;
         default:
        }
    }
}