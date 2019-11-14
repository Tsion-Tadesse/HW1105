/*
 * Tsion Tadesse    
 * COSC 331, FAll 2019
 * November 14, 2019
 */
import java.util.Random;
import java.util.*;
import java.util.Arrays;
import java.util.Hashtable;

public class Hw012{
    static int[] key = new int [8];
    static int[] hashValues = new int [11];
    static int a;
    static int i, j;
    static int[] hkey = new int [11];
    static boolean occupied = false;
    public static void main(String[] args){
        Random r = new Random();
        for(i=0; i<key.length; i++){
            key[i] = r.nextInt(99);
            System.out.print(key[i] + ", ");
            a = key[i] % 11;    // the mod by 11 of the array values       
            System.out.println("=" + a ); // prints the the mod by 11 of the array values 
        }

        System.out.println("");   
        for(i=0; i<hashValues.length; i++){           
            hashValues = Arrays.copyOf(key, 11);             
            for(i=0; i<key.length; i++){
                if(hashValues[i] % 11 == 1){
                    hkey[1] = hashValues[i];
                }                
            }
            for(i=0; i<key.length; i++){
                if(hashValues[i] % 11 == 2){
                    hkey[2] = hashValues[i];
                }                
            }
            for(i=0; i<key.length; i++){
                if(hashValues[i] % 11 == 3){
                    hkey[3] = hashValues[i];                                     
                }
            }
            for(i=0; i<key.length; i++){
                if(hashValues[i] % 11 == 4){
                    hkey[4] = hashValues[i];                    
                }               
            }
            for(i=0; i<key.length; i++){
                if(hashValues[i] % 11 == 5){
                    hkey[5] = hashValues[i];                  
                }             
            }
            for(i=0; i<key.length; i++){
                if(hashValues[i] % 11 == 6){
                    hkey[6] = hashValues[i];

                }
            }
            for(i=0; i<key.length; i++){
                if(hashValues[i] % 11 == 7){
                    hkey[7] = hashValues[i];                   
                }               
            }
            for(i=0; i<key.length; i++){
                if(hashValues[i] % 11 == 8){
                    hkey[8] = hashValues[i];                                      
                }
            }
            for(i=0; i<key.length; i++){
                if(hashValues[i] % 11 == 9){
                    hkey[9] = hashValues[i];                                    
                }               
            }
            for(i=0; i<key.length; i++){
                if(hashValues[i] % 11 == 10){
                    hkey[10] = hashValues[i];                  
                }
            }
            for(i=0; i<key.length; i++){
                if(hashValues[i] % 11 == 0){
                    hkey[0] = hashValues[i];               
                }              
            }            
            for(i=0; i<hashValues.length; i++){                
                System.out.println(hkey[i]);
            }
        }
    }
}