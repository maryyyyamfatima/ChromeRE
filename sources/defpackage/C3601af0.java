package defpackage;

import J.N;
import android.os.SystemClock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: af0 */
/* loaded from: classes.dex */
public final class C3601af0 implements InterfaceC6377ij3 {
    public final C2090Qc0 a;
    public final InterfaceC7913nB g;
    public final PC h;
    public final String i;
    public long j;
    public int k;

    public C3601af0(I5 i5, C2090Qc0 c2090Qc0, C1181Jc0 c1181Jc0, PC pc) {
        i5.b(this);
        this.a = c2090Qc0;
        this.g = c1181Jc0;
        this.h = pc;
        this.i = pc.g();
    }

    @Override // defpackage.InterfaceC6377ij3
    public final void f() {
        this.j = SystemClock.elapsedRealtime();
        this.k = 2;
    }

    @Override // defpackage.InterfaceC6377ij3
    public final void g() {
        EI2.h(this.k, 3, "CustomTabs.CloseCause");
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.j;
        int i = this.k;
        InterfaceC7913nB interfaceC7913nB = this.g;
        if (i == 2 && interfaceC7913nB.a()) {
            EI2.j(elapsedRealtime, "CustomTabs.AutoclosedSessionDuration");
        }
        if (interfaceC7913nB.a()) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            boolean z = this.k != 2;
            boolean H = this.h.H();
            long min = Math.min(elapsedRealtime / 1000, 300L);
            String str = this.i;
            if (str == null) {
                str = "";
            }
            N.MGdXu4nu(currentTimeMillis, str, min, z, H);
        }
        this.j = 0L;
    }
}
