# NumeralSystem

Системы счисления.

## Поддерживаемые системы счисления

* Двоичная
* Римская
* Восьмеричная
* Десятеричная
* Двенадцатеричная
* Шестнадцатеричная

## Использование

#### Получение цифр

```java
Numerable numeralSystem = new HexadecimalSystem();
numeralSystem.getDigits();
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

Аналог в виде перечисления:

```java
NumeralSystem.HEXADECIMAL.getDigits();
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

## Установка

Для установки этого проекта, введите в терминале:

```bash
git clone https://github.com/kalenchukov/NumeralSystem.git
```

## Версии

Доступные [версии](https://github.com/kalenchukov/NumeralSystem/releases).

## Авторы

[Алексей Каленчуков](https://github.com/kalenchukov)

## Лицензия

[MIT](https://opensource.org/licenses/MIT)
