package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Y03 extends AbstractC8888q13 implements Cloneable, InterfaceC4449d61, SC0 {
    public static final AtomicInteger q = new AtomicInteger(0);
    public Y03 a;
    public boolean g;
    public C3390a13 h;
    public HashMap i;
    public final String j;
    public int m;
    public ArrayList n;
    public String o;
    public final String p;
    public final int l = q.getAndIncrement();
    public AbstractC6726jk3 k = m();

    @Override // defpackage.InterfaceC4449d61
    public final InterfaceC4487dD0 b() {
        return this;
    }

    public AbstractC6726jk3 m() {
        return null;
    }

    @Override // defpackage.SC0
    /* renamed from: p */
    public abstract boolean a(Y03 y03);

    public Y03(String str) {
        this.j = str;
        this.p = str;
    }

    public static void o(Y03 y03) {
        y03.g = true;
        Y03 y032 = y03.a;
        if (y032 != null) {
            o(y032);
        }
    }

    public Y03 q(boolean z) {
        try {
            Y03 y03 = (Y03) super.clone();
            if (!z) {
                if (y03.n != null) {
                    y03.n = new ArrayList();
                }
                y03.m = 0;
                y03.g = false;
                y03.i = null;
            }
            return y03;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final void n(C3390a13 c3390a13, String str) {
        Y03 q2 = c3390a13.q();
        if (q2 != null && q2.h.s.a.contains(str)) {
            if (q2.i == null) {
                q2.i = new HashMap();
            }
            HashMap hashMap = q2.i;
            String str2 = this.j;
            int intValue = hashMap.containsKey(str2) ? ((Integer) q2.i.get(str2)).intValue() : 0;
            q2.i.put(str2, Integer.valueOf(intValue + 1));
            str = str + intValue;
        }
        this.o = str;
        c3390a13.s.a.add(str);
    }

    public static HashMap l(Y03 y03) {
        HashMap hashMap = new HashMap();
        if (y03 == null) {
            return hashMap;
        }
        ArrayList arrayList = y03.n;
        if (arrayList == null) {
            throw new IllegalStateException(AbstractC4199cO1.a("Children of current section ", String.valueOf(y03), " is null!"));
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Y03 y032 = (Y03) arrayList.get(i);
            hashMap.put(y032.o, new C8776pi2(y032, Integer.valueOf(i)));
        }
        return hashMap;
    }
}
