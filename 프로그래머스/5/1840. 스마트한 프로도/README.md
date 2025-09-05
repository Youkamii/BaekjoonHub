# [level 5] 스마트한 프로도 - 1840 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/1840?language=java) 

### 성능 요약

메모리: 189 MB, 시간: 538.43 ms

### 구분

코딩테스트 연습 > 2017 카카오코드 본선

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 08월 29일 12:45:00

### 문제 설명

<h2>스마트한 프로도</h2>

<p><img src="https://t1.kakaocdn.net/codefestival/frodo1.png" title="" alt="img"></p>

<p>직장인 프로도는 오늘도 열심히 일한다. 회사에서 인정받는 프로도는 직장 상사에게 문제를 풀어 달라는 요청을 받았다. 문제를 읽은 프로도는 혼자 풀긴 어려운 문제로 보여 여러분에게 도움을 요청하였다. 상사가 전달한 문제는 아래와 같다.<br>
그래프 <code>G</code>에 대해서, 서로 다른 두 정점 사이에 간선이 존재한다면 단지 한 간선만 존재한다. 또한 동일한 정점을 연결하는 간선(셀프 루프)은 존재하지 않는다. <code>G</code>의 두 간선 <code>e_1</code>과 <code>e_2</code>가 인접하다면, <code>e_1</code>이 연결하는 두 정점 중 하나는 <code>e_2</code>가 연결하는 정점과 일치한다. 그래프 G의 매칭 M은 간선들의 집합이고 <code>M</code>에 속하는 임의의 두 간선은 서로 인접하지 않다. 여기서, 공집합은 매칭임에 주목하자.<br>
그래프 <code>G</code>와 정수 <code>k</code>에 대해서, 초기에 <code>|M_0|≥k</code>이고 <code>|M_t|≥k</code> 인 두 매칭 <code>M_0</code>와 <code>M_t</code>가 주어진다. 우리는 매칭 <code>M_0</code>에서 <code>G</code>의 간선을 추가하거나 또는 삭제해서 <code>M_0</code>를 변환한다. 변환의 한 단계에서는 하나의 간선을 추가하거나 삭제할 수 있다. 이렇게 해서 변환된 간선들의 집합 <code>M_1</code>은 다시 매칭이 되어야 한다. 다시 말해서, 각 변환 단계의 결과물은 매칭이어야 한다. 따라서 <code>i</code>번째 단계에서는 매칭 <code>M_i-1</code>를 매칭 <code>M_i</code>로 변환하게 된다.<br>
이런 식으로 <code>M_0</code>에서 시작해서 중간 매칭들로의 변환 단계들을 거쳐서 마지막에 <code>M_t</code>를 만들어야 한다. 다시 말해서, <code>p</code>번의 단계를 거쳐 만들어진 매칭 <code>M_p</code>에 대해서, <code>M_p</code> = <code>M_t</code>를 만족하면 된다. 하지만 중간에 만들어지는 <code>M_i</code> (<code>0 &lt; i &lt; p</code>)는 크기에 제한이 있어서 <code>|M_i| ≥ k-2</code>를 만족해야만 한다.<br>
매칭 <code>M_0</code>에서 <code>M_t</code>로 위의 조건들을 만족하면서 항상 변환할 수 있다는 것이 잘 알려져 있다. 따라서 여러분은 그 변환 과정을 리턴하는 프로그램을 작성하여야 한다.<br>
예를 들어, 아래 그림에서 초기 매칭 <code>M_0 = {e_3, e_6}</code>이고 마지막 매칭 <code>M_t = {e_2, e_4}</code>이고, <code>k = 2</code> 인 경우이다. 그림에서와 같이 간선들을 추가하거나 삭제하면, <code>M_0</code>에서 <code>M_t</code>로 변환할 수 있다.</p>

<p><img src="https://t1.kakaocdn.net/codefestival/frodo2.png" title="" alt="img"><br>
<img src="https://t1.kakaocdn.net/codefestival/frodo3.png" title="" alt="img"></p>

<h3>입력 형식</h3>

<p>입력은 총 9가지의 변수로 주어진다. <code>n</code>과 <code>m</code>은 각각 그래프 <code>G</code>의 정점과 간선의 수이다. 그래프 <code>G</code>의 정점들은 <code>1</code>부터 <code>n</code>까지의 정수로, 간선들은 <code>1</code>부터 <code>m</code>까지의 정수로 나타낸다. <code>a</code>와 <code>b</code>는 각각 크기가 <code>m</code>인 1차원 배열로, 간선이 잇는 두 점을 나타낸다. <code>i</code>번째 간선이 잇는 두 정점의 번호가 <code>a</code>와 <code>b</code>의 <code>i</code>번째 원소가 된다. <code>k</code>는 문제에서 설명된 것과 같다. <code>m1</code>과 <code>m2</code>는 각각 초기 매칭 <code>M_0</code>의 크기, 마지막 매칭 <code>M_t</code>의 크기이다. <code>e1</code>과 <code>e2</code>는 각각 <code>M_0</code>와 <code>M_t</code>에 속하는 간선의 정보를 나타내는 1차원 배열이며, 각각의 원소의 개수는 <code>m1</code>과 <code>m2</code>이다. 제한조건은 다음과 같다.</p>

<ul>
<li><code>1 &lt;= n &lt;= 100,000</code></li>
<li><code>1 &lt;= m &lt;= 1,000,000</code></li>
<li><code>1 &lt;= k &lt;= 50,000</code></li>
<li><code>m1 &gt;= k, m2 &gt;= k</code></li>
</ul>

<h3>출력 형식</h3>

<p>리턴 타입은 2차원 정수 배열이다. 매칭 <code>M_0</code>에서 <code>M_t</code>로 변환하는데 <code>p</code>단계가 걸린다고 할 때, 배열의 크기는 <code>p × 2</code>가 되어야 한다. 각 행의 첫 번째 원소는 <code>0</code> 또는 <code>1</code>로, <code>0</code>이면 간선을 삭제했음을 의미하며 <code>1</code>이면 간선을 추가했음을 의미한다. 두 번째 원소는 추가 또는 삭제하는 간선의 번호이다. 답이 될 수 있는 변환이 여러 가지인 경우에는 그중 한 가지를 리턴하면 된다.</p>
<table class="table">
        <thead><tr>
<th>변수명</th>
<th>값</th>
</tr>
</thead>
        <tbody><tr>
<td>n</td>
<td>5</td>
</tr>
<tr>
<td>m</td>
<td>6</td>
</tr>
<tr>
<td>a</td>
<td>[1, 1, 2, 2, 3, 4]</td>
</tr>
<tr>
<td>b</td>
<td>[2, 3, 3, 4, 5, 5]</td>
</tr>
<tr>
<td>k</td>
<td>2</td>
</tr>
<tr>
<td>m1</td>
<td>2</td>
</tr>
<tr>
<td>m2</td>
<td>2</td>
</tr>
<tr>
<td>e1</td>
<td>[3, 6]</td>
</tr>
<tr>
<td>e2</td>
<td>[2, 4]</td>
</tr>
<tr>
<td>answer</td>
<td>[[0, 3], [1, 2], [0, 6], [1, 4]]</td>
</tr>
</tbody>
      </table>
<h3>알림</h3>

<p>이 문제의 경우 같은 입력에 대해 정답이 여러 개 존재할 수 있으나, ‘실행’을 눌러 예제 입출력에 대해 테스트를 진행할 때 등록된 한 가지 답만 정답으로 처리되고 있습니다. ‘코드 채점’을 눌러 제출할 시에는 올바르게 채점되니 참고하여 주시기 바랍니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges