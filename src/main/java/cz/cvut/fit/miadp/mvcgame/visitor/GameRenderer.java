package cz.cvut.fit.miadp.mvcgame.visitor;

import cz.cvut.fit.miadp.mvcgame.Bridge.IGameGraphics;
import cz.cvut.fit.miadp.mvcgame.model.Position;
import cz.cvut.fit.miadp.mvcgame.model.gameObjects.AbsCannon;
import cz.cvut.fit.miadp.mvcgame.model.gameObjects.AbsEnemy;
import cz.cvut.fit.miadp.mvcgame.model.gameObjects.AbsGameInfo;
import cz.cvut.fit.miadp.mvcgame.model.gameObjects.AbsMissile;

public class GameRenderer implements IVisitor {

    private IGameGraphics gr;

    public void setGraphicContext( IGameGraphics gr ) {
        this.gr = gr;
    }

    @Override
    public void visitCannon(AbsCannon cannon) {
        this.gr.drawImage(  "images/cannon.png" , cannon.getPosition());
        
    }

    @Override
    public void visitMissile(AbsMissile missile) {
        this.gr.drawImage( "images/missile.png" , missile.getPosition());
        
    }

    @Override
    public void visitGameInfo(AbsGameInfo gameInfo) {
        this.gr.drawText(gameInfo.getText(), gameInfo.getPosition());
    }

    @Override
    public void visitEnemy(AbsEnemy enemy) {
        this.gr.drawImage( "images/" + enemy.getType() + ".png" , enemy.getPosition());
    }

}
