package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pr3 */
/* loaded from: classes.dex */
public final class C8831pr3 extends JX0 implements InterfaceC7327lV1 {
    public C8831pr3(int i) {
        super(C9174qr3.o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(OL2 ol2) {
        if (this.h) {
            l();
            this.h = false;
        }
        C9174qr3 c9174qr3 = (C9174qr3) this.g;
        InterfaceC1377Kp1 interfaceC1377Kp1 = c9174qr3.l;
        if (!((AbstractC7504m0) interfaceC1377Kp1).a) {
            c9174qr3.l = QX0.r(interfaceC1377Kp1);
        }
        List list = c9174qr3.l;
        Charset charset = AbstractC1507Lp1.a;
        ol2.getClass();
        if (ol2 instanceof InterfaceC6812jz1) {
            List e = ((InterfaceC6812jz1) ol2).e();
            InterfaceC6812jz1 interfaceC6812jz1 = (InterfaceC6812jz1) list;
            int size = list.size();
            for (Object obj : e) {
                if (obj == null) {
                    String a = AbstractC9307rF1.a("Element at index ", interfaceC6812jz1.size() - size, " is null.");
                    int size2 = interfaceC6812jz1.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        } else {
                            interfaceC6812jz1.remove(size2);
                        }
                    }
                    throw new NullPointerException(a);
                }
                if (obj instanceof AbstractC4147cE) {
                    interfaceC6812jz1.h((AbstractC4147cE) obj);
                } else {
                    interfaceC6812jz1.add((String) obj);
                }
            }
            return;
        }
        if (!(ol2 instanceof InterfaceC2337Rz2)) {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(ol2.size() + list.size());
            }
            int size3 = list.size();
            C0172Bi1 listIterator = ol2.listIterator(0);
            while (listIterator.hasNext()) {
                Object next = listIterator.next();
                if (next == null) {
                    String a2 = AbstractC9307rF1.a("Element at index ", list.size() - size3, " is null.");
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 < size3) {
                            break;
                        } else {
                            list.remove(size4);
                        }
                    }
                    throw new NullPointerException(a2);
                }
                list.add(next);
            }
            return;
        }
        list.addAll(ol2);
    }
}
