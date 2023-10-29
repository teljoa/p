from random import randint

def listaAleatoria (cantidad = 10, inicial=0,final=1000):
    tmp = []
    for n in range(cantidad):
        tmp.append(randint(inicial,final))  
    return tmp


lista=listaAleatoria()
print(lista)
listaN=[]
for i in range(len(lista)):
    if i==len(lista)-1:
       listaN.insert(0,lista[i])
    else:
        listaN.insert(i,lista[i])
print(listaN)