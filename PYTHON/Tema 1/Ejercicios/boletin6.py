#1.

for multiple in range(1,101):
    print(multiple)
    if multiple % 7 == 0:
        print("El s% es multiplo de 7" %(multiple))
    elif multiple % 13 == 0:
        print("El s% es multiplo de 13" %(multiple))
    elif (multiple % 7 == 0) and (multiple % 13 == 0):
        print("El s% es multiplo de 7 y de 13" %(multiple))
#2.
numbers = int(input("Dime un numero entre el (0 - 10):"))

if 0 <= numbers <= 10:
    for integer in range(1,11):
        print(numbers * integer)
else:
    print("El numero esta fuera del limite, vuelve a introducirlo")
#3.
numero = int(input("Enter one number:"))
peque = numero

pregunta = input("Do you wnt to enter more number (Y/N)")

while pregunta.upper()=="Y":
    numero = int(input("Enter one number:"))
    if numero < peque:
        peque = numero
    pregunta = input("do you want to enter more number (Y/N)")
    
print(f"The smallest number is {peque}")
#4.
numero = int(input("Enter one number greater than 0:"))

while numero < 0:
    print("The number is not right, try again.")
    numero = int(input("Enter one number greater than 0:"))
    
for sum in range(1, numero):
    print(f"The sum of the N first numbers is {numero + (numero - 1)}")
#5.
numero = int(input("until the user inputs:"))
total = 0

for i in range(numero):
    numero = int(input("Enter one number greate than 0:"))
    while numero <= 0:
        numero = int(input("Enter a number (negative to finish)."))
        
    
    total += numero
    if i <= 0:
        print(f"You have entered XX positive numbers{total+numero}")    
#6.
numeroA = int(input("Enter one number:"))
numeroB = int(input("Enter one number:"))
suma = 0

for i in range(numeroA, numeroB):
    suma +=numeroB

print("The product is %" %(suma))
#7.

cantidad = int(input("How many numbers do you want input?"))

while cantidad <= 0:
    cantidad = int(input("How many numbers do you want input?"))
    
total = 0

for i in range(cantidad):
    numero = int(input("Enter one number greate than 0:"))
    while numero <= 0:
        numero = int(input("The number is not valid, it should be greater than 0 to inform that the number is not valit."))
    
    total += numero
    
print(f"The medium is{total/cantidad}")
#8.
numero = int(input("Enter one number:"))
peque = numero

pregunta = input("Do you wnt to enter more number (Y/N)")

while pregunta.upper()=="Y":
    numero = int(input("Enter one number:"))
    if numero < peque:
        suma = numero
    pregunta = input("do you want to enter more number (Y/N)")
    
print(f"The smallest number is {suma}")
#9.
numero = int(input("Enter an integer positive number greater than 0:"))
perfect = 0

while numero < 0:
    print("The number is not valid, try again.")
    int(input("Enter an integer positive number greater than 0:"))

perfect += numero

for i in range (numero % perfect ==0):
    if (numero // i)+i== numero:
        print("The number is perfect.") 
    else:
        print("The number is not perfect.")
#10.

numero = int(input("Dime un numero:"))
total = 1

while numero > 0:
    total = total * numero
    numero -=1
    
print(total)