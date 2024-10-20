package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class KV1 {
    public final C12157za2 a = new C12157za2();
    public final int b;

    public KV1(int i) {
        this.b = i;
    }

    public void a(QU1 qu1) {
        this.a.a(qu1);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public final void c(defpackage.IV1 r19) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.KV1.c(IV1):void");
    }

    public final void d() {
        Iterator it = this.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            }
            QU1 qu1 = (QU1) ((JV1) c11814ya2.next());
            LinkedHashMap linkedHashMap = qu1.c;
            int i = this.b;
            if (linkedHashMap.containsKey(Integer.valueOf(i))) {
                linkedHashMap.remove(Integer.valueOf(i));
            }
            if (qu1.d.containsKey(Integer.valueOf(i))) {
                qu1.a(i);
            }
        }
    }

    public static void b(int i, String str) {
        EI2.h(i, 4, String.format("GridTabSwitcher.%s.DisableReason", str));
    }
}
