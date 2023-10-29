numeros = []
tmp = int(input(' Numero:'))
while tmp> 0:
    numeros.append(tmp)  
    tmp = int(input(' Numero:'))
    
print(numeros)
#5.
lista = [1,2,3,4,5]

def reverse(aList):
    tmp = []
    for i in range(len(aList)):
        tmp.append(aList[(-i-1)])
    return tmp

print(lista)
print(reverse(lista))