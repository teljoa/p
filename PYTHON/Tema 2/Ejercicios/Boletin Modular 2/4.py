def getday0fWeek(dia,mes,año):
    a=(14-mes)//12
    
    y=año-a
    
    m=mes+12*a-2
    
    return(int(dia+y+y//4-y//100+y//400+(31*m)//12)%7)

nameOfDays=["Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"]
dia=1
while dia>0:
    dia=int(input("Introduce un muenro de dia:"))
    mes=int(input("Introduce un numero de mes:"))
    año=int(input("Introduce un numero de año:"))
    if dia>0:
        text=nameOfDays[getday0fWeek(dia,mes,año)]
    
    else:
        text="error"
        
    print("Es",text)