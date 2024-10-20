package defpackage;

import android.content.Intent;
import androidx.browser.customtabs.CustomTabsSessionToken;
import java.util.Arrays;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1441Lc0 implements InterfaceC6377ij3 {
    public final CustomTabsConnection a;
    public final PC g;
    public final C4620dd0 h;
    public boolean i;

    public C1441Lc0(CustomTabsConnection customTabsConnection, PC pc, I5 i5, C4620dd0 c4620dd0) {
        this.a = customTabsConnection;
        this.g = pc;
        this.h = c4620dd0;
        i5.b(this);
    }

    @Override // defpackage.InterfaceC6377ij3
    public final void f() {
        boolean z;
        CustomTabsConnection customTabsConnection = this.a;
        CustomTabsSessionToken u = this.g.u();
        Intent q = this.g.q();
        EU eu = customTabsConnection.c;
        synchronized (eu) {
            z = false;
            if (q != null) {
                if (q.getComponent() != null) {
                    DU du = (DU) eu.c.get(u);
                    if (du != null) {
                        BU bu = du.o;
                        if (bu == null) {
                            if (Arrays.asList(V60.a.getPackageManager().getPackagesForUid(du.a)).contains(q.getComponent().getPackageName())) {
                                bu = new BU(V60.a, new Intent().setComponent(q.getComponent()));
                            }
                        }
                        if (bu.i) {
                            z = true;
                        } else if (!bu.h) {
                            try {
                                boolean bindService = bu.a.bindService(bu.g, bu, 1);
                                bu.i = bindService;
                                z = bindService;
                            } catch (SecurityException unused) {
                            }
                        }
                        if (z) {
                            du.o = bu;
                        }
                    }
                }
            }
        }
        this.i = z;
    }

    @Override // defpackage.InterfaceC6377ij3
    public final void g() {
        CustomTabsConnection customTabsConnection = this.a;
        CustomTabsSessionToken u = this.g.u();
        EU eu = customTabsConnection.c;
        synchronized (eu) {
            DU du = (DU) eu.c.get(u);
            if (du != null) {
                BU bu = du.o;
                if (bu != null && bu.i) {
                    bu.a.unbindService(bu);
                    bu.i = false;
                }
            }
        }
        this.i = false;
    }
}
