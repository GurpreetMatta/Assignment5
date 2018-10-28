/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author Gurpreet Singh
 */
interface animal
{
    void speak();
    void eat();
}
class Dog implements animal
{

    @Override
    public void speak() {
        System.out.println("implemented in Dog class");
    }

    @Override
    public void eat() {
        System.out.println("implemented in dog class");
    }
    
}
class Cat implements animal
{

    @Override
    public void speak() {
      System.out.println("implemented in Cat class");
    }

    @Override
    public void eat() {
      System.out.println("implemented in Cat class ");
    }
    
}
public class Program1 {
    public static void main(String a[])
    {
        Dog dog =new Dog();
        dog.speak();
        dog.eat();
        Cat cat=new Cat();
        cat.eat();
        cat.speak();
    }
}
