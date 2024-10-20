package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gp0 */
/* loaded from: classes.dex */
public abstract class AbstractC0856Gp0 {
    public static final C2823Vs3 a = new C2823Vs3("UNDEFINED");
    public static final C2823Vs3 b = new C2823Vs3("REUSABLE_CLAIMED");

    public static final void a(InterfaceC8927q80 interfaceC8927q80, InterfaceC7670mV0 interfaceC7670mV0) {
        Object oz;
        C8546p14 c8546p14 = C8546p14.a;
        if (interfaceC8927q80 instanceof C0726Fp0) {
            C0726Fp0 c0726Fp0 = (C0726Fp0) interfaceC8927q80;
            Throwable a2 = PP2.a(c8546p14);
            boolean z = false;
            if (a2 == null) {
                oz = interfaceC7670mV0 != null ? new PZ(c8546p14, interfaceC7670mV0) : c8546p14;
            } else {
                oz = new OZ(false, a2);
            }
            InterfaceC8927q80 interfaceC8927q802 = c0726Fp0.j;
            c0726Fp0.getContext();
            L90 l90 = c0726Fp0.i;
            if (l90.C()) {
                c0726Fp0.k = oz;
                c0726Fp0.h = 1;
                l90.y(c0726Fp0.getContext(), c0726Fp0);
                return;
            }
            AbstractC8611pD0 a3 = AbstractC10706vK3.a();
            if (a3.h >= 4294967296L) {
                c0726Fp0.k = oz;
                c0726Fp0.h = 1;
                a3.I(c0726Fp0);
                return;
            }
            a3.O(true);
            try {
                InterfaceC10555ut1 interfaceC10555ut1 = (InterfaceC10555ut1) c0726Fp0.getContext().b(C10212tt1.a);
                if (interfaceC10555ut1 != null && !interfaceC10555ut1.c()) {
                    CancellationException i = interfaceC10555ut1.i();
                    c0726Fp0.a(oz, i);
                    c0726Fp0.d(SP2.a(i));
                    z = true;
                }
                if (!z) {
                    Object obj = c0726Fp0.l;
                    E90 context = interfaceC8927q802.getContext();
                    Object b2 = AbstractC9334rK3.b(context, obj);
                    if (b2 != AbstractC9334rK3.a) {
                        I90.b(interfaceC8927q802, context);
                    }
                    try {
                        interfaceC8927q802.d(c8546p14);
                        AbstractC9334rK3.a(context, b2);
                    } catch (Throwable th) {
                        AbstractC9334rK3.a(context, b2);
                        throw th;
                    }
                }
                do {
                } while (a3.P());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        interfaceC8927q80.d(c8546p14);
    }
}
