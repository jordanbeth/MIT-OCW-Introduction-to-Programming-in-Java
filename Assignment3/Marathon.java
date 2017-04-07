class Marathon {

public static void getFastestRunner(String[] names, int[] times, Integer fastestTime, String fastestRunner){

for (int i = 1; i < times.length; i++) {
        if (times[i] < fastestTime) {
                fastestTime = times[i];
                fastestRunner = names[i];

        }
}
System.out.println(fastestRunner + ": " + fastestTime);
}

public static void main (String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };
        int fastestTime = times[0];
        String fastestRunner = names[0];
        getFastestRunner(names, times, fastestTime, fastestRunner);
}
};
