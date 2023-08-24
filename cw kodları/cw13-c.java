public class Main {
    public static void main(String[] args) {
        int [] [] distance = {
            {0, 434, 541, 842, 229},
            {434, 279, 932, 378, 763},
            {541, 378, 600, 345, 493},
            {842, 932, 345, 600, 1453},
            {229, 763, 493, 1453, 0},
        };
        System.out.println("Among this distances the smallest distance is: " +smallestDistance(distance)); 
    }
    
    public static int smallestDistance(int [] [] distance) {
        int smallest = distance [0] [1];
        for (int x = 0; x < distance.length; x++) {
            for(int y = x + 1; y < distance.length; y++) {
                if (distance [x] [y] < smallest) {
                    smallest = distance [x] [y];
                    
                }
            }
        }
        return smallest;
    }
}
 
 

