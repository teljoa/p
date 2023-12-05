#2.
numero=7
numeroA=0
while numero!=0:
    numeroA=numero
    numero=int(input("Introduce un numero:"))
    if numeroA+1==numero:#Esta condicion solo sucedera cuando el numero introducido sea igual al anterior+1.
        print("Sigue un orden creciente.")
    elif numeroA-1==numero:#Esta condicion solo sucedera cuando el numero introducido sea igual al anterior-1.
        print("Sige un orden descreciente.")
    elif numeroA==numero:#Esta condicion solo sucedera cuando el numero introducido sea igual al anterior.
        print("Se ha introducido un numero igual al anterior")
    else:#Esta condicion solo sucedera cuando no sigan un orden ascendente o descendente.
        print("Los numeros siguen no siguen un orden.")

#Este bucle solo terminara cuando introduzcas el 0.