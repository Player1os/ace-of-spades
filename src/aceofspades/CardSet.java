package aceofspades;

import java.awt.*;
import java.util.ArrayList;

public class CardSet {

    ArrayList<Card> Cards;
    VisCardSet visual;
    String setClass;

    public CardSet(int x, int y, String s, Color c) {
        visual = new VisCardSet(x, y, s, c);
        setClass = s;
        Cards = new ArrayList<>();
    }

    public void addCard(int _pos, Card _card) {
        this.Cards.add(_pos, _card);
        for (int i = _pos; i < Cards.size(); i++) {
            this.Cards.get(i).position = i;
        }
    }

    public void removeCard(int _pos) {
        this.Cards.remove(_pos);
        for (int i = _pos; i < Cards.size(); i++) {
            this.Cards.get(i).position = i;
        }
    }

    public Card getCard(int _pos) {
        return this.Cards.get(_pos);
    }

    public int getCardCount() {
        return Cards.size();
    }

    public void shuffle() {
    }

    public String getCardSetClass() {
        return setClass;
    }

    public VisCardSet getVisCardSet() {
        return visual;
    }
}
