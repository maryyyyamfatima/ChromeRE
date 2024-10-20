package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10794vc implements JO2 {
    public final AnimatedImageDrawable a;

    @Override // defpackage.JO2
    public final Object get() {
        return this.a;
    }

    public C10794vc(AnimatedImageDrawable animatedImageDrawable) {
        this.a = animatedImageDrawable;
    }

    @Override // defpackage.JO2
    public final Class e() {
        return Drawable.class;
    }

    @Override // defpackage.JO2
    public final int d() {
        int intrinsicWidth;
        int intrinsicHeight;
        AnimatedImageDrawable animatedImageDrawable = this.a;
        intrinsicWidth = animatedImageDrawable.getIntrinsicWidth();
        intrinsicHeight = animatedImageDrawable.getIntrinsicHeight();
        int i = intrinsicHeight * intrinsicWidth;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        char[] cArr = AbstractC10296u74.a;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i2 = AbstractC9610s74.a[config.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                i3 = 2;
            } else {
                i3 = 4;
                if (i2 == 4) {
                    i3 = 8;
                }
            }
        }
        return i3 * i * 2;
    }

    @Override // defpackage.JO2
    public final void b() {
        AnimatedImageDrawable animatedImageDrawable = this.a;
        animatedImageDrawable.stop();
        animatedImageDrawable.clearAnimationCallbacks();
    }
}
