
#1.1
jugador1=input("Elige jugador1 entre:piedra,papel,tigera,lagarto,spock:")
jugador2=input("Elige jugador2 entre:piedra,papel,tigera,lagarto,spock:")
while not(jugador1=="piedra" or jugador1=="papel" or jugador1=="tigera" or jugador1=="lagarto" or jugador1=="spock"):
    jugador1=input("Elige jugador1 entre:piedra,papel,tigera,lagarto,spock:")
while not(jugador2=="piedra" or jugador2=="papel" or jugador2=="tigera" or jugador2=="lagarto" or jugador2=="spock"):
    jugador2=input("Elige jugador2 entre:piedra,papel,tigera,lagarto,spock:")
if jugador1=="priedra":
    if jugador2=="piedra":
        print("empate")
    elif jugador2=="papel":
        print("gana jugador2")
    elif jugador2=="tigera":
        print("gana jugador1")
    elif jugador2=="lagarto":
        print("gana jugador1")
    else:
        print("gana jugador2")
elif jugador1=="papel":
    if jugador2=="papel":
        print("empate")
    elif jugador2=="tigera":
        print("gana jugador2")
    elif jugador2=="lagarto":
        print("gana jugador2")
    else:
        print("gana jugador1")
elif jugador1=="tigera":
    if jugador2=="tigera":
        print("empate")
    elif jugador2=="lagarto":
        print("gana jugador1")
    else:
        print("gana jugador2")
elif jugador1=="lagarto":
    if jugador2=="lagarto":
        print("empate")
    else:
        print("gana jugador1")
else:
    print("empate")

#1.2

jugador1="felkfl"
jugador2="jfedwfkefjfwwdd"
while not(jugador1=="spock" and jugador2=="spock"):
    jugador1=input("Elige jugador1 entre:piedra,papel,tigera,lagarto,spock:")
    jugador2=input("Elige jugador2 entre:piedra,papel,tigera,lagarto,spock:")
    while not(jugador1=="piedra" or jugador1=="papel" or jugador1=="tigera" or jugador1=="lagarto" or jugador1=="spock"):
        jugador1=input("Elige jugador1 entre:piedra,papel,tigera,lagarto,spock:")
    while not(jugador2=="piedra" or jugador2=="papel" or jugador2=="tigera" or jugador2=="lagarto" or jugador2=="spock"):
        jugador2=input("Elige jugador2 entre:piedra,papel,tigera,lagarto,spock:")
    if jugador1=="priedra":
        if jugador2=="piedra":
            print("empate")
        elif jugador2=="papel":
            print("gana jugador2")
        elif jugador2=="tigera":
            print("gana jugador1")
        elif jugador2=="lagarto":
            print("gana jugador1")
        else:
            print("gana jugador2")
    elif jugador1=="papel":
        if jugador2=="papel":
            print("empate")
        elif jugador2=="tigera":
            print("gana jugador2")
        elif jugador2=="lagarto":
            print("gana jugador2")
        else:
            print("gana jugador1")
    elif jugador1=="tigera":
        if jugador2=="tigera":
            print("empate")
        elif jugador2=="lagarto":
            print("gana jugador1")
        else:
            print("gana jugador2")
    elif jugador1=="lagarto":
        if jugador2=="lagarto":
            print("empate")
        else:
            print("gana jugador1")
    else:
        print("empate")

#3.
nempreados=input("Cuantos trabajadores hay en la empresa:")
nempreadosHP=0
nempreadosMP=0
nempreadosHJ=0
nempreadosMJ=0
edadempredo=0
edadempredosPT=0
edadempredosJT=0
edadempredosPM=0
edadempredosJT=0
generoEmpreado="grf"
lenguageEmpreado="fg"
for i in range(nempreados):
    lenguageEmpreado=input("Que lenjuage suele utilizar el trajagador(python o java):")
    while not(lenguageEmpreado=="python" or lenguageEmpreado=="java"):
        lenguageEmpreado=input("Que lenjuage suele utilizar el trajagador(python o java):")
    edadempredo=input("Que edad tiene el trabajador(18-65):")
    while not(18<=edadempredo<=65):
        edadempredo=input("Que edad tiene el trabajador(18-65):")
    generoEmpreado=input("a que genero pertenece el empreado(h o m):")
    while not(generoEmpreado=="h" or generoEmpreado=="m"):
        generoEmpreado=input("a que genero pertenece el empreado(h o m):")
    if lenguageEmpreado=="python":
        if generoEmpreado=="h":
            nempreadosHP+=1
        else:
            nempreadosMP+=1
        edadempredosPT+=edadempredo
    else:
        if generoEmpreado=="h":
            nempreadosHJ+=1
        else:
            nempreadosMJ+=1
        edadempredosPT+=edadempredo