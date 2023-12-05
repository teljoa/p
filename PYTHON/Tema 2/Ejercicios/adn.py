palabra=["C","G","A","C","T"]
cadena=['A','A','T','C','G','A','C','T','T','G','C','C','A','G','C','G','A','C','T','A','C','T','A','C','T','A','A']

def cadena_ADN(cadena,palabra):
    apariciones=0
    for i in range(len(cadena)):
        if cadena[i:i+len(palabra)]==palabra:
                apariciones+=1
    return apariciones


print(cadena_ADN(cadena,palabra))
assert(cadena_ADN(cadena,palabra)==2)

def codificador(cadenaAND):
    cadena_AND_Codificada=""
    for i in range(len(cadenaAND)):
        if cadenaAND[i]=="A":
            cadena_AND_Codificada+="T"
        elif cadenaAND[i]=="T":
            cadena_AND_Codificada+="A"
        elif cadenaAND[i]=="C":
            cadena_AND_Codificada+="G"
        elif cadenaAND[i]=="G":
            cadena_AND_Codificada+="C"
    return cadena_AND_Codificada

print(codificador("TGACTGGTCAA"))
assert(codificador("TGACTGGTCAA")=="ACTGACCAGTT")