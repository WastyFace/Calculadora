import sys
sys.path.append('gen-py')

from thrift.transport import TSocket
from thrift.server import TServer
from Calculadora import Calculadora

class CalculadoraHandler(Calculadora.Iface):
    def sumar(self, num1, num2):
        return num1 + num2
    
    def restar(self, num1, num2):
        return num1 - num2

    def multiplicar(self, num1, num2):
        return num1 * num2

    def dividir(self, num1, num2):
        if (num2 != 0):
            return num1 / num2
        else:
            raise TypeError("No se puede dividir entre cero")

if __name__ == "__main__":
    transporte_servidor = TSocket.TServerSocket(port=8080)
    procesador = Calculadora.Processor(CalculadoraHandler())
    servidor = TServer.TSimpleServer(procesador, transporte_servidor)
    servidor.serve()
