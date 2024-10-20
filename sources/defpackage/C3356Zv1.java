package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zv1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3356Zv1 extends Paint {
    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }

    public C3356Zv1() {
    }

    public C3356Zv1(int i) {
        super(i);
    }

    public C3356Zv1(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C3356Zv1(PorterDuff.Mode mode, int i) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
