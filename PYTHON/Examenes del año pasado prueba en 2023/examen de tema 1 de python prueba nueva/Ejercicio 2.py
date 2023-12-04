menu='''############################################
        #Bienvenido al IES JACARANDA!!
            1. Alumnos que han entrado:
            2. Alumnos que han abandonado el centro:
            3. Alumnos en el IES:
            4. Salir.
        ############################################
        '''

alumnosD=0
opcion=0

while opcion>4:
    if opcion==1:
        alumnosE=int(input("Cuantos alumnos entran en el centro:"))
        alumnosD+=alumnosE
    elif opcion==2:
        alumnosS=int(input("Cuantos alumnos salen del centro:"))
        while alumnosS>alumnosD:
            alumnosS=int(input("Cuantos alumnos salen del centro:"))
        alumnosD-=alumnosS
    else:
        print(alumnosD)