/*
 * Copyright © 2022-2023 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package dev.kalenchukov.numeralsystem;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;

/**
 * Интерфейс системы счисления.
 *
 * @author Алексей Каленчуков
 */
public interface Numerable
{
	/**
	 * Проверяет содержание цифры в системе счисления.
	 *
	 * @param digit цифра.
	 * @return {@code true}, если цифра содержится в системе счисления, иначе {@code false}.
	 */
	boolean contains(@NotNull Character digit);

	/**
	 * Проверяет принадлежность всех цифр системе счисления.
	 *
	 * @param string строка.
	 * @return {@code true}, если все цифры принадлежат системе счисления, иначе {@code false}.
	 */
	boolean allMatch(@NotNull String string);

	/**
	 * Проверяет принадлежность хотя бы одной цифры системе счисления.
	 *
	 * @param string строка.
	 * @return {@code true}, если хотя бы одна цифра принадлежит системе счисления, иначе {@code false}.
	 */
	boolean anyMatch(@NotNull String string);

	/**
	 * Проверяет не принадлежность всех цифр системе счисления.
	 *
	 * @param string строка.
	 * @return {@code true}, если все цифры не принадлежат системе счисления, иначе {@code false}.
	 */
	boolean noneMatch(@NotNull String string);

	/**
	 * Проверяет, расположены ли цифры системы счисления в возрастающем или убывающем порядке.
	 *
	 * @param string строка.
	 * @return {@code true}, если цифры системы счисления расположены в возрастающем или
	 * убывающем порядке, иначе {@code false}.
	 */
	boolean isSorted(@NotNull String string);

	/**
	 * Проверяет, расположены ли цифры системы счисления в возрастающем порядке.
	 *
	 * @param string строка.
	 * @return {@code true}, если цифры системы счисления расположены в возрастающем порядке, иначе {@code false}.
	 */
	boolean isSortedAsc(@NotNull String string);

	/**
	 * Проверяет, расположены ли цифры системы счисления в убывающем порядке.
	 *
	 * @param string строка.
	 * @return {@code true}, если цифры системы счисления расположены в убывающем порядке, иначе {@code false}.
	 */
	boolean isSortedDesc(@NotNull String string);

	/**
	 * Возвращает коллекцию из цифр системы счисления.
	 *
	 * @return коллекцию цифр системы счисления.
	 */
	@Unmodifiable
	@NotNull
	List<@NotNull Character> toList();

	/**
	 * Возвращает массив из цифр системы счисления.
	 *
	 * @return массив из цифр системы счисления.
	 */
	@NotNull
	Character @NotNull [] toArray();

	/**
	 * Проверяет равенство объектов.
	 *
	 * @param obj сравниваемый объект.
	 * @return {@code true}, если объекты равны, иначе {@code false}.
	 * @see Object#equals(Object)
	 */
	boolean equals(@Nullable Object obj);

	/**
	 * Возвращает значение объекта в виде числа.
	 *
	 * @return число.
	 * @see Object#hashCode()
	 */
	int hashCode();

	/**
	 * Возвращает значение объекта в виде строки.
	 *
	 * @return строку.
	 * @see Object#toString()
	 */
	@NotNull
	String toString();

	/**
	 * Возвращает значение объекта в виде строки.
	 *
	 * @param separator разделитель.
	 * @return строку.
	 */
	@NotNull
	String toString(@NotNull String separator);
}
