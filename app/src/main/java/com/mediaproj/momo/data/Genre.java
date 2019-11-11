package com.mediaproj.momo.data;

public class Genre {
    private boolean drama;
    private boolean fantasy;
    private boolean horror;
    private boolean romance;
    private boolean action;
    private boolean thriller;
    private boolean blues;
    private boolean mistery;
    private boolean comedy;
    private boolean family;
    private boolean sf;
    private boolean animation;

    public Genre(boolean drama, boolean fantasy, boolean horror, boolean romance, boolean action, boolean thriller, boolean blues, boolean mistery, boolean comedy, boolean family, boolean sf, boolean animation) {
        this.drama = drama;
        this.fantasy = fantasy;
        this.horror = horror;
        this.romance = romance;
        this.action = action;
        this.thriller = thriller;
        this.blues = blues;
        this.mistery = mistery;
        this.comedy = comedy;
        this.family = family;
        this.sf = sf;
        this.animation = animation;
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

    public boolean isBlues() {
        return blues;
    }

    public boolean isMistery() {
        return mistery;
    }

    public boolean isComedy() {
        return comedy;
    }

    public boolean isFamily() {
        return family;
    }

    public boolean isSf() {
        return sf;
    }

    public boolean isAnimation() {
        return animation;
    }
}
