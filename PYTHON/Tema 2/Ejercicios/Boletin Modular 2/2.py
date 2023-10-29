def es_bisiesto(ayo):
    if ayo % 4 == 0 and (ayo % 100 != 0 or ayo % 400 == 0):
        ayo = True
    else:
        ayo = False
        
    return ayo

ayo = 2024

print(es_bisiesto(ayo))