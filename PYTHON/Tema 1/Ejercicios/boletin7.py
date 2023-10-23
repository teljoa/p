#1.
numero1 = int(input("Dime un numero:"))
numero2 =  int(input("dime un numro:"))

if numero1 < numero2:
    numero1 = numero2 * numero1
    numero2 = numero1 / numero2
    numero1 = numero1 / numero2

tmp = numero1
division = 0

while numero1 >= numero2:
    numero1 = numero1 - numero2 
    division +=1
    
print(f" {tmp}/{numero2}={division} con resto {numero1}")
#2.
numero1 = int(input("Dime un numero:"))
numero2 = int(input("Dime un numero:"))

cantidad = int(input("Cuantos numeros quieres:"))

numeros = []

k = numero1

for n in range(cantidad):
    encontrado = False
    while not encontrado:
        if k % numero2 == 0:
            numeros.append(k)
            encontrado = True
        k += 1
     
print("", *numeros)
#3.
numero = int(input("Numero: "))

while numero != 0:
    tipo = "impar"
    signo = "negativo"
    cuadrado = numero * numero
    if numero % 2 == 0:
        tipo = "par"
    if numero >= 0:
        signo = "positivo"
    print(f"{numero} => es {tipo}, {signo} y su cuadrado es {cuadrado}")
    numero = int(input("Numero: "))  
#4.
tamano = int(input("Inserte el tamaño de de su secuencia numerica:"))

contador = 1
numero = 1
secuenciaA = " " 
while contador<=tamano:
    secuenciaA += str(numero)
    if contador != tamano:
        secuenciaA+= ","
        numero*=-5
    contador+=1
print(secuenciaA)
    
contador = 1
numero = 1
secuenciaB = " "
while contador<= tamano:
    secuenciaB += str(numero)
    if contador != tamano:
        secuenciaB+= ","
    numero*=-1
    contador+=1
print(secuenciaB)

contador = 1
numero = 0
secuenciaC = " "
while contador<= tamano:
    secuenciaC += str(numero)
    if contador != tamano:
        secuenciaC+= ","
    numero+=3**tamano
    contador+=1
print(secuenciaC)
#5.
numero = int(input(" Numero: "))

historial = [numero]

while numero != 1:
    if numero % 2 == 0:
        numero = numero / 2
    else:
        numero = numero * 3 + 1
    historial.append(numero)
print(historial[:]) 
#6.
agno = int(input(" Año al que calcular:"))
incremento = float(input(" Incrementar dinero en: "))
eurosInicial = float(input(" Primera paga: "))

totalDinero = 0
totalPuzzles = 0

o = 0
j = 0
for n in range (1, agno + 1):
    
    if n % 2 != 0:
        totalPuzzles = totalPuzzles + (2 ** o)
        o += 1
    else:
        totalDinero = totalDinero + (eurosInicial + incremento * j)
        j += 1
        
print(f" {agno} años => {totalPuzzles} puzzles y {totalDinero}€")
#7.
n = int(input("Introduce la altura del triángulo (entero positivo): "))
for i in range(n):
    for j in range(i+1):
        print(f"{n}", end="")
    print("")
#8.
numero = int(input(" Tamaño: "))
figura = input(" Que figura quires? (Cuadrado, triangulo, rombo): ").upper()

if figura =="CUADRADO":
    for i in range(numero):
        print("*"*numero)
        
elif figura =="TRIANGULO":
    for i in range (numero):
        print((" " * ((numero - i) - 1)) + ("*" * (1 + i * 2)))

elif figura == "ROMBO":
        o = 0
        for i in range (numero):
            print((" " * ((numero - i) - 1)) + ("*" * (1 + i * 2)))
            
            o = (1 + i * 2) - 2
            
        for i in range(numero):
            print ((" " * (1 + i)) + ("*" * (o - i * 2)))
     
else:
    print(" Figura no valida")
#9.
numero = int(input(" Tamaño: "))
figura = input(" Que figura quires? (Cuadrado, triangulo, rombo): ").upper()


if figura == "CUADRADO":
    for i in range(numero):
        if i == 0 or i == numero - 1:
            print("*"*numero)
        else:
            print("*" + " "*(numero - 2) + "*")
               
elif figura == "TRIANGULO":
    h = 0
    for i in range (numero):    
        if i == numero - 1:
            print("*"*(h + 2))
        elif i == 0:
            print((" " * ((numero - i) - 1)) + ("*"))
        else: 
            print((" " * ((numero - i) - 1)) + ("*") + (" " * (-1 + i * 2)) + ("*"))
            h = (1 + i * 2)       

elif figura =="ROMBO":
    h = 0 
    for i in range (numero):    
        if i == 0:
            print((" " * ((numero - i) - 1)) + ("*"))
        else: 
            print((" " * ((numero - i) - 1)) + ("*") + (" " * (-1 + i * 2)) + ("*"))
            h = (i * 2 - 1)
            
    for i in range(numero - 1):        
        if i == numero - 2:
            print((" " * (1 + i)) + ("*"))
        else:
            print((" " * (1 + i)) + ("*") + (" " * (h - i * 2 - 2)) + ("*"))
else:
    print(" Figura no valida")
#10.
numero = int(input(" Tamaño: "))
figura = input(" Que figura quires? (Cuadrado, triangulo, rombo): ").upper()
caracter = input("Escribe el caracter que quieres intraduccir en la figura:")

if figura == "CUADRADO":
    for i in range(numero):
        if i == 0 or i == numero - 1:
            print(caracter*numero)
        else:
            print(caracter + " "*(numero - 2) + "*")
               
elif figura == "TRIANGULO":
    h = 0
    for i in range (numero):
        if i == numero - 1:
            print(caracter*(h + 2))
        elif i == 0:
            print((" " * ((numero - i) - 1)) + (caracter))
        else: 
            print((" " * ((numero - i) - 1)) + (caracter) + (" " * (-1 + i * 2)) + (caracter))
            h = (1 + i * 2)       

elif figura =="ROMBO":
    h = 0 
    for i in range (numero):    
        if i == 0:
            print((" " * ((numero - i) - 1)) + (caracter))
        else: 
            print((" " * ((numero - i) - 1)) + (caracter) + (" " * (-1 + i * 2)) + (caracter))
            h = (i * 2 - 1)
            
    for i in range(numero - 1):        
        if i == numero - 2:
            print((" " * (1 + i)) + (caracter))
        else:
            print((" " * (1 + i)) + (caracter) + (" " * (h - i * 2 - 2)) + (caracter))
else:
    print("Figura no valida")
#11.
numero = int(input(" Dimension: "))
print(f"\n Número {numero}:")
fila = [] 

columnas = 2*numero-1
orden = 0

for n in range(columnas):
    fila.append(numero+1)
    
for n in range ((columnas+1)//2):
    
    for j in range(n,len(fila)-n):
        
        fila [j] = fila [j]-1
        
    print(*fila [:])
    
for n in range ((columnas)//2,0,-1):
    
    for j in range(n,len(fila)-n):
        
        fila [j] = fila [j]+1
        
    print(*fila [:])