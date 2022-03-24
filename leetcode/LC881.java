import java.util.Arrays;

public class LC881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int left = 0;
        int right = people.length;

        int numBoat = 0;
        while (left < right) {
            if (people[left] + people[--right] <= limit) {
                ++left;
            }
            ++numBoat;
        }

        return numBoat;
    }

    public static void main(String[] args) {
        int[] people;
        int limit;

        people = new int[]{1, 2};
        limit = 3;
        System.out.println(new LC881().numRescueBoats(people, limit)); // 1

        people = new int[]{3, 2, 2, 1};
        limit = 3;
        System.out.println(new LC881().numRescueBoats(people, limit)); // 3

        people = new int[]{3, 5, 3, 4};
        limit = 5;
        System.out.println(new LC881().numRescueBoats(people, limit)); // 4

        people = new int[]{2,49,10,7,11,41,47,2,22,6,13,12,33,18,10,26,2,6,50,10};
        limit = 50;
        System.out.println(new LC881().numRescueBoats(people, limit)); // 11
    }
}
