from random import randint

aciertos=0
combinacionA=[]

def creador_combinacion_Ganadora():
    combinacionG=[]
    cifra=0
    
    for i in range(6):
        cifra=randint(1,49)
        
        while cifra in combinacionG:
            cifra=randint(1,49)

        combinacionG.append(cifra)

    return combinacionG

combinacionG=creador_combinacion_Ganadora()

for i in range(6):
    numero=int(input("Introduce un numero entre 1 y 49:"))

    while not(1<numero<49) or numero in combinacionA:
        numero=int(input("Introduce un numero entre 1 y 49, que no hayas introducido antes:"))

    combinacionA.append(numero)


def comprobar_boleto(combinacionG,combinacionA):
    aciertos=0
    for i in range(len(combinacionG)):
    
        if combinacionA[i] in combinacionG:
            aciertos+=1
    return aciertos

aciertos=comprobar_boleto(combinacionG,combinacionA)

def respuesta_boleto(aciertos):
    resolucion=f"El numero de aciertos es {aciertos}"

    if aciertos==6:
        resolucion="ENHORABUENA. TIENES EL PLENO"
        
    return resolucion

print(respuesta_boleto(aciertos))
