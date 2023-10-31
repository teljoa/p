def calcula_euclidea(xp,yp,xq,yq):
    distancia = ((xq-xp)**2+(yq-yp)**2)**0.5
    return distancia

print(calcula_euclidea(5,1,8,9))