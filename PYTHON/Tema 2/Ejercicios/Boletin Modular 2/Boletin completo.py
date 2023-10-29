#1.
def factorial(num): 
    if num < 0: 
        print("Factorial of negative num does not exist")

    elif num == 0: 
        return 1
        
    else: 
        fact = 1
        while(num > 1): 
            fact *= num 
            num -= 1
        return fact 

num =7

print("Factorial of",num,"is", factorial(num)) 
#2.
def es_bisiesto(ayo):
    if ayo % 4 == 0 and (ayo % 100 != 0 or ayo % 400 == 0):
        ayo = True
    else:
        ayo = False
        
    return ayo

ayo = 2020

print(es_bisiesto(ayo))
#3.
def es_bisiesto(ayo):
    if ayo % 4 == 0 and (ayo % 100 != 0 or ayo % 400 == 0):
        ayo = True
    else:
        ayo = False
        
    return ayo

def contador_dias(mes):
    if mes in [1,3,5,7,8,10,12]:
        dia = 31
    elif mes in [4,6,9,11]:
        dia = 30
    elif mes==2:
        if es_bisiesto(ayo) == True:
            dia = 29
        elif es_bisiesto(ayo) == False:
            dia = 28
    else:
        dia = -1
    
    return dia

ayo = 2020
mes = 2

