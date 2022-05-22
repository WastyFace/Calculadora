import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import java.util.Scanner;

public class ClienteCalculadora {
  public static void main(String[] args) throws TException {
    Scanner sc = new Scanner (System.in);
    int operacion;
    double num1,num2;
    TTransport transporte = new TSocket("10.5.0.5", 8080);
    TProtocol protocolo = new TBinaryProtocol(transporte);
    Calculadora.Iface cliente = new Calculadora.Client(protocolo);
    transporte.open();
    try{
      System.out.println("SELECCIONE LO QUE DESEA HACER:\n 1. Sumar\n 2.Restar\n 3.Multiplicar\n 4.Dividir\n 5.Salir\n");
      operacion = sc.nextInt();
      if (operacion == 1){
        System.out.println("Ingrese el primer numero:");
        num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        num2 = sc.nextDouble();
        System.out.println("El resultado es: " + cliente.sumar(num1, num2));
      }else{
        if (operacion == 2){
          System.out.println("Ingrese el primer numero:");
          num1 = sc.nextDouble();
          System.out.println("Ingrese el segundo numero:");
          num2 = sc.nextDouble();
          System.out.println("El resultado es: " + cliente.restar(num1, num2));
        }else{
          if (operacion == 3){
            System.out.println("Ingrese el primer numero:");
            num1 = sc.nextDouble();
            System.out.println("Ingrese el segundo numero:");
            num2 = sc.nextDouble();
            System.out.println("El resultado es: " + cliente.multiplicar(num1, num2));
          }else{
            if (operacion == 4){
              System.out.println("Ingrese el primer numero:");
              num1 = sc.nextDouble();
              System.out.println("Ingrese el segundo numero:");
              num2 = sc.nextDouble();
              System.out.println("El resultado es: " + cliente.dividir(num1, num2));
            }else{
              transporte.close();
            }
          }
        }
      }
    }catch (OperacionInvalida e){
      System.out.println("Exception: " + e.why);
    }catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
