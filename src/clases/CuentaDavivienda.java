/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author SP
 */
public class CuentaDavivienda { 
   private int numerocuenta;private int identificacion;private long saldoactual;private long interesanual; 

    public CuentaDavivienda(int numerocuenta, int identificacion, long saldoactual, long interesanual) {
        this.numerocuenta = numerocuenta;
        this.identificacion = identificacion;
        this.saldoactual = saldoactual;
        this.interesanual = interesanual;
    }

    public int getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public long getSaldoactual() {
        return saldoactual;
    }

    public void setSaldoactual(long saldoactual) {
        this.saldoactual = saldoactual;
    }

    public long getInteresanual() {
        return interesanual;
    }

    public void setInteresanual(long interesanual) {
        this.interesanual = interesanual;
    }
   public long actualizaciondatos(){ 
     long interesdavivienda,actualizacionsaldo;double aux; 
     aux=this.interesanual / 365; 
     interesdavivienda=(long) ((this.saldoactual * aux) / 100); 
     actualizacionsaldo=this.saldoactual; 
     
     return actualizacionsaldo;
   } 
   public CuentaDavivienda mostrarinformacion(){ 
      CuentaDavivienda userdata;int numerodavivienda,identificacion_usuario;long actualizacionsaldo,interesanual; 
      numerodavivienda=this.numerocuenta; 
      identificacion_usuario=this.identificacion; 
      actualizacionsaldo=this.saldoactual; 
      interesanual=this.interesanual; 
      userdata=new CuentaDavivienda(numerodavivienda,identificacion_usuario,actualizacionsaldo, interesanual); 
      
      return userdata;
      
     
   } 
   public long ingresarinformacion(long ingreso){ 
    long muestra; 
   if(ingreso<=0){ 
    muestra=0;
   }else{ 
    this.saldoactual=this.saldoactual + ingreso; 
    muestra=this.saldoactual;
   } 
   return muestra;
   }
   public long retirodavivienda(long money){ 
     long retiro_de_money=0; 
    if(money<=this.saldoactual){ 
     if(money<=0){ 
       retiro_de_money= -1;
     }else{ 
       this.saldoactual=this.saldoactual - money; 
       retiro_de_money=this.saldoactual;
     }
    }else{ 
       retiro_de_money= -1;
    } 
    return retiro_de_money;
   }
}
