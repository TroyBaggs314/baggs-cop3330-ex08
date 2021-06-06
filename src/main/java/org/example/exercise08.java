/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Troy Baggs
 */

package org.example;
import java.util.Scanner;
class Party
{
    int people;
    int pizzas;
    int slices;
}

public class exercise08
{
    public static void main(String[] args)
    {
        Party p = new Party();
        p = inputs(p);
        System.out.println(p.people + " people with " + p.pizzas + " pizzas (" + (p.slices * p.pizzas) + ")\nEach person gets " + ((p.slices * p.pizzas) / p.people) + " pieces of pizza.\nThere are "+ ((p.slices * p.pizzas) % p.people) + " leftover pieces.");
    }

    public static Party inputs(Party p)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many people?");
        p.people = sc.nextInt();
        System.out.println("How many pizzas do you have?");
        p.pizzas = sc.nextInt();
        System.out.println("How many slices per pizza?");
        p.slices = sc.nextInt();
        return p;
    }
}
