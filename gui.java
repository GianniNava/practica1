import javax.swing.*;
public class gui{



public static void menu(int o){
cliente martin=new cliente();
int a=2;
JOptionPane.showMessageDialog(null, "Bienvenido al cajero automatico");
do{


String op=JOptionPane.showInputDialog(null, "1.-Ver saldo\n2.-Depositar\n3.-Retirar\n4.-Salir");
int intop=Integer.parseInt(op);
int regresar=1;

switch(intop){

case 1:
int saldo=martin.versaldo();
JOptionPane.showMessageDialog(null,"Tu saldo es" + saldo);

break;

case 2:

String dep=JOptionPane.showInputDialog(null,"¿Cuanto quieres depositar?");
int intdep=Integer.parseInt(dep);
JOptionPane.showMessageDialog(null,"Depositaste:\n" + "$"+intdep);
martin.depositar(intdep);
martin.versaldo();

JOptionPane.showMessageDialog(null,"Tu nuevo saldo es de: \n" + "$"+martin.versaldo(), "hola", a );
break;

case 3:
String ret=JOptionPane.showInputDialog(null,"¿Cuanto quieres retirar?");

int intret=Integer.parseInt(ret);

JOptionPane.showMessageDialog(null, "Has retirado la cantidad de:\n\t" +"$"+ intret);
martin.retirar(intret);

JOptionPane.showMessageDialog(null,"Tu nuevo saldo es de: \n" + "$ "+martin.versaldo() );
break;
case 4:
default:
JOptionPane.showMessageDialog(null,"Hasta la proxima");
System.exit(0);
break;

}
}while(a==2);
}

}

