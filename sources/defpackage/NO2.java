package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NO2 implements RO2 {
    public final UO2 a;
    public final InterfaceC11610xy b;

    @Override // defpackage.RO2
    public final boolean a(Object obj, C0543Ee2 c0543Ee2) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }

    @Override // defpackage.RO2
    public final JO2 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        JO2 c = this.a.c((Uri) obj, c0543Ee2);
        if (c == null) {
            return null;
        }
        return AbstractC2435St0.a(this.b, (Drawable) ((AbstractC2045Pt0) c).get(), i, i2);
    }

    public NO2(UO2 uo2, InterfaceC11610xy interfaceC11610xy) {
        this.a = uo2;
        this.b = interfaceC11610xy;
    }
}
