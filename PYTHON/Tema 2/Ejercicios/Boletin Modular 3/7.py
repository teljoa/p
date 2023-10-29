def buscarPalabra(frase, buscar):  
    respuesta = -1
    buscar = " " + buscar.upper() + " "  
    frase = " " + frase.upper() + " " 
    if (buscar in frase):
        respuesta = siestaPalabra(frase, buscar)
    return respuesta

def siestaPalabra(cad, buscar):   
    encontrado = False
    c = 0
    c1 = 0
    while c < len(cad) and not encontrado:
        i = 0
        esta = True
        c1 = c
        while i < len(buscar) and esta :
            if cad[c] != buscar[i]:
                esta = False
            c += 1
            i += 1              
        if esta:
            encontrado = True 
        else:
            c1 = -1            
    return c1

def remplazarEnFrase(frase, buscar, sustituir):
    c = buscarPalabra(frase, buscar)
    while c != -1:   
        frase = frase[:c] + sustituir + frase[c + len(buscar):]  
        c = buscarPalabra(frase, buscar) 
    return frase


print(remplazarEnFrase("La vida no es vida ", "vida", "calor"))