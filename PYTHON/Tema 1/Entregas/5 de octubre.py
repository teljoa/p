num=int(input("De que numero quieres la tabla de multiplicar:"))
while num<0:
  num=int(input("De que numero quieres la tabla de multiplicar:"))
for i in range(11):
    print(f"{num}*{i}={num*i}")
indice=1
while indice<11:
       print(f"{num}*{indice}={num*indice}")
       indice+=1
