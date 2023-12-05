chp ="hsgshfksdklfjhweiojhvksdllkedtjdjdhkdhkMHKHJDDKhdtkfghkdgfkdJKGLJKGJHGH"

def lowCaseInString(chp):
    lcm = 0
    for i in chp:
        if i.islower():
            lcm+=1
    return lcm

print(lowCaseInString(chp))
assert not(lowCaseInString(chp)==45)
assert (lowCaseInString(chp)==52)