/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Disatvantages_M5.LackOfFlexibility;

/**
 *
 * @author Dell
 */
public interface PersonADT {
   void add(Person person);
   Person get(int index);
   boolean contains(Person person);
   int size();
}