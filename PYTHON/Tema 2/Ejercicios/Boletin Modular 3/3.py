chp ="hsgshfksdklFjhweioJhvkSdllke"

def upperCaseInString(chp):
    lcm = 0
    for i in chp:
        if i.isupper():
            lcm+=1
    return lcm

print(upperCaseInString(chp))