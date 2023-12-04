from random import randint

caracteres=["~","`","!","@","#","$","%","^","&","*","(",")","_","-","+","=","{","}","[","]","|","/",":",";","<",",",">","?","¿","."]
letrasm=['q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m']
letrasM=['Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M']
numeros=['1','2','3','4','5','6','7','8','9','0']
componentes_contrasena=[caracteres,letrasM,letrasm,numeros]

def es_pass_segura(contrasena):
    seguro=False
    minuscula=False
    mayuscula=False
    digito=False
    caracter=False
    espacio=True
    if len(contrasena)>=8:
        for i in range(len(contrasena)):
            
            if contrasena[i].islower() and minuscula==False:
                minuscula=True
            
            elif contrasena[i].isupper() and mayuscula==False:
                mayuscula=True
            
            elif contrasena[i].isdigit() and digito==False:
                digito=True
            
            elif contrasena[i]==" " and espacio==True:
                espacio=False
            
            elif contrasena[i] in caracteres and caracter==False:
                caracter=True
        
        if minuscula and mayuscula and digito and caracter and espacio:
            seguro=True
    
    return seguro

def generar_pass_segura():
    contrasena=""
    caracterM=""
    while not es_pass_segura(contrasena):
        contrasena=""
        for i in range(8):
            posicion1=randint(0,len(componentes_contrasena)-1)
            posicion2=randint(0,len(componentes_contrasena[posicion1])-1)
            caracterM=componentes_contrasena[posicion1][posicion2]
            contrasena+=str(caracterM)

    return contrasena

print(generar_pass_segura())