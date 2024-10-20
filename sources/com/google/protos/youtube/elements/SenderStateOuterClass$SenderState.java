package com.google.protos.youtube.elements;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.C1127Ir1;
import defpackage.C6827k14;
import defpackage.C7931nE2;
import defpackage.DV;
import defpackage.EV;
import defpackage.K33;
import defpackage.KX0;
import defpackage.MX0;
import defpackage.PX0;
import defpackage.QW2;
import defpackage.QX0;
import defpackage.XF0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SenderStateOuterClass$SenderState extends MX0 {
    public static final SenderStateOuterClass$SenderState l;
    public static volatile KX0 m;
    public byte k = 2;

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = (byte) (obj != null ? 1 : 0);
                return null;
            case 2:
                return QX0.s(l, "\u0001\u0000", new Object[0]);
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new SenderStateOuterClass$SenderState();
            case 4:
                return new K33(0);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return l;
            case 6:
                KX0 kx0 = m;
                if (kx0 == null) {
                    synchronized (SenderStateOuterClass$SenderState.class) {
                        kx0 = m;
                        if (kx0 == null) {
                            kx0 = new KX0(l);
                            m = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = new SenderStateOuterClass$SenderState();
        l = senderStateOuterClass$SenderState;
        QX0.u(SenderStateOuterClass$SenderState.class, senderStateOuterClass$SenderState);
    }

    public static SenderStateOuterClass$SenderState parseFrom(ByteBuffer byteBuffer) {
        XF0 c = XF0.c();
        DV h = DV.h(byteBuffer, false);
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = new SenderStateOuterClass$SenderState();
        try {
            C7931nE2 c7931nE2 = C7931nE2.c;
            c7931nE2.getClass();
            QW2 b = c7931nE2.b(senderStateOuterClass$SenderState.getClass());
            EV ev = h.d;
            if (ev == null) {
                ev = new EV(h);
            }
            b.e(senderStateOuterClass$SenderState, ev, c);
            b.b(senderStateOuterClass$SenderState);
            QX0.i(senderStateOuterClass$SenderState);
            QX0.i(senderStateOuterClass$SenderState);
            return senderStateOuterClass$SenderState;
        } catch (C1127Ir1 e) {
            if (e.g) {
                throw new C1127Ir1(e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof C1127Ir1) {
                throw ((C1127Ir1) e2.getCause());
            }
            throw new C1127Ir1(e2);
        } catch (C6827k14 e3) {
            throw e3.a();
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof C1127Ir1) {
                throw ((C1127Ir1) e4.getCause());
            }
            throw e4;
        }
    }
}
