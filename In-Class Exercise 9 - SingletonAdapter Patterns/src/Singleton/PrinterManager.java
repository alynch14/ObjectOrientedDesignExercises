package Singleton;

public class PrinterManager {
    private static PrinterManager singleInstance;
    private Printer[] printers;

    public static PrinterManager getInstance() {
        if(singleInstance == null)
            singleInstance = new PrinterManager(8);
        return singleInstance;
    }

    private PrinterManager(int numOfPrinters){
        printers = new Printer[numOfPrinters];

        for(int i = 0; i<numOfPrinters; i++){
            printers[i] = new Printer();
        }
    }

    public String assignJob(String printJob){
        for(Printer printer : printers){
            if(!printer.isBusy()){
                printer.setBusy(true);
                printer.setPrintJob(printJob);
                return "The job is assigned.";
            }
        }
        return "All printers are busy. Please try again later.";
    }

    public void showStatus(){
        for(int i = 0; i<printers.length; i++){
            System.out.print("Status of Printer " + i + ": ");
            if(printers[i].isBusy()){
                System.out.print("Busy\n");
            }else
                System.out.print("Available\n");
        }
    }
}
