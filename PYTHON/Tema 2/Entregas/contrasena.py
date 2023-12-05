from random import randint

caracteres=["~","`","!","@","#","$","%","^","&","*","(",")","_","-","+","=","{","}","[","]","|","/",":",";","<",",",">","?","¿","."]

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

assert(es_pass_segura("hfgdshjshA675875."))
assert(not es_pass_segura("hfgdshjshA67 5875."))
assert(not es_pass_segura("hshA5."))

'''
def generar_pass_segura():
    contrasena=""
    
    for i in range(8):
        contrasena+=str(i)
    
    return contrasena
'''