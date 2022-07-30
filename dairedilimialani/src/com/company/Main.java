package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        double r=0;
        double aci =0;
        double alan;
        System.out.println("açının ölçüsünü yazınız : "+aci );
        aci= scanner.nextDouble();
        if(aci<=360){

            System.out.println("dairenin yarıçapını yazınız : "+r);
            r= scanner.nextDouble();
            alan=(pi*((r*r)*aci))/360;
            System.out.println("daire diliminin alanı : "+alan);


        }else{
            System.out.println("geçersiz değer");
        }




    }
}
