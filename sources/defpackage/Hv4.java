package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class Hv4 implements Runnable {
    public final AH0 a;
    public final List g;
    public final List h;
    public final List i;
    public final long j;
    public final /* synthetic */ int k = 1;

    public Hv4(AH0 ah0, long j, ArrayList arrayList, ArrayList arrayList2, List list) {
        this.a = ah0;
        this.j = j;
        this.g = arrayList;
        this.h = arrayList2;
        this.i = list;
    }

    public Hv4(AH0 ah0, List list, List list2, List list3, long j) {
        this.a = ah0;
        this.g = list;
        this.h = list2;
        this.i = list3;
        this.j = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.k;
        AH0 ah0 = this.a;
        if (i == 0) {
            List list = this.g;
            List list2 = this.h;
            List list3 = this.i;
            long j = this.j;
            if (ah0.m.get()) {
                ah0.i(6, -6, null, null, null, null, null);
                return;
            }
            ah0.h.getClass();
            if (((InterfaceC11942yv4) EnumC7143kw4.g.get()) != null) {
                ah0.k(list, list2, list3, j, false);
                return;
            }
            ah0.k.addAll(list2);
            ah0.l.addAll(list3);
            Long valueOf = Long.valueOf(j);
            ah0.i(5, 0, null, valueOf, valueOf, null, null);
            return;
        }
        long j2 = this.j;
        List list4 = this.g;
        List list5 = this.h;
        List list6 = this.i;
        ah0.getClass();
        long j3 = j2 / 3;
        long j4 = 0;
        int i2 = 0;
        while (i2 < 3) {
            long min = Math.min(j2, j4 + j3);
            int i3 = i2;
            ah0.i(2, 0, null, Long.valueOf(min), Long.valueOf(j2), null, null);
            SystemClock.sleep(AH0.n);
            int i4 = ((Zs4) ah0.j.get()).b;
            if (i4 == 9 || i4 == 7 || i4 == 6) {
                return;
            }
            i2 = i3 + 1;
            j4 = min;
        }
        ah0.g.execute(new Hv4(ah0, list4, list5, list6, j2));
    }
}
