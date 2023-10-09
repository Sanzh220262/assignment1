public class ComputerFactory { // create class
    public static Computer getComputer(String type, String ram, String
            hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);// if type is pc create and return
        else if("Server".equalsIgnoreCase(type)) return new Server(ram,  //if type is server create and return
                hdd, cpu);

        return null;
    }
}


