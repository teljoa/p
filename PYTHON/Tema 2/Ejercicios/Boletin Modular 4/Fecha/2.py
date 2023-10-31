def calcula_tiempo(h1,h2,m1,m2,s1,s2):
    tr=0
    t1=((h1*60)+(m1*3600)+(s1*216000))
    t2=((h2*60)+(m2*3600)+(s2*216000))
    if t1 > t2:
        tr=t1-t2
    elif t2 < t1:
        tr=t2-t1
        
    return tr 

print(calcula_tiempo(14,22,56,28,42,34))