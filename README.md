# CountingMachine

#### 가격과 금액을 넣어주면 총 거스름돈과 금액권을 알려주는 프로그램.

- 반복되는 행위를 제어문으로 패턴화
- 객체지향 원리에 따라 함수 분리
- 적절한 변수값 찾아내기

```java
public void changeMachine(int money, int price){

    int change = money - price;   // 필요한 변수값 확인
    int[] unit = {10000, 5000, 1000, 500, 100 ,10};
    int unit_length = unit.length;
    // 반복되는 코드 제어문으로 패턴화
    for(int i=0; i<unit_length; i++){
      // 객체지향 원리에 따라 함수 분리
      change = printChange(change, unit[i]);
    }
}

// 잔돈 구하기
public int printChange(int change, int unit){
    int count = change/unit;
    System.out.println(unit+"원권"+count+"장");
    change = change - count*unit;
    return change;
}
```
