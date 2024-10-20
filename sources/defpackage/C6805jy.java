package defpackage;

import android.content.res.Resources;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6805jy implements RO2 {
    public final RO2 a;
    public final Resources b;

    public C6805jy(Resources resources, RO2 ro2) {
        this.b = resources;
        this.a = ro2;
    }

    @Override // defpackage.RO2
    public final boolean a(Object obj, C0543Ee2 c0543Ee2) {
        return this.a.a(obj, c0543Ee2);
    }

    @Override // defpackage.RO2
    public final JO2 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        JO2 b = this.a.b(obj, i, i2, c0543Ee2);
        if (b == null) {
            return null;
        }
        return new C3371Zy1(this.b, b);
    }
}
