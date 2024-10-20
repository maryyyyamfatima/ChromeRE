package defpackage;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ny0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1810Ny0 extends CharacterStyle {
    public abstract void a(Canvas canvas);

    public abstract void b(Canvas canvas);

    public boolean c(int i, int i2) {
        return false;
    }

    public abstract void d(Layout layout, CharSequence charSequence);

    public boolean e() {
        return this instanceof A91;
    }

    public abstract void f();

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }
}
