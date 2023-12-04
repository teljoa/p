empleadosHP=0
empleadosMP=0
empleadosHJ=0
empleadosMP=0
empleadosMJ=0
empleadosT=0
edadTP=0
edadMP=0
edadTJ=0
edadMJ=0
empleados_porcentajeP=0
empleados_porcentajeJ=0

for i in range(empleadosT):
    lenjuage=input("En que lenjuage programa el empleado(python o java):")
    genero=input("Introduce el genero del empleado(h o m):")
    edad=int(input("Introduce la edad del empleado:"))
    if lenjuage=="pthony":
        if genero=="h":
            empleadosHP+=1
            edadTP+=edad
        else:
            empleadosMP+=1
            edadTP+=edad
        empleadosTP=empleadosHP+empleadosMP
    else:
        if genero=="h":
            empleadosHJ+=1
            edadTJ+=edad
        else:
            empleadosMJ+=1
            edadTJ+=edad
        empleadosTJ=empleadosHJ+empleadosMJ

empleados_porcentajeP=empleadosTP/empleadosT*100
empleados_porcentajeJ=empleadosTJ/empleadosT*100
edadMJ=edadTJ/empleadosT*100
edadMP=edadTP/empleadosT*100

print(f"El {empleados_porcentajeP}% de empleados utilizan python, de los que {empleadosHP} son hombres y {empleadosMP} son mujeres y su edad media es {edadMP} años")
print(f"El {empleados_porcentajeJ}% de empleados utilizan java, de los que {empleadosHJ} son hombres y {empleadosMJ} son mujeres y su edad media es {edadMJ} años")