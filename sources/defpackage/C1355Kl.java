package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kl */
/* loaded from: classes.dex */
public final class C1355Kl extends JX0 implements InterfaceC7327lV1 {
    public C1355Kl(int i) {
        super(C2264Rl.r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(ArrayList arrayList) {
        if (this.h) {
            l();
            this.h = false;
        }
        C2264Rl c2264Rl = (C2264Rl) this.g;
        InterfaceC1377Kp1 interfaceC1377Kp1 = c2264Rl.o;
        if (!((AbstractC7504m0) interfaceC1377Kp1).a) {
            c2264Rl.o = QX0.r(interfaceC1377Kp1);
        }
        List list = c2264Rl.o;
        Charset charset = AbstractC1507Lp1.a;
        arrayList.getClass();
        if (arrayList instanceof InterfaceC6812jz1) {
            List e = ((InterfaceC6812jz1) arrayList).e();
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
        if (!(arrayList instanceof InterfaceC2337Rz2)) {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
            }
            int size3 = list.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
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
        list.addAll(arrayList);
    }
}
