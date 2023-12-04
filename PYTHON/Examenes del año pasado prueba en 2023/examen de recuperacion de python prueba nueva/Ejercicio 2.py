from random import randint

aciertos=0
combinacionA=[]

def creador_combinacion_Ganadora():
    combinacionG=[]
    for i in range(6):
        combinacionG.append(randint(1,49))
    return combinacionG

combinacionG=creador_combinacion_Ganadora()
print(combinacionG)


for i in range(6):
    numero=int(input("Introduce un numero entre 1 y 49:"))
    while not(1<numero<49):
        numero=int(input("Introduce un numero entre 1 y 49:"))
    combinacionA.append(numero)

def comprobar_boleto(combinacionG,combinacionA):
    aciertos=0
    for i in range(len(combinacionG)):
        if combinacionG[i]==combinacionA[i]:
            aciertos+=1
    return aciertos

aciertos=comprobar_boleto(combinacionG,combinacionA)

def respuesta_boleto(aciertos):
    resolucion=f"El nuero de aciertos es {aciertos}"
    if aciertos==6:
        resolucion="¡¡Enhorabuena!!Has triunfado!!"
    return resolucion

print(respuesta_boleto(aciertos))