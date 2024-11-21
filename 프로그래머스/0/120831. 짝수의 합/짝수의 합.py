def solution(n):
    answer = 0
    #               1   11
    for i in range (1, n+1) : # 10번 반복
        if i % 2 == 0 :
            print(answer)
            answer += i
            print(i)
            print(answer)
            print()
    
    return answer