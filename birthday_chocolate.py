def birthday(s, d, m):
    count=0
    for i in range(0,n):
        if(sum(s[i:m+i])==d):
            count+=1
    return count
