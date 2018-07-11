# BigInteger

------

큰 정수를 나타날때 나타내는 클래스.

* import java.math.*;
* 연산은 메소드 형태로 이용해야 한다.
* a+b == a.add(b)
* a-b == a.substract(b)
* a*b == a.multiply(b)
* a/b == a.divide(b)
* a%b == a.remainder(b)
* gcd(a,b) == a.gcd(b)
* -a == a.negate()
* ZERO == BigInteger.ZERO
* a^10 == a.pow(10)
* <u>*기본으로 null이 들어가 있다.*</u>







### BigDecimal

------

* 정확한 실수 계산
* 매개변수로 `문자열`이 온다.
* Java에서 제곱값은 Math 클래스의 pow를 이용한다. 하지만 Math.pow는 근사치를 수행한다.
* 실수의 제곱 연산 시 double 타입의 정밀도가 최대 13자리이므로 소수표현범위를 초과하여 오차가 발생한다.
* toPlainString() : 어떤 경우에도 다른 기호없이 숫자로만 표현한다.
* toString()은 필요하면 지수형태로 표현할 수도 있다.

![](C:\Users\jihye\Desktop\캡처2.PNG)

