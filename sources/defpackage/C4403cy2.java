package defpackage;

import android.content.IntentFilter;
import android.os.PowerManager;
import java.util.Iterator;
import org.chromium.base.ApplicationStatus;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cy2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4403cy2 {
    public static C4403cy2 e;
    public final C12157za2 a = new C12157za2();
    public final PowerManager b = (PowerManager) V60.a.getSystemService("power");
    public C4059by2 c;
    public boolean d;

    public C4403cy2() {
        b();
        a();
        ApplicationStatus.d(new InterfaceC11522xj() { // from class: ay2
            @Override // defpackage.InterfaceC11522xj
            public final void n(int i) {
                C4403cy2.this.a();
            }
        });
    }

    public final void a() {
        int stateForApplication = ApplicationStatus.getStateForApplication();
        if (stateForApplication == 1 || stateForApplication == 2) {
            if (this.c == null) {
                C4059by2 c4059by2 = new C4059by2(this);
                this.c = c4059by2;
                V60.a.registerReceiver(c4059by2, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
            }
            b();
            return;
        }
        C4059by2 c4059by22 = this.c;
        if (c4059by22 != null) {
            V60.a.unregisterReceiver(c4059by22);
            this.c = null;
        }
    }

    public final void b() {
        PowerManager powerManager = this.b;
        boolean z = powerManager != null && powerManager.isPowerSaveMode();
        if (z == this.d) {
            return;
        }
        this.d = z;
        Iterator it = this.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((Runnable) c11814ya2.next()).run();
            }
        }
    }
}
