a = ['h','b','q',2,45,6,'Q']

b = ['A', 'b',45,2,1,63,9,'Q']

def unionListas(aList, bList):
    tmp = []
    for n in aList:
        if n not in bList:
            tmp.append(n)
    for i in bList:
        if i not in aList:
            tmp.append(i)
    
    return tmp

print(unionListas(a, b))