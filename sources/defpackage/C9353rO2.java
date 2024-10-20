package defpackage;

import android.os.Looper;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rO2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9353rO2 {
    public static final C4856eI1 f = new C4856eI1("RequestTracker");
    public static final Object g = new Object();
    public final long a;
    public InterfaceC3857bO2 d;
    public RunnableC9011qO2 e;
    public long c = -1;
    public final HandlerC10413uU3 b = new HandlerC10413uU3(Looper.getMainLooper());

    public C9353rO2(long j) {
        this.a = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [qO2, java.lang.Runnable] */
    public final void d(long j, InterfaceC3857bO2 interfaceC3857bO2) {
        InterfaceC3857bO2 interfaceC3857bO22;
        long j2;
        Object obj = g;
        synchronized (obj) {
            interfaceC3857bO22 = this.d;
            j2 = this.c;
            this.c = j;
            this.d = interfaceC3857bO2;
        }
        if (interfaceC3857bO22 != null) {
            interfaceC3857bO22.b(j2);
        }
        synchronized (obj) {
            RunnableC9011qO2 runnableC9011qO2 = this.e;
            if (runnableC9011qO2 != null) {
                this.b.removeCallbacks(runnableC9011qO2);
            }
            ?? r5 = new Runnable() { // from class: qO2
                @Override // java.lang.Runnable
                public final void run() {
                    C9353rO2 c9353rO2 = C9353rO2.this;
                    c9353rO2.getClass();
                    synchronized (C9353rO2.g) {
                        if (c9353rO2.c == -1) {
                            return;
                        }
                        c9353rO2.a(15);
                    }
                }
            };
            this.e = r5;
            this.b.postDelayed(r5, this.a);
        }
    }

    public final boolean e(long j) {
        boolean z;
        synchronized (g) {
            long j2 = this.c;
            z = j2 != -1 && j2 == j;
        }
        return z;
    }

    public final boolean b(long j, int i, C5913hN1 c5913hN1) {
        synchronized (g) {
            long j2 = this.c;
            if (j2 == -1 || j2 != j) {
                return false;
            }
            c(c5913hN1, i, String.format(Locale.ROOT, "request %d completed", Long.valueOf(j)));
            return true;
        }
    }

    public final void a(int i) {
        synchronized (g) {
            long j = this.c;
            if (j != -1) {
                c(null, i, String.format(Locale.ROOT, "clearing request %d", Long.valueOf(j)));
            }
        }
    }

    public final void c(C5913hN1 c5913hN1, int i, String str) {
        f.a(str, new Object[0]);
        Object obj = g;
        synchronized (obj) {
            InterfaceC3857bO2 interfaceC3857bO2 = this.d;
            if (interfaceC3857bO2 != null) {
                interfaceC3857bO2.a(this.c, i, c5913hN1);
            }
            this.c = -1L;
            this.d = null;
            synchronized (obj) {
                RunnableC9011qO2 runnableC9011qO2 = this.e;
                if (runnableC9011qO2 != null) {
                    this.b.removeCallbacks(runnableC9011qO2);
                    this.e = null;
                }
            }
        }
    }
}
