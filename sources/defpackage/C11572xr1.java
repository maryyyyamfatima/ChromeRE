package defpackage;

import android.util.Pair;
import com.google.android.libraries.elements.converters.intersectionobserver.IntersectionObserver;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xr1 */
/* loaded from: classes.dex */
public final class C11572xr1 implements InterfaceC9641sD2 {
    public static final AtomicInteger d = new AtomicInteger();
    public final AbstractC9896sy0 a;
    public final TL2 b;
    public final TL2 c;

    @Override // defpackage.InterfaceC9641sD2
    public final int b() {
        return 322066057;
    }

    @Override // defpackage.InterfaceC11013wD2
    public final /* synthetic */ void c(InterfaceC8177nx0 interfaceC8177nx0) {
    }

    @Override // defpackage.InterfaceC9641sD2
    public final AbstractC11362xE3 d(ByteBuffer byteBuffer) {
        C11229wr1 c11229wr1 = new C11229wr1();
        c11229wr1.c(byteBuffer.position() + TW1.a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        return c11229wr1;
    }

    @Override // defpackage.InterfaceC11013wD2
    public final void e(C7849n00 c7849n00, U80 u80, String str, Object obj, InterfaceC8177nx0 interfaceC8177nx0, C8367oX c8367oX) {
        IntersectionObserver intersectionObserver;
        C11229wr1 c11229wr1 = (C11229wr1) obj;
        C3184Yn c3184Yn = (C3184Yn) u80;
        AtomicReference atomicReference = c3184Yn.y;
        AbstractC9896sy0 abstractC9896sy0 = this.a;
        Throwable th = null;
        if (atomicReference == null) {
            abstractC9896sy0.d(EnumC11438xU.A, "scrollStrategyListenerHolder is unavailable", u80, null);
            return;
        }
        TF0 tf0 = new TF0();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int b = c11229wr1.b(4);
            if (i < (b != 0 ? c11229wr1.g(b) : 0)) {
                int b2 = c11229wr1.b(4);
                if (b2 != 0) {
                    tf0.c(c11229wr1.a((i * 4) + c11229wr1.e(b2)), c11229wr1.b);
                }
                if (tf0.k() == 1) {
                    InterfaceC10543ur1 interfaceC10543ur1 = (InterfaceC10543ur1) this.b.get(Integer.valueOf(tf0.j()));
                    if (interfaceC10543ur1 == null) {
                        throw new C10239ty0(AbstractC9076qb1.a("Unknown Flatbuffer extension: ", tf0.j()));
                    }
                    AbstractC11362xE3 c = interfaceC10543ur1.c(tf0);
                    C2794Vn a = AbstractC9053qX.a();
                    a.f = interfaceC8177nx0;
                    a.b(u80);
                    a.h = c3184Yn.v;
                    intersectionObserver = interfaceC10543ur1.d(c, a.a());
                } else {
                    if (tf0.k() == 2) {
                        Pair pair = (Pair) this.c.get(Integer.valueOf(tf0.j()));
                        if (pair != null) {
                            try {
                                X5.a(pair.first);
                                AbstractC5180fE1.a(tf0.f(6), (InterfaceC7751mj2) pair.second, XF0.d());
                                C2794Vn a2 = AbstractC9053qX.a();
                                a2.f = interfaceC8177nx0;
                                a2.b(u80);
                                a2.h = ((C3184Yn) u80).v;
                                a2.a();
                                throw th;
                            } catch (C1127Ir1 e) {
                                abstractC9896sy0.d(EnumC11438xU.y, AbstractC9076qb1.a("Failed to resolve Intersection Property Extension in IntersectionPropertiesConverter. Extension id: ", tf0.j()), u80, e);
                            }
                        }
                    }
                    intersectionObserver = null;
                }
                if (intersectionObserver != null) {
                    arrayList.add(intersectionObserver);
                }
                i++;
                th = null;
            } else {
                if (arrayList.isEmpty()) {
                    return;
                }
                C10200tr1 c10200tr1 = new C10200tr1(atomicReference, arrayList, "xr1" + d.incrementAndGet(), this.a, u80);
                interfaceC8177nx0.c(c10200tr1);
                interfaceC8177nx0.d(c10200tr1);
                interfaceC8177nx0.q(c10200tr1);
                return;
            }
        }
    }

    public C11572xr1(TL2 tl2, AbstractC9896sy0 abstractC9896sy0) {
        TL2 tl22 = TL2.l;
        this.a = abstractC9896sy0;
        C0822Gi1 c0822Gi1 = new C0822Gi1(4);
        C14 it = ((QL2) tl2.entrySet()).iterator();
        while (true) {
            AbstractC11277x abstractC11277x = (AbstractC11277x) it;
            if (!abstractC11277x.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) abstractC11277x.next();
            c0822Gi1.b(Integer.valueOf(((InterfaceC10543ur1) entry.getValue()).b()), (InterfaceC10543ur1) entry.getValue());
        }
        C0822Gi1 c0822Gi12 = new C0822Gi1(4);
        if (!tl22.isEmpty()) {
            AbstractC11277x abstractC11277x2 = (AbstractC11277x) ((QL2) tl22.entrySet()).iterator();
            if (abstractC11277x2.hasNext()) {
                X5.a(((Pair) ((Map.Entry) abstractC11277x2.next()).getValue()).first);
                throw null;
            }
        }
        this.b = c0822Gi1.a(true);
        this.c = c0822Gi12.a(true);
    }
}
