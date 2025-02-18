# [level 5] 직사각형의 넓이 - 12974 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12974) 

### 성능 요약

메모리: 106 MB, 시간: 513.70 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

정확성: 69.7<br/>효율성: 30.3<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 02월 18일 10:35:48

### 문제 설명

<p>평면 위에 N개의 직사각형이 놓여있습니다. 직사각형의 각 변은 x축, y축에 평행합니다. 각각의 직사각형은 왼쪽 아래 좌표(x1, y1)과 오른쪽 위 좌표 (x2, y2)를 가지며, (x1, y1, x2, y2)로 나타내고, 서로 겹쳐있을 수 있습니다. 이때 이 직사각형들이 차지하는 면적을 구하려고 합니다. 다음은 N = 5인 경우의 예시입니다.</p>

<p><img src="https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/files/production/3540f1f7-d7d1-4eba-9d88-3421584e2c5e/%E1%84%8C%E1%85%B5%E1%86%A8%E1%84%89%E1%85%A1%E1%84%80%E1%85%A1%E1%86%A8%E1%84%92%E1%85%A7%E1%86%BC1_n91auy.png" title="" alt="직사각형1_n91auy.png"><br>
위 그림에는 5개의 직사각형 (1, 1, 6, 5), (2, 0, 4, 2), (2, 4, 5, 7), (4, 3, 8, 6), (7, 5, 9, 7) 이 놓여있습니다. 이때 전체 직사각형이 덮고 있는 면적은 아래 그림의 검은 테두리 안쪽의 면적과 같습니다.</p>

<p><img src="https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/files/production/0fb732a3-5360-44b4-8898-c61fd0566cf3/%E1%84%8C%E1%85%B5%E1%86%A8%E1%84%89%E1%85%A1%E1%84%80%E1%85%A1%E1%86%A8%E1%84%92%E1%85%A7%E1%86%BC2_sfgsce.png" title="" alt="직사각형2_sfgsce.png"><br>
따라서 위 예시에서 5개의 직사각형이 덮고 있는 면적은 38이 됩니다.</p>

<p>평면 위에 놓여있는 직사각형들의 좌표가 매개변수 rectangles로 주어질 때, 직사각형들이 덮고 있는 면적의 넓이를 return하도록 solution 합수를 완성해 주세요.</p>

<h5>제한사항</h5>

<ul>
<li>직사각형의 개수 N : 1 ≤ N ≤ 100,000</li>
<li>직사각형의 좌표 x1, y1, x2, y2 : 0 ≤ x1 &lt; x2 ≤ 10<sup>9</sup> , 0 ≤ y1 &lt; y2 ≤ 10<sup>9</sup></li>
<li>x1, y1, x2, y2는 정수</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>rectangles</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>[[0, 1, 4, 4], [3, 1, 5, 3]]</td>
<td>14</td>
</tr>
<tr>
<td>[[1, 1, 6, 5], [2, 0, 4, 2], [2, 4, 5, 7], [4, 3, 8, 6], [7, 5, 9, 7]]</td>
<td>38</td>
</tr>
</tbody>
      </table>
<h5>입출력 예 설명</h5>

<p>입출력 예 #1<br>
직사각형 (0, 1, 4, 4)가 차지하는 면적은 12이며, 직사각형 (3, 1, 5, 3)이 차지하는 면적은 4입니다. 두 직사각형의 겹치는 면적은 2 이기 때문에 전체 면적은 12 + 4 - 2 = 14입니다.</p>

<p>입출력 예 #2<br>
문제의 예시와 같습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges