package org.alicandor.problems.leetcode200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import problems.leetcode200.NumberOfIslandsSolution;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfIslandsSolutionTest {
    private NumberOfIslandsSolution solution;

    @BeforeEach
    void init() {
        solution = new NumberOfIslandsSolution();
    }

    // Este método proporciona los casos de prueba
    static Stream<Arguments> islandTestCases() {
        return Stream.of(
                // Caso 1 - Ejemplo del enunciado (una isla grande)
                Arguments.of(
                        new char[][] {
                                {'1', '1', '1', '1', '0'},
                                {'1', '1', '0', '1', '0'},
                                {'1', '1', '0', '0', '0'},
                                {'0', '0', '0', '0', '0'}
                        },
                        1
                ),

                // Caso 2 - Ejemplo del enunciado (tres islas separadas)
                Arguments.of(
                        new char[][] {
                                {'1', '1', '0', '0', '0'},
                                {'1', '1', '0', '0', '0'},
                                {'0', '0', '1', '0', '0'},
                                {'0', '0', '0', '1', '1'}
                        },
                        3
                ),

                // Caso 3 - Un caso adicional (grid vacía - sin islas)
                Arguments.of(
                        new char[][] {
                                {'0', '0', '0'},
                                {'0', '0', '0'},
                                {'0', '0', '0'}
                        },
                        0
                )
        );
    }

    @ParameterizedTest
    @MethodSource("islandTestCases")
    void testNumIslandsWithMultipleCases(char[][] grid, int expectedIslands) {
        int actualIslands = solution.numIslands(grid);
        assertEquals(expectedIslands, actualIslands,
                "La grid debería tener " + expectedIslands + " islas");
    }
}