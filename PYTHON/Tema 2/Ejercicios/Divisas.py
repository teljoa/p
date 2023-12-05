menu='''Bienbenido a Jacaixa
        1.Abrir cuenta.
        2.Introducir nuevo valor a cambio.
        3.Comprar bitcoins.
        4.Vender bitcoins.
        5.Mostrar historico
        6.Salir
        '''
opcion=0
saldoB=0
saldoE=0
ultimosValoresB=[]
usuario=input("Introduce tu nombre de usuario:")

while opcion<6:
    
    opcion=int(input("Introduce una opcion:"))
    
    if opcion==1:
        saldoIngresar=float(input("INtroduce tu saldo actual a ingresar en €:"))
        
        while saldoIngresar<=0:
            saldoIngresar=float(input("INtroduce tu saldo actual a ingresar en €:"))
        
        saldoB=0
        saldoE+=saldoIngresar
        
    elif opcion==2:
        valor=float(input("Introduce el valor actual del bitcoins en euros:"))
        
        while valor<0:
            valor=float(input("Introduce el valor actual del bitcoins en euros:"))
            
        if len(ultimosValoresB)>=7:
            ultimosValoresB.pop(0)            #ultimosValores.remove(ultimosValores[0])
        
        ultimosValoresB.append(valor)
            
    elif opcion==3:
    
        if len(ultimosValoresB)>0:
            compra=float(input("Introduce cuantos bitcoins quieres comprar:"))
            while compra<0:
                compra=float(input("Introduce cuantos bitcoins quieres comprar:"))
            
            resultado=ultimosValoresB[-1]*compra
            
            if resultado<=saldoE:
                saldoE-=resultado
                saldoB+=compra
                print("La compra se ha realizado correctamente.")
                
            else:
                print("Su saldo actual es menor al necesario para realizar dicha compra.")
                
        else:
            print("Actualmente no se ha registrado ningun  valor de cambio.")
            
    elif opcion==4:
                
        if len(ultimosValoresB)>0:
            venta=float(input("Introduce cuantos bitcoins quieres comprar:"))
            while venta<0:
                venta=float(input("Introduce cuantos bitcoins quieres comprar:"))
            
            if venta<=saldoB:
                resultado=ultimosValoresB[-1]*venta
                saldoE+=resultado
                saldoB-=venta
                
            else:
                print("Su saldo actual es menor al necesario para realizar dicha venta.")
                
        else:
            print("Actualmente no se ha registrado ningun  valor de cambio.")
            
    elif opcion==5:
        for i in range(len(ultimosValoresB)):
            print(f"El cambio en el dia{i+1} fue de {ultimosValoresB[i]}")
        
    elif opcion==6:
        print(f"Su saldo actual señ@r{usuario} es de {saldoE}€ y {saldoB}₿")