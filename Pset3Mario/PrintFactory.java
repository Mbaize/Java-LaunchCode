/**
 * Created by Micah on 7/7/2014.
 */
public class PrintFactory {

    //use getPrint method to get object of type printer
    public Printer getPrinter(String option){
        if (option == null){
            return null;
        }
        else if (option.equalsIgnoreCase("c")){
            return new ConsolePrint();
        }
        else if (option.equalsIgnoreCase("f")){
            return new FilePrint();
        }
        return null;
    }
}
