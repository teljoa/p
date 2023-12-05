from random import randint

def creador_combinacion_Ganadora():
    combinacionG=[]
    cifra=0
    
    for i in range(6):
        cifra=randint(1,49)
        
        while cifra in combinacionG:
            cifra=randint(1,49)

        combinacionG.append(cifra)

    return combinacionG

ganadora=creador_combinacion_Ganadora()
print(ganadora)
apuesta=[]

for i in range(6):
    numero=int(input("Introduce un numero entre 1 y 49:"))

    while not(0<numero<50) or numero in apuesta:
        numero=int(input("Introduce un numero entre 1 y 49 o que no hayas introducido antes:"))

    apuesta.append(numero)

def eliminarRepetidos(combinacion):
    apuestaSinRepetidos=[]
    for i in combinacion:
        if i not in apuestaSinRepetidos:
            apuestaSinRepetidos.append(i)
    return apuestaSinRepetidos

def sonValoresValidos(combinacion):
    validos = True
    for numero in combinacion:
        if numero<1 or numero>49:
            validos=False
    return validos

def sonDatosValidos(apuesta, ganadora):
    return sonValoresValidos(apuesta) and sonValoresValidos(ganadora) and len(apuesta)==6 and len(ganadora)==6  and len(eliminarRepetidos(apuesta))==6 and len(eliminarRepetidos(ganadora))==6 

def comprobar_resultado(apuesta, ganadora):
    aciertos = 0

    if not sonDatosValidos(apuesta, ganadora):
        aciertos = -1


    else:
        for numero in apuesta:
            if numero in ganadora:
                aciertos+=1

    return aciertos

aciertos=comprobar_resultado(apuesta,ganadora)

def respuesta_boleto(aciertos):
    resolucion=f"El numero de aciertos es {aciertos}"

    if aciertos==6:
        resolucion="ENHORABUENA. TIENES EL PLENO"
        
    return resolucion

print(respuesta_boleto(aciertos))


















assert(comprobar_resultado([1,2,3,4,5,6, 6, 6, 6, 6], [5,6,7,8,9,10])==-1)
assert(comprobar_resultado([1,2,3,4,5, 5], [5,6,7,8,9,10])==-1)
assert(comprobar_resultado([1,2,3,5,5,5], [5,6,7,8,9,10])==-1)
assert(comprobar_resultado([1,2,3,4,5,6], [5,6,7,8,9,10])==2)
