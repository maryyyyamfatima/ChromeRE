package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class G52 extends AbstractC2045Pt0 {
    @Override // defpackage.JO2
    public final void b() {
    }

    public G52(Drawable drawable) {
        super(drawable);
    }

    @Override // defpackage.JO2
    public final Class e() {
        return this.a.getClass();
    }

    @Override // defpackage.JO2
    public final int d() {
        Drawable drawable = this.a;
        return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
    }
}
