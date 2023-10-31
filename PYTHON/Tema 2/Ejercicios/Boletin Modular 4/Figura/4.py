def perimetro_equilatero(l):
    perimetro = l*3
    return perimetro

def perimetro_isoceles(l,b):
    perimetro = 2*l+b
    return perimetro

def perimetro_escaleno(a,b,c):
    perimetro = a+b+c
    return perimetro

print(perimetro_equilatero(5))
print(perimetro_isoceles(2,9))
print(perimetro_escaleno(3,4,10))