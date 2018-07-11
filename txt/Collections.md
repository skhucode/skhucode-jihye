## Collections

#### ArrayList

O(n)

* 길이가 변하는 배열. C++에서는 vector
* java.util.ArrayList<E>
* boolean add(E e)// 뒤에 추가   
* void add()//index에 추가
* void clear()//크기가 0
* boolean Contains(Object o)// o 가 들어있는지 아닌지 확인
* E get(int index) // index값 가져오기
* boolean isEmpty() // 비어있는지 아닌지
* E remove(int index) //index 번째를 지우는 것.
* E set(int index, E element) // arr[index]=element
* Object[] toArray() //Array로 바꾸는 메소드 ex) int [] arr = (int []) a. toArray();



ArrayList는 그래프 문제의 인접 리스트를 만들 때, 가장 많이 사용한다.

ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n+1];

for(int i=1; i<=n; ++i){

​	a[i] = new ArrayList<Integer>();

}

for(int i=0; i<m; ++i){

​	int u = sc.nextInt();

​	int v = sc.nextInt();

 	a[u].add(v);

​	a[v].add(u);

}





### LinkedList

* 이중연결리스트
* java.util.ArrayList<E>



### Stack

 https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html

* java.util
* 한쪽 끝에서만 자료를 넣고 뺼 수 있는 자료구조
* 마지막으로 넣은 것이 가장 먼저 나오기 때문에 Last In First Out (LIFO)라고도 한다.
* push - 스택에 자료를 넣는 연산
* pop - 스택에 자료를 빼는 연산
* top - 스택의 가장 위에 있는 자료를 보는 연산.  E pook()
* emty - 스택이 비어있는지 아닌지를 알아보는 연산
* size - 스택에 저장되어있는 자료의 개수를 알아보는 연산



### Set

* 인터페이스이다.
* 중복된 원소를 포함하지 않는다.
* HashSet - 일반적인 경우
* TreeSet - 순서가 중요한 경우
* LinkedHashSet - 입력으로 넣은 순서가 중요한 경우
* add()
* clear()
* contains()
* isEmpty()
* remove()
* size()
* toArray()



#### HashSet

* 해시 테이블을 이용해서 구현
* 삽입 삭제 제거 연산 시간 복잡도가 O(1)
* 순서가 보장되지 않는다.
* 무엇이 들어있는지 또는 들어있지 않은지 판단할 때 많이 사용한다.





#### TreeSet

* 이진 검색 트리(레드 블랙 트리) 이용해서 구현
* 삽입 삭제 제거 연산의 시간 복잡도가 O(logn)
* 순서가 보장된다.



#### LinkedHashSet

* 해시테이블과 연결 리스트를 이용해서 구현
* 삽입 삭제 제거 연산 시간 복잡도가 O(1)
* 추가한 순서가 보장된다.





### Map

* java.util.Map<K,V>
* 인터페이스
* 중복된 key를 포함하지 않는다.
* key- value 쌍을 이룬다.
* HashMap
* TreeMap
* LinkedHashMap
* void clear()
* boolean containsKey(Object key)
* boolean containsValue(Object value)
* Set<Map.Entry<K,V>> entrySet(); //쌍을 이용한 Set
* V get(Object key)
* boolean isEmpty()
* Set<K> keySet()
* V put(K key, V value)
* boolean remove(Object o)
* int size()



### Queue

* 한쪽 끝에서만 자료를 넣고 다른 한쪽 끝에서만 뺄 수 있는 자료구조
* 먼저 넣은 것이 가장 먼저 나오기 때문에 FIFO
* 인터페이스
* ArrayDeque
* LinkedList
* PriorityQueue - 들어 있는 것중에서 최소 또는 최대값이(우선순위) 먼저 나오게 됨
* push : offer()
* pop : poll()
* front : peek()
* empty
* size





### PriorityQueue

* 흔히 최소힙 또는 최대힙 구현.



# 알고리즘 스터디 필기

* collections.reverseorder과 collections.reverse는 다르다.
* StringJoiner 공부하기.