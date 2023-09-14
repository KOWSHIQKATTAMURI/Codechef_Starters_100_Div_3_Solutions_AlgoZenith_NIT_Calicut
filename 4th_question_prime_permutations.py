t = int(input())
while t > 0:
    t -= 1
    n = int(input())
    
    #if n is equal to 2 or 3, then there exists no solution
    if n == 2 or n == 3:
        print(-1)
        continue
    
    arr = [0] + [i for i in range(1, n + 1)]
    
    #as we are swapping the ith index element with (i + 2)th index elemenet, we need to make sure (i + 2) is not more than n
    i = 1
    while i + 2 <= n:
        #if i is odd, then just go to next index.
        #if i is even, then go to (i + 3)th index as (i + 1)th index is already swapped with (i - 1)th and (i + 2)th index is already swapped with ith.
        arr[i], arr[i + 2] = arr[i + 2], arr[i]
        if i%2 == 1:
            i += 1
        else:
            i += 3
    
    #case when only one element is left to be swapped
    if n%4 == 1:
        arr[n], arr[n - 2] = arr[n - 2], arr[n]
        arr[n], arr[n - 1] = arr[n - 1], arr[n]
    
    #case when two elements are left to be swapped
    elif n%4 == 2:
        arr[n], arr[n - 2] = arr[n - 2], arr[n]
        arr[n - 1], arr[n - 3] = arr[n - 3], arr[n - 1]
        arr[n], arr[n - 1] = arr[n - 1], arr[n]
    
    #case when three elements are left to be swapped
    elif n%4 == 3:
        arr[n - 1], arr[n - 3] = arr[n - 3], arr[n - 1]
        arr[n - 2], arr[n - 4] = arr[n - 4], arr[n - 2]
        arr[n - 1], arr[n - 2] = arr[n - 2], arr[n - 1]
        arr[n - 3], arr[n - 4] = arr[n - 4], arr[n - 3]
    
    print(' '.join(map(str, arr[1:])))
