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
abstract class Vehicle
{
public abstract void start();
public abstract void stop();        
}
class twowheeler extends Vehicle
{
    @Override
    public void start()
    {
        System.out.println("this is start function implemented in twowheeler class");
    }
    @Override
    public void stop()
    {
        System.out.println("this is stop function implemented in twowheeler class");
    }
}
class fourwheeler
{
    public void start()
    {
        System.out.println("this is startfunction implemented in fourwheeler class");
    }
    public void stop()
    {
        System.out.println("this is stop function implemented in fourwheeler class");
    }
    
}
public class Program2 {
public static void main(String args[])
{
    twowheeler tw=new twowheeler();
    tw.start();
    tw.stop();
    fourwheeler fw=new fourwheeler();
    fw.start();
    fw.stop();
}}
