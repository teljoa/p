num1 = 4
num2 = 6

def powerIt(num1,num2):
    if num2 in []:
        power = 0
    else:
        power = num1**num2
        
    return power

print(powerIt(num1,num2))