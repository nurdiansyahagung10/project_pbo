/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threading_agungnurdiansyah;

/**
 *
 * @author USER
 * 
 * 
 */
  class Multix implements Runnable{
        public void run(){
            System.out.println("thread implements is running...");
        }
        public static void main(String args[]) {
            Multix m1 = new Multix();
            Thread t1 = new Thread(m1);
            t1.start();
        }
    
}
