a,b = [3,4],[2,5]

def encagan(a,b):
    encaga=False
    if a[0] in b or a[1] in b:
        encaga=True
    return encaga

print(encagan(a, b))