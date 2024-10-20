package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import org.chromium.chrome.browser.webapps.WebappRegistry;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tn4 */
/* loaded from: classes2.dex */
public final class C10179tn4 implements InterfaceC6044hl1, InterfaceC3657ao2, InterfaceC6377ij3 {
    public final PC a;
    public final Kn4 g;
    public final Activity h;
    public final Dn4 i;

    @Override // defpackage.InterfaceC6044hl1
    public final /* synthetic */ void H() {
    }

    @Override // defpackage.InterfaceC6044hl1
    public final void W() {
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void e() {
    }

    @Override // defpackage.InterfaceC6377ij3
    public final void g() {
    }

    @Override // defpackage.InterfaceC6377ij3
    public final void f() {
        if (Fn4.a.getAndSet(false)) {
            new En4().c(AbstractC0185Bl.e);
        }
    }

    public C10179tn4(Activity activity, PC pc, C6166i6 c6166i6, C9766sc0 c9766sc0, Dn4 dn4, final I5 i5) {
        this.a = pc;
        Kn4 c = Kn4.c(pc);
        this.g = c;
        this.h = activity;
        this.i = dn4;
        new C9493rn4(c6166i6, pc, c9766sc0);
        dn4.d.add(new Cn4() { // from class: sn4
            @Override // defpackage.Cn4
            public final void a(C12237zn4 c12237zn4, boolean z) {
                C10179tn4 c10179tn4 = C10179tn4.this;
                c10179tn4.getClass();
                if (i5.a() || c12237zn4 == null) {
                    return;
                }
                c12237zn4.c(c10179tn4.a);
                int i = c10179tn4.g.f().i;
                if ((i == 5 || i == 9 || i == 14 || i == 13 || i == 15) ? false : true) {
                    c12237zn4.b.edit().putLong("last_used", System.currentTimeMillis()).apply();
                }
            }
        });
        i5.b(this);
        C7432ln3 c2 = C7432ln3.c();
        try {
            WebappRegistry webappRegistry = Wn4.a;
            Wn4.a.d(c.i());
            c2.close();
        } catch (Throwable th) {
            try {
                c2.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC6044hl1
    public final void i() {
        ArrayList arrayList = AbstractC0767Fx1.a;
        Kn4 kn4 = this.g;
        int i = kn4.f().i;
        if (kn4.j() && i == 0) {
            C7432ln3 c = C7432ln3.c();
            try {
                String i2 = kn4.i();
                WebappRegistry webappRegistry = Wn4.a;
                webappRegistry.d(i2);
                C12237zn4 c2 = webappRegistry.c(kn4.i());
                c.close();
                if (c2 == null || (i = c2.b.getInt("source", 0)) == 0) {
                    i = 11;
                }
            } catch (Throwable th) {
                try {
                    c.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        AbstractC0767Fx1.a.add(new C0637Ex1(kn4.s(), false, i, kn4));
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void c() {
        Activity activity = this.h;
        if (activity.isFinishing() || activity.getIntent() == null) {
            return;
        }
        AbstractC2599Ua.a(activity.getTaskId(), activity.getIntent().getData());
    }
}
