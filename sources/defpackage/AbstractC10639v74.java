package defpackage;

import com.airbnb.lottie.b;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v74 */
/* loaded from: classes.dex */
public abstract class AbstractC10639v74 {
    public static SenderStateOuterClass$SenderState a(SenderStateOuterClass$SenderState senderStateOuterClass$SenderState, C8394oc c8394oc) {
        K33 k33;
        if (senderStateOuterClass$SenderState == null) {
            k33 = (K33) SenderStateOuterClass$SenderState.l.j();
        } else {
            k33 = (K33) SenderStateOuterClass$SenderState.l.k(senderStateOuterClass$SenderState);
        }
        k33.p(C8394oc.o, c8394oc);
        return (SenderStateOuterClass$SenderState) k33.j();
    }

    public static C8394oc b(b bVar) {
        float f;
        C8050nc c8050nc = (C8050nc) C8394oc.m.j();
        SJ1 sj1 = bVar.m.h;
        boolean z = sj1 == null ? false : sj1.p;
        if (c8050nc.h) {
            c8050nc.l();
            c8050nc.h = false;
        }
        C8394oc c8394oc = (C8394oc) c8050nc.g;
        c8394oc.j |= 1;
        c8394oc.k = z;
        SJ1 sj12 = bVar.m.h;
        C8985qJ1 c8985qJ1 = sj12.o;
        if (c8985qJ1 == null) {
            f = 0.0f;
        } else {
            float f2 = sj12.k;
            float f3 = c8985qJ1.j;
            f = (f2 - f3) / (c8985qJ1.k - f3);
        }
        if (c8050nc.h) {
            c8050nc.l();
            c8050nc.h = false;
        }
        C8394oc c8394oc2 = (C8394oc) c8050nc.g;
        c8394oc2.j |= 2;
        c8394oc2.l = f;
        return (C8394oc) c8050nc.j();
    }
}
