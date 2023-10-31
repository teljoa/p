#USUARIO
#1
usuarios = []
contrasenas = []
intentos = 0
usuario = ""
contrasena =""
opcion = 0
while opcion < 4:
    print("Menu")
    print("1.Crear usuario")
    print("2.Entrar")
    print("3.Ver usuarios exixtentes")
    print("4.Salir")
    opcion = int(input("Elige una opcion:"))
    if opcion == 1:
        if len(usuarios) <=9:
            usuario=input("Introduce un usuario valido:")
            contrasena=input("Introduce una contraseña valida:")
            if usuario not in usuarios:
                usuarios.append(usuario)
            if contrasena not in contrasenas:
                contrasenas.append(contrasena)
    elif opcion ==2:
        while intentos !=3:
            usuario = input("Introduce tu usuario:")
            contrasena = input("Introduce tu contrseña:")
            if (usuario not in usuarios) and (contrasena not in contrasenas):
                intentos+=1
            elif (usuario in usuarios) and (contrasena in contrasenas):
                pass
    elif opcion ==3:
        print(usuarios)
#CALCULO
#1
n=int(input("Enter a number:"))
tot=0
while(n>0):
    dig=n%10
    tot=tot+dig
    n=n//10
print("The total sum of digits is:",tot)
#2
def maximo_comun_divisor(a, b):
    temporal = 0
    while b != 0:
        temporal = b
        b = a % b
        a = temporal
    return a

print( maximo_comun_divisor(2, 22))
#3
def gcd(a, b):
    if a == 0:
        return b
    
    return gcd(b % a, a)


def lcm(a, b):
    return (a / gcd(a, b)) * b


if __name__ == '__main__':
    print("LCM = ", lcm(4, 6))
#4
n, m = 1, 5

change = n

s = 0

for i in range(m):
    s += change
    change = change * 10 + n

print(s)
#5
def leer_fraccion(nud,dmd):
    resultado = (nud//2) and (dmd//2)
    return resultado

def escribir_fraccion(nud,dmd):
    fraccion = []
    if dmd == 1:
        fraccion.append(nud)
    else:
        fraccion.append([nud, dmd])
    return fraccion

def calcular_mcd(nud,dmd):
    tml = 0
    while dmd != 0:
        tml = dmd
        dmd = nud % dmd
        nud = tml
    return nud

def simplificar_fracción(nud,dmd):
    resultado=calcular_mcd(nud,dmd)//nud,dmd
    return resultado

def sumar_fracciones(nud1,dmd1,nud2,dmd2):
    nud=(nud1*dmd2)+(dmd1*nud2)
    dmd=dmd1*dmd2
    return nud,dmd

def restar_fracciones(nud1,dmd1,nud2,dmd2):
    nud=nud1*dmd2-dmd1*nud2
    dmd=dmd1*dmd2
    return nud,dmd

def multiplicar_fracciones(nud1,dmd1,nud2,dmd2):
    nud=nud1*nud2
    dmd=dmd1*dmd2
    return nud,dmd
def dividir_fracciones(nud1,dmd1,nud2,dmd2):
    nud=nud1*dmd2
    dmd=dmd1*nud2
    return nud,dmd

print(leer_fraccion(4,2))
print(escribir_fraccion(4,2))
print(calcular_mcd(4,2))
print(simplificar_fracción(4,2))
print(sumar_fracciones(4,2,4,2))
print(restar_fracciones(4,2,4,2))
print(multiplicar_fracciones(4,2,4,2))
print(dividir_fracciones(4,2,4,2))
#6
opcion=0
nud1=4
nud2=4
dmd1=2
dmd2=2
while opcion !=6:
    print("Menu:")
    print("a. Sumar dos fracciones: En esta opción se piden dos fracciones y se muestra el resultado.")
    print("b. Restar dos fracciones: En esta opción se piden dos fracciones y se muestra la resta.")
    print("c. Multiplicar dos fracciones: En esta opción se piden dos fracciones y se muestra el producto.")
    print("d. Dividir dos fracciones: En esta opción se piden dos fracciones y se muestra la cociente.")
    print("e. Salir")
    opcion= input("Elige una opcion:")
    
    if opcion=="a":
        nud=(nud1*dmd2)+(dmd1*nud2)
        dmd=dmd1*dmd2

    elif opcion=="b":
        nud=nud1*dmd2-dmd1*nud2
        dmd=dmd1*dmd2

    elif opcion=="c":
        nud=nud1*nud2
        dmd=dmd1*dmd2

    elif opcion=="d":
        nud=nud1*dmd2
        dmd=dmd1*nud2

#FIGURAS
#1
π=3.14

def calcula_area(r):
    a = π*r**2
    
    return a

print(calcula_area(4))
#2
π=3.14

def calcula_longitud(r):
    l = 2*π*r
    return l

print(calcula_longitud(5))
#3
def calcula_euclidea(xp,yp,xq,yq):
    distancia = ((xq-xp)**2+(yq-yp)**2)**0.5
    return distancia

print(calcula_euclidea(4,7,8,2))
#4
def perimetro_equilatero(l):
    perimetro = l*3
    return perimetro

def perimetro_isoceles(l,b):
    perimetro = 2*l+b
    return perimetro

def perimetro_escaleno(a,b,c):
    perimetro = a+b+c
    return perimetro

print(perimetro_equilatero(4))
print(perimetro_isoceles(4,7))
print(perimetro_escaleno(2,6,8))
#5
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

print(calcula_area(4))
#FECHAS
#1
def calcula_tiempo(h,m,s):
    tr=86400-((h*60)+(m*3600)+(s*216000))
    return tr

print(calcula_tiempo(14,25,56))
#2
def calcula_tiempo(h1,h2,m1,m2,s1,s2):
    tr=0
    t1=((h1*60)+(m1*3600)+(s1*216000))
    t2=((h2*60)+(m2*3600)+(s2*216000))
    if t1 > t2:
        tr=t1-t2
    elif t2 < t1:
        tr=t2-t1
        
    return tr 

print(calcula_tiempo(14,22,56,28,42,34))
#3
def pasar_tiempo(s):
    tf=0
    opcion = input("Intraduce a que tipo de dato quieres convertir los segundos: d(dias),h(horas),m(minutos),s(segundos):")
    
    if opcion == "d":
        tf = s/(24*60**2)
    elif opcion == "h":
        tf =s/60**2
    elif opcion == "m":
        tf =s/60
    elif opcion == "s":
        tf = s
        
    return tf

print(pasar_tiempo(455423545454545456878))
#4
def diasHastaFecha(day1, month1, year1, day2, month2, year2):
    
    # Función para calcular si un año es bisiesto o no
    
    def esBisiesto(year):
        return year % 4 == 0 and year % 100 != 0 or year % 400 == 0
    
    # Caso de años diferentes
    
    if (year1<year2):
        
        # Días restante primer año
        
        if esBisiesto(year1) == False:
            diasMes = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        else:
            diasMes = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
     
        restoMes = diasMes[month1] - day1
    
        restoYear = 0
        i = month1 + 1
    
        while i <= 12:
            restoYear = restoYear + diasMes[i]
            i = i + 1
    
        primerYear = restoMes + restoYear
    
        # Suma de días de los años que hay en medio
    
        sumYear = year1 + 1
        totalDias = 0
    
        while (sumYear<year2):
            if esBisiesto(sumYear) == False:
                totalDias = totalDias + 365
                sumYear = sumYear + 1
            else:
                totalDias = totalDias + 366
                sumYear = sumYear + 1
    
        # Dias año actual
    
        if esBisiesto(year2) == False:
            diasMes = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        else:
            diasMes = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    
        llevaYear = 0
        lastYear = 0
        i = 1
    
        while i < month2:
            llevaYear = llevaYear + diasMes[i]
            i = i + 1
    
        lastYear = day2 + llevaYear
    
        return totalDias + primerYear + lastYear
    
    # Si estamos en el mismo año
    
    else:
        
        if esBisiesto(year1) == False:
            diasMes = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        else:
            diasMes = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    
        llevaYear = 0
        total = 0
        i = month1
        
        if i < month2:
            while i < month2:
                llevaYear = llevaYear + diasMes[i]
                i = i + 1
            total = day2 + llevaYear - 1
            return total 
        else:
            total = day2 - day1
            return total 
#5
def calcular_posicion_dia(dia,mes,anyo):
    a=(14-mes)//12
    
    y=anyo-a
    
    m=mes+12*a-2
    
    return(int(dia+y+y//4-y//100+y//400+(31*m)//12)%7)

nameOfDays=["Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"]

def calcula_diasemanal(dia,mes,anyo):
    if dia>0:
        text=nameOfDays[calcular_posicion_dia(dia,mes,anyo)]
    
    else:
        None
        
    return text 

print(calcula_diasemanal(31,10,2023))