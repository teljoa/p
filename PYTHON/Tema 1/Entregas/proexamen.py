#1.
menu='''===============================================
        A)Añadir cliente
        b)Mostrar los % de clientes premium y normales.
        G)Salir'''
opcion="j"
nclientes=0
nclientesP=0
nclientesN=0
while opcion!="g":
    print(menu)
    opcion="Introduce una opcion:"
    if opcion=="A":
        nclientes+=1
        tipocuenta=input("Quiere una cuenta premium(True or false).")
        correoelec=input("Introduzca su correo elentronico.")
        if tipocuenta==True:            
            nclientesP+=1
        else:
            nclientesN+=1
    elif opcion=="B":
        print(f"El {(nclientesP/nclientes)*100}% de los clientes son premium")
        print(f"El {(nclientesN/nclientes)*100}% de los clientes son normales")
    else:
        print("Opcion incorecta")

#2.
menu='''===============================================
        A)Añadir cliente
        b)Mostrar los % de clientes premium y normales.
        C)Visualizar todos los calculos para clintes premium.
        D)Visualizar todos los calculos para clientes normales.
        E)Mostrar el correo de nuestro mejor cliente y el importe gastado.
        G)Salir'''
opcion="j"
nclientes=0
nclientesP=0
nclientesN=0
correoMejorClienteP=""
correoMejorClienteN=""
correoMejorCliente=""
importeMclienteP=0
importeMclienteN=0
precioproductoUnitarioMasCaroP=0
precioproductoUnitarioMasCaroN=0
precioproductoUnitarioMasCaro=0
codigoProductoMasCaroP=""
codigoProductoMasCaroN=""
while opcion!="g":
    print(menu)
    opcion="Introduce una opcion:"
    if opcion=="A":
        nclientes+=1
        tipocuenta=input("Quiere una cuenta premium(True or false).")
        correoelec=input("Introduzca su correo elentronico.")
        codigoProducto=input("Introduce el codigo del producto.")
        while codigoProducto<=0:
            codigoProducto=input("Introduce el codigo del producto.")
        udidadesProducto="Introduce cuantas unidades quieres de dicho produvto."
        precioproductoUnitario="Introduce el precio del producto."
        if tipocuenta==True:            
            nclientesP+=1
        else:
            nclientesN+=1
    elif opcion=="B":
        print(f"El {(nclientesP/nclientes)*100}% de los clientes son premium")
        print(f"El {(nclientesN/nclientes)*100}% de los clientes son normales")
    elif opcion=="C":
        print(f"El {(nclientesP/nclientes)*100}% de clientes son premium")
        print(f"El importe mas alto es el producto:{importeMclienteP}€, realizado por el cliente{correoMejorClienteP}.")
        print(f"El articulo mas caro vendido entre los clientes preium es codigo:{codigoProductoMasCaroP} con precio:{precioproductoUnitarioMasCaroP}€.")
    elif opcion=="D":
        print(f"El {(nclientesP/nclientes)*100}% de clientes son normales")
        print(f"El importe mas alto es el producto:{importeMclienteN}€, realizado por el cliente{correoMejorClienteN}.")
        print(f"El articulo mas caro vendido entre los normales es {precioproductoUnitarioMasCaroN}€.")
    elif opcion=="E":
        print(f"El mejor cliente es {correoMejorCliente} y el importe gastado es de {precioproductoUnitarioMasCaro}€")
    else:
        print("Opcion incorecta")
        