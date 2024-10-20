package defpackage;

import android.content.Intent;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zt3 */
/* loaded from: classes.dex */
public final class C12272zt3 implements InterfaceC1528Lt3 {
    public static C12272zt3 i;
    public static boolean j;
    public final C7549m72 a = new C7549m72(V60.a);
    public final AbstractC1658Mt3 g;
    public boolean h;

    public C12272zt3() {
        AbstractC1658Mt3 b = AbstractC1658Mt3.b();
        this.g = b;
        b.a(this);
    }

    public final void a(Intent intent, String str, String str2) {
        C4705dr2 a = C4705dr2.a(V60.a, 0, intent, 134217728);
        PO a2 = X72.a("browser", new C7893n72(8, null, 1));
        a2.a.d(true);
        a2.f(a);
        K62 k62 = a2.a;
        k62.f(str);
        k62.e(str2);
        a2.l(R.drawable.0_resource_name_obfuscated_res_0x7f0901d9);
        k62.E.tickerText = K62.c(str2);
        k62.t = true;
        k62.r = "Sync";
        W72 e = a2.e(str2);
        this.a.f(e);
        U72.a.b(8, e.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    @Override // defpackage.InterfaceC1528Lt3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B() {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12272zt3.B():void");
    }
}
