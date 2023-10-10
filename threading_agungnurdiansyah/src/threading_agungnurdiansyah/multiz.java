/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threading_agungnurdiansyah;
class Multiz extends Thread {
        public void run(){
            System.out.println("thread extends is run....");
        }
    
    public static void main(String[] args) {
        Multiz t1 = new Multiz();
        t1.start();
    }
    
}
