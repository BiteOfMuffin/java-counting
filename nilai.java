public class nilai {
    public static void main(String[] args) {
        int nilai1 = 85;
        int nilai2 = 90;
        int nilai3 = 35;

        if(nilai1 >= nilai2 && nilai1 >= nilai3) {
            System.out.println("Nilai tertinggi adalah: " + nilai1);
        } else if(nilai2 >= nilai1 && nilai2 >= nilai3) {
            System.out.println("Nilai tertinggi adalah: " + nilai2);
        } else {
            System.out.println("Nilai tertinggi adalah: " + nilai3);
        }
    }
}