public class Main {
    public static void main(String[] args) {
//        int[] myInts = {101, 21, 30213, 3123, 1938120, 312030, 231380, 5, 1275, 1751303, 213, 70123, 70192, 70192, 3701375, 913538157, 9013, 590317, 12301, 4015, 18, 41348, 3194343, 318, 43194, 31941749};

        int[] myInts = {-1, -5, 3, 7, -8, 9};

        //Find the biggest, smallest, mean, mode and median of this array and print them to the screen.

        int length = myInts.length;

        int[] myOrderedInts = new int[length];

        int smallest = myInts[0];
        int smallestInt = myInts[0];

        int biggest = myInts[0];

// finding biggest and smallest ints in array

        for (int i = 0; i < length; i++) {
            if (myInts[i] <= smallest) {
                smallest = myInts[i];
            }

        }
        for (int i = 0; i < length; i++) {
            if (myInts[i] > biggest) {
                biggest = myInts[i];
            }

        }

        int smallestPosition = 0;
        int intIgnore = smallest - 1;

// creating a new array with the numbers sorted

        for (int n = 0; n < length; n++) {
            smallestInt = biggest; // important to set the smallest int to a big number initially, so that each time it goes through the loop it

            for (int i = 0; i < length; i++) {

                if (myInts[i] <= smallestInt) {
                    if (myInts[i] <= intIgnore) {
                        continue;
                    }
                    smallestInt = myInts[i];
                    smallestPosition = i;
                }
            }
            myOrderedInts[n] = smallestInt;
            //
            myInts[smallestPosition] = myInts[smallestPosition] - 1 ;
            intIgnore = myInts[smallestPosition];
        }

        //median

        double median;
        if (length % 2 != 0) {
            median = myOrderedInts[length/2];
        }
        else {
            median = (myOrderedInts[length/2] + myOrderedInts[length/2 - 1]) / 2.0;
        }

        // mean / average

        int total = 0;
        double mean = 0;
        for (int i = 0; i < length; i++) {
            total = total + myInts[i];
            mean = 1.0 * total / myInts.length + 1;

        }

//        System.out.println("the smallest number is " + smallest);
//        System.out.println("the biggest number is " + biggest);
//        System.out.println("the mean is " + mean);
//        System.out.println("the median is " + median);


        for (int i = 0; i < length; i++) {
            System.out.println(myOrderedInts[i]);
        }
    }
}