def Ro(t,row,n):
    for i in range(0,9):
        if(t[row][i]==n):
            return False
    return True
def Co(t,colo,n):
    for i in range(0,9):
        if(t[i][colo]==n):
            return False
    return True
def Ma(t,row,colo,n):
    start=row-row%3
    c_start=colo-colo%3
    for i in range(start,start+3):
        for j in range(c_start,c_start+3):
            if(t[i][j]==n):
              return False
    return True

def check(t,row,colo,n):
    if(not Ro(t,row,n)):
        return False
    if(not Co(t,colo,n)):
        return False
    if(not Ma(t,row,colo,n)):
        return False
    return True
def sudko(t):
    r=False
    row=-1
    colo=-1
    for i in range(0,9):
        for j in range(0,9):
            if(t[i][j]==0):
                row=i
                colo=j
                r=True
                break
        if(r):
            break
    if( not r):
        return True
    for i in range(1,10):
        if(check(t,row,colo,i)):
            t[row][colo]=i
            if(sudko(t)):
                return True
            t[row][colo]=0
    return False
        






for i in range(0,int(input())):
    t=[]
    dd=list(map(int,input().split()))
    uu=0
    for i in range(0,9):
        t.append([])
        for j in range(0,9):
            t[i].append(dd[uu])
            uu+=1
    if(sudko(t)):
        for i in range(0,9):
          for j in range(0,9):
            print(t[i][j],end=" ")
        print()
    else:
        print(-1)
