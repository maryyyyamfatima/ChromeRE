package defpackage;

import J.N;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcel;
import android.util.LongSparseArray;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.chromium.base.TraceEvent;
import org.chromium.components.safe_browsing.SafeBrowsingApiBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4732dw implements InterfaceC10407uT2 {
    public static final long g = TimeUnit.SECONDS.toMillis(30);
    public C10064tT2 a;
    public final LongSparseArray b = new LongSparseArray();
    public HandlerThread c;
    public Handler d;
    public ExecutorC4389cw e;
    public boolean f;

    public final boolean b(C10064tT2 c10064tT2) {
        C4502dG0 c4502dG0 = C4502dG0.b;
        U44 u44 = new U44();
        c4502dG0.getClass();
        if (!C4502dG0.c(u44)) {
            AbstractC4851eH1.f("SafeBrowsingApi", "First party Google Play services not available, Safe Browsing disabled.", new Object[0]);
            return false;
        }
        this.a = c10064tT2;
        HandlerThread handlerThread = new HandlerThread("SAFE_BROWSING_UTIL_THREAD");
        this.c = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.c.getLooper());
        this.d = handler;
        this.e = new ExecutorC4389cw(handler);
        if (AX.e().g("danger-disable-safebrowsing-for-benchmarking")) {
            AbstractC4851eH1.f("SafeBrowsingApi", "Danger! SafeBrowsing is disabled!", new Object[0]);
            this.f = true;
        }
        this.d.post(new RunnableC2964Wv(this));
        return true;
    }

    public static void a(AbstractC4732dw abstractC4732dw) {
        abstractC4732dw.getClass();
        final JU2 ju2 = new JU2(V60.a);
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.d = 4202;
        c5531gF3.a = new InterfaceC5565gM2() { // from class: HU2
            @Override // defpackage.InterfaceC5565gM2
            public final void accept(Object obj, Object obj2) {
                JU2.this.getClass();
                IU2 iu2 = new IU2((C6905kF3) obj2);
                C4976ef1 c4976ef1 = (C4976ef1) ((InterfaceC5664gf1) ((KU2) obj).m());
                Parcel a = c4976ef1.a();
                AbstractC11786yV.c(a, iu2);
                c4976ef1.h(12, a);
            }
        };
        ju2.b(0, c5531gF3.a());
        abstractC4732dw.d.postDelayed(new RunnableC2964Wv(abstractC4732dw), g);
    }

    public static void c(C4046bw c4046bw, int i, long j) {
        long j2 = j - c4046bw.b;
        C10064tT2 c10064tT2 = c4046bw.c;
        long j3 = c4046bw.a;
        long j4 = j2 / 1000;
        c10064tT2.getClass();
        synchronized (SafeBrowsingApiBridge.a) {
            C6852k6 c6852k6 = SafeBrowsingApiBridge.d;
            if (c6852k6 != null) {
                c6852k6.a.l.compareAndSet(0L, j4);
                TraceEvent.h("FirstSafeBrowsingResponse", String.valueOf(j4));
                SafeBrowsingApiBridge.d = null;
            }
            N.M3tDaVsh(j3, i, "{}", j4);
        }
    }

    public final boolean d(String str, int i) {
        ArrayList arrayList = AbstractC9721sT2.a;
        try {
            URI uri = new URI(str);
            ArrayList arrayList2 = new ArrayList();
            if (i == 16) {
                arrayList2 = new ArrayList(AbstractC9721sT2.a);
            } else if (i == 17) {
                arrayList2 = new ArrayList(AbstractC9721sT2.b);
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (C9378rT2.a((C9378rT2) it.next(), uri)) {
                    return true;
                }
            }
        } catch (URISyntaxException unused) {
        }
        return false;
    }
}
