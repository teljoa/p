palindrome = "anilina"

def ispalindrome(palindrome):
    resultado=False
    prin= 0
    vuelta = len(palindrome)-1
    while palindrome[prin]==palindrome[vuelta]:
        if prin >= vuelta:
            resultado=True 
        prin+= 1
        vuelta-=1
    return resultado
    

print(ispalindrome(palindrome))
