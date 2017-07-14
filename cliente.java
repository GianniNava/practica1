public class cliente{


String nombre=null;
int saldo;
int deposito;
int retiro;


public cliente(){

nombre="Martin nava";
saldo=1500;
deposito=0;
retiro=0;

}

public  int retirar(int r){
retiro=r;
saldo=saldo-retiro;
return saldo;

}

public int depositar(int d){
deposito=d;
saldo=saldo+deposito;
return saldo;

}

public int versaldo(){
if(saldo<=999){

saldo=saldo - 35;

}
return saldo;

}

}