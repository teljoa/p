opcion = 0 
surtidor1l=5000
surtidor2l=5000
surtidor3l=5000
surtidor4l=5000
surtidor1c="gasolina"
surtidor2c="gasolina"
surtidor3c="diesel"
surtidor4c="diesel"
preciod=0
preciog=0
matriculas=[]
puntoss=[]
puntos=0
combustibles=[]
menu=''')
    #########################################
    1.Lenar tanque: (diesel o gasolina)
    2.Asignar coche a surtidor y repostar.
    3.Ver puntos del cliente.
    4.Comprobar historico de ventas.
    5.Consultar el estado de los surtidores.
    6.Asignar precio a la gasolina.
    7.Asignar precio al diesel.
    8.Salir.
    ##########################################
    '''
while opcion!=8:
    historialV=[]
    print(menu)
    opcion = int(input("Elige una de las opciones:"))
    if opcion==1:
        if surtidor1l == 5000:
            print("El surtidor esta lleno")
        elif surtidor2l == 5000:
            print("El surtidor esta lleno")
        elif surtidor3l == 5000:
            print("El surtidor esta lleno")
        elif surtidor4l == 5000:
            print("El surtidor esta lleno")
        elif surtidor1l < 5000:
            rellenar=float(input("Cuantos litros quieres repostar en el deposito del surtidor:"))
            surtidor1l = surtidor1l+rellenar
        elif surtidor2l < 5000:
            rellenar=float(input("Cuantos litros quieres repostar en el deposito del surtidor:"))
            surtidor2l = surtidor2l+rellenar
        elif surtidor3l < 5000:
            rellenar=float(input("Cuantos litros quieres repostar en el deposito del surtidor:"))
            surtidor3l = surtidor3l+rellenar
        elif surtidor4l < 5000:
            rellenar=float(input("Cuantos litros quieres repostar en el deposito del surtidor:"))
            surtidor4l = surtidor4l+rellenar
    elif opcion==2:
        matricula=input("Introduzca su matricula:")
        if matricula in matriculas:
            gastado=float(input("Cuanto dinero quieres echar:"))
        elif matricula not in matriculas:
            combustible=input("Introduzca el tipo de combustible que utiliza su vehiculo:")
            matriculas.append(matricula)
            combustibles.append(combustible)
        for i in range(len(matriculas)):
            if matricula in len(matriculas):
                i= len(matriculas)
            if i == len(combustibles):
                if combustible =="gasolina":
                    litrosg=gastado/preciog
                    if surtidor1l < surtidor2l: 
                        surtidorl=surtidor1l-litrosg
                    elif surtidor2l < surtidor1l:
                        surtidor2l=surtidor2l-litrosg
                elif combustible =="diesel":
                    litrosg=gastado/preciod
                    if surtidor3l < surtidor4l: 
                        surtidor3=surtidor3l-litrosg
                    elif surtidor4l < surtidor3l:
                        surtidorl4=surtidor4l-litrosg
        if gastado < 10:
            print("El minimo a gastar son 10€")
            gastado=float(input("Cuanto dinero quieres echar:"))
        for i in range(gastado):
            if gastado/20==0:
                puntos+=1
                puntoss.append(puntos)
        historialV.append(gastado)    
    elif opcion==3:
        matricula=input("Introduzca su matricula:")
        for i in range(len(matriculas)):
            if matricula in len(matriculas):
                i= len(matriculas)
                print(f"los puntos que tienes son:"(len(puntoss)==i))
    elif opcion==4:
        print(historialV)
    elif opcion==5:
        print(f"Surtidor1:"(surtidor1l))
        print(f"Surtidor2:"(surtidor2l))
        print(f"Surtidor3:"(surtidor3l))
        print(f"Surtidor4:"(surtidor4l))
    elif opcion==6:
        preciog=float(int("Que precio quieres ponerle al litro de la gasolina:"))
        while 1<preciog<999.999:
            preciod=float(int("Que precio quieres ponerle al litro de la gasolina:")) 
    elif opcion==7:
        preciod=float(int("Que precio quieres ponerle al litro del diesel:"))
        while 1<preciod<999.999:
            preciod=float(int("Que precio quieres ponerle al litro del diesel:"))   
    else:
        None