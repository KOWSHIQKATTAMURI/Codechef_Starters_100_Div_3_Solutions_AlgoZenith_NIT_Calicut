t = int(input())
while t > 0:
    t -= 1
    n = int(input())
    arr = [int(x) for x in input().split()]
    
    #we are not worried about the position/index of the elements
    #only the element has significance but not its position as we are given the freedom to swap any element with an another element
    arr.sort()
    
    #choice_one is the list in which odd index elements values are more than the adjacent even elements values.
    #choice_two is the list in which even index elements values are more than the adjacent odd elements values.
    choice_one = [0]*n
    choice_two = [0]*n
    #idx_one is for choice_one list. 
    idx_one = 0
    idx_two = 1
    for i in range(n):
        #once idx_one crosses or equals to value of n, then put it equal to 1 as we need to start filling the odd indices.
        if idx_one >= n:
            idx_one = 1
        choice_one[idx_one] = arr[i]
        idx_one += 2
    
    #idx_two is for choice_two list.
    for i in range(n):
        #once idx_two crosses or equals to value of n, then put it equal to 0 as we need to start filling the even indices.
        if idx_two >= n:
            idx_two = 0
        choice_two[idx_two] = arr[i]
        idx_two += 2
    
    def verify_one(arr, n):
        for i in range(1, n - 1):
            if i%2 == 1 and (arr[i - 1] >= arr[i] or arr[i] <= arr[i + 1]):
                return False
            elif i%2 == 0 and (arr[i - 1] <= arr[i] or arr[i] >= arr[i + 1]):
                return False
        return True
      
    def verify_two(arr, n):
        for i in range(1, n - 1):
            if i%2 == 1 and (arr[i - 1] <= arr[i] or arr[i] >= arr[i + 1]):
                return False
            elif i%2 == 0 and (arr[i - 1] >= arr[i] or arr[i] <= arr[i + 1]):
                return False
        return True
    
    if verify_one(choice_one, n):
        print(' '.join(map(str, choice_one)))
    elif verify_two(choice_two, n):
        print(' '.join(map(str, choice_two)))
    else:
        print(-1)
