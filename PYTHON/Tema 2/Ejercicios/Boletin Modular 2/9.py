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