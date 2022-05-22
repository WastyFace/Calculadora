exception OperacionInvalida {
  1: i32 whatOp,
  2: string why
}

service Calculadora {
   double sumar(1:double num1, 2:double num2) throws (1:OperacionInvalida ouch),
   double restar(1:double num1, 2:double num2) throws (1:OperacionInvalida ouch),
   double multiplicar(1:double num1, 2:double num2) throws (1:OperacionInvalida ouch),
   double dividir(1:double num1, 2:double num2) throws (1:OperacionInvalida ouch),
}