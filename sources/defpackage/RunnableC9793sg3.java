package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.io.Closeable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sg3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC9793sg3 implements Runnable, Closeable {
    public LT3 a;
    public LT3 g;
    public final boolean h = HK3.a();
    public boolean i;
    public boolean j;

    public RunnableC9793sg3(LT3 lt3) {
        this.a = lt3;
        this.g = lt3;
    }

    public final void b(RD1 rd1) {
        if (this.i) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (this.j) {
            throw new IllegalStateException("Signal is already attached to future");
        }
        this.j = true;
        rd1.f(this, EnumC6747jo0.a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (this.i || !(z = this.j)) {
            Runnable runnable = new Runnable() { // from class: rg3
                @Override // java.lang.Runnable
                public final void run() {
                    throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
                }
            };
            if (HK3.b == null) {
                HK3.b = new Handler(Looper.getMainLooper());
            }
            HK3.b.post(runnable);
            return;
        }
        this.i = true;
        LT3 lt3 = this.a;
        if (this.h && !z) {
            HK3.a();
        }
        lt3.A0();
        this.a = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        LT3 lt3 = this.g;
        this.g = null;
        try {
            boolean z = this.j;
            if (!z) {
                if (this.i) {
                    throw new IllegalStateException("Span was already closed!");
                }
                this.i = true;
                LT3 lt32 = this.a;
                if (this.h && !z) {
                    HK3.a();
                }
                lt32.A0();
                this.a = null;
            }
        } finally {
            AbstractC6294iU3.c(lt3);
        }
    }
}
