menu='''
        1.Invertir cadena de texto.
        2.Contar el numero total de caracteres.
        3.Contar el numero de palabras.
        4.Contar las apariciones de una determinada palabra.
        5.Sustituir una palabra por otra.        
        6.Salir
'''

opcion=0
separadores=[" ",",",";",".",":"]

while opcion<6:
    print(menu)
    opcion=int(input("Introduce una opcion:"))
    frase=input("Introduce una frase:")
    if opcion==1:
        cadena_invertida = ""
        for letra in frase:
            cadena_invertida = letra + cadena_invertida
        print(cadena_invertida)
    elif opcion==2:
        print(f"Esta frase se compone de {len(frase)} caracteres.")
    elif opcion==3:
        palabrasN=0
        for i in range(len(frase)):
            if frase[i] in separadores and frase[i-1] not in separadores:
                palabrasN+=1
        print(f"Esta frase se compone de {palabrasN} palabras.")
    elif opcion==4:
        palabraB=input("Introduce la palabra a buscar:")
        aparicion=0
        for i in range(len(frase)):
            if frase[i:i+len(palabraB)]==palabraB:
                aparicion+=1
        print(f"En esta frase aparece la palabra {palabraB} {aparicion} veces.")
    elif opcion==5:
        fraseM=""
        palabraB=input("Introduce la palabra a buscar:")
        palabraS=input("Que palabra quieres poner en su lugar:")
        for i in range(len(frase)):
            if frase[i:i+len(palabraB)]==palabraB:
                fraseM+=palabraS
            elif frase[i] not in palabraB:
                fraseM+=frase[i]
        print(f"La frase original es:{frase}")
        print(f"La frase modificada es:{fraseM}")