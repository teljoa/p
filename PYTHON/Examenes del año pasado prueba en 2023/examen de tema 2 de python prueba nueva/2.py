from random import randint

def dame_numero():
    return randint(2,12)

opcion=2
napuestas=0
dinerog=0
saldo=0

while opcion<4:
    if opcion==1:
        apuesta=float(input("Cuanto quieres apostar."))
        while apuesta>saldo:
            apuesta=float(input("Cuanto quieres apostar."))
        saldo-=apuesta
        numeroA=int(input("Introduce un numero entre 2-12."))
        while not 2<=numeroA<=12:
            numeroA=int(input("Introduce un numero entre 2-12."))
        numerog=int(dame_numero())
        if numeroA==numerog:
            apuesta=apuesta*2
            saldo+=apuesta
            dinerog+=apuesta
        elif numeroA>numerog:
            apuesta=0
            saldo+=apuesta
            dinerog+=apuesta
        else:
            apuesta=apuesta/2
            saldo+=apuesta
            dinerog+=apuesta
        napuestas+=1
    elif opcion==2:
        saldo=float(input("Introduce tu saldo inicial."))
    elif opcion==3:
        print(saldo,napuestas,dinerog)
    opcion=int(input("Introduce una opcion:"))