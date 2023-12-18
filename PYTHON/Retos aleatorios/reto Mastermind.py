from random import randint

colores=["rojo","azul","naranja","amarillo","verde"]

def combinacion_Randon ():
    combinacion=[]
    
    while not(len(combinacion)>=4):
        posicion=randint(0,len(colores)-1)
        color=colores[posicion]
        if color not in combinacion:
            combinacion.append(color)
    return combinacion

combinacion_ganadora=combinacion_Randon()

intentos=0
aciertosN=0

seguir="si"

while seguir=="si":

    veces_aciertos=int(input("En cuantos aciertos quieres intentar acertar la combinacion ganadora(1vez - 9veces):"))
    while not(0<veces_aciertos<10):
        veces_aciertos=int(input("En cuantos aciertos quieres intentar acertar la combinacion ganadora(1vez - 9veces):"))

    while not(intentos==veces_aciertos or aciertosN==len(combinacion_ganadora)):
        aciertosN=0
        respuesta=[]
        combinacion_apuesta=[]

        for i in range(4):
            color=input("Introduce un color de esta lista:rojo, azul, naranja, amarillo o verde:")

            while color not in colores or color in combinacion_apuesta:
                color=input("Introduce un color, correcto, de esta lista:rojo, azul, naranja, amarillo o verde.Y que no hayas introducido antes:")

            combinacion_apuesta.append(color)

        for j in range(len(combinacion_apuesta)):

            if combinacion_apuesta[j]==combinacion_ganadora[j]:
                respuesta.append("negro")
                aciertosN+=1

            elif combinacion_apuesta[j] in combinacion_ganadora:
                respuesta.append("blanco")

        intentos+=1

        if intentos==9:
            respuesta="Fin de Juego. Lo sentimos, has perdido. Inicia otro juego."

        elif aciertosN==4:
            respuesta=f"Fin de Juego. Felicidades has ganado. Has necesitado {intentos} jugadas."

        print(respuesta)

    seguir=input("Quiere seguir jugando o abandonas el juego(si o no):")