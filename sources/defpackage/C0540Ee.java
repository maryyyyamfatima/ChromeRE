package defpackage;

import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ee, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0540Ee {
    public final int a;
    public final C3588ad b;
    public final InterfaceC2999Xc c;
    public final String d;

    public C0540Ee(C3588ad c3588ad, InterfaceC2999Xc interfaceC2999Xc, String str) {
        this.b = c3588ad;
        this.c = interfaceC2999Xc;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{c3588ad, interfaceC2999Xc, str});
    }

    public final int hashCode() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0540Ee)) {
            return false;
        }
        C0540Ee c0540Ee = (C0540Ee) obj;
        return W82.a(this.b, c0540Ee.b) && W82.a(this.c, c0540Ee.c) && W82.a(this.d, c0540Ee.d);
    }
}
