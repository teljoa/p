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
