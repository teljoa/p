chp ="hsgshfksdklfjhweiojhvksdllke".upper()
l = "d".upper()

def charactersInString(chp,l):
    np = 0
    for i in chp:
        if l == i:
            np+=1
    return np

print(charactersInString(chp,l))