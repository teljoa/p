vocales=['o','i',' ','e','a','u']

def codificador_Vocales(cadena):
    mensaje=""
    for i in cadena:
        if i in vocales:
            for j in range(len(vocales)):
                if i== vocales[j]:
                    i=str(j)
                    mensaje+=i
        else:
            mensaje+=i
    return mensaje


print(codificador_Vocales("chicago"))