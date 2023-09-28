#1.

#a)
sueldoBruto=input("Introduce tu suldo bruto con numeros enteros:")
sueldoNeto=input("Introduce tu suldo neto con numeros enteros:")
retencion=22
retencionOficial=(sueldoBruto/sueldoNeto)*100
resultado=retencionOficial==retencion
print(resultado)

#b)
dia=input("Introduce un dia:")
resultado=1<=dia<=31

#c) 
num1=input("Introduce un numero:")
num2=input("Introduce un numero:")
resultado=(num1%3==0)and (num2%3==3)
print(resultado)

#d) 
nota=input("Introduce tu nota:")
resultado=5<=nota<=10
print("Resultado")

#e)
nota1=input("Introduce tu nota:")
nota2=input("Introduce tu nota:")
nota3=input("Introduce tu nota:")
notaTotal=nota1+nota2+nota3
notaMedia=notaTotal//3
respuesta=notaMedia>=5
print(respuesta)

#2.

#a)
nota1=input("Introduce tu nota:")
nota2=input("Introduce tu nota:")
nota3=input("Introduce tu nota:")
notaTotal=nota1+nota2+nota3
notaMedia=notaTotal//3
respuesta=notaMedia<5
print(respuesta)
#b)
saldo=input("Indique su saldo")
descubierto=("Cuantas veces se ha quedado descubierto su curta de saldo.")
resultado=True
if saldo<1000 and descubierto>=5:
    resultdo=False
#c)
asignaturasCursos=input("Cuantas asignaturas tiene el curso:")
asignaturasAprobadas=input("Cuantas asignaturas tienes aprobadas:")
mediadeAprobacion=asignaturasAprobadas/asignaturasCursos
respuesta=mediadeAprobacion>=0.3
print(respuesta)
#d)
mes=input("En que mes nos encontramos en numero:")
dia=input("En que dia nos encontramos, en numero:")
respuesta=False
if  mes==1 or mes==3 or mes==5 or mes==7 or mes==8 or mes==10 or mes==12:
    if 0<dia<32:
        respuesta=True
if mes==2:
    if 0<dia<29:
        respuesta=True
if mes==4 or mes==6 or mes==9 or mes==111:
    if 0<dia<31:
        respuesta=True

#3.

#llueve y no haceSol y no haceFrio o no llueve y haceSol y no haceFrio o no llueve y no haceSol y haceFrio

a="llueve"
b="haceSol"
c="hacefrio"

resultado=a and not(b) and not(c) or not(a) and b and not(c) or not(a) and not(b) and c

print(resultado)


#4. 

#1)no me gusta programar y voy a dedicarle al menos 10 horas a la semana a programamar
#2)no me gusta programar o voy a dedicarle al menos 10 horas a la semana a programamar
#3)me gusta programar
#4)no me gusta programar o no voy a dedicarle al menos 10 horas a la semana a programamar
#5)me gusta programar o voy a dedicarle al menos 10 horas a la semana a programamar
#6)no me gusta programar y no voy a dedicarle al menos 10 horas a la semana a programamar