#1.
nota=0
while 0<=nota<=100:
    nota=input("Intoduce una nota entre 0-100.")
    if 0<=nota<=100:
        if 90<=nota<=100:
            print("Sobresaliente")
        elif 70<=nota<=89:
            print("Notable")
        elif 60<=nota<=69:
            print("Bien")
        elif 50<=nota<=59:
            print("suficiente")
        else:
            print("Suspenso")
    else:
        print("Nota no validad.")
#2.
hemisferio=input("Introduce en que hemisferio te encuentras:")
mes=input("Introduce en mes te encuentras:")
dia=input("Introduce en que dia te encuentras:")
if (0 < dia <= 31) and (mes== "Enero" or mes == "Febrero" or mes == "Marzo" or mes == "Abril" or mes == "Mayo" or mes == "Junio" or mes == "Julio" or mes == "Agosto" or mes == "Septiembre" or mes == "Octubre" or mes == "Nobiembre" or mes == "Diciembre") and (hemisferio == "S" or hemisferio == "N"):
    if (23 <= dia <= 30 and mes == "Septiembre") or (0 < dia <=31 and mes == "Octubre") or (0 < dia <= 21 and mes == "Nobiembre") or (0 < dia <=20 and mes == "Diciembre"):
        if hemisferio == "N":
            print("Otoño")
        else:
            print("Primavera")

    elif (21 <= dia <= 31 and mes == "Diciembre") or (0 < dia <= 31 and mes== "Enero") or (0 < dia <= 28 and mes == "Febrero") or (0 < dia < 20 and mes == "Marzo" ):
        if hemisferio == "N":
            print("Invierno")
        else:
            print("Verano")

    elif (21 <= dia <= 31 and mes == "Marzo") or (0 < dia <= 30 and mes == "Abril") or (0 < dia <= 31 and mes == "Mayo") or (0 < dia <= 20 and mes == "Junio"):
        if hemisferio == "N":
            print("Primavera")
        else:
            print("Otoño")
    elif (21 <= dia <= 30 and mes == "Junio") or (0 < dia <= 31 and mes == "Julio") or (0 < dia <= 31 and mes == "Agosto") or (0 < dia <= 22 and mes == "Septiembre"):
        if hemisferio == "N":
            print("Invierno")
        else:
            print("Verano")
else:
    print("Datos no validos")
#3.
#Codigo modificado y realizado con ayuda de informacion buscada en internet.
day2 = int(input("Dime un dia:"))
month2 = int(input("Dime un mes:"))
year2 = int(input("Dime un año:"))

day1 = 1
month1 = 1
year1 = year2 


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
#4.
grupoSanguineo1 = input("Dime un grupo sanguineo:")
grupoSanguineo2 = input("Dime un grupo sanguineo:")


if (grupoSanguineo1 == "A" or grupoSanguineo1 == "B" or grupoSanguineo1 == "AB" or grupoSanguineo1 == "0") and (grupoSanguineo2 == "A" or grupoSanguineo2 == "B" or grupoSanguineo2 == "AB" or grupoSanguineo2 == "0"):
    
    if grupoSanguineo1 == "A" and grupoSanguineo2 == "A":
        print("Ambos grupos sangineos son compatibles, A puede donar a: A y A puede recibir de: A.")
    
    elif grupoSanguineo1 == "A" and grupoSanguineo2 == "B":
        print("Ambos grupos sangineos no son compatibles.")
    
    elif grupoSanguineo1 == "A" and grupoSanguineo2 == "AB":
        print("Ambos grupos sangineos son compatibles, A puede donar a: AB y AB puede recibir de: A")    
    
    elif grupoSanguineo1 == "A" and grupoSanguineo2 == "0":
        print("Ambos grupos sangineos son compatibles, 0 puede donar a: A y A puede recibir de: 0")
    
    elif grupoSanguineo1 == "B" and grupoSanguineo2 == "B":
        print("Ambos grupos sangineos son compatibles, B puede donar a: B y B puede recibir de: B")
    
    elif grupoSanguineo1 == "B" and grupoSanguineo2 == "AB":
        print("Ambos grupos sangineos son compatibles, B puede donar a: AB y AB puede recibir de: B")
    
    elif grupoSanguineo1 == "B" and grupoSanguineo2 == "0":
        print("Ambos grupos sangineos son compatibles, 0 puede donar a: B y B puede recibir de: 0")
    
    elif grupoSanguineo1 == "AB" and grupoSanguineo2 == "AB":
        print("Ambos grupos sangineos son compatibles, AB puede donar a: AB y AB puede recibir de: AB")
        
    elif grupoSanguineo1 == "AB" and grupoSanguineo2 == "0":
        print("Ambos grupos sangineos son compatibles, 0 puede donar a: AB y AB puede recibir de: 0")
    
    elif grupoSanguineo1 == "0" and grupoSanguineo2 == "0":
        print("Ambos grupos sangineos son compatibles, 0 puede donar a: 0 y 0 puede recibir de: 0")