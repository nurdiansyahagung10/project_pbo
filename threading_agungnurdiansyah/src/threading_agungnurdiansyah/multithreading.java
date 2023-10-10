/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threading_agungnurdiansyah;


public class multithreading implements Runnable{
    public void run() {
       
    }
    
    public static void main(String[] args) {
         Thread MThread1 = new Thread ("percobaan 1");
           Thread MThread2 = new Thread ("percobaan 2");
           Thread MThread3 = new Thread ("percobaan 3");
            MThread1.start(); 
            MThread2.start();
            MThread3.start(); 
             System.out.println("multithread sedang jalan nih");
            System.out.println(MThread1.getName());
            System.out.println(MThread2.getName());
            System.out.println(MThread3.getName());
    }
    

    
}
