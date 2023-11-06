def buscar_palabra(palabrab,cadena):
    palabra = []
    c=0
    c2=0
    while c<(len(cadena)):
        if palabrab[c2]==cadena[c]:
            palabra.append(cadena[c])
            c2+=1
        c+=1
    return palabra

print(buscar_palabra("hola","shybaoxlna"))
