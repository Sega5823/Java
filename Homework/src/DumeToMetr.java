class DumToMetr {
    public static void main(String args[]) {
        double dume, metr;
        int counter, fut;
        fut = 0;
        counter = 0;

        for(dume = 1; fut <= 12; dume++){
            metr = dume / 39.37;
            System.out.println(dume + " дюйм соответствует " +
                    metr + " метру.");
            counter++;
            if (counter == 12){
                System.out.println();
                fut++;
                counter = 0;
            }
        }
    }
}
