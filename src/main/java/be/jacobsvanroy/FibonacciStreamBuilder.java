package be.jacobsvanroy;

import java.util.function.Predicate;
import java.util.stream.LongStream;

/**
 * Copyright (C) 2014  Davy Van Roy
 * <p/>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

public class FibonacciStreamBuilder {

    public LongStream getStream(Predicate<Long> predicate) {
        LongStream.Builder builder = LongStream.builder();
        FibonacciIterator iterator = new FibonacciIterator(predicate);
        while (iterator.hasNext()) {
            builder.add(iterator.nextLong());
        }
        return builder.build();
    }


}
