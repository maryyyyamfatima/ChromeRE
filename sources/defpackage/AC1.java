package defpackage;

import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AC1 extends BC1 {
    @Override // defpackage.BC1
    public final void a(long j, Object obj) {
        ((AbstractC7504m0) ((InterfaceC1377Kp1) Q14.n(j, obj))).a = false;
    }

    @Override // defpackage.BC1
    public final void b(long j, Object obj, Object obj2) {
        InterfaceC1377Kp1 interfaceC1377Kp1 = (InterfaceC1377Kp1) Q14.n(j, obj);
        InterfaceC1377Kp1 interfaceC1377Kp12 = (InterfaceC1377Kp1) Q14.n(j, obj2);
        int size = interfaceC1377Kp1.size();
        int size2 = interfaceC1377Kp12.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC7504m0) interfaceC1377Kp1).a) {
                interfaceC1377Kp1 = interfaceC1377Kp1.c(size2 + size);
            }
            interfaceC1377Kp1.addAll(interfaceC1377Kp12);
        }
        if (size > 0) {
            interfaceC1377Kp12 = interfaceC1377Kp1;
        }
        Q14.x(j, obj, interfaceC1377Kp12);
    }

    @Override // defpackage.BC1
    public final List c(long j, Object obj) {
        InterfaceC1377Kp1 interfaceC1377Kp1 = (InterfaceC1377Kp1) Q14.n(j, obj);
        if (((AbstractC7504m0) interfaceC1377Kp1).a) {
            return interfaceC1377Kp1;
        }
        int size = interfaceC1377Kp1.size();
        InterfaceC1377Kp1 c = interfaceC1377Kp1.c(size == 0 ? 10 : size * 2);
        Q14.x(j, obj, c);
        return c;
    }
}
