package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;

import static org.assertj.core.api.Assertions.*;

class BishopBlackTest {
    @Test
    public void whenPositionG1ThenG1() {
        BishopBlack bishopBlack = new BishopBlack(Cell.G1);
        assertThat((bishopBlack.position())).isEqualTo(Cell.G1);
    }

    @Test
    public void whenCopyFromG1ToG4() {
        BishopBlack bishopBlack = new BishopBlack(Cell.G1);
        assertThat((bishopBlack.copy(Cell.G4)).position()).isEqualTo(Cell.G4);
    }

    @Test
    public void whenWayFromA1ToD4() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell[] src = new Cell[] {Cell.B2, Cell.C3, Cell.D4};
        assertThat(bishopBlack.way(Cell.D4)).isEqualTo(src);
    }

    @Test
    public void whenWayFromD4ToA1() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D4);
        Cell[] src = new Cell[] {Cell.C3, Cell.B2, Cell.A1};
        assertThat(bishopBlack.way(Cell.A1)).isEqualTo(src);
    }

    @Test
    public void whenWayFromA4ToD1() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A4);
        Cell[] src = new Cell[] {Cell.B3, Cell.C2, Cell.D1};
        assertThat(bishopBlack.way(Cell.D1)).isEqualTo(src);
    }

    @Test
    public void whenWayFromD1ToA4() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D1);
        Cell[] src = new Cell[] {Cell.C2, Cell.B3, Cell.A4};
        assertThat(bishopBlack.way(Cell.A4)).isEqualTo(src);
    }

    @Test
    public void whenIsNotDiagonalFromA1ToA4() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        assertThat(bishopBlack.isDiagonal(Cell.A1, Cell.A4)).isFalse();
    }

    @Test
    public void whenIsDiagonalFromA1ToD4() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        assertThat(bishopBlack.isDiagonal(Cell.A1, Cell.D4)).isTrue();
    }
}