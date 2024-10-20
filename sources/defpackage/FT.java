package defpackage;

import J.N;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FT {
    public final IT a;
    public final InterfaceC0209Bp3 b;
    public final WT c;
    public boolean d;
    public MU e;
    public ArrayList f;
    public ArrayList g;
    public final boolean h;
    public final String i;
    public String j;
    public int k;

    public final void a(int[] iArr) {
        if (this.a.d.equals(EnumC1717Nf2.j)) {
            throw new IllegalArgumentException("addExperimentIds forbidden on deidentified logger");
        }
        if (iArr == null || iArr.length == 0) {
            return;
        }
        if (this.g == null) {
            this.g = new ArrayList();
        }
        for (int i : iArr) {
            this.g.add(Integer.valueOf(i));
        }
    }

    public FT(IT it, CT ct) {
        WT wt = (WT) YT.C.j();
        this.c = wt;
        this.d = false;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = true;
        this.a = it;
        this.j = it.i;
        this.i = it.j;
        this.k = it.l;
        ((C9808sj0) it.f).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (wt.h) {
            wt.l();
            wt.h = false;
        }
        YT yt = (YT) wt.g;
        yt.k |= 1;
        yt.l = currentTimeMillis;
        it.k.getClass();
        long offset = TimeZone.getDefault().getOffset(currentTimeMillis) / 1000;
        if (wt.h) {
            wt.l();
            wt.h = false;
        }
        YT yt2 = (YT) wt.g;
        yt2.k |= 65536;
        yt2.w = offset;
        if (AbstractC6404io0.b() && !AbstractC6404io0.a(it.b)) {
            if (wt.h) {
                wt.l();
                wt.h = false;
            }
            YT yt3 = (YT) wt.g;
            yt3.k |= 8388608;
            yt3.z = true;
        }
        if (SystemClock.elapsedRealtime() != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (wt.h) {
                wt.l();
                wt.h = false;
            }
            YT yt4 = (YT) wt.g;
            yt4.k |= 2;
            yt4.m = elapsedRealtime;
        }
        this.b = ct;
    }

    public final NT c() {
        if (this.d) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.d = true;
        OT ot = (OT) this.a.a;
        ot.getClass();
        NT nt = new NT(ot, this, ot.h);
        ot.c(2, nt);
        return nt;
    }

    public final FT b() {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((NJ0) ((C6966kS) it.next()).a).getClass();
            a(!ThreadUtils.h() ? new int[0] : N.MSnK4vdU());
        }
        Iterator it2 = IT.o.iterator();
        while (it2.hasNext()) {
            ((NJ0) ((C6966kS) it2.next()).a).getClass();
            a(!ThreadUtils.h() ? new int[0] : N.MSnK4vdU());
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClearcutLogger.LogEventBuilder[uploadAccount: ");
        sb.append(this.i);
        sb.append(", logSourceName: ");
        sb.append(this.j);
        sb.append(", qosTier: ");
        sb.append(AbstractC2373Sg3.b(this.k));
        sb.append(", SourceExtensionByteStringProvider: ");
        sb.append(this.b);
        sb.append(", veMessage: ");
        sb.append(this.e);
        sb.append(", testCodes: null, mendelPackages: ");
        ArrayList arrayList = this.f;
        sb.append(arrayList != null ? new C1007Ht1(", ").b(arrayList) : null);
        sb.append(", experimentIds: ");
        ArrayList arrayList2 = this.g;
        sb.append(arrayList2 != null ? new C1007Ht1(", ").b(arrayList2) : null);
        sb.append(", experimentTokens: null, experimentTokensBytes: null, addPhenotype: ");
        sb.append(this.h);
        sb.append(", logVerifier: null]");
        return sb.toString();
    }
}
