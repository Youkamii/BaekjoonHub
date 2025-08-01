# [Platinum II] 학교 가지마! - 1420 

[문제 링크](https://www.acmicpc.net/problem/1420)

### 성능 요약

메모리: 17164 KB, 시간: 116 ms

### 분류

최대 유량, 최대 유량 최소 컷 정리

### 제출 일자

2024년 11월 18일 12:31:37

### 문제 설명

<p>도현이가 사는 도시는 N×M 크기의 모양이며, 1×1칸으로 나누어져 있다. 각 칸은 빈 칸 또는 벽이다.</p>

<p>도현이는 학교에 가려고 한다. 도현이가 있는 곳은 항상 빈 칸이고, 학교도 빈 칸에 있다. 도현이는 현재 있는 칸과 상하좌우로 인접한 칸으로 이동할 수 있다. 이때, 벽이 있는 칸으로는 이동할 수 없다. 또, 도시를 벗어날 수는 없다.</p>

<p>준규는 도현이가 학교에 가지 못하게 빈 칸을 적절히 벽으로 바꾸려고 한다. 이미 벽인 곳은 벽으로 바꿀 수 없고, 빈 칸만 벽으로 바꿀 수 있다. 도현이와 학교가 있는 곳은 벽으로 바꿀 수 없다.</p>

<p>도현이가 학교에 가지 못하게 하기 위해서 빈 칸을 벽으로 바꿔야하는 횟수의 최솟값을 구하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 도시의 세로 크기 N과 가로 크기 M이 주어진다. (1 ≤ N, M ≤ 100) 둘째 줄부터 N개의 줄에 도시의 모양이 주어진다. 비어있으면 점('.'), 벽은 '#', 도현이의 위치는 K, 학교의 위치는 H이다. K와 H는 하나만 주어진다.</p>

### 출력 

 <p>첫째 줄에 도현이가 학교를 가지 못하게 하기 위해서 바꿔야 하는 벽의 최소 개수를 출력한다. 만약, 벽을 아무리 세워도 학교에 가는 것을 막을 수 없다면 -1을 출력한다.</p>

