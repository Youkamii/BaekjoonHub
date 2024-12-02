def solution(num_list):
    짝수합 = 0
    홀수합 = 0
    
    for i in range (0 , len(num_list)) :
        if i % 2 == 0 :
            홀수합 += num_list[i]
        else : 짝수합 += num_list[i]
    
    return 홀수합 if 홀수합 > 짝수합 else 짝수합