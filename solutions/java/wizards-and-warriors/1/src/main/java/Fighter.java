class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    @Override
    public int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6; 
    }
    
    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {

    private boolean isSpellPrepared = false;

    public void prepareSpell() {
        isSpellPrepared = true;
    }
    
    @Override
    public int getDamagePoints(Fighter fighter) {
        return isSpellPrepared ? 12 : 3; 
    }

    @Override
    public boolean isVulnerable() {
        return isSpellPrepared ? false : true;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}
