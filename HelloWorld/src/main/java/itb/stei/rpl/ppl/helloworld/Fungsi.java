/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itb.stei.rpl.ppl.helloworld;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Fungsi {   
    public int kali(int a, int b){
        return a*b;
    }
    
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        Scanner in = new Scanner(System.in);
        Fungsi obj = new Fungsi();
        int result = obj.kali(Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()));
        System.out.println( result );
    }
}
