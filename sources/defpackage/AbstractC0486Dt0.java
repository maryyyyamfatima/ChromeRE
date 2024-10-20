package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0486Dt0 {
    public static void a(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static void b(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void c(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }
}
