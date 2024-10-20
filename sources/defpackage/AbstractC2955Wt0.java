package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2955Wt0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Drawable drawable, Drawable drawable2) {
        if (drawable == 0) {
            return drawable2 == 0;
        }
        if (drawable2 == 0) {
            return false;
        }
        if ((drawable instanceof UY) && (drawable2 instanceof UY)) {
            return ((UY) drawable).a((UY) drawable2);
        }
        return drawable.equals(drawable2);
    }
}
