lista = [1636,2,3,4634,34565,6,3467,8,9,4560,10,6245654,33,821709]
n = 7

def menoresQue(aList, num):
    tmp = []
    for i in aList:
        if i < num:
            tmp.append(i)     
    return tmp

def mayoresQue(aList, num):
    tmp = [] 
    for i in aList:
        if i > num:
            tmp.append(i)     
    return tmp

def multiplosDe(aList, num):
    tmp = [] 
    for i in aList:
        if ((i%num == 0) and (i != 0)):
            tmp.append(i)    
    return tmp

print(f' Los numeros menores que {n} son {menoresQue(lista,n)}')
print(f' Los numeros mayores que {n} son {mayoresQue(lista,n)}')
print(f' Los numeros multiplos de {n} son {multiplosDe(lista,n)}')