def leer_fraccion(num,dmd):
    resultado = (num//2) and (dmd//2)
    return resultado

def escribir_fraccion(num,dmd):
    fraccion = []
    if dmd == 1:
        fraccion.append(num)
    else:
        fraccion.append([num, dmd])
    return fraccion

def calcular_mcd(num,dmd):
    tml = 0
    while dmd != 0:
        tml = dmd
        dmd = num % dmd
        num = tml
    return num

def simplificar_fracción(num,dmd):
    resultado=calcular_mcd(num,dmd)//num,dmd
    return resultado

def sumar_fracciones(num1,dmd1,num2,dmd2):
    num=(num1*dmd2)+(dmd1*num2)
    dmd=dmd1*dmd2
    return num,dmd

def restar_fracciones(num1,dmd1,num2,dmd2):
    num=num1*dmd2-dmd1*num2
    dmd=dmd1*dmd2
    return num,dmd

def multiplicar_fracciones(num1,dmd1,num2,dmd2):
    num=num1*num2
    dmd=dmd1*dmd2
    return num,dmd
def dividir_fracciones(num1,dmd1,num2,dmd2):
    num=num1*dmd2
    dmd=dmd1*num2
    return num,dmd

print(leer_fraccion(6,3))
print(escribir_fraccion(6,3))
print(calcular_mcd(6,3))
print(simplificar_fracción(6,3))
print(sumar_fracciones(6,3,6,3))
print(restar_fracciones(6,3,6,3))
print(multiplicar_fracciones(6,3,6,3))
print(dividir_fracciones(6,3,6,3))