/*
 * Copyright © 2022 Алексей Каленчуков
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
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;

/**
 * Интерфейс системы счисления.
 */
public interface Numerable
{
	/**
	 * Возвращает цифры системы счисления.
	 *
	 * @return Коллекцию цифр системы счисления.
	 */
	@Unmodifiable
	@NotNull
	List<@NotNull Character> get();

	/**
	 * Проверяет содержание цифры в системе счисления.
	 *
	 * @param digit Цифра.
	 * @return {@code True}, если цифра содержится в системе счисления, иначе {@code false}.
	 */
	boolean contains(@NotNull Character digit);

	/**
	 * Проверяет принадлежность всех цифр системе счисления.
	 *
	 * @param string Строка.
	 * @return {@code True}, если все цифры принадлежат системе счисления, иначе {@code false}.
	 */
	boolean allMatch(@NotNull final String string);

	/**
	 * Возвращает массив из цифр системы счисления.
	 *
	 * @return Массив из цифр системы счисления.
	 */
	@NotNull
	Character @NotNull [] toArray();

	/**
	 * Возвращает строковое представление цифр системы счисления.
	 *
	 * @param separator Разделитель.
	 * @return Строку из цифр системы счисления.
	 */
	@NotNull
	String toString(@NotNull String separator);
}
