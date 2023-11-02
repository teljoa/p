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
                rellenar=float 
        elif surtidor==2:
            if surtidor2LG==5000:
                print("El surtidor esta lleno")
            else:

        elif surtidor==3:
            if surtidor1LD==5000:
                print("El surtidor esta lleno")
            else:

        elif surtidor==4:
            if surtidor2LD==5000:
                print("El surtidor esta lleno")
            else:
                
    elif opcion==2:

    elif opcion==3:
        matricula=input("Introduzca su matricula:")
        for i in range(len(matriculas)):
            if matricula in len(matriculas):
                i= len(matriculas)
                print(f"los puntos que tienes son:"(len(puntoss)==i))
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