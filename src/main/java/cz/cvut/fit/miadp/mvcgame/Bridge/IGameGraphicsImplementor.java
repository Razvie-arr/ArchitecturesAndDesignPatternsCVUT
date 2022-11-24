package cz.cvut.fit.miadp.mvcgame.Bridge;

import cz.cvut.fit.miadp.mvcgame.model.Position;

public interface IGameGraphicsImplementor {

    public void drawImage(String path, Position pos);
    public void drawText(String text, Position pos);
    public void drawLine(Position begPosition, Position endPosition);
    public void clearRect();
}
