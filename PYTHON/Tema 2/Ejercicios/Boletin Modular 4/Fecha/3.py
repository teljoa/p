def pasar_tiempo(s):
    t=0
    opcion = input("Intraduce a que tipo de dato quieres convertir los segundos: d(dias),h(horas),m(minutos),s(segundos):")
    
    if opcion == "d":
        t = s/(24*60**2)
    elif opcion == "h":
        t =s/60**2
    elif opcion == "m":
        t =s/60
    elif opcion == "s":
        t = s
        
    return t

print(pasar_tiempo(763753757276597893628769346))