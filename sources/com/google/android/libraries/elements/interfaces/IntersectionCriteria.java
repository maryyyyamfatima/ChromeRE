package com.google.android.libraries.elements.interfaces;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IntersectionCriteria {
    final boolean isIncreasing;
    final float ratio;

    public IntersectionCriteria(float f, boolean z) {
        this.ratio = f;
        this.isIncreasing = z;
    }

    public float getRatio() {
        return this.ratio;
    }

    public boolean getIsIncreasing() {
        return this.isIncreasing;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IntersectionCriteria)) {
            return false;
        }
        IntersectionCriteria intersectionCriteria = (IntersectionCriteria) obj;
        return this.ratio == intersectionCriteria.ratio && this.isIncreasing == intersectionCriteria.isIncreasing;
    }

    public int hashCode() {
        return ((Float.floatToIntBits(this.ratio) + 527) * 31) + (this.isIncreasing ? 1 : 0);
    }

    public String toString() {
        return "IntersectionCriteria{ratio=" + this.ratio + ",isIncreasing=" + this.isIncreasing + "}";
    }
}
