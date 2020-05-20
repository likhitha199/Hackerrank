#Python solution without any libraries

def permutationEquation(p):
    count=[]
    for x in range(1,n+1):
        if x in p:
            d=p.index(x)+1
            d1=p.index(d)+1
            count.append(d1)
    return count
