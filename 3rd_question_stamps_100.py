t = int(input())
while t > 0:
    t -= 1
    n = int(input())
    s = list(input())
    
    #to count the one that is appearing first
    count_one = 0
    
    #should only check till (n - 2)th position
    #ones in the last two positions cannot be updated untill and unless we find a one in the first (n - 3) positions
    for i in range(n - 2):
        #if one is there in the present index of the string and previously we found a one, then we will update the present index value to 0
        if s[i] == '1' and count_one > 0:
            s[i] = '0'
        elif s[i] == '1':
            count_one += 1
    
    #if we found a one, then even the values on the last three positions of the string will also be updated to zero
    if count_one > 0:
        for i in range(n - 2, n):
            s[i] = '0'
    print(''.join(s))
