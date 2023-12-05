from random import randint

def creacionClave(longitud):
    if longitud==1:
        clave=str(randint(0,10))
    elif longitud==2:
        clave=str(randint(10,100))
    elif longitud==3:
        clave=str(randint(100,1000))
    elif longitud==4:
        clave=str(randint(1000,10000))
    return clave


cifra=0
intento=0

#print(clave) Este print es para complobar las coincidencias a la hora de probar el codigo por eso esta comentado.

longitud=int(input("De cuantos digitos quieres que sea la clave(1min-4max):"))
while not(0<longitud<5):
    longitud=int(input("De cuantos digitos quieres que sea la clave(1min-4max):"))

clave=creacionClave(longitud)

intentos=int(input("Cuantos intentos quieres(1min-7max):"))
while not(1<=intentos<=7):
    intentos=int(input("Cuantos intentos quieres(1min-7max):"))

while not(clave==cifra or intento==intentos):
    cifra=input("Introduce un numero igual de largo que la clave:")

    while not(len(cifra)==len(clave)):
        cifra=input("Introduce un numero igual de largo que la clave:")
        
    coincidencias=0
    coincidenciasP=0

    for i in range(len(clave)):
        if clave[i]==cifra[i]:
            coincidenciasP+=1
        elif cifra[i] in clave:
            coincidencias+=1

    print(f"El numero de coincidencias es {coincidencias} y {coincidenciasP} en posicion correcta.")
    intento+=1

if clave==cifra:
    print("Has acertado la clave secreta.")

elif intento==intentos:
    print("Los intentos se han terminado.")