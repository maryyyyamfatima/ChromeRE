package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: s11 */
/* loaded from: classes.dex */
public final class C9571s11 {
    public final String c;
    public final String d;
    public final Context f;
    public final Looper i;
    public final HashSet a = new HashSet();
    public final HashSet b = new HashSet();
    public final C4317ck e = new C4317ck();
    public final C4317ck g = new C4317ck();
    public final int h = -1;
    public final C8543p11 j = C8543p11.d;
    public final Y93 k = AbstractC3574aa3.a;
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public C9571s11(Context context) {
        this.f = context;
        this.i = context.getMainLooper();
        this.c = context.getPackageName();
        this.d = context.getClass().getName();
    }

    public final void a(C3588ad c3588ad) {
        this.g.put(c3588ad, null);
        c3588ad.a.getClass();
        List emptyList = Collections.emptyList();
        this.b.addAll(emptyList);
        this.a.addAll(emptyList);
    }

    public final N11 b() {
        this.g.getClass();
        C5636ga3 c5636ga3 = C5636ga3.b;
        C4317ck c4317ck = this.g;
        C3588ad c3588ad = AbstractC3574aa3.b;
        if (c4317ck.containsKey(c3588ad)) {
            c5636ga3 = (C5636ga3) c4317ck.get(c3588ad);
        }
        JU ju = new JU(null, this.a, this.e, this.c, this.d, c5636ga3);
        C4317ck c4317ck2 = new C4317ck();
        C4317ck c4317ck3 = new C4317ck();
        ArrayList arrayList = new ArrayList();
        C4317ck c4317ck4 = this.g;
        Iterator it = ((C3164Yj) c4317ck4.keySet()).iterator();
        while (true) {
            AbstractC3638al1 abstractC3638al1 = (AbstractC3638al1) it;
            if (!abstractC3638al1.hasNext()) {
                break;
            }
            C3588ad c3588ad2 = (C3588ad) abstractC3638al1.next();
            Object obj = c4317ck4.get(c3588ad2);
            boolean z = ju.d.get(c3588ad2) != null;
            c4317ck2.put(c3588ad2, Boolean.valueOf(z));
            ZT zt = new ZT(c3588ad2, z);
            arrayList.add(zt);
            InterfaceC3129Yc b = c3588ad2.a.b(this.f, this.i, ju, obj, zt, zt);
            c4317ck3.put(c3588ad2.b, b);
            b.getClass();
        }
        N11 n11 = new N11(this.f, new ReentrantLock(), this.i, ju, this.j, this.k, c4317ck2, this.l, this.m, c4317ck3, this.h, N11.q(c4317ck3.values()), arrayList);
        Set set = AbstractC10600v11.a;
        synchronized (set) {
            set.add(n11);
        }
        if (this.h < 0) {
            return n11;
        }
        LifecycleCallback.c(null);
        throw null;
    }
}
