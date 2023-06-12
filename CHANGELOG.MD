# Журнал изменений
## vX.X.X - XX.XX.XXXX
### Добавлено
* Добавлен модуль assertj-core версии 3.24.2.

### Изменено
*

### Исправлено
*

### Удалено
*

## v1.6.0 - 14.05.2023
### Добавлено
* Добавлена четвертичная система счисления.
* Добавлено перечисление NumeralSystem.TERNARY.

## v1.5.0 - 12.02.2023
### Добавлено
* Добавлен метод Numerable.isSorted(String).
* Добавлен метод Numerable.isSortedAsc(String).
* Добавлен метод Numerable.isSortedDesc(String).
* Добавлен метод Numerable.equals(Object).
* Добавлен метод Numerable.hashCode().
* Удалён метод NumeralSystem.toString().
* Добавлен AUTHOR.MD.
* Добавлен INSTALL.MD.
* Добавлен CHANGELOG.MD.

### Изменено
* Обновлён README.MD.
* Убраны модификаторы final из Numerable.

## v1.4.0 - 16.10.2022
### Добавлено
* Добавлен метод Numerable.allMatch(String).
* Добавлен метод Numerable.anyMatch(String).
* Добавлен метод Numerable.noneMatch(String).
* Добавлен плагин maven-assembly в pom.xml.
* Добавлен плагин maven-compiler в pom.xml.
* Добавлен плагин maven-dependency в pom.xml.
* Добавлен плагин maven-javadoc в pom.xml.
* Добавлен плагин maven-source в pom.xml.

## v1.3.0 - 31.08.2022
### Добавлено
* Добавлен метод Numerable.toString(String).

### Исправлено
* Исправлен баг в методе BinarySystem.equals(Object).
* Исправлен баг в методе DecimalSystem.equals(Object).
* Исправлен баг в методе DuodecimalSystem.equals(Object).
* Исправлен баг в методе HexadecimalSystem.equals(Object).
* Исправлен баг в методе OctalSystem.equals(Object).
* Исправлен баг в методе RomanSystem.equals(Object).
* Исправлен баг в методе TernarySystem.equals(Object).

## v1.2.0 - 07.08.2022
### Добавлено
* Добавлена троичная система счисления.
* Добавлен метод AbstractSystem.toString().
* Добавлен метод Numerable.contains(Character).
* Добавлен метод Numerable.toArray().
* Добавлен метод Numerable.equals().
* Добавлен метод Numerable.hashCode().

### Изменено
* Переименован метод Numerable.getDigits() -> Numerable.get().

## v1.1.0 - 05.08.2022
### Добавлено
* Добавлена римская система счисления.
