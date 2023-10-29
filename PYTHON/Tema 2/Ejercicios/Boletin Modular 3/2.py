chp ="hsgshfksdklfjhweiojhvksdllke"

def lowCaseInString(chp):
    lcm = 0
    for i in chp:
        if i.islower():
            lcm+=1
    return lcm

print(lowCaseInString(chp))