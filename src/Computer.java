public abstract class Computer { // create class Computer

    public abstract String getRAM(); //create methods
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){ //return string
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}