package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.browser.customtabs.CustomTabsSessionToken;
import org.chromium.net.NetworkChangeNotifier;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nd0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1705Nd0 {
    public final C4620dd0 a;
    public final PC b;
    public final InterfaceC1835Od0 c;
    public final C12274zu d;
    public final Context e;
    public Runnable f;

    public C1705Nd0(C4620dd0 c4620dd0, PC pc, InterfaceC1835Od0 interfaceC1835Od0, C12274zu c12274zu, Context context) {
        this.a = c4620dd0;
        this.b = pc;
        this.c = interfaceC1835Od0;
        this.d = c12274zu;
        this.e = context;
        if (c4620dd0.b == null) {
            c4620dd0.a.a(new C1575Md0(this));
        }
        Runnable runnable = new Runnable() { // from class: Kd0
            @Override // java.lang.Runnable
            public final void run() {
                C1705Nd0 c1705Nd0 = C1705Nd0.this;
                C4620dd0 c4620dd02 = c1705Nd0.a;
                int i = c4620dd02.c;
                PC pc2 = c1705Nd0.b;
                if (i != 2) {
                    c1705Nd0.c.a(pc2);
                } else if (pc2.a() == 3 && NetworkChangeNotifier.b()) {
                    c4620dd02.b.D();
                }
            }
        };
        if (c4620dd0.b != null) {
            runnable.run();
        } else {
            this.f = runnable;
        }
    }

    public final boolean a(final PC pc) {
        Intent p = pc.p();
        CustomTabsSessionToken u = pc.u();
        In4 F = pc.F();
        if (F != null) {
            if (!F.n) {
                return false;
            }
        } else if (u == null || !u.equals(this.b.u())) {
            p.setFlags((p.getFlags() & (-603979777)) | 268435456);
            this.e.startActivity(p);
            return false;
        }
        if (this.d.a.k0.x(p, true)) {
            return false;
        }
        Runnable runnable = new Runnable() { // from class: Ld0
            @Override // java.lang.Runnable
            public final void run() {
                C1705Nd0.this.c.b(pc);
            }
        };
        if (this.a.b != null) {
            runnable.run();
        } else {
            this.f = runnable;
        }
        return true;
    }
}
