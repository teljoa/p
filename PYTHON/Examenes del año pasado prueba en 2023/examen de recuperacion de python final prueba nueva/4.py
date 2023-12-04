def intersection(lista1,lista2):
    lista=[]
    for i in lista1:
        if i in lista2 and  i not in lista:
            lista.append(i)
    return lista

def diferencia(lista1,lista2):
    lista=[]
    for i in lista1 :
        if i not in lista2 and i not in lista:
            lista.append(i)
    for j in lista2:
        if j not in lista1 and j not in lista:
            lista.append(j)
    return lista

lista1=[1,3,5,7,9]
lista2=[8,15,24,9,3]

print(intersection(lista1,lista2))
print(diferencia(lista1,lista2))