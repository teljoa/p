from random import randint

def obtener_Numero_Ganador():
    return randint(2,12)

MENU='''
        1. Apostar
        2. Mostrar historial
        3. Retirarse
    '''
    
opcion=0
saldoN=0.00
historial=[]
ganancias=[]
perdidas=[]

while opcion<3:
    print(MENU)
    opcion=int(input("Introduce una de las opciones:"))
    
    if opcion==1:
        resultado=''
        resultadoN=0.00
        dineroA=float(input("Introduce cuanto dinero quieres apostar:"))
        while dineroA<0:
            dineroA=float(input("Introduce cuanto dinero quieres apostar:"))
            
        numeroA=int(input("Introduce un numero entre 2-12 para apostar:"))
        while not(1<numeroA<13):
            numeroA=int(input("Introduce un numero entre 2-12 para apostar:"))
            
        numero_Ganador=obtener_Numero_Ganador()
        
        if numeroA==numero_Ganador:
            resultadoN=dineroA*2
            ganancias.append(resultadoN)
            resultado='ganando'
        else:
            resultadoN=dineroA
            perdidas.append(resultadoN)
            resultado='perdiendo'
            
        historial.append([numeroA,numero_Ganador,resultado,resultadoN])
        
    elif opcion==2:
        for i in range(len(historial)):
            print(f"En la {i+1}º jugada aposto al valor {historial[i][0]} y sumo {historial[i][1]},{historial[i][2]} {historial[i][3]}€")
    elif opcion==3:
        totalGanancias=0
        for i in ganancias:
            totalGanancias+=i
        
        totalPerdidas=0
        for j in perdidas:
            totalPerdidas+=j
            
        saldoN=totalGanancias-totalPerdidas
        
        print(f"Su saldo final es de {saldoN}€")