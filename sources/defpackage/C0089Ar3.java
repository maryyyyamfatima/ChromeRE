package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ar3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0089Ar3 {
    public final /* synthetic */ C0219Br3 a;

    public C0089Ar3(C0219Br3 c0219Br3) {
        this.a = c0219Br3;
    }

    public final void b() {
        AtomicBoolean atomicBoolean = C0219Br3.j;
        synchronized (atomicBoolean) {
            atomicBoolean.set(true);
        }
        C0219Br3 c0219Br3 = this.a;
        InterfaceC4064bz2 interfaceC4064bz2 = c0219Br3.a;
        if (interfaceC4064bz2 != null) {
            c0219Br3.b.a();
            C9601s61 c9601s61 = (C9601s61) interfaceC4064bz2;
            AbstractC4851eH1.d("HatsNextController", "Last time survey with ID %s was requested: %s.", c9601s61.a, Long.valueOf(SystemClock.currentThreadTimeMillis()));
            c9601s61.b.setVisibility(0);
            C9944t61 c9944t61 = c9601s61.d;
            c9944t61.getClass();
            C9944t61.e(0);
            I5 i5 = c9601s61.c;
            if (i5 != null) {
                c9944t61.f = i5;
                C9258r61 c9258r61 = new C9258r61();
                c9944t61.g = c9258r61;
                i5.b(c9258r61);
            }
        }
    }

    public final void a() {
        AtomicBoolean atomicBoolean = C0219Br3.j;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                Log.e("SurveyController", "Notified that survey was destroyed when it wasn't marked as running.");
            }
            atomicBoolean.set(false);
        }
        C0219Br3 c0219Br3 = this.a;
        c0219Br3.f.getClass();
        c0219Br3.h = System.currentTimeMillis();
        InterfaceC4064bz2 interfaceC4064bz2 = c0219Br3.a;
        if (interfaceC4064bz2 != null) {
            c0219Br3.b.a();
            C9601s61 c9601s61 = (C9601s61) interfaceC4064bz2;
            AbstractC4851eH1.d("HatsNextController", "Last time survey with ID %s was closed: %s.", c9601s61.a, Long.valueOf(SystemClock.currentThreadTimeMillis()));
            c9601s61.b.setVisibility(8);
            C9944t61 c9944t61 = c9601s61.d;
            c9944t61.f.c(c9944t61.g);
        }
    }
}
