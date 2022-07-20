# Numeral System
Системы счисления.

### Получение цифр двоичной системы счисления
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

### Получение цифр восьмеричной системы счисления
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

### Получение цифр десятеричной системы счисления
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

### Получение цифр двенадцатеричной системы счисления
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

### Получение цифр шестнадцатеричной системы счисления
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