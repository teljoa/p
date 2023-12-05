#3.1
nincidentes=0 #Numero de incidentes ocurridos durante el proceso.
incidenteT="" #Tipo de incidente ocurrido.
nivelC="" #En que curso ha ocurrido dicho incidente.
incidentreM=""#Varialble para declarar si quiere introducir un incidente.
incidenteTL=0#Numero de incidentes leves.
incidenteTM=0#Numero de incidentes moderados.
nincidentesE=0#Numero de incidentes ocurridos en la ESO.

while incidentreM!="n":
    incidentreM=input("Desea introducir un incidente(s o n):")
    while not(incidentreM=="s" or incidentreM=="n"):
        incidentreM=input("Desea introducir un incidente(s o n):")
    if incidentreM=="s":
        incidenteT=input("Que tipo de incidente desea introducir(l,m,g):")
        while not(incidenteT=="l"or incidenteT=="m" or  incidenteT=="g"):
            incidenteT=input("Que tipo de incidente desea introducir(l,m,g):")
        if incidenteT=="l":
            incidenteTL+=1
        elif incidenteT=="m":
            incidenteTM+=1
        nivelC=input("En que nivel se a producido dicho incidente: e(ESO)o p(Post-Obligatoria).")
        while not(nivelC=="e" or nivelC=="p"):
            nivelC=input("En que nivel se a producido dicho incidente: e(ESO)o p(Post-Obligatoria).")
        if nivelC=="e":
            nincidentesE+=1
        nincidentes+=1 
#Este bucle seguira asta que no introduzcamos la n, refiriendonos a que no queremos introducir mas incidentes.
#3.2
if nincidentes!=0:
    print(f'''Se ha producido{nincidentes} incidentes en el centro:{incidenteTL} de ellos Leves,{incidenteTM} Moderados y {nincidentes-(incidenteTL+incidenteTM)} Graves, 
        siendo el {(nincidentesE/nincidentes)*100}% en ESO y el {((nincidentes-nincidentesE)/nincidentes)*100}% en Post-Obligaroria.''')
else:#Esta frase solo saldra cuando el numero de incicdentes sea 0.
    print('''Se ha producido 0 incidentes en el centro:0 de ellos Leves,0 Moderados y 0 Graves, 
             siendo el 0% en ESO y el 0% en Post-Obligaroria.''')