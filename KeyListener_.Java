package moe;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


class KeyListener_ extends KeyAdapter {

    //按下键盘
    @Override
    public void keyPressed(KeyEvent e){
        if (moe.game == null){
            return;
        }
        else if (e.getKeyCode() == KeyEvent.VK_S){
            moe.game.pressS();
        }
        else if (e.getKeyCode() == KeyEvent.VK_D){
            moe.game.pressD();
        }
        else if (e.getKeyCode() == KeyEvent.VK_F){
            moe.game.pressF();
        }
        else if (e.getKeyCode() == KeyEvent.VK_SPACE){
            moe.game.pressSpace();
        }
        else if (e.getKeyCode() == KeyEvent.VK_J){
            moe.game.pressJ();
        }
        else if (e.getKeyCode() == KeyEvent.VK_K){
            moe.game.pressK();
        }
        else if (e.getKeyCode() == KeyEvent.VK_L){
            moe.game.pressL();
        }
    }

    //释放键盘
    @Override
    public void keyReleased(KeyEvent e){
        if (moe.game == null){
            return;
        }
        else if (e.getKeyCode() == KeyEvent.VK_S){
            moe.game.releaseS();
        }
        else if (e.getKeyCode() == KeyEvent.VK_D){
            moe.game.releaseD();
        }
        else if (e.getKeyCode() == KeyEvent.VK_F){
            moe.game.releaseF();
        }
        else if (e.getKeyCode() == KeyEvent.VK_SPACE){
            moe.game.releaseSpace();
        }
        else if (e.getKeyCode() == KeyEvent.VK_J){
            moe.game.releaseJ();
        }
        else if (e.getKeyCode() == KeyEvent.VK_K){
            moe.game.releaseK();
        }
        else if (e.getKeyCode() == KeyEvent.VK_L){
            moe.game.releaseL();
        }
    }

}

