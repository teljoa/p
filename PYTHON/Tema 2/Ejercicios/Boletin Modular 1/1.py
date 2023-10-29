from random import randint

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
    while opcion!="F": 
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