package defpackage;

import android.view.WindowManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lq2 */
/* loaded from: classes.dex */
public final class C1513Lq2 {
    public boolean a;
    public boolean b;
    public final /* synthetic */ C1642Mq2 c;

    public final void a() {
        C1642Mq2 c1642Mq2 = this.c;
        ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2 = c1642Mq2.z;
        if (viewOnClickListenerC5731gq2 == null) {
            return;
        }
        boolean z = true;
        boolean z2 = !this.a && this.b;
        C2665Un0 c2665Un0 = viewOnClickListenerC5731gq2.l;
        if (!z2) {
            c2665Un0.a.hide();
        } else {
            c2665Un0.getClass();
            try {
                c2665Un0.a.show();
            } catch (WindowManager.BadTokenException unused) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        C4546dP c4546dP = (C4546dP) c1642Mq2.p;
        c4546dP.e.a(8);
        c4546dP.b("Fails to show payment request UI. Please try again.");
    }

    public C1513Lq2(C1642Mq2 c1642Mq2) {
        this.c = c1642Mq2;
    }
}
