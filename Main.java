public class Main {
    public static void main (String[] args){
        String[] cars = {"audi", "volvo", "mercedes"};//array of strings
        int[] numbers = {1, 2, 3, 4, 5};//array of integers
        //accessing elements in an array
        System.out.println(numbers[1]);//this will print 2- zero indexing
        System.out.println(cars[2]);//this wil print mercedes if the arrays in java are zeroindexed like in most languages
        //arrays are zero indexed as it turns out which makes things a little bit easier
        //changing an element in an array
        cars[2] = "BMW";
        System.out.println(cars[2]);//should print BMW
        cars[2] = "mercedes";
        System.out.println(cars.length);//should print 3
    }
}
