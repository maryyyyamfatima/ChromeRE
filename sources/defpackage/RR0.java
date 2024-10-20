package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.nio.MappedByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RR0 implements InterfaceC6811jz0 {
    public final Context a;
    public final LR0 b;
    public final NR0 c;
    public final Object d;
    public Handler e;
    public HandlerThread f;
    public MR0 g;
    public C4406cz0 h;
    public PR0 i;
    public QR0 j;

    public RR0(Context context, LR0 lr0) {
        NR0 nr0 = SR0.d;
        this.d = new Object();
        this.a = context.getApplicationContext();
        this.b = lr0;
        this.c = nr0;
    }

    public final void c(C4406cz0 c4406cz0) {
        synchronized (this.d) {
            if (this.e == null) {
                HandlerThread handlerThread = new HandlerThread("emojiCompat", 10);
                this.f = handlerThread;
                handlerThread.start();
                this.e = new Handler(this.f.getLooper());
            }
            this.e.post(new OR0(this, c4406cz0));
        }
    }

    public final C5249fS0 d() {
        try {
            NR0 nr0 = this.c;
            Context context = this.a;
            LR0 lr0 = this.b;
            nr0.getClass();
            C4905eS0 a = JR0.a(context, lr0);
            int i = a.a;
            if (i != 0) {
                throw new RuntimeException(AbstractC9307rF1.a("fetchFonts failed (", i, ")"));
            }
            C5249fS0[] c5249fS0Arr = a.b;
            if (c5249fS0Arr == null || c5249fS0Arr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c5249fS0Arr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    public final void e(Uri uri, long j) {
        synchronized (this.d) {
            if (this.i == null) {
                PR0 pr0 = new PR0(this, this.e);
                this.i = pr0;
                NR0 nr0 = this.c;
                Context context = this.a;
                nr0.getClass();
                context.getContentResolver().registerContentObserver(uri, false, pr0);
            }
            if (this.j == null) {
                this.j = new QR0(this);
            }
            this.e.postDelayed(this.j, j);
        }
    }

    public final void a() {
        this.h = null;
        PR0 pr0 = this.i;
        if (pr0 != null) {
            NR0 nr0 = this.c;
            Context context = this.a;
            nr0.getClass();
            context.getContentResolver().unregisterContentObserver(pr0);
            this.i = null;
        }
        synchronized (this.d) {
            this.e.removeCallbacks(this.j);
            HandlerThread handlerThread = this.f;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            this.e = null;
            this.f = null;
        }
    }

    public final void b() {
        long min;
        if (this.h == null) {
            return;
        }
        try {
            C5249fS0 d = d();
            int i = d.e;
            if (i == 2) {
                synchronized (this.d) {
                    MR0 mr0 = this.g;
                    if (mr0 != null) {
                        if (mr0.a == 0) {
                            mr0.a = SystemClock.uptimeMillis();
                            min = 0;
                        } else {
                            long uptimeMillis = SystemClock.uptimeMillis() - mr0.a;
                            min = uptimeMillis > 2000 ? -1L : Math.min(Math.max(uptimeMillis, 1000L), 2000 - uptimeMillis);
                        }
                        if (min >= 0) {
                            e(d.a, min);
                            return;
                        }
                    }
                }
            }
            if (i != 0) {
                throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
            }
            NR0 nr0 = this.c;
            Context context = this.a;
            nr0.getClass();
            Typeface b = AbstractC10095tZ3.a.b(context, new C5249fS0[]{d}, 0);
            MappedByteBuffer e = FZ3.e(this.a, d.a);
            if (e == null) {
                throw new RuntimeException("Unable to open file.");
            }
            this.h.a(VW1.a(b, e));
            a();
        } catch (Throwable th) {
            this.h.a.a.d(th);
            a();
        }
    }
}
