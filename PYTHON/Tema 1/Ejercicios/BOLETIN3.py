#1.

numero=input("Introduce un numero entero.")
if numero%2==0:
    respuesta="par"
else:
    respuesta="impar"
print(respuesta)
#2.
numero1=input("Introduce un numero entero.")
numero2=input("Introduce un numero entero.")
if numero1==numero2:
    respuesta="son iguales."
elif numero1>numero2:
    respuesta="el primero es mayor que el segundo."
else:
    respuesta="El segundo es mayor que el primero."
print(respuesta)
#3.
numero=input("Introduce un numero entero.")
if numero%2==0:
    print("Es multiplo de 2.")
elif numero%3==0:
    print("es multiplo de 3.")
elif numero%2==0 and numero%3==0:
    print("es multiplo de 2 y 3.")
#4.
edad=input("Introduce una edad comprendida entre 0 y 100.")
if 0<edad<=12:
    print("Es un niño")
elif 13<=edad<=17:
    print("Es un adolescente.")
elif 18<=edad<=29:
    print("Es un joven")
elif 30<=edad<=100:
    print("Es un adulto")
else:
    print("Edad no validad.")
#5.
numero1=input("Introduce un numero entero.")
numero2=input("Introduce un numero entero.")
numero3=input("Introduce un numero entero.")
numero4=input("Introduce un numero entero.")
numeroTotal=numero1+numero2+numero3+numero4
numeroMedio=numeroTotal/0.4
print(numeroMedio)
if numeroMedio<numero1:
    print(numero1)
if numeroMedio<numero2:
    print(numero2)
if numeroMedio<numero3:
    print(numero3)
if numeroMedio<numero4:
    print(numero4)
#6.
letra=input("Introduce una letra en mayuscula")
if letra!="A" or letra!="E" or letra!="I" or letra!="O" or letra!="U":
    print("no es una vocal")
elif letra=="A":
    print("Es la primera vocal")
elif letra=="E":
    print("Es la segunda vocal")
elif letra=="I":
    print("Es la tercera vocal")
elif letra=="O":
    print("Es la cuarta vocal")
elif letra=="U":
    print("Es la quinta vocal")
#7.
edad=input("introduce tu edad:")
estadoCivil=input("Introduce la inicial de tu estado Civil:")
if (estadoCivil=="s" or estadoCivil=="d") and edad<35:
    retencion=12
elif edad>50:
    retencion=8.5
elif (estadoCivil=="v" or estadoCivil=="c") and edad<35:
    retencion=11.35
else:
    retencion=10.5
print(retencion)

#8.
hora1=input("Indroduce la hora:")
minuto1=input("Introduce los minutos:")
segundo1=input("Introduce los segundos:")
hora2=input("Indroduce la hora:")
minuto2=input("Introduce los minutos:")
segundo2=input("Introduce los segundos:")
if (0<=hora1<24 and 0<=hora2<24)and(0<=minuto1<60 and 0<=minuto2<60)and(0<=segundo1<60 and 0<=segundo2<60):
    if hora1!=hora2:
        if hora1<hora2:
            print("Hora 2 es mayor")
        else:
            print("Hora 1 es mayor")
    else:
        if minuto1!=minuto2:
            if minuto1<minuto2:
                print("Hora 2 es mayor")
            else:
                print("Hora 1 es mayor")
        else:
            if segundo1<segundo2:
                print("Hora 2 es mayor")
            else:
                print("Hora 1 es mayor")
else:
    print("Horas no validas")
#9.
producto=input("De que tipo de tipo es el producto:")
precio=input("Introduce el precio del producto.")
if producto=="a" or producto=="b" or producto=="c":
    if producto=="a":
        descuento=0.07
        preciototal=precio-(precio/descuento)
        print(preciototal)
    elif producto=="c" or precio<500:
        descuento=0.12
        preciototal=precio-(precio/descuento)
        print(preciototal)
    else:
        descuento=0.09
        preciototal=precio-(precio/descuento)
        print(preciototal)
else:
    print("Tipo de producto no validad")
#10.
numero1=input("Introduce un numero:")
numero2=input("Introduce un numero:")
caracter=input("introduce un caracter:")
if caracter=="+" or caracter=="-" or caracter=="*" or caracter=="/" or caracter=="//" or caracter=="%":
    respuesta=numero1+caracter+numero2
    print(respuesta)
else:
    print("Este caracter no es un operador.")