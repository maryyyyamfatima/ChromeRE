package defpackage;

import android.content.Context;
import android.os.Looper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ML0 extends AbstractC2609Uc {
    public final String a;
    public final String b;
    public final int c;

    @Override // defpackage.AbstractC2609Uc
    public final InterfaceC3129Yc b(Context context, Looper looper, JU ju, Object obj, InterfaceC9914t11 interfaceC9914t11, InterfaceC10257u11 interfaceC10257u11) {
        return new NL0(this.a, this.b, this.c, context, looper, ju, interfaceC9914t11, interfaceC10257u11);
    }

    public ML0(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }
}
