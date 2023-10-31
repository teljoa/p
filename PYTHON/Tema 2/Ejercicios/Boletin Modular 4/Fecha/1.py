def calcula_tiempo(h,m,s):
    tr=86400-((h*60)+(m*3600)+(s*216000))
    return tr

print(calcula_tiempo(13,30,50))