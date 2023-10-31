opcion=""
num1=4
num2=4
dmd1=2
dmd2=2
while opcion !="e":
    print("Menu:")
    print("a. Sumar dos fracciones: En esta opción se piden dos fracciones y se muestra el resultado.")
    print("b. Restar dos fracciones: En esta opción se piden dos fracciones y se muestra la resta.")
    print("c. Multiplicar dos fracciones: En esta opción se piden dos fracciones y se muestra el producto.")
    print("d. Dividir dos fracciones: En esta opción se piden dos fracciones y se muestra la cociente.")
    print("e. Salir")
    opcion= input("Elige una opcion:")
    
    if opcion=="a":
        num=(num1*dmd2)+(dmd1*num2)
        dmd=dmd1*dmd2

    elif opcion=="b":
        num=num1*dmd2-dmd1*num2
        dmd=dmd1*dmd2

    elif opcion=="c":
        num=num1*num2
        dmd=dmd1*dmd2

    elif opcion=="d":
        num=num1*dmd2
        dmd=dmd1*num2
