menu='''Bienbenido a Jacaixa
        1.Abrir cuenta.
        2.Introducir nuevo valor a cambio.
        3.Comprar bitcoins.
        4.Vender bitcoins.
        5.Mostrar historico
        6.Salir
        '''
print(menu)

clientes=[]
saldosE=[]
saldosB=[]
historial=[clientes,saldosE,saldosB]
opcion=0
ultimosValoresB=[]

while opcion<7:
    usuario=input("Introduce tu nombre de usuario:")
    opcion=int(input("Introduce una opcion:"))
    resultado=0
    if opcion==1:
        if usuario not in clientes:
            clientes.append(usuario)
            saldoE=float(input("INtroduce tu saldo actual a ingresar en €:"))
            while saldoE<=0:
                saldoE=float(input("INtroduce tu saldo actual a ingresar en €:"))
            saldosE.append(saldoE)
            saldosB.append(0)
        else:
            for i in range (len(clientes)):
                if clientes[i]==usuario:
                    saldosE[i]+=saldoE
                
    elif opcion==2:
        valor=float(input("Introduce el valor actual del bitcoins en euros:"))
        if len(ultimosValoresB)<7:
            ultimosValoresB.append(valor)
        elif len(ultimosValoresB)==7:
            ultimosValoresB.remove(0)
            ultimosValoresB.append(valor)
            
    elif opcion==3:
        if usuario in clientes:
            for i in range(len(clientes)):
                if clientes[i]==usuario:
                    comprar=float(input("Introduce cuantos bitcoins quieres comprar:"))
                    resultado=ultimosValoresB[-1]*comprar
                    while resultado>saldosB[i]:
                        resultado=0
                        print("La cantidad de bitcoins que quieres comprar no se corresponde al saldo en euros que tienes en la cuenta.")
                        comprar=float(input("Introduce cuantos bitcoins quieres comprar:"))
                        resultado=ultimosValoresB[-1]*comprar
                    saldosE[i]-=resultado
                    saldosB[i]+=comprar
    
    elif opcion==4:
       if usuario in clientes:
           for i in range(len(clientes)):
               if clientes[i]==usuario:
                    vender=float(input("Introduce cuantos bitcoins quieres vender:"))
                    while vender<=saldosB[i]: 
                        vender=float(input("Introduce cuantos bitcoin quieres vender, dentro de tus posibilidades:"))
                    resultado=vender*ultimosValoresB[-1]
                    saldosB[i]-=vender
                    
    elif opcion==5:
        print(ultimosValoresB)
        
    elif opcion==6:
        for i in range(len(historial)):
            if historial[i]==usuario:
                print(historial[i][i][i])