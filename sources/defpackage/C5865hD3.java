package defpackage;

import android.os.SystemClock;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hD3 */
/* loaded from: classes.dex */
public final class C5865hD3 extends BA0 implements J44 {
    public static long j;
    public int a;
    public long g = -1;
    public long h = -1;
    public int i = 0;

    @Override // defpackage.J44
    public final /* synthetic */ void destroy() {
    }

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
    }

    public static void V0(int i, long j2, long j3) {
        if (i == 0) {
            EI2.h(1, 3, "Tab.RestoreResult");
            EI2.e((int) j2, "Tab.RestoreTime");
            EI2.e((int) j3, "Tab.PerceivedRestoreTime");
        } else if (i == -803 || i == -137 || i == -106) {
            EI2.h(2, 3, "Tab.RestoreResult");
        } else {
            EI2.h(0, 3, "Tab.RestoreResult");
        }
    }

    public C5865hD3(int i, TabImpl tabImpl) {
        System.currentTimeMillis();
        this.a = i;
        if (i == 0) {
            W0(1);
        } else if (i == 1 || i == 2 || i == 3) {
            W0(2);
        }
        tabImpl.v(this);
    }

    public final void W0(int i) {
        if (this.i == i) {
            return;
        }
        System.currentTimeMillis();
        int i2 = this.i;
        if (i2 == 0) {
            EI2.h(i, 4, "Tabs.StateTransfer.Target_Initial");
        } else if (i2 == 1) {
            EI2.h(i, 4, "Tabs.StateTransfer.Target_Active");
        } else if (i2 == 2) {
            EI2.h(i, 4, "Tabs.StateTransfer.Target_Inactive");
        }
        this.i = i;
    }

    @Override // defpackage.BA0
    public final void P0(int i, Tab tab) {
        long j2 = C1695Nb0.m(tab).s;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.g;
        if (j3 != -1 && i == 3) {
            EI2.e((int) (elapsedRealtime - j3), "Tab.SwitchedToForegroundAge");
        }
        long j4 = j + 1;
        j = j4;
        int i2 = 0;
        boolean z = j4 == 1;
        int i3 = this.a;
        boolean z2 = i3 == 3 && this.g == -1;
        if (this.h != -1 || z2) {
            if (this.g == -1) {
                if (z) {
                    i2 = 6;
                } else if (i3 == 2) {
                    i2 = 7;
                } else if (i3 == 3) {
                    i2 = 8;
                }
            }
            i2 = 1;
        }
        if (i == 3) {
            EI2.h(i2, 9, "Tab.StatusWhenSwitchedBackToForeground");
        }
        if (this.g == -1 && j2 > 0) {
            long currentTimeMillis = System.currentTimeMillis() - j2;
            if (z) {
                EI2.e((int) (currentTimeMillis / 60000), "Tabs.ForegroundTabAgeAtStartup");
            } else if (i == 3) {
                EI2.e((int) (currentTimeMillis / 60000), "Tab.AgeUponRestoreFromColdStart");
            }
        }
        this.g = elapsedRealtime;
        W0(1);
    }

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        if (i != 1) {
            W0(2);
        }
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        W0(4);
        tab.w(this);
    }

    @Override // defpackage.BA0
    public final void N0() {
        this.h = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.BA0
    public final void M0() {
        if (this.i == 1) {
            this.a = 0;
        } else {
            this.a = 1;
        }
    }

    @Override // defpackage.BA0
    public final void J0(Tab tab, GURL gurl) {
        long j2 = this.h;
        if (j2 != -1 && this.g >= j2) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            V0(0, elapsedRealtime - this.h, elapsedRealtime - this.g);
        }
        this.h = -1L;
    }

    @Override // defpackage.BA0
    public final void I0(int i, Tab tab) {
        long j2 = this.h;
        if (j2 != -1 && this.g >= j2) {
            V0(i, -1L, -1L);
        }
        this.h = -1L;
    }

    @Override // defpackage.BA0
    public final void q0(TabImpl tabImpl) {
        if (this.h != -1) {
            this.h = -1L;
        }
    }
}
