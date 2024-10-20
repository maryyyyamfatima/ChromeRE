package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sf4 */
/* loaded from: classes.dex */
public final class C9788sf4 extends AbstractC10779vZ1 {
    public static final C9788sf4 a = new C9788sf4();

    public static void c(C3471aG0 c3471aG0) {
        C9445rf4 c9445rf4 = (C9445rf4) c3471aG0.b;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : c9445rf4.a.entrySet()) {
            C9103qf4 c9103qf4 = (C9103qf4) entry.getValue();
            if (c9103qf4.d) {
                c9103qf4.d = false;
            } else {
                arrayList.add((String) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            HashMap hashMap = c9445rf4.a;
            C9103qf4 c9103qf42 = (C9103qf4) hashMap.get(str);
            if (c9103qf42 != null) {
                InterfaceC11101wV0 interfaceC11101wV0 = c9103qf42.b;
                InterfaceC11101wV0 interfaceC11101wV02 = c9103qf42.c;
                if (interfaceC11101wV0 != null) {
                    AbstractC10474uf4.a(interfaceC11101wV0, c9445rf4.f);
                }
                if ((c9103qf42.e & 32) != 0) {
                    c9103qf42.a(false);
                    if (interfaceC11101wV02 != null) {
                        AbstractC10474uf4.b(interfaceC11101wV02);
                    }
                }
                InterfaceC11101wV0 interfaceC11101wV03 = c9103qf42.a;
                if (interfaceC11101wV03 != null) {
                    AbstractC10474uf4.c(interfaceC11101wV03);
                }
                c9103qf42.getClass();
            }
            hashMap.remove(str);
        }
        c9445rf4.b.setEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x008b, code lost:            if ((((float) r6.width()) >= r0 * ((float) r10.width())) != false) goto L540;     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(defpackage.C3471aG0 r17, android.graphics.Rect r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9788sf4.e(aG0, android.graphics.Rect, boolean):void");
    }

    public final void d(C3471aG0 c3471aG0) {
        ((C9445rf4) c3471aG0.b).b.setEmpty();
    }

    @Override // defpackage.AbstractC10779vZ1
    public final Object a() {
        return new C9445rf4();
    }
}
