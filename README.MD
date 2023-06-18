# Справка
## NumeralSystem
Системы счисления.

## Поддерживаемые системы счисления
* Двоичная
* Троичная
* Четвертичная
* Восьмеричная
* Десятеричная
* Двенадцатеричная
* Шестнадцатеричная
* Римская

## Использование
### Перечисления
#### Получение системы счисления
```java
NumeralSystem.HEXADECIMAL.getNumeralSystem();
```

### Цифры систем счисления
#### Проверка содержания цифры в системе счисления
```java
Numerable numeralSystem = new DuodecimalSystem();
numeralSystem.contains('A');
```

Результат выполнения:
```
true
```

#### Проверка принадлежности всех цифр системе счисления
```java
Numerable numeralSystem = new DecimalSystem();
numeralSystem.allMatch("56734589057651234");
```

Результат выполнения:
```
true
```

#### Проверка принадлежности хотя бы одной цифры системе счисления
```java
Numerable numeralSystem = new DecimalSystem();
numeralSystem.anyMatch("AB0CD");
```

Результат выполнения:
```
true
```

#### Проверка не принадлежности всех цифр системе счисления
```java
Numerable numeralSystem = new DecimalSystem();
numeralSystem.anyMatch("ABCDEF");
```

Результат выполнения:
```
true
```

#### Проверка расположения цифр системы счисления в возрастающем или убывающем порядке
```java
Numerable numeralSystem = new DecimalSystem();
numeralSystem.isSorted("012");
```

Результат выполнения:
```
true
```

#### Проверка расположения цифр системы счисления в возрастающем порядке
```java
Numerable numeralSystem = new DecimalSystem();
numeralSystem.isSortedAsc("01234");
```

Результат выполнения:
```
true
```

#### Проверка расположения цифр системы счисления в убывающем порядке
```java
Numerable numeralSystem = new DecimalSystem();
numeralSystem.isSortedDesc("987654");
```

Результат выполнения:
```
true
```

#### Получение минимальной цифры
```java
Numerable numeralSystem = new HexadecimalSystem();
numeralSystem.getMin();
```

Результат выполнения:
```
0
```

#### Получение цифр в виде коллекции
```java
Numerable numeralSystem = new HexadecimalSystem();
numeralSystem.toList();
```

Результат выполнения:
```
[
    0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F
]
```

Аналог в виде константы:
```java
HexadecimalSystem.DIGITS;
```

#### Получение цифр в виде массива
```java
Numerable numeralSystem = new RomanSystemTest();
numeralSystem.toArray();
```

Результат выполнения:
```
[
    I, V, X, L, C, D, M
]
```

#### Получение цифр в виде строки с разделителем
```java
Numerable numeralSystem = new OctalSystem();
numeralSystem.toString(",");
```

Результат выполнения:
```
0,1,2,3,4,5,6,7
```

#### Получение цифр в виде строки
```java
Numerable numeralSystem = new DuodecimalSystem();
numeralSystem.toString();
```

Результат выполнения:
```
0123456789AB
```
