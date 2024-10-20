package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.TimerTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tO1 */
/* loaded from: classes.dex */
public final class C10038tO1 extends TimerTask {
    public final /* synthetic */ C11067wO1 a;

    public C10038tO1(C11067wO1 c11067wO1) {
        this.a = c11067wO1;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        BasePendingResult basePendingResult;
        final C11067wO1 c11067wO1 = this.a;
        ArrayDeque arrayDeque = c11067wO1.h;
        if (arrayDeque.isEmpty() || c11067wO1.k != null || c11067wO1.b == 0) {
            return;
        }
        int[] f = WH.f(arrayDeque);
        KM2 km2 = c11067wO1.c;
        if (!km2.h()) {
            basePendingResult = KM2.f();
        } else {
            C9686sM2 c9686sM2 = new C9686sM2(km2, f);
            KM2.b(c9686sM2);
            basePendingResult = c9686sM2;
        }
        c11067wO1.k = basePendingResult;
        basePendingResult.l(new RP2() { // from class: rO1
            @Override // defpackage.RP2
            public final void c(QP2 qp2) {
                C11067wO1 c11067wO12 = C11067wO1.this;
                c11067wO12.getClass();
                Status S0 = ((HM2) qp2).S0();
                int i = S0.g;
                if (i != 0) {
                    c11067wO12.a.g(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", Integer.valueOf(i), S0.h), new Object[0]);
                }
                c11067wO12.k = null;
                if (c11067wO12.h.isEmpty()) {
                    return;
                }
                HandlerC10413uU3 handlerC10413uU3 = c11067wO12.i;
                C10038tO1 c10038tO1 = c11067wO12.j;
                handlerC10413uU3.removeCallbacks(c10038tO1);
                handlerC10413uU3.postDelayed(c10038tO1, 500L);
            }
        });
        arrayDeque.clear();
    }
}
