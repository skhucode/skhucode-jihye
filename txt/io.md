# 입/출력

대부분 클래스 이름을 Main으로 한다.

### Scanner

 https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html

hashNextInt()

nextInt와 nextLine 함께 쓸 경우에는 줄바꿈 nextLine()을 한번해줘야 한다.

Scanner은 느리다. 따라서 입력이 많은 경우에는 BufferedReader를 사용하는 것이 좋다.



<네 수 문제> - BufferedReader 사용

import java.io.*;

throws IOException

String[] line = bf.readLine().split(" ");

//bf.readLine() -> 한 줄을 입력받아서

//split(" ") -> 공백으로 나눈다.

14자리 수는 int범위를 넘어가게 된다. 따라서 long형을 썼다.

Long.valueOf(a)// a의 값을 Long형으로 변환한다.



### BufferedReader

 https://docs.oracle.com/javase/7/docs/api/java/io/BufferedReader.html

reader와 readerLine만 있기 때문에 정수는 파싱을 해야 한다.



### StringTokenizer

 https://docs.oracle.com/javase/7/docs/api/java/util/StringTokenizer.html

java.util.StringTokenizer

문자열을 토큰으로 잘라야 할 때 사용하면 편한 클래스.

https://blog.naver.com/qbxlvnf11/221126962149 // split()메소드와 StringTokenizer클래스 차이점.



### StringBuilder

java.lang.StringBuilder

문자열을 만들어주는 클래스

출력해야 하는 것이 많은 경우에는

StringBuilder를 이용해 문자열을 만들고, 출력하는 것이 좋다.



