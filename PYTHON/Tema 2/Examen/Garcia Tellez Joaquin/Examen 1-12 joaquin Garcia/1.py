#APARTADO 1

numero=1.449

def redondear(numero):
    numeroN=0.00
    numeroN=round(float(numero),2)
    return numeroN

print(redondear(numero))
assert(redondear("0.375")==0.38)

#APARTADO 2

def redordear_lista(lista,nredondear):
    listaN=[]
    numeroN=0
    for i in range(len(lista)):
        numeroN=round(float(lista[i]),nredondear)
        listaN.append(numeroN)
    return listaN

print(redordear_lista([1.449,'1.444',0.375,'0.374',1],2))
assert(redordear_lista([1.449,'1.444',0.375,'0.374',1],2)==1.45,1.44,0.38,0.37,1.00)