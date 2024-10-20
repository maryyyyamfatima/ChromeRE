package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Iu1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1142Iu1 {
    public final String a;
    public final Callback b;
    public final Callback c;
    public final int d;

    public C1142Iu1(int i, String str, Callback callback, C2831Vu1 c2831Vu1) {
        this.a = str;
        this.b = callback;
        this.c = c2831Vu1;
        this.d = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessoryAction(");
        int i = this.d;
        String a = AbstractC8207o22.a(sb, i, ")");
        if (i == 0) {
            a = "GENERATE_PASSWORD_AUTOMATIC";
        } else if (i == 1) {
            a = "MANAGE_PASSWORDS";
        } else if (i == 2) {
            a = "AUTOFILL_SUGGESTION";
        }
        return AbstractC10204ts.a(new StringBuilder("'"), this.a, "' of type ", a);
    }
}
