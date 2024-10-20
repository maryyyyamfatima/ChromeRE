package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ct0 */
/* loaded from: classes.dex */
public final class C0356Ct0 implements InterfaceC11073wP2 {
    public final InterfaceC11610xy a;
    public final InterfaceC11073wP2 b;
    public final InterfaceC11073wP2 c;

    public C0356Ct0(InterfaceC11610xy interfaceC11610xy, C5431fy c5431fy, C5628gZ0 c5628gZ0) {
        this.a = interfaceC11610xy;
        this.b = c5431fy;
        this.c = c5628gZ0;
    }

    @Override // defpackage.InterfaceC11073wP2
    public final JO2 a(JO2 jo2, C0543Ee2 c0543Ee2) {
        Drawable drawable = (Drawable) jo2.get();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(C12296zy.c(((BitmapDrawable) drawable).getBitmap(), this.a), c0543Ee2);
        }
        if (drawable instanceof C5284fZ0) {
            return this.c.a(jo2, c0543Ee2);
        }
        return null;
    }
}
