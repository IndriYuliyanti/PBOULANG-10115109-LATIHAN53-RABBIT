/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan53.rabbit;

/**
 *
 * @author User
 */
public class Rabbit extends Animal {
    private final String color;
    private final String name;

    public Rabbit(String color, String name, boolean vegetarian, String food,int legs){
    super(vegetarian, food,legs);
    this.color = color;
    this.name = name;
    }
    

    public Rabbit(String color, String name){
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    
    
}
