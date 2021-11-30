/** @author Tulesh
 * @version 2.0
 *
 */
package com.company;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;
import java.lang.*;


class custom_exception extends Exception
{
    /**
     *
     * @param s
     */

    custom_exception(String s){
        System.out.println("Invalid Elasticsearch port configuration.");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        int num1;
        System.out.print("Enter any number : ");
        Scanner sc=new Scanner(System.in);

        try {
            if(sc.hasNextInt()) {
                num1 = sc.nextInt();

                if (num1 > 65000) {
                    throw new custom_exception("Invalid Elasticsearch port configuration.");
                } else {
                    System.out.println("Right input");
                }
            }
            else {
                throw new custom_exception("Invalid Elasticsearch port configuration.");
            }
        }
        catch(NumberFormatException e)
        {
            //If number is not integer,you wil get exception and exception message will be printed
            System.out.println(e.getMessage());
            System.out.println("Invalid Elasticsearch port configuration..");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
