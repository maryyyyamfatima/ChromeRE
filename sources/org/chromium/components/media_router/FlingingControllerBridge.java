package org.chromium.components.media_router;

import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.C11058wM2;
import defpackage.C11401xM2;
import defpackage.C11744yM2;
import defpackage.C2533Tm3;
import defpackage.C3521aQ0;
import defpackage.C3865bQ0;
import defpackage.C6963kR1;
import defpackage.KM2;
import defpackage.QM2;
import defpackage.ZP0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class FlingingControllerBridge {
    public final ZP0 a;
    public long b;

    public FlingingControllerBridge(ZP0 zp0) {
        this.a = zp0;
    }

    public void play() {
        C3865bQ0 c3865bQ0 = (C3865bQ0) this.a;
        c3865bQ0.getClass();
        QM2 qm2 = c3865bQ0.b;
        if (qm2.g()) {
            if (!c3865bQ0.e) {
                c3865bQ0.c(0L);
            } else {
                qm2.e().n().l(new C3521aQ0(c3865bQ0));
            }
        }
    }

    public void pause() {
        C3865bQ0 c3865bQ0 = (C3865bQ0) this.a;
        c3865bQ0.getClass();
        QM2 qm2 = c3865bQ0.b;
        if (qm2.g()) {
            qm2.e().m().l(new C3521aQ0(c3865bQ0));
        }
    }

    public void setMute(boolean z) {
        BasePendingResult basePendingResult;
        C3865bQ0 c3865bQ0 = (C3865bQ0) this.a;
        c3865bQ0.getClass();
        QM2 qm2 = c3865bQ0.b;
        if (qm2.g()) {
            KM2 e = qm2.e();
            if (!e.h()) {
                basePendingResult = KM2.f();
            } else {
                C11744yM2 c11744yM2 = new C11744yM2(e, z);
                KM2.b(c11744yM2);
                basePendingResult = c11744yM2;
            }
            basePendingResult.l(new C3521aQ0(c3865bQ0));
        }
    }

    public void setVolume(float f) {
        BasePendingResult basePendingResult;
        C3865bQ0 c3865bQ0 = (C3865bQ0) this.a;
        c3865bQ0.getClass();
        double d = f;
        QM2 qm2 = c3865bQ0.b;
        if (qm2.g()) {
            KM2 e = qm2.e();
            if (!e.h()) {
                basePendingResult = KM2.f();
            } else {
                C11401xM2 c11401xM2 = new C11401xM2(e, d);
                KM2.b(c11401xM2);
                basePendingResult = c11401xM2;
            }
            basePendingResult.l(new C3521aQ0(c3865bQ0));
        }
    }

    public void seek(long j) {
        BasePendingResult basePendingResult;
        C3865bQ0 c3865bQ0 = (C3865bQ0) this.a;
        c3865bQ0.getClass();
        QM2 qm2 = c3865bQ0.b;
        if (qm2.g()) {
            if (!c3865bQ0.e) {
                c3865bQ0.c(j);
                return;
            }
            KM2 e = qm2.e();
            e.getClass();
            C6963kR1 c6963kR1 = new C6963kR1(j, 0, null);
            if (!e.h()) {
                basePendingResult = KM2.f();
            } else {
                C11058wM2 c11058wM2 = new C11058wM2(e, c6963kR1);
                KM2.b(c11058wM2);
                basePendingResult = c11058wM2;
            }
            basePendingResult.l(new C3521aQ0(c3865bQ0));
            C2533Tm3 c2533Tm3 = c3865bQ0.a;
            c2533Tm3.d = false;
            c2533Tm3.b = j;
            c2533Tm3.c = System.currentTimeMillis();
        }
    }

    public long getApproximateCurrentTime() {
        return ((C3865bQ0) this.a).b();
    }

    public void addNativeFlingingController(long j) {
        this.b = j;
        ((C3865bQ0) this.a).d = this;
    }

    public void clearNativeFlingingController() {
        ((C3865bQ0) this.a).d = null;
        this.b = 0L;
    }
}
