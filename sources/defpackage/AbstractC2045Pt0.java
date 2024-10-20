package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2045Pt0 implements JO2, InterfaceC2656Ul1 {
    public final Drawable a;

    public AbstractC2045Pt0(Drawable drawable) {
        AbstractC6464iy2.b(drawable);
        this.a = drawable;
    }

    @Override // defpackage.JO2
    public final Object get() {
        Drawable drawable = this.a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // defpackage.InterfaceC2656Ul1
    public void a() {
        Drawable drawable = this.a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof C5284fZ0) {
            ((C5284fZ0) drawable).a.a.l.prepareToDraw();
        }
    }
}
