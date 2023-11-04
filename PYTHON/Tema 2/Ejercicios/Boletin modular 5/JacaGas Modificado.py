opcion=0
surtidor1LG=5000
surtidor2LG=5000
surtidor1LD=5000
surtidor2LD=5000
surtidor=0
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
    tmp=0
    print(menu)
    opcion = int(input("Elige una de las opciones:"))
    if opcion==1:
        surtidor=int(input("Que surtidor quieres rellenar."))
        while surtidor>4:
            surtidor=int(input("Que surtidor quieres rellenar."))
        if surtidor==1:
            if surtidor1LG==5000:
                print("El surtidor esta lleno")
            else:
                rellenar=float(input("Cuantos litros quieres repostar en el deposito del surtidor:"))
                while not(0<rellenar<5000):
                    rellenar=float(input("Cuantos litros quieres repostar en el deposito del surtidor:"))
                tmp=surtidor1LG+rellenar
                if tmp>5000:
                    rellenar=float(input("Cuantos litros quieres repostar en el deposito del surtidor:"))
                    while not(0<rellenar<5000):
                        rellenar=float(input("Cuantos litros quieres repostar en el deposito del surtidor:"))
                    tmp=surtidor1LG+rellenar
                else:
                    surtidor1LG+=rellenar
        elif surtidor==2:
            if surtidor2LG==5000:
                print("El surtidor esta lleno")
            else:
                rellenar=float(input("Cuantos litros quieres repostar en el deposito del surtidor:"))
                while not(0<rellenar<5000):
                    rellenar=float(input("Cuantos litros quieres repostar en el deposito del surtidor:")) 
                tmp=surtidor2LG+rellenar
                if tmp>5000:
                    rellenar=float(input("Cuantos litros quieres repostar en el deposito del surtidor:"))
                    while not(0<rellenar<5000):
                        rellenar=float(input("Cuantos litros quieres repostar en el deposito del surtidor:"))
                    tmp=surtidor2LG+rellenar
                else:
                    surtidor2LG+=rellenar
        elif surtidor==3:
            if surtidor1LD==5000:
                print("El surtidor esta lleno")
            else:
                rellenar=float(input("Cuantos litros quieres repostar en el deposito del surtidor:"))
                while not(0<rellenar<5000):
                    rellenar=float(input("Cuantos litros quieres repostar en el deposito del surtidor:")) 
                tmp=surtidor1LD+rellenar
                if tmp>5000:
                    rellenar=float(input("Cuantos litros quieres repostar en el deposito del surtidor:"))
                    while not(0<rellenar<5000):
                        rellenar=float(input("Cuantos litros quieres repostar en el deposito del surtidor:"))
                    tmp=surtidor1LD+rellenar
                else:
                    surtidor1LD+=rellenar
        elif surtidor==4:
            if surtidor2LD==5000:
                print("El surtidor esta lleno")
            else:
                rellenar=float(input("Cuantos litros quieres repostar en el deposito del surtidor:"))
                while not(0<rellenar<5000):
                    rellenar=float(input("Cuantos litros quieres repostar en el deposito del surtidor:")) 
                tmp=surtidor1LG+rellenar
                if tmp>5000:
                    rellenar=float(input("Cuantos litros quieres repostar en el deposito del surtidor:"))
                    while not(0<rellenar<5000):
                        rellenar=float(input("Cuantos litros quieres repostar en el deposito del surtidor:"))
                    tmp=surtidor1LG+rellenar
                else:
                    surtidor1LG+=rellenar
    elif opcion==2:
        matricula=input("Introduzca su matricula:")
        while not(len(matricula)==7 and matricula[0:3] and matricula[4:]):
            matricula=input("Introduzca su matricula:")
        if matricula not in matriculas:
            combustible=input("Introduzca el tipo de combustible que utiliza su vehiculo:")
            while not(combustible=="gasolina" and combustible=="diesel"):
                combustible=input("Introduzca el tipo de combustible que utiliza su vehiculo:")
            matriculas.append(matricula)
            combustibles.append(combustible)
        else:
            gastado=float(input("Cuanto dinero quieres echar:"))
            while gastado<10.00:
                gastado=float(input("Cuanto dinero quieres echar:"))
            for i in range(len(matriculas)):
                if matriculas[i]==matricula:
                    for j in range(len(combustibles)):
                        if j==i:
                            if combustibles[j]=="gasolina":
                                litrosg=gastado/preciog
                                if surtidor1LG < surtidor2LG: 
                                    surtidor1LG=surtidor1LG-litrosg
                                elif surtidor2LG < surtidor1LG:
                                    surtidor2LG=surtidor2LG-litrosg
                            else:
                                litrosg=gastado/preciod
                                if surtidor1LD < surtidor2LD: 
                                    surtidor1LD=surtidor1LD-litrosg
                                elif surtidor2LD < surtidor1LD:
                                    surtidor2LD=surtidor2LD-litrosg
        for i in range(gastado):
            if gastado/20==0:
                puntos+=1
                puntoss.append(puntos)
        historialV.append(gastado)
    elif opcion==3:
        matricula=input("Introduzca su matricula:")
        while not(len(matricula)==7 and matricula[0:3] and matricula[4:]):
            matricula=input("Introduzca su matricula:")
        while matricula not in matriculas:
           matricula=input("Introduzca su matricula:")
        for i in range(len(matriculas)):
            if matricula==matriculas[i]:
                for j in range(len(puntoss)):
                    if len(matriculas[i])==len(puntoss[j]):
                        puntos=puntoss[j]
        print(puntos)
    elif opcion==4:
        print(historialV)
    elif opcion==5:
        print(f"Surtidor1:"(surtidor1LG))
        print(f"Surtidor2:"(surtidor2LG))
        print(f"Surtidor3:"(surtidor1LD))
        print(f"Surtidor4:"(surtidor2LD))
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
