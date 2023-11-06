n, m = 4, 10
ran = n
s = 0
for i in range(m):
    s += ran
    ran = ran * 10 + n

print(s)
