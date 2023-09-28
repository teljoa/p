#1.

#a)
respuesta= 7>=27 and not(7<=2)
print(respuesta)
#b)
respuesta= 24>5 and 10<=10 or 10==5
print(respuesta)
#c)
respuesta= (10>=15 or 23==13) and not(8==8)
print(respuesta)
#d)
respuesta= not(6/3>3) or 7>7
print(respuesta)
#2.

#a)
respuesta1= 27 % 4 + 15/4
print(respuesta1)
#b)
respuesta1= 37/4**2-2
print(respuesta1)
#c)
respuesta1=  9*2/3*10*3
print(respuesta1)
#d)
respuesta1= (7*3-4*4)**2/4*2
print(respuesta1)

#3.

#a)
precio=input("Introduce un numero entero:")
respuesta2=False
if precio>=60 or precio<=420:
    respuesta2=True
else:
    respuesta2=False

print(respuesta2)
#b)
numero=input("Introduce un numero entero:")
respuesta2=False
if numero/2==1:
    respuesta2=True
print(respuesta2)

#c)
saldo=input("Introduce tu saldo:")
dineroSacar=input("Introduce el dinero a sacar:")
respuesta2=False
if saldo>=dineroSacar:
    respuesta2=True
print(respuesta2)

#d)
hora=input("Introduce una hora:")
minutos=input("Introduce los minutos:")
respuesta2=False
if (0<=hora<=23)and(0<=minutos<=59):
    respuesta2=True
print(respuesta2)

#e)
estadoCivil=input("Introduce la inicial de tu estado civil:")
respuesta2=False
match estadoCivil:
    case "S":
        respuesta2=True
    case "c":
        respuesta2=True
    case "v":
        respuesta2=True
    case "d":
        respuesta2=True
print(respuesta2)

#4.

#a)
cantidad=input("Cantidad a sacar:")
resultado=True
if cantidad>300 or cantidad<0:
    resultado=False
print(resultado)
#b)
edad=input("Cantidad a sacar:")
resultado=True
if 16<=edad<=22:
    resultado=False
print(resultado)
#c)
respuesta=input("Responde con S/N:")
resultado=True
if respuesta=="S" or respuesta=="N":
    resultado=False
print(resultado)
#d)
numero=input("Dime un mumero")
resultado=True
if numero%7==0 or numero%3==0:
    resultado=False
print(resultado)
'''
#5.

#a) (A OR B) AND NOT(A)

a=T b=T
RESULTADO=F
a=T b=F
RESULTADO=F
a=F b=T
RESULTADO=F
a=F b=F
RESULTADO=F

#b) NOT (A OR B) AND B

a=T b=T
RESULTADO=F
a=T b=F
RESULTADO=F
a=F b=T
RESULTADO=F
a=F b=F
RESULTADO=F

#c) A OR NOT (B)

a=T b=T
RESULTADO=T
a=T b=F
RESULTADO=T
a=F b=T
RESULTADO=F
a=F b=F
RESULTADO=T

#d) NOT ((A AND B) AND (B OR A))

a=T b=T
RESULTADO=F
a=T b=F
RESULTADO=T
a=F b=T
RESULTADO=T
a=F b=F
RESULTADO=T
'''