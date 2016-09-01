/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JavaApplication1 {

    public static void main(String[] args) {   //psvm+tab    void-метод ничего не возвращает
        float num1,num2,result=0;
        String znak, q;
        Scanner scanner=new Scanner(System.in);  //new Scanner выделяем память
        do{
            System.out.printf("Введите первое число: ");
            num1=scanner.nextFloat();
            System.out.printf("Введите знак операции (+ - * /): ");
            znak=scanner.next();
            System.out.printf("Введите второе число: ");
            num2=scanner.nextFloat();

            if(znak.equals("+")){    //{}соcтавной оператор
                result=num1+num2;
            }
            if(znak.equals("-")){    
                result=num1-num2;
            }
            if(znak.equals("*")){    
                result=num1*num2;
            }
            /*if(znak.equals("/")){       
                result=num1/num2;
                {
                if(num2==0);
                    System.out.printf("На ноль делить нельзя%n");                    
                    return;
                }
            }*/
            if(znak.equals("/")){      
                if(num2!=0)
                    result=num1/num2;
                else{
                    System.out.printf("На ноль делить нельзя%n");
                    return;
                    //continue;
                }
            }
            System.out.printf("Результат: %.2f %s %.2f = %.2f%n",num1,znak,num2,result);
            System.out.printf("Выход из программы клавишa q%n");
            q=scanner.next();
        }
        while(!q.equals("q"));
    }
}    

/*public class Randint{
    public static void main(String[] args) {  
        Random random =new Random();
        int i = 0;
            while (i<20){
                System.out.prinf("",random.nextInt());
                i++;
            }
    }
}*/


/*123*/