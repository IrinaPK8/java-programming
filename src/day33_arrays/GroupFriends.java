package day33_arrays;

public class GroupFriends {
    public static void main(String[] args) {
        // indexes      0     1        2         3         4         5           6        7
        String[] friends = {"Irina", "Anna", "Biniyam", "Marko", "Karlos", "Katarina", "Wilfrid", "Ayta"};
        for (int i = 0; i < friends.length; i++) {
            System.out.println("Happy holidays " + friends[i] + "!");
        }

        /** CAN USE FOR EACH LOOP */
        System.out.println("* * * * * * * * * * * * * *");
        for (String eachFriend : friends) {
            System.out.println("Happy holidays " + eachFriend + "!");
        }
    }
}
