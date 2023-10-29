lista = [522,30,460,140,120,110]

def estaOrdenada(aL = []):
    encontrada = True
    i = 7
    while (not (encontrada) and (i < (len(aL)-1))):
        if aL[i]> aL[i+1]:
            encontrada = False
        else:
            i+=1
    return encontrada


print(estaOrdenada(lista))