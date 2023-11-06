#1.
chp ="hsgshfksdklfjhweiojhvksdllke".upper()
l = "d".upper()

def charactersInString(chp,l):
    np = 0
    for i in chp:
        if l == i:
            np+=1
    return np

print(charactersInString(chp,l))
#2.
chp ="hsgshfksdklfjhweiojhvksdllke"

def lowCaseInString(chp):
    lcm = 0
    for i in chp:
        if i.islower():
            lcm+=1
    return lcm

print(lowCaseInString(chp))
#3.
chp ="hsgshfksdklFjhweioJhvkSdllke"

def upperCaseInString(chp):
    lcm = 0
    for i in chp:
        if i.isupper():
            lcm+=1
    return lcm

print(lowCaseInString(chp))
#4.
def numberInString(chp):
    lcm = 0
    for i in chp:
        if i.isnumeric():
            lcm+=1
    return lcm

print(lowCaseInString(chp))
#5.
palindrome = "anilina"

def ispalindrome(palindrome):
    prin= 0
    vuelta = len(palindrome)-1
    while palindrome[prin]==palindrome[vuelta]:
        if prin >= vuelta:
            return True 
        prin+= 1
        vuelta-=1
    return False
    

print(ispalindrome(palindrome))
#6.
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
#7.
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
#8.
def distintasVocales(cad):
    tmp = []
    cad = cad.lower()
    for n in cad:
        if n in "aeiou":
            if n not in tmp:
                tmp.append(n)
    return len(tmp)


print(distintasVocales("abaco"))
#9.
def descadena(cad):
    cad = cad.lower()
    solucion = ''
    for n in cad:
        if n in "qwrtypsdfghjklñzxcvbnm":
            solucion += n
            
    for n in cad:
        if n in "aeiou":
            solucion += n
    return solucion

            
assert(descadena('curso de programacion') == "crsdprgrmcnuoeoaaio")
print(descadena('curso de programacion'))
#10.
def numeroPalabra(cad):
    c = 0
    solucion = 0
    cad = cad.strip()
    while c < len(cad):
        while c < len(cad) and cad[c] ==" ":
            c += 1
        solucion += 1
        while  c < len(cad) and cad[c] !=" ":
            c += 1
    return solucion

print (numeroPalabra("He estudiado mucho"))
