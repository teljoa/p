from random import randint

#1.
def listaAleatoria (cantidad = 100, inicial=0,final=1000):
    tmp = []
    for n in range(cantidad):
        tmp.append(randint(inicial,final))  
    return tmp

def mayor(tmp): 
    n = tmp[0]
    for i in tmp:
        if i > n:
            n = i
    return n

def menor (tmp): 
    n = tmp[0]
    for i in tmp:
        if i < n:
            n = i
    return n

def media (tmp):
    return (sumatorio(tmp) / len(tmp))

def sumatorio (tmp):
    n = 0
    for i in tmp:
        n += i
    return n


def sustituir(sustituido,sustituto, tmp = []):
    for n in range(len(tmp)):
        if tmp[n] == sustituido:
            tmp[n] = sustituto 
    return(tmp)
    
def numeros (tmp = []):
    print(tmp)

def menu(numero):
    print('a. Conocer el mayor')
    print('b. Conocer el menor')
    print('c. Obtener la suma de todos los numeros')
    print('d. Obtener la media ')
    print('e. Sustituir el valor de una elemento por otro introcucido por teclado')
    print('f. Mostrar todos los numeros')
    print('g. Generar nueva lista\n')
    opcion = input(' Que quiere hacer? ').upper().strip()
    
    if opcion == 'A':
        print(mayor(numero))
        menu(numero)
    elif opcion == 'B':
        print(menor(numero))
        menu(numero)
    elif opcion == 'C':
        print(sumatorio(numero))
        menu(numero)
    elif opcion == 'D':
        print(media(numero))
        menu(numero)
    elif opcion == 'E':
        sustituido = int (input(' Numero a sustituir: '))
        sustituto = int (input(' Sustituto: '))
        sustituir(sustituido, sustituto, numero)
        menu(numero)
    elif opcion == 'F':
        print(numero)
        menu(numero)
    elif opcion == 'G':
        numero = listaAleatoria() 
        menu(numero)
    else:
        print(' Opcion no valida \n')
        menu(numero = listaAleatoria() )


numero = listaAleatoria()         
menu(numero)

#2.
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

#3.
dia = 15
mes = 3
agno = 2009

meses = ['enero','febrero','marzo','abril','mayo', 'junio', 'julio', 'agosto', 'septiembre', 'octubre', 'noviembre','diciembre']

def listaDiasAgno(agno):
    
    dias = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]    
    if ( (agno % 4 == 0 and agno % 100 != 0) or (agno % 400 == 0) ):
        dias[1]=29
    return dias

while ( not(0 < mes <= 12) and (mes > 0) ):
    mes = input(' Mes no valido, pruebe de nuevo')

if mes > 0:
    while ( not(0 < mes <= 12) and (mes > 0) ):
        mes = input(' Año no valido, pruebe de nuevo')   
    
    else:
        while dia > listaDiasAgno(agno)[mes+1]:
            dia = input(' Dia no valido, pruebe de nuevo')
#4.
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
    for n in range(len(aList)):
        tmp.append(aList[(-n-1)])
    return tmp

print(lista)
print(reverse(lista))
#6.
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
#7.
a,b = [3,4],[2,5]

def encajan(a,b):
    encaga=False
    if a[0] in b or a[1] in b:
        encaga=True
    return encaga

print(encajan(a, b))
#8.
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
#9.
lista = [1,2,3,4,5,6,7,8,9,0,10,62,33,821709]

k = 7


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

print(f' Los numeros menores que {k} son {menoresQue(lista,k)}')
print(f' Los numeros mayores que {k} son {mayoresQue(lista,k)}')
print(f' Los numeros multiplos de {k} son {multiplosDe(lista,k)}')
#10.
def conversor(cadena):
    for i in range(len(cadena)):
        if i=="B":
            if decimal <= 0:
                cadena = ""
            while decimal > 0:
                residuo = int(decimal % 2)
                decimal = int(decimal / 2)
                cadena = str(residuo) + cadena
        elif i=="D":
            i = 0
            while (cadena>0):
                digito  = cadena%10
                cadena = int(cadena//10)
                decimal = decimal+digito*(2**i)
                i = i+1
    return cadena
#11.
a = ['j','b','h',6,47]

b = ['j', 'a',7,47]

def intersect(aList, bList):
    tmp = []
    for n in aList:
        if n in bList:
            tmp.append(n)
    for i in bList:
        if ((i in aList) and (i not in tmp)):
            tmp.append(i)
    
    return tmp

print(intersect(a, b))
#12.
a = ['a','b','c',2,4,6,'D']

b = ['1', 'b',7,2,1,6,9,'D']

def unionListas(aList, bList):
    tmp = []
    for n in aList:
        if n not in bList:
            tmp.append(n)
    for i in bList:
        if i not in aList:
            tmp.append(i)
    
    return tmp

print(unionListas(a, b))
#13.
nombres = ['Joaquin', 'Bartolo', 'Jatoru']

inicial = 'J'

def nombresInicial(aList, inicial):
    tmp = []
    for n in aList:
        if n[0].upper() == inicial.upper():
            tmp.append(n)
    return tmp
 
def nombreValido(cad):
    for n in cad:
        if not (n.isalpha()):
            return False
    return True

def listaValida(aList):
    for n in aList:
        if not(nombreValido(n)):
            return False
    return True



if listaValida(nombres):
    if nombreValido(inicial):
        print(nombresInicial(nombres, inicial))
    else:
        print(' Inicial no valida')
else:
    print(' Los datos de la lista son erroneos')
#14.
lista = ['isodjgiksgjñljksegñk']
lista = ['krljheeeeeeeeeeeeesósdkñljgl']

def contarLetra(cadena,letra):
    k = 0
    letra = letra.lower()
    cadena = cadena.lower()
    for n in cadena:
        if letra == n:
            k += 1
    return [letra, k]

def esta(letra, lista):
    
    for n in lista:
        if letra in n:
            return True
    return False

def contarRepetidos(cadena):
    cadena = cadena.lower()
    tmp = []
    tmp.append(contarLetra(cadena, cadena[0]))
    for n in cadena.lower():
        if not (esta(n,tmp)):
            tmp.append(contarLetra(cadena, n))
    return tmp


    
maximo = lista[0]
for n in lista:
    if len(n) > len(maximo):
        maximo = n
    elif len(n) == len(maximo): 
        if len(contarRepetidos(n)) < len(contarRepetidos(maximo)):#mientras menor sea el tamaño mas letras repetidas tiene
            maximo = n
        
        
print(maximo)
