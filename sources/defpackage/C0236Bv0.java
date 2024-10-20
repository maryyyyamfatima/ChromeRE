package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0236Bv0 implements InterfaceC1016Hv0 {
    @Override // defpackage.InterfaceC1016Hv0
    public final C0886Gv0 a(Context context, String str, InterfaceC0756Fv0 interfaceC0756Fv0) {
        C0886Gv0 c0886Gv0 = new C0886Gv0();
        c0886Gv0.a = interfaceC0756Fv0.a(context, str);
        int b = interfaceC0756Fv0.b(context, str, true);
        c0886Gv0.b = b;
        int i = c0886Gv0.a;
        if (i == 0 && b == 0) {
            c0886Gv0.c = 0;
        } else if (b >= i) {
            c0886Gv0.c = 1;
        } else {
            c0886Gv0.c = -1;
        }
        return c0886Gv0;
    }
}
