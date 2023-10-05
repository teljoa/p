'''
#1.
cateto1=40
cateto2=10
hipotenusa=cateto1**2+cateto2**2
print(hipotenusa)
#2.
gradosF=32
gradosC=(gradosF-32)*5/9
print(gradosC)
#3.
numero1=input("Introduce un numero")
numero2=input("Introduce un numero")
numero3=input("Introduce un numero")
media=(numero1+numero2+numero3)/3
#4.
valorC=80
descuento=0.15
valorF=valorC-(valorC/descuento)
print(valorF)
#5.
numero1=input("Introduce un numero")
numero2=input("Introduce un numero")
if numero1<numero2:
    distancia=numero2-numero1
    print(distancia)
elif numero1>numero2:
    distancia=numero1-numero2
    print(distancia)
else:
    print(0)
#6.
x1=6
y1=3
x2=9
y2=4
distancia=((x2-x1)**2+(y2-y1)**2)**(1/2)
print(distancia)
#7.
numero=75463
raiz2=numero**(1/2)
raiz3=numero**(1/3)
print(raiz2)
print(raiz3)
#8.
moneda2e=6
moneda1e=2
moneda50c=20
moneda20c=40
moneda10c=2
dineroe=(moneda2e*2)+moneda1e+(moneda50c*0.5)+(moneda20c/0.2)+(moneda10c/0.1)
dineroc=((moneda2e*200)+(moneda1e*100)+(moneda50c*50)+(moneda20c*20)+(moneda10c*10))
print(dineroe)
print(dineroc)
#9.
base=40
exponente=17
if exponente>0:
    potncia=base**exponente
elif exponente==0:
    potencia=1
else:
    potencia=base**(1/exponente)

print(potencia)

#10.
a=6434
b=2324
c=3429
if ((a**2) + (b**2) == c**2) and (c**2-a**2=b**2) and (c**2-b**2=a**2):
    print("Rectangulo")
elif a==b and b==c and a==c:
    print("Equilatero")
elif a==b or b==c or a==c:
    print("Isosceles")
else:
    print("escaleno")

#11.
ano=input("Introduce un año:")
if (ano%4==0) and not(ano%100==0) and (ano%400==0 and ano%100==0):
    print("Es bisiesto")
else:
    print("No es bisiesto")

#12.
tipoUva=input("A,B,C")
tamanoUva=("1,2")
precioInicial=1.50
if tipoUva=="A":
    if tamanoUva==1:
        precioFinal=precioInicial+0.20
    else:
        precioFinal=precioInicial+0.30
else:
    if tamanoUva==1:
        precioFinal=precioInicial-0.30
    else:
        precioFinal=precioInicial-0.50
#13.
alumnos=input("Cuantos alumnos van a la escursion:")
if alumnos>=100:
    precioAlumno=65
elif 50<=alumnos<=99:
    precioAlumno=70
elif 30<=alumnos<=49:
    precioAlumno=95
else:
    precioAlumno=4000/alumnos

#14.
tiempo=input("Cuanto tiempo a durado la llamada:")
dia=input("En que dia de la semana estamos:")
turno=input("En que parte del dia nos encontramos.")
if 1<=tiempo<=5:
    precioTiempo=0.20*tiempo
if 5<tiempo<=8:
    precioTiempo=1+((8-tiempo)*0.26)
if 8<tiempo<=10:
    precioTiempo=1.80+((10-tiempo)*0.35)
if tiempo>10:
    precioTiempo=2.50+((tiempo-10)*0.50)

if dia=="domingo":
    precioFinal=(precioTiempo/0.03)+ precioTiempo
else:
    if turno=="mañana":
        precioFinal=(precioTiempo/0.15)+ precioTiempo
    elif turno=="tarde":
        precioFinal=(precioTiempo/0.1)+ precioTiempo

#15.

diaSemana=input("En que dia de la semana estamos, en numero:")
if 1<=diaSemana<=7:
    match diaSemana:
        case 1:
            print("Lunes")
        case 2:
            print("Martes")
        case 3:
            print("Miercoles")
        case 4:
            print("Jueves")
        case 5:
            print("Viernes")
        case 6:
            print("sabado")
        case 7:
            print("Domingo")
else:
    print("Dia no valido.")

#16.
mes=input("Introduce un mes:")
#Meses31=1,3,5,7,8,10,12
#Meses30=4,6,9,11
#Meses28=2
if 0<mes1<13:
    match mes:
        case 1,3,5,7,8,10,12:
            print(31)
        case 4,6,9,11:
            print(30)
        case 2:
            print(28)
else:
    print("Mes incorrecto")

#17.
num1=input("Introduce un numero:")
num2=input("Introduce un numero:")
if num1<num2:
    for i in range(num1,num2):
        if i%2==0:
            print(i)
else:
    for i in range(num2,num1):
        if i%2==0:
            print(i)

#18.
limiteInferior=input("Introduce un numero como limite inferior:")
limiteSuperior=input("Introduce un numero como limite superior:")
while limiteInferior>limiteSuperior:
    print("Mientras no introduzcas el limite inferior que sea menor que el limite superior.Se te volveria a preguntar los limites.")
    limiteInferior=input("Introduce un numero como limite inferior:")
    limiteSuperior=input("Introduce un numero como limite superior:")

num=int(input("Introduce un numero dentro de los limites establecidos anteriormente:"))
sumaNumeros=0
numfueraLimite=0
numigual=0
while num!=0:
    if limiteInferior<num<limiteSuperior:
        sumaNumeros+=num
    elif num<limiteInferior or num>limiteSuperior:
        numfueraLimite+=1   
    else:
        numigual+=1
    num=int(input("Introduce numero:"))
    
print(f"La suma de los numeros dentro del intervalo es {sumaNumeros}.", f"{numfueraLimite} numeros estan fuera del intervalo.", f"{numigual} numeros han sido iguales.")

#19.
base=input("Introduce un numero como base:")
exponente=input("introduce un numero como exponente:")
for i in range(exponente):
   resultado=resultado+base
print(f"El resultado es {resultado}")

#20.
num=10
pago=num
for i in range(2,21):
    num*=2
    print(f"{i}º mes: {num}€")
    pago+=num
print(pago, "€ en total")

#21.
num=input("Introduce la cantidad de numeros primos que quieres.")
c=1
print(2)
i=3 

while c<num:
  for j in range(2,i):
    if i%j == 0:
      break
    if j==i-1:
      print(i)
      c=c+1
  i=i+1
print(c)
'''
