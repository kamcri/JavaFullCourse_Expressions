package org.example;

public class Main
{
    public static void main( String[] args )
    {
        /* Expressions in java
         * Operands = values, variables, numbers, quantity
         * operators = + - * / %
         */

        int friends = 15;

        friends = friends % 2;//prints 1 if there is a remainder

        System.out.println(friends);

        double friend = 10;

        friend = (double) friend / friend;

        System.out.println(friend);//prints decimal
    }
}
