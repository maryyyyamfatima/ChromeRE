package defpackage;

import java.util.List;
import java.util.Locale;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZY3 implements InterfaceC1835Od0 {
    public final C11180wj0 a;
    public final C3913bZ3 b;

    public ZY3(C11180wj0 c11180wj0, C3913bZ3 c3913bZ3) {
        this.a = c11180wj0;
        this.b = c3913bZ3;
    }

    @Override // defpackage.InterfaceC1835Od0
    public final void a(PC pc) {
        c(pc, true);
    }

    @Override // defpackage.InterfaceC1835Od0
    public final void b(PC pc) {
        c(pc, false);
    }

    public final void c(final PC pc, final boolean z) {
        final Ik4 ik4;
        MC2 c;
        final C3913bZ3 c3913bZ3 = this.b;
        c3913bZ3.getClass();
        final D63 v = pc.v();
        Xj4 E = pc.E();
        if (E != null) {
            ik4 = E.k;
        } else {
            C6868k83 w = pc.w();
            if (w == null) {
                ik4 = null;
            } else {
                String str = w.a;
                C6524j83 c6524j83 = w.d;
                String str2 = c6524j83.a;
                String str3 = c6524j83.b;
                String str4 = w.b;
                boolean z2 = str4 != null && "POST".equals(str4.toUpperCase(Locale.ENGLISH));
                String str5 = w.c;
                boolean z3 = str5 != null && "multipart/form-data".equals(str5.toLowerCase(Locale.ENGLISH));
                List list = c6524j83.c;
                int size = list == null ? 0 : list.size();
                String[] strArr = new String[size];
                String[][] strArr2 = new String[size];
                for (int i = 0; i < size; i++) {
                    C6182i83 c6182i83 = (C6182i83) list.get(i);
                    strArr[i] = c6182i83.a;
                    List list2 = c6182i83.b;
                    strArr2[i] = (String[]) list2.toArray(new String[list2.size()]);
                }
                ik4 = new Ik4(str, str2, str3, z2, z3, strArr, strArr2);
            }
        }
        if (ik4 == null || v == null) {
            c = MC2.c(Boolean.FALSE);
        } else {
            c = c3913bZ3.d.h(ik4.a[0]).f(new BV0() { // from class: aZ3
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException
                    */
                @Override // defpackage.BV0
                public final java.lang.Object apply(java.lang.Object r24) {
                    /*
                        Method dump skipped, instructions count: 566
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.C3569aZ3.apply(java.lang.Object):java.lang.Object");
                }
            });
        }
        c.g(new Callback() { // from class: YY3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                ZY3 zy3 = ZY3.this;
                zy3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                boolean z4 = z;
                PC pc2 = pc;
                C11180wj0 c11180wj0 = zy3.a;
                if (z4) {
                    c11180wj0.a(pc2);
                } else {
                    c11180wj0.b(pc2);
                }
            }
        });
    }
}
