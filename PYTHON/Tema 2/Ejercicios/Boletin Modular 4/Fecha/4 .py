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