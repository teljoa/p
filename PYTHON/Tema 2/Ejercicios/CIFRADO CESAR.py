abecedarioC="abcdefghijklmnñopqrstuvwxyz"
abecedarioD="zyxwvutsrqpoñnmlkjihgfedcba"
signos="!·$%&/()=?¿€^[]`*+´¨{,};.:-_"

def cifrado_cesar_cifrar(clave,cadena):
    cadenaM=""
    posicionO=0
    posicionF=0
    for i in range(len(cadena)):
        if cadena(i) in abecedarioC:
            posicionO=len(cadena(i)==abecedarioC(i))
            posicionF=posicionO+clave
            if 0<=posicionF<=27:
                pass
            elif posicionF>27:
                posicionF=posicionF%27
        elif cadena(i)==" ":
            cadenaM+=" "
        elif cadena(i) in signos:
            cadenaM+=cadena(i)
    return cadenaM

def cifrado_cesar_descifrar(clave,cadena):
    cadenaM=""
    for i in range(len(cadena)):
        if cadena(i) in abecedarioD:
            posicionO=len(cadena(i)==abecedarioD(i))
            posicionF=posicionO+clave
            if 0<=posicionF<=27:
                pass
            elif posicionF>27:
                posicionF=posicionF%27
        elif cadena(i)==" ":
            cadenaM+=" "
        elif cadena(i) in signos:
            cadenaM+=cadena(i)
    return cadenaM


menu='''
        #############################################################################
        Bienbenido al cifrado cesar
            a.  Introducir nuevo usuario.
            b.  Modificar palabra clave de cifrado.
            c.  Cifrar un mensaje.
            d.  Descifrar un mensaje.
            e.  Eliminar usuario.
            f.  Total mensajes cifrados y todal mensajes descifrados por el usuario.
            g.  Terminar.
        ############################################################################'''

opcion=""
usuario=[]
claveS=[]
cifradoT=[]
descifradoT=[]
usuarios=[usuario,claveS,cifradoT,descifradoT]

while opcion=="g":
    if opcion=="a":
        nombre=input("Introduzca su nombre de usuiario:")
        if nombre not in usuario:
            clave=("introduzca su numero clave(1-27):")
            while 0<clave<28:
                clave=("introduzca su numero clave(1-27):")
            usuario.append(nombre)
            claveN.append(clave)
            cifradoT.append(0)
            descifradoT.append(0)
        else:
            print("Ya existe dicho usuario.")
    elif opcion=="b":
        nombre=input("Introduzca su nombre de usuario:")
        if nombre in usuario:
            for i in usuario:
                if nombre==usuario[i]:
                    clave=("introduzca su numero clave(1-27):")
                    while 0<clave<28:
                        clave=("introduzca su numero clave(1-27):")
                    claveN=("introduzca su numero clave(1-27):")
                    while 0<claveN<28:
                        claveN=("introduzca su numero clave(1-27):")
                    claveS[i]=claveN
    elif opcion=="c":
        nombre=input("Introduzca su nombre de usuario:")
        if nombre in usuario:
            for i in usuario:
                if nombre==usuario[i]:
                    clave=claveS[i]
                    cadena=input("Introduce la frase que quieres cifrar:")
                    print(cifrado_cesar_cifrar(clave,cadena))
                    cifradoT[i]+=1
    elif opcion=="d":
        nombre=input("Introduzca su nombre de usuario:")
        if nombre in usuario:
            for i in usuario:
                if nombre==usuario[i]:
                    clave=claveS[i]
                    cadena=input("Introduce la frase que quieres descifrar:")
                    print(cifrado_cesar_descifrar(clave,cadena))
                    descifradoT[i]+=1
    elif opcion=="e":
        nombre=input("Introduce tu nombre de usuario:")
        clave=input("Introduce tu clave")
        for i in range(len(usuario)):
            if nombre==usuario[i] and clave==claveS[i]:
                usuario.remove(i)
                claveS.remove(i)
                cifradoT.remove(i)
                descifradoT.remove(i)
            else:
                print("datos introducidos incorrectos.")
    elif opcion=="f":
        usuarios.sort()
        print(usuarios)
    else:
        pass