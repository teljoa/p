letras=["T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"]

def dni_Valido(dni):
    valido=False
    numero=0
    resto=0
    letra=""
    if len(dni)==9:
        if dni[:8].isdigit() and not(dni[-1].isdigit()):
            numero=int(dni[:8])
            resto=numero%23
            letra=letras[resto]
            if letra == dni[-1]:
                valido = True
    elif len(dni)==8:
        if dni[:7].isdigit() and not(dni[-1].isdigit()):
            numero=int(dni[:7])
            resto=numero%23
            letra=letras[resto]
            if letra == dni[-1]:
                valido = True            
    return valido

print(dni_Valido("30246841R"))
assert(dni_Valido("00000000T"))
assert(dni_Valido("11111111H"))
assert(dni_Valido("1111111G"))