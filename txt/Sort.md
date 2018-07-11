# 정렬

------

sort

* Arrays.sort
* Collections.sort



Comparable 과 Comparator 공부!!!!!



## Comparable

java.lang.Comparable<T>

```
public int compareTo(Point point){
    if(this.x < point.x){
        return -1;
    }else if(this.x == point.x){
        if(this.y< point.y){
			 return -1;
			}else if(this.y<point.y){
                return 0;
			}else{
                return 1;
			}
    }else{
        return 1;
    }
}
```

> comparaTo 메소드는 클래스 내부에 선언되어야 한다.
>
> implements Comparable<클래스명>





## Comparator

java.util.Comparator<T>

```
Arrays.sort(a, new Comparator<Point>(){
    public int compare(Point p1, Point p2){
        return p1.compareTo(p2);
    }
});
```

!! BufferedReader 에서 read()와 readLine()차이 알아오기!!



!! 자바 Arrays.sort()는 static 메소드이기 때문에 Comparable 인터페이스를 상속받아서 compareTo()메소드를 오버라이드해서 써야한다.



!! Arrays.sort() 호출하면 자동으로 배열을 정렬하는 것처럼 보이지만, Character클래스의 Compareable의

구현에 의해서 정렬된다.



## Comparable과 Comparator

> java.lang.Comparable<T>
>
> * Comparable은 compareTo를 구현하는데, natural 순서를 정의한다.
> * 예를들면, 문자열의 natural 순서는 사전순
> * Comparator는 다른 순서로 정렬하고 싶을 때 사용한다.
> * 예를들면, 문자열을 깊이 순으로 정렬하고 싶을 때.



### Arrays.sort 와 Arrays.parallelSort

* 자바 8

* parallelSort()는 멀티스레드 활용하여 병렬로 처리하여 더 빠른 속도.

![](C:\Users\jihye\Desktop\캡처.PNG)

* 기존 Sort는 하나의 스레드.

  참고 : https://blog.naver.com/2feelus/220732310413

