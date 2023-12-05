palindrome = "anilina"

def ispalindrome(palindrome):
    prin= 0
    vuelta = len(palindrome)-1
    while palindrome[prin]==palindrome[vuelta]:
        if prin >= vuelta:
            return True 
        prin+= 1
        vuelta-=1
    return False
    

print(ispalindrome(palindrome))