package defpackage;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1954Pb implements TimeInterpolator {
    public int[] a;
    public int b;
    public int c;

    public C1954Pb(AnimationDrawable animationDrawable, boolean z) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        this.b = numberOfFrames;
        int[] iArr = this.a;
        if (iArr == null || iArr.length < numberOfFrames) {
            this.a = new int[numberOfFrames];
        }
        int[] iArr2 = this.a;
        int i = 0;
        for (int i2 = 0; i2 < numberOfFrames; i2++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
            iArr2[i2] = duration;
            i += duration;
        }
        this.c = i;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i = (int) ((f * this.c) + 0.5f);
        int i2 = this.b;
        int[] iArr = this.a;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = iArr[i3];
            if (i < i4) {
                break;
            }
            i -= i4;
            i3++;
        }
        return (i3 / i2) + (i3 < i2 ? i / this.c : 0.0f);
    }
}
