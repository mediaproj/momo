package com.mediaproj.momo.data;

public class Genre {
    private boolean drama;
    private boolean fantasy;
    private boolean horror;
    private boolean romance;
    private boolean action;
    private boolean thriller;
    private boolean animation;
    private boolean adventure;
    private boolean mistery;
    private boolean history;
    private boolean sf;
    private boolean comedy;

    public Genre() {

    }

    public Genre(boolean drama, boolean fantasy, boolean horror, boolean romance, boolean action, boolean thriller, boolean animation, boolean adventure, boolean mistery, boolean history, boolean sf, boolean comedy) {
        this.drama = drama;
        this.fantasy = fantasy;
        this.horror = horror;
        this.romance = romance;
        this.action = action;
        this.thriller = thriller;
        this.animation = animation;
        this.adventure = adventure;
        this.mistery = mistery;
        this.history = history;
        this.sf = sf;
        this.comedy = comedy;
    }

    public boolean isDrama() {
        return drama;
    }

    public boolean isFantasy() {
        return fantasy;
    }

    public boolean isHorror() {
        return horror;
    }

    public boolean isRomance() {
        return romance;
    }

    public boolean isAction() {
        return action;
    }

    public boolean isThriller() {
        return thriller;
    }

    public boolean isAnimation() {
        return animation;
    }

    public boolean isAdventure() {
        return adventure;
    }

    public boolean isMistery() {
        return mistery;
    }

    public boolean isHistory() {
        return history;
    }

    public boolean isSf() {
        return sf;
    }

    public boolean isComedy() {
        return comedy;
    }
}
