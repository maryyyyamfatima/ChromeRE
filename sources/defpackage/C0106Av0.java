package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Av0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106Av0 implements InterfaceC1016Hv0 {
    @Override // defpackage.InterfaceC1016Hv0
    public final C0886Gv0 a(Context context, String str, InterfaceC0756Fv0 interfaceC0756Fv0) {
        C0886Gv0 c0886Gv0 = new C0886Gv0();
        int a = interfaceC0756Fv0.a(context, str);
        c0886Gv0.a = a;
        if (a != 0) {
            c0886Gv0.b = interfaceC0756Fv0.b(context, str, false);
        } else {
            c0886Gv0.b = interfaceC0756Fv0.b(context, str, true);
        }
        int i = c0886Gv0.a;
        if (i == 0 && c0886Gv0.b == 0) {
            c0886Gv0.c = 0;
        } else if (i >= c0886Gv0.b) {
            c0886Gv0.c = -1;
        } else {
            c0886Gv0.c = 1;
        }
        return c0886Gv0;
    }
}
