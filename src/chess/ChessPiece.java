package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    /*
        * Não foi criado o método 'set', pois na lógica do projeto não queremos que a cor da peça seja mudada
    */
}
