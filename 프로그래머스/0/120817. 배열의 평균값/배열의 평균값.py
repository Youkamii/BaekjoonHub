def solution(numbers):
    answer = 0
    l = len(numbers)
    
    for i in range(len(numbers)):
        answer += numbers[i]
    
    return answer / len(numbers)