t = int(input())
while t > 0:
    t -= 1
    n = int(input())
    
    #there are only 3 jars
    #so if two of them have one chocolate each, then all the conditions will be satisfied
    #so the remaining jar can have the rest of the chocolates
    print(1, 1, n - 2)
