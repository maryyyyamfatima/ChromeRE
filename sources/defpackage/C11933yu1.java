package defpackage;

import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yu1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11933yu1 implements InterfaceC2999Xc {
    public final String b;

    public C11933yu1(C11590xu1 c11590xu1) {
        this.b = c11590xu1.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11933yu1) {
            return W82.a(this.b, ((C11933yu1) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }
}
