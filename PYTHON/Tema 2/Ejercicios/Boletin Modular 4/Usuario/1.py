usuarios = []
contrasenas = []
intentos = 0
usuario = ""
contrasena =""
opcion = 0
while opcion < 4:
    print("Menu")
    print("1.Crear usuario")
    print("2.Entrar")
    print("3.Ver usuarios exixtentes")
    print("4.Salir")
    opcion = int(input("Elige una opcion:"))
    if opcion == 1:
        if len(usuarios) <=10:
            usuario=input("Introduce un usuario valido:")
            contrasena=input("Introduce una contraseña valida:")
            if usuario not in usuarios:
                usuarios.append(usuario)
            if contrasena not in contrasenas:
                contrasenas.append(contrasena)
    elif opcion ==2:
        while intentos !=3:
            usuario = input("Introduce tu usuario:")
            contrasena = input("Introduce tu contrseña:")
            if (usuario not in usuarios) and (contrasena not in contrasenas):
                intentos+=1
            elif (usuario in usuarios) and (contrasena in contrasenas):
                pass
    elif opcion ==3:
        print(usuarios)