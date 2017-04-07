class FooCorporation {

public static void workerPay(double basePay, int hoursWorked){
        double totalPay;
        double overTimeTotal;
        double coreTotal;
        int coreHours = 40;
        if ((basePay < 8.00) || (hoursWorked > 60)){
          System.out.println("ERROR. Base Pay Below Minimum OR Too Many Hours Worked");
          return;
        }
        if (hoursWorked > 45) {
                coreTotal = 40 * basePay;
                overTimeTotal = (45 - coreHours) * (basePay*1.5);
                totalPay = coreTotal + overTimeTotal;
        } else if ((hoursWorked > 40) && (hoursWorked <= 45)){
                coreTotal = 40 * basePay;
                overTimeTotal = (hoursWorked - 40) * (basePay*1.5);
                totalPay = coreTotal + overTimeTotal;
        } else {
              totalPay = hoursWorked * basePay;
        }

    System.out.println(totalPay);
}

public static void main(String[] args){
        workerPay(7.5, 35);
        workerPay(8.2, 47);
        workerPay(10.0, 73);
}

}
