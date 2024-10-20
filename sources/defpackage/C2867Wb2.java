package defpackage;

import android.content.Intent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wb2 */
/* loaded from: classes.dex */
public class C2867Wb2 extends AbstractC0819Gh3 {
    @Override // defpackage.AbstractC0819Gh3
    public final void a(Intent intent) {
        C3929bc2 c3929bc2;
        AbstractIntentServiceC0949Hh3 abstractIntentServiceC0949Hh3 = this.a;
        synchronized (C3929bc2.l) {
            if (C3929bc2.m == null) {
                C3929bc2.m = new C3929bc2(abstractIntentServiceC0949Hh3);
            }
            c3929bc2 = C3929bc2.m;
        }
        c3929bc2.j();
    }

    @Override // defpackage.AbstractC0819Gh3
    public final void b() {
        this.a.setIntentRedelivery(true);
    }
}
