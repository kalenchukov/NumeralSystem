# NumeralSystem

Системы счисления.

## Использование

#### Получение цифр двоичной системы счисления

```java
Numerable numeralSystem = new BinarySystem();
numeralSystem.getDigits();
// Результат выполнения: [0, 1]
```

Аналог в виде константы:

```java
BinarySystem.DIGITS;
```

Аналог в виде перечисления:

```java
NumeralSystem.BINARY.getDigits();
```

#### Получение цифр римской системы счисления

```java
Numerable numeralSystem = new RomanSystem();
numeralSystem.getDigits();
// Результат выполнения: [I, V, X, L, C, D, M]
```

Аналог в виде константы:

```java
RomanSystem.DIGITS;
```

Аналог в виде перечисления:

```java
NumeralSystem.ROMAN.getDigits();
```

#### Получение цифр восьмеричной системы счисления

```java
Numerable numeralSystem = new OctalSystem();
numeralSystem.getDigits();
// Результат выполнения: [0, 1, 2, 3, 4, 5, 6, 7]
```

Аналог в виде константы:

```java
OctalSystem.DIGITS;
```

Аналог в виде перечисления:

```java
NumeralSystem.OCTAL.getDigits();
```

#### Получение цифр десятеричной системы счисления

```java
Numerable numeralSystem = new DecimalSystem();
numeralSystem.getDigits();
// Результат выполнения: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
```

Аналог в виде константы:

```java
DecimalSystem.DIGITS;
```

Аналог в виде перечисления:

```java
NumeralSystem.DECIMAL.getDigits();
```

#### Получение цифр двенадцатеричной системы счисления

```java
Numerable numeralSystem = new DuodecimalSystem();
numeralSystem.getDigits();
// Результат выполнения: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B]
```

Аналог в виде константы:

```java
DuodecimalSystem.DIGITS;
```

Аналог в виде перечисления:

```java
NumeralSystem.DUODECIMAL.getDigits();
```

#### Получение цифр шестнадцатеричной системы счисления

```java
Numerable numeralSystem = new HexadecimalSystem();
numeralSystem.getDigits();
// Результат выполнения: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F]
```

Аналог в виде константы:

```java
HexadecimalSystem.DIGITS;
```

Аналог в виде перечисления:

```java
NumeralSystem.HEXADECIMAL.getDigits();
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
