package day48_constructore_static;

import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        Group group1 = new Group("Cyberbugs");  // dependency injection. Group object depends on String
        System.out.println(group1.getMembers().size());     // to see how many members are in the group1 now
            // can add members one by one
        group1.addMember("Irina");
        group1.addMember("Art");
        group1.addMember("Anna");
        group1.addMember("Jane");
        group1.addMember("Mimi");
        group1.addMember("Alex");
        group1.addMember("John");

        System.out.println(group1.getMembers().size());     // size of group is 7 people now
        System.out.println(group1.toString());              // printing who is in group


        Group group2 = new Group("Cybercats");
            // can add members using Array List
        group2.setMembers (Arrays.asList("Nancy", "Stephen", "Maria", "Andrea"));

            // print all members, not toString
        System.out.println("Group2 members = " + group2.getMembers());

            // let' check if certain name is in group2
        if (group2.getMembers().contains ("Maria")) {
            System.out.println("Maria is a member of group2");
        }else {
            System.out.println("Maria is not the member of group2");
        }

            // remove some members from group1
        group1.removeMember("Mimi");
        group1.removeMember("Alex");
        System.out.println("After removal group1 = " + group1);

        }
    }