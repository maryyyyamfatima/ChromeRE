package defpackage;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.Objects;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WE1 implements InterfaceC3906bY1, XX1 {
    public final Handler a;
    public final InterfaceC7697ma2 g;
    public ZX1 i;
    public PropertyModel j;
    public long k;
    public final C12157za2 h = new C12157za2();
    public int l = 0;

    @Override // defpackage.XX1
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.XX1
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        this.l = 4;
        this.i.c(2, this.j);
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        this.i.h(this);
        this.a.removeCallbacksAndMessages(null);
        int i2 = i != 13 ? i != 15 ? 4 : 5 : 3;
        this.l = i2;
        C12157za2 c12157za2 = this.h;
        if (i2 == 4 || i2 == 5) {
            Iterator it = c12157za2.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    break;
                } else {
                    AbstractC0193Bm2.h(this.l, ((C0063Am2) c11814ya2.next()).a);
                }
            }
        }
        c12157za2.clear();
    }

    @Override // defpackage.XX1
    public final void d(PropertyModel propertyModel) {
        if (propertyModel != this.j) {
            return;
        }
        this.l = 2;
        this.k = SystemClock.elapsedRealtime();
        Runnable runnable = new Runnable() { // from class: TE1
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                WE1 we1 = WE1.this;
                Iterator it = we1.h.iterator();
                while (true) {
                    C11814ya2 c11814ya2 = (C11814ya2) it;
                    if (!c11814ya2.hasNext()) {
                        break;
                    }
                    C0063Am2 c0063Am2 = (C0063Am2) c11814ya2.next();
                    AbstractC0193Bm2.h(c0063Am2.b, c0063Am2.a);
                    try {
                        c0063Am2.c.send();
                        z = true;
                    } catch (PendingIntent.CanceledException unused) {
                        z = false;
                    }
                    EI2.b(c0063Am2.d, z);
                    Handler handler = new Handler(Looper.getMainLooper());
                    SE1 se1 = c0063Am2.e;
                    Objects.requireNonNull(se1);
                    handler.postDelayed(new RunnableC10857vm2(se1), 300L);
                }
                if (we1.l == 3) {
                    we1.i.c(13, we1.j);
                }
            }
        };
        Handler handler = this.a;
        handler.postDelayed(runnable, 500L);
        handler.postDelayed(new Runnable() { // from class: UE1
            @Override // java.lang.Runnable
            public final void run() {
                WE1 we1 = WE1.this;
                if (we1.l != 2) {
                    return;
                }
                we1.l = 5;
                we1.i.c(15, we1.j);
            }
        }, 4500L);
    }

    public WE1(InterfaceC7697ma2 interfaceC7697ma2, Handler handler) {
        this.g = interfaceC7697ma2;
        this.a = handler;
    }

    public final boolean e() {
        int i = this.l;
        if (i == 0) {
            return false;
        }
        if (i != 1) {
            if (i == 2 || i == 3) {
                return SystemClock.elapsedRealtime() - this.k >= 500;
            }
            if (i != 4 && i != 5) {
                throw new AssertionError();
            }
        }
        return true;
    }
}
