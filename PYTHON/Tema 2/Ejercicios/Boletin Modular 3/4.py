chp ="hsgshfks6457d54345k234l2Fj5hweioJhv25kSdllke"

def numberInString(chp):
    lcm = 0
    for i in chp:
        if i.isnumeric():
            lcm+=1
    return lcm

print(numberInString(chp))