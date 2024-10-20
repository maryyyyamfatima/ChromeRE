package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12281zv0 implements InterfaceC1016Hv0 {
    @Override // defpackage.InterfaceC1016Hv0
    public final C0886Gv0 a(Context context, String str, InterfaceC0756Fv0 interfaceC0756Fv0) {
        C0886Gv0 c0886Gv0 = new C0886Gv0();
        int b = interfaceC0756Fv0.b(context, str, true);
        c0886Gv0.b = b;
        if (b != 0) {
            c0886Gv0.c = 1;
        } else {
            int a = interfaceC0756Fv0.a(context, str);
            c0886Gv0.a = a;
            if (a != 0) {
                c0886Gv0.c = -1;
            }
        }
        return c0886Gv0;
    }
}
