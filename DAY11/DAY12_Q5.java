class Printer{
    public void print(String file){
        System.out.println("printing started for file"+file);
        try{
            System.out.println("----");
            System.out.println("----");
            System.out.println("-----");
            Thread.sleep(200);

        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("printing finished for file"+file);

    }
}
class PrinterFactory{
    public static Printer printer;
}
class MyComputer extends Thread{
    private String file;
    public MyComputer(String file){
        this.file = file;
    }
    public void run(){
        PrinterFactory

    }
}