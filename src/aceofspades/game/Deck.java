package aceofspades.game;

import aceofspades.components.DDeck;
import java.awt.Point;
import java.util.ArrayList;

public class Deck {

    protected int _deckID;
    protected ArrayList<Card> _cards;
    protected ArrayList<Boolean> _ownership;
    protected String _type;
    
    protected Point _position;

    public Deck(int deckID, String type, int playerCount) {
        _deckID = deckID;
        _type = type;
        
        _cards = new ArrayList<>();
        _ownership = new ArrayList<>();
        _ownership.ensureCapacity(playerCount);
        for (int i = 0; i < playerCount; i++) {
            _ownership.add(false);
        }
    }

    public void addCard(int deckPosition, Card card) {
        _cards.add(deckPosition, card);
        card.addToDeck(this, deckPosition);
        for (int i = deckPosition; i < _cards.size(); i++) {
            _cards.get(i).addToDeck(this, i);
        }
    }

    public void removeCard(int deckPosition) {
        _cards.remove(deckPosition);
        for (int i = deckPosition; i < _cards.size(); i++) {
            this._cards.get(i).addToDeck(this, i);
        }
    }

    public ArrayList<Card> getCards() {
        return _cards;
    }
    
    public Card getCard(int deckPosition) {
        return _cards.get(deckPosition);
    }

    public int getCardCount() {
        return _cards.size();
    }

    public void shuffle() {
        int n = _cards.size();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                int change = (i + new Double(Math.random()).intValue()) % n;
                Card helper = _cards.get(i);
                _cards.set(i, _cards.get(change));
                _cards.set(change, helper);
            }
        }
    }

    public DDeck getDDeck() {
        DDeck dDeck = new DDeck(this);
        dDeck.setPosition(_deckID, _deckID);
        dDeck.setImage();        
        return dDeck;
    }
    
    public void setDDeckPosition(Point position) {
        _position = position;
    }

    @Override
    public String toString() {
        return _type + Integer.toString(_deckID);
    }
    
    public boolean isOwner(int playerID) {
        return _ownership.get(playerID);
    }

    public void addOwner(int playerID) {
        _ownership.add(playerID, true);
    }
    
    public void removeOwner(int playerID) {
        _ownership.add(playerID, false);
    }

    public void setType(String type) {
        _type = type;
    }

    public String getType() {
        return _type;
    }
}
