
package Media;


public class Television {
    
    private int volume;
    private int currentProgram;
    private boolean turnON;
    
    public int getVolume() {
    return volume;
    
   }
    
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public int getcurrentProgram() {
        return currentProgram;
    }
    
    public void setcurrentProgram(int currentProgram) {
        this.currentProgram = currentProgram;
    }
    
     public boolean getturnON() {
        return turnON;
    }
    
    public void setturnON(boolean turnON) {
        this.turnON = turnON;
    }
    
    public Television() {
        this.volume = 0;
        this.currentProgram = 1;     
        this.turnON = true;
        
    }
    
    public Television(int volume, int currentProgram, boolean turnON) {
        this.volume = volume;
        this.currentProgram = currentProgram;
        this.turnON = turnON;
    
    }
    
     public void showData() {
        System.out.println("Volume is: " + getVolume());
        System.out.println("currentProgram is: " + getcurrentProgram());
        System.out.println("turnON: " + getturnON());
    }
    
}
