def perimetro_equilatero(l):
    perimetro = l*3
    return perimetro

print(perimetro_equilatero(4))

def calcula_altura(l):
    altura = l**2-(l**2/4)
    return altura

print(calcula_altura(4))

def calcula_area(l):
    area=(l*calcula_altura(l))/2
    return area

print(calcula_area(8))