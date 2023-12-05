#Apartado 1

def buscarpalabras(listaP,letraB="a".lower()):
    listaComienza=[]
    for i in range(len(listaP)):
        if listaP[i][0].lower()==letraB.lower() and not listaP[i]in listaComienza:
            listaComienza.append(listaP[i])
    
    return listaComienza

listaP=['bocadillo','pez','ornitorrinco','viaje','patrocinio','ocio','orangutan','ocio']
letraB='O'

print(buscarpalabras(listaP,letraB))

#Apartado 2

def buscarpalabra2(lista,caracteres="a".lower()):
    listaCoincidencias=[]
    for i in range(len(lista)):
        if lista[i][:len(caracteres)].lower()==caracteres.lower() and not lista[i] in listaCoincidencias:
            listaCoincidencias.append(lista[i])
    
    return listaCoincidencias

lista=['bocadillo','pez','ornitorrinco','viaje','patrocinio','ocio','orangutan','ocio','Ortopedia','orangutan']
caracteres="Or"

print(buscarpalabra2(lista,caracteres))