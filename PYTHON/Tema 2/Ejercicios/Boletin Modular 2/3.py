def es_bisiesto(ayo):
    if ayo % 4 == 0 and (ayo % 100 != 0 or ayo % 400 == 0):
        ayo = True
    else:
        ayo = False
        
    return ayo

def contador_dias(mes):
    if mes in [1,3,5,7,8,10,12]:
        dia = 31
    elif mes in [4,6,9,11]:
        dia = 30
    elif mes==2:
        if es_bisiesto(ayo) == True:
            dia = 29
        elif es_bisiesto(ayo) == False:
            dia = 28
    else:
        dia = -1
    
    return dia

ayo = 2024
mes = 2

print(contador_dias(mes))