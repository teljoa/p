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