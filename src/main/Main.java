package main;

import Media.Radio;
import Media.Television;

public class Main {

   
    public static void main(String[] args) {
       
     Television t1 = new Television();
     t1.showData();
     t1.setVolume(0);
     t1.setcurrentProgram(1);
     t1.setturnON(true);
     
     Television t2 = new Television(2, 3, false);
     t2.showData();
     
     Radio r1 = new Radio();
     r1.showData();
     r1.setfmFrequency(91.8);
     r1.setamFrequency(600);
     r1.setband('A');
     
     Radio r2 = new Radio(92.5, 200, 'B');
     r2.showData();
     
     
    
    }   
}
