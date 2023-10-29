a = ['j','b','h',62,4237]

b = ['j', 'a',62,437]

def intersect(aList, bList):
    tmp = []
    for n in aList:
        if n in bList:
            tmp.append(n)
    for i in bList:
        if ((i in aList) and (i not in tmp)):
            tmp.append(i)
    
    return tmp

print(intersect(a, b))