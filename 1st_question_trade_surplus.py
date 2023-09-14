t = int(input())
while t > 0:
    t -= 1
    A_exports, A_imports, B_exports, B_imports = map(int, input().split())
    
    #calculate total exports and total imports
    total_exports = A_exports + B_exports
    total_imports = A_imports + B_imports
    
    #C will be surplus only if total exports is greater than total imports. Total exports is actually equal to exports made by C. 
    if total_imports > total_exports:
        print("YES")
    else:
        print("NO")
