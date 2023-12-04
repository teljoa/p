def dame_numero():
    from random import randint
    return randint(0,20)

i=0
listaN1=[]
listaN2=[]
while i<10:
    listaN1.append(dame_numero())
    i+=1

print(listaN1)

while i<30:
    listaN2.append(dame_numero())
    i+=1

print(listaN2)

def get_posicion_eq_valor(listaN):
    listaC=[]
    for i in range(len(listaN)):
        if i==listaN[i]:
            listaC.append(listaN[i])
    return listaC


print(get_posicion_eq_valor(listaN1))

def obtener_frecuencia(lista,numero):
    frecuencia=lista.count(numero)
    return frecuencia

listaR=[]
for i in range(len(listaN2)):
    if listaN2[i] not in listaR:
        listaR.append(listaN2[i])
        print(f"{listaN2[i]} -> frecuencia ->{obtener_frecuencia(listaN2,listaN2[i])}")