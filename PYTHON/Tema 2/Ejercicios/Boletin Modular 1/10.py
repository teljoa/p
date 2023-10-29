def conversor(cadena):
    for i in range(len(cadena)):
        if i=="B":
            if decimal <= 0:
                cadena = ""
            while decimal > 0:
                residuo = int(decimal % 2)
                decimal = int(decimal / 2)
                cadena = str(residuo) + cadena
        elif i=="D":
            i = 0
            while (cadena>0):
                digito  = cadena%10
                cadena = int(cadena//10)
                decimal = decimal+digito*(2**i)
                i = i+1
    return cadena