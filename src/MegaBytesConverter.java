public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int kb = kiloBytes;
            int mb = Math.round(kiloBytes / 1024);
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println("Project Was Sucessfully Executed.");
            System.out.println(kb +" KB = "+mb+" MB and "+remainingKiloBytes+" KB");

        }

    }
}
