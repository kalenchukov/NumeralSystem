# NumeralSystem
Системы счисления.

## Поддерживаемые системы счисления
* Двоичная
* Троичная
* Римская
* Восьмеричная
* Десятеричная
* Двенадцатеричная
* Шестнадцатеричная

## Использование
### Перечисления
#### Получение системы счисления
```java
NumeralSystem.HEXADECIMAL.getNumeralSystem();
```

### Цифры систем счисления 
#### Получение цифр
```java
Numerable numeralSystem = new HexadecimalSystem();
numeralSystem.get();
/*
Результат выполнения:
[
    0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F
]
*/
```

Аналог в виде константы:

```java
HexadecimalSystem.DIGITS;
```

#### Проверка содержания цифры в системе счисления
```java
Numerable numeralSystem = new DuodecimalSystem();
numeralSystem.contains('A');
// Результат выполнения: true
```

#### Проверка принадлежности всех цифр системе счисления
```java
Numerable numeralSystem = new DecimalSystem();
numeralSystem.allMatch("0123456789");
// Результат выполнения: true
```

#### Проверка принадлежности хотя бы одной цифры системе счисления
```java
Numerable numeralSystem = new DecimalSystem();
numeralSystem.anyMatch("AB0CD");
// Результат выполнения: true
```

#### Проверка не принадлежности всех цифр системе счисления
```java
Numerable numeralSystem = new DecimalSystem();
numeralSystem.anyMatch("ABCDEF");
// Результат выполнения: true
```

#### Получение цифр в виде массива
```java
Numerable numeralSystem = new RomanSystemTest();
numeralSystem.toArray();
/*
Результат выполнения:
[
    I, V, X, L, C, D, M
]
*/
```

#### Получение цифр в виде строки с разделителем
```java
Numerable numeralSystem = new OctalSystem();
numeralSystem.toString(",");
// Результат выполнения: 0,1,2,3,4,5,6,7
```

#### Получение цифр в виде строки
```java
Numerable numeralSystem = new DuodecimalSystem();
numeralSystem.toString();
// Результат выполнения: 0123456789AB
```