print(contador_dias(mes))
#4.
def getday0fWeek(dia,mes,año):
    a=(14-mes)//12
    
    y=año-a
    
    m=mes+12*a-2
    
    return(int(dia+y+y//4-y//100+y//400+(31*m)//12)%7)

nameOfDays=["Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"]
dia=1
while dia>0:
    dia=int(input("Introduce un muenro de dia:"))
    mes=int(input("Introduce un numero de mes:"))
    año=int(input("Introduce un numero de año:"))
    if dia>0:
        text=nameOfDays[getday0fWeek(dia,mes,año)]
    
    else:
        text="error"
        
    print("Es",text)
#5.
num1 = 4
num2 = 6

def powerIt(num1,num2):
    if num2 in []:
        power = 0
    else:
        power = num1**num2
        
    return power

print(powerIt(num1,num2))
#6.
def getNumberOfDigitsDecimal(number):
    count=0     
    listdot=" "
    listothers=""
    for i in range(len(number)):
        if(number[i]=="."):
            listdot+=number[i]
        if not(number[i]=="0" or number[i]=="1" or number[i]=="2" or number[i]=="3" or number[i]=="4" or number[i]=="5" or number[i]=="6" or number[i]=="7" or number[i]=="8" or number[i]=="9" or number[i]=="." or number[i]=="-"):
            listothers+=number[i]
        if(len(listothers)>0)or("-"in number[1:-1])or("-"in number[-1])or("." in (number[0] or number[-1]))or(".." in number)or(".." in listdot)or ("-." in number):
            count=None
        elif ("0" in number[i]) or ("1"in number[i]) or ("2"in number[i]) or ("3"in number[i]) or ("4"in number[i]) or ("5"in number[i]) or ("6"in number[i]) or ("7"in number[i]) or ("8"in number[i]) or("9"in number[i]): 
            count+=1
    return count

def getNumberOfDigitsBinary(number):
    count=0     
    listdot=" "
    list0_1=""
    for i in range(len(number)):
        if(number[i]=="."):
            listdot+=number[i] 
        if not(number[i]=="1" or number[i]=="0" or number[i]=="-" or number[i]=="."):
            list0_1+=number[i]   
        if("-." in number)or(len(list0_1)>0)or("-"in number[1:-1])or("-"in number[-1])or("." in (number[0] or number[-1]))or(".." in number)or(".." in listdot):
            count=None
        elif ("0" in number[i]) or ("1"in number[i]): 
            count+=1
    
    return count

def getNumberOfDigitsOctal(number):
    count=0     
    listdot=" "
    listothers=""
    for i in range(len(number)):
        if(number[i]=="."):
            listdot+=number[i]
        if not(number[i]=="0" or number[i]=="1" or number[i]=="2" or number[i]=="3" or number[i]=="4" or number[i]=="5" or number[i]=="6" or number[i]=="7" or number[i]=="." or number[i]=="-"):
            listothers+=number[i]
        if("-." in number)or (len(listothers)>0)or("-"in number[1:-1])or("-"in number[-1])or("." in (number[0] or number[-1]))or(".." in number)or(".." in listdot):
            count=None
        elif ("0" in number[i]) or ("1"in number[i]) or ("2"in number[i]) or ("3"in number[i]) or ("4"in number[i]) or ("5"in number[i]) or ("6"in number[i]) or ("7"in number[i]): 
            count+=1
    return count

def getNumberOfDigitsHexadecimal(number):
    count=0     
    listdot=" "
    listothers=""
    for i in range(len(number)):
        if(number[i]=="."):
            listdot+=number[i] 
        if not(number[i]=="0" or number[i]=="1" or number[i]=="2" or number[i]=="3" or number[i]=="4" or number[i]=="5" or number[i]=="6" or number[i]=="7" or number[i]=="8" or number[i]=="9"or number[i]=="A" or number[i]=="B" or number[i]=="C" or number[i]=="D" or number[i]=="E" or number[i]=="F" or number[i]=="." or number[i]=="-"):
            listothers+=number[i]
        if("-." in number)or (len(listothers)>0)or("-"in number[1:-1])or("-"in number[-1])or("." in (number[0] or number[-1]))or(".." in number)or(".." in listdot):
            count=None
        elif ("0" in number[i]) or ("1"in number[i]) or ("2"in number[i]) or ("3"in number[i]) or ("4"in number[i]) or ("5"in number[i]) or ("6"in number[i]) or ("7"in number[i]) or ("8"in number[i]) or("9"in number[i])or("A"in number[i])or("B"in number[i])or("C"in number[i])or("D"in number[i])or("E"in number[i])or("F"in number[i]): 
            count+=1
    return count

print("[Decimal] tiene", getNumberOfDigitsDecimal("-.10.0955"), "digitos")
print("[Binary] tiene", getNumberOfDigitsBinary("1001"), "digitos")
print("[Octal] tiene", getNumberOfDigitsOctal("141"), "digitos")
print("[Hexadecimal] tiene", getNumberOfDigitsHexadecimal(".-1081A"), "digitos")
#7.
n = 1

def isPrime(n):
    isPrime = True
    
    for i in range(2,n):
        if n%i==0:
            isPrime = False
            
    return isPrime
    
    
print(isPrime(n))
#8.
def solveSecondOrderEquation(n1,n2,n3):
    x=0
    y=0
    if(n1 <=0)or(n2 <=0)or(n3 <=0):
        x=None
        y=None  
    else:
        x1=(n2**2)-(4*n1*n3)
        x3=x1**(1/2)
        x2=(n2)+(x3)
        x=x2/(2*n1)
        y1=(n2**2)-(4*n1*n3)
        y3=y1**(1/2)
        y2=(n2)-(y3)
        y=y2/(2*n1)
    return x, y  

numero1=input("Introduce un numero:")
while numero1<0:
    numero1=input("Introduce un numero:")
numero2=input("Introduce un numero:")
while numero1<0:
    numero2=input("Introduce un numero:")
numero3=input("Introduce un numero:")
while numero1<0:
    numero3=input("Introduce un numero:")
solveSecondOrderEquation(numero1,numero2,numero3)
#9.
def isPrime(n):
    isPrime = True
    
    for i in range(2,n):
        if n%i==0:
            isPrime = False
            
    return isPrime

def getPrimeDivisors(n):
    getPrimeDivisors = []
    for i in range(n):
        if isPrime(i) == True:
            getPrimeDivisors.append(i)
    
    return getPrimeDivisors

n = 46

print(getPrimeDivisors(n))
#10.
def isFriendNumber(number, number2):
    divisors=0
    is_friend=False
    for i in range(1, number):
        if number%i==0:
            divisors+=i
    
    if divisors==number2:
        is_friend=True 
        
    return is_friend    
    
print(isFriendNumber(220,284))
print(isFriendNumber(1184, 1210))
print(isFriendNumber(5020,5564))
print(isFriendNumber(300,600))
