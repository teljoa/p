jugador1=""
jugador2=""

while not(jugador1=="spock" and jugador2=="spock"):
    jugador1=input("Elige entre: piedra, tijera, papel, lagarto o spock.")
    while not(jugador1=="piedra" or jugador1=="papel" or jugador1=="tijera" or jugador1=="lagarto" or jugador1=="spock"):
        jugador1=input("Elige entre: piedra, tijera, papel, lagarto o spock.")
    jugador2=input("Elige entre: piedra, tijera, papel, lagarto o spock.")
    while not(jugador2=="piedra" or jugador2=="papel" or jugador2=="tijera" or jugador2=="lagarto" or jugador2=="spock"):
        jugador2=input("Elige entre: piedra, tijera, papel, lagarto o spock.")

    if jugador1=="piedra":
        if jugador2=="lagarto":
            print("El jugador1 a ganado.")
        elif jugador2=="papel":
            print("El jugador2 a ganado.")
        elif jugador2=="tijera":
            print("El jugador1 a ganado.")
        elif jugador2=="spock":
            print("El jugador2 a ganado.")
        else:
            print("Es empate.")
    elif jugador1=="papel":
        if jugador2=="tijera":
            print("El jugador2 a ganado.")
        elif jugador2=="lagarto":
            print("El jugador2 a ganado.")
        elif jugador2=="spock":
            print("El jugador1 a ganado.")
        else:
            print("Es empate.")
    elif jugador1=="tijera":
        if jugador2=="lagarto":
            print("El jugador1 a ganado.")
        elif jugador2=="spock":
            print("El jugador2 a ganado.")
        else:
            print("Es empate.")
    elif jugador1=="lagarto":
        if jugador2=="spock":
            print("El jugador1 a ganado.")