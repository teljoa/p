#1.
numero1=4
numero2=2
numero3=8
while not((numero1<=0 and numero2<=0)or (numero1<=0 and numero3<=0) or (numero2<=0 and numero3<=0)):
    numero1=int(input("Introduce el primer numero:"))
    numero2=int(input("Introduce el segundo numero:"))
    numero3=int(input("Introduce el tercer numero:"))
    print(numero1,numero2,numero3)

'''Brebe explicacion del programa: el programa te pide un grupo 3 numeros, el cual tras pedirlos te los imprime y te los seguira pidiendo a no ser que introduzcas: 2 o mas numeros menores a 
 0 o igual a 0.'''
