def solution(num_list):
    짝수 = 0
    홀수 = 0
    
    for n in num_list :
        if n % 2 == 0 :
            짝수 += 1
        else :
            홀수 += 1            
        
    return [짝수, 홀수]