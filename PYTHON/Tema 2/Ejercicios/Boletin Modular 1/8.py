numeros = []
tmp = int(input(' Numero:'))
while tmp>= 0:
    numeros.append(tmp)  
    tmp = int(input(' Numero:'))

  
def esPrimo(num):    
    valido = True
    i=2
    while (i<num and esPrimo):
        if num%i==0:
            valido = False
        i += 1
    return valido       
     
def primosLista(list): 
    tmp = []
    for i in list:
        if esPrimo(i):
            tmp.append(i)
    return tmp
    
def sumatorio(list):
    tmp = 0 
    for i in list:
        tmp += i
    return tmp

def media (list):
    tmp = sumatorio(list)
    
    return tmp / len(list)

def factorial(num):
    tmp = 1
    for i in range(1,num+1):
        tmp *= i
    return tmp

def factorialLista(list):
    tmp = []
    for i in list:
        tmp.append(factorial(i))
    return tmp

print(numeros)
print(primosLista(numeros))  
print(sumatorio(numeros))
print(media(numeros))
print(factorialLista(numeros))