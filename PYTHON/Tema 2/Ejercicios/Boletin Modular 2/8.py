def solveSecondOrderEquation(n1,n2,n3):
    x=0
    y=0
    if(n1 <=0)or(n2 <=0)or(n3 <=0):
        x=None
        y=None  
    else:
        x1=(n2**2)-(4*n1*n3)
        x3=x1**(1/2)
        x2=(n2)+(x3)
        x=x2/(2*n1)
        y1=(n2**2)-(4*n1*n3)
        y3=y1**(1/2)
        y2=(n2)-(y3)
        y=y2/(2*n1)
    return x, y  

numero1=input("Introduce un numero:")
while numero1<0:
    numero1=input("Introduce un numero:")
numero2=input("Introduce un numero:")
while numero1<0:
    numero2=input("Introduce un numero:")
numero3=input("Introduce un numero:")
while numero1<0:
    numero3=input("Introduce un numero:")
solveSecondOrderEquation(numero1,numero2,numero3)