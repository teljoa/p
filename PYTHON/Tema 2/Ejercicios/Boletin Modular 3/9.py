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