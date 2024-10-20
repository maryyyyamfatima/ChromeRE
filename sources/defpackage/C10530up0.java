package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: up0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10530up0 implements InterfaceC4691dp0 {
    public final File b;
    public final long c;
    public C9844sp0 e;
    public final C7441lp0 d = new C7441lp0();
    public final LT2 a = new LT2();

    public C10530up0(File file, long j) {
        this.b = file;
        this.c = j;
    }

    @Override // defpackage.InterfaceC4691dp0
    public final File b(InterfaceC6098hu1 interfaceC6098hu1) {
        C9844sp0 c9844sp0;
        String a = this.a.a(interfaceC6098hu1);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            String.valueOf(interfaceC6098hu1);
        }
        try {
            synchronized (this) {
                if (this.e == null) {
                    this.e = C9844sp0.k(this.b, this.c);
                }
                c9844sp0 = this.e;
            }
            C9501rp0 i = c9844sp0.i(a);
            if (i != null) {
                return i.a[0];
            }
        } catch (IOException e) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC4691dp0
    public final void a(InterfaceC6098hu1 interfaceC6098hu1, C1845Of0 c1845Of0) {
        C6753jp0 c6753jp0;
        C9844sp0 c9844sp0;
        boolean z;
        String a = this.a.a(interfaceC6098hu1);
        C7441lp0 c7441lp0 = this.d;
        synchronized (c7441lp0) {
            c6753jp0 = (C6753jp0) c7441lp0.a.get(a);
            if (c6753jp0 == null) {
                C7097kp0 c7097kp0 = c7441lp0.b;
                synchronized (c7097kp0.a) {
                    c6753jp0 = (C6753jp0) c7097kp0.a.poll();
                }
                if (c6753jp0 == null) {
                    c6753jp0 = new C6753jp0();
                }
                c7441lp0.a.put(a, c6753jp0);
            }
            c6753jp0.b++;
        }
        c6753jp0.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                String.valueOf(interfaceC6098hu1);
            }
            try {
                synchronized (this) {
                    if (this.e == null) {
                        this.e = C9844sp0.k(this.b, this.c);
                    }
                    c9844sp0 = this.e;
                }
                if (c9844sp0.i(a) == null) {
                    C8816pp0 f = c9844sp0.f(a);
                    if (f == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(a));
                    }
                    try {
                        if (c1845Of0.a.a(c1845Of0.b, f.b(), c1845Of0.c)) {
                            C9844sp0.b(f.d, f, true);
                            f.c = true;
                        }
                        if (!z) {
                            try {
                                f.a();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!f.c) {
                            try {
                                f.a();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.d.a(a);
        }
    }
}
