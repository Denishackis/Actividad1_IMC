/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024_actividad1;

import javax.swing.JOptionPane;

/**
 *
 * @author denis
 */
public class Persona {
     private float estatura;
    private float peso;
    private float imc;
    public float getEstatura(){
    return estatura;
}

public void setEstatura (float e){
    estatura=e;
}
public float getPeso(){
    return peso;
}
public void setPeso(float p){
    peso = p;
}

public float getIMC(){
    return imc;
}
public void setIMC(){
    imc = getPeso() / (getEstatura() * getEstatura());
}
public void mostrarIMC(){
    JOptionPane.showMessageDialog(null, "Su IMC es: " + getIMC());
    
    if(getIMC() < 18.5){
        JOptionPane.showMessageDialog(null,"Bajo peso");
    }else if (getIMC() >= 18.5 && getIMC() <=24.9){
         JOptionPane.showMessageDialog(null,"Normal");
    }else if (getIMC() >= 25 && getIMC() <=29.9){
         JOptionPane.showMessageDialog(null,"Sobrepeso");
    }else if (getIMC() >= 30 && getIMC() <=34.9){
         JOptionPane.showMessageDialog(null,"Obesidad I"); 
    }else if (getIMC() >= 35 && getIMC() <=39.9){
         JOptionPane.showMessageDialog(null,"Obesidad II");
    }else {
         JOptionPane.showMessageDialog(null,"Obesidad III");
         
    }
    
  }
}
