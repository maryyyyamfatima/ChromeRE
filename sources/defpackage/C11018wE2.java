package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wE2 */
/* loaded from: classes.dex */
public final class C11018wE2 extends AbstractC6471j {
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicLong d = new AtomicLong();
    public static final ConcurrentLinkedQueue e = new ConcurrentLinkedQueue();
    public volatile AbstractC6232iI1 b;

    public C11018wE2(String str) {
        super(str);
        String str2 = Build.FINGERPRINT;
        boolean z = true;
        boolean z2 = str2 == null || "robolectric".equals(str2);
        String str3 = Build.HARDWARE;
        boolean z3 = "goldfish".equals(str3) || "ranchu".equals(str3);
        String str4 = Build.TYPE;
        if (!"eng".equals(str4) && !"userdebug".equals(str4)) {
            z = false;
        }
        if (z2 || z3) {
            this.b = new C0789Gb3("", a(), true, false, Level.ALL, true, C0919Hb3.f, C0919Hb3.g);
            return;
        }
        if (!z) {
            this.b = null;
            return;
        }
        Level level = Level.ALL;
        this.b = new C0919Hb3("", a(), true, false, Level.OFF, C0919Hb3.f, C0919Hb3.g);
    }

    public static void e() {
        while (true) {
            C10675vE2 c10675vE2 = (C10675vE2) e.poll();
            if (c10675vE2 == null) {
                return;
            }
            d.getAndDecrement();
            AbstractC5118f31 abstractC5118f31 = (AbstractC5118f31) c10675vE2.b;
            C6569jH1 c6569jH1 = abstractC5118f31.c;
            boolean z = c6569jH1 != null && Boolean.TRUE.equals(c6569jH1.a(AbstractC6227iH1.e));
            AbstractC6232iI1 abstractC6232iI1 = c10675vE2.a;
            if (z || abstractC6232iI1.c(abstractC5118f31.a)) {
                abstractC6232iI1.d(abstractC5118f31);
            }
        }
    }

    @Override // defpackage.AbstractC6232iI1
    public final boolean c(Level level) {
        if (this.b != null) {
            return this.b.c(level);
        }
        return true;
    }

    @Override // defpackage.AbstractC6232iI1
    public final void d(InterfaceC6913kH1 interfaceC6913kH1) {
        if (this.b != null) {
            this.b.d(interfaceC6913kH1);
            return;
        }
        if (d.incrementAndGet() > 20) {
            e.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        e.offer(new C10675vE2(this, interfaceC6913kH1));
        if (this.b != null) {
            e();
        }
    }

    @Override // defpackage.AbstractC6471j, defpackage.AbstractC6232iI1
    public final void b(RuntimeException runtimeException, InterfaceC6913kH1 interfaceC6913kH1) {
        if (this.b != null) {
            this.b.b(runtimeException, interfaceC6913kH1);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
