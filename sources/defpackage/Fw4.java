package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Fw4 implements InterfaceC2248Rh3 {
    public final St4 a;
    public final Bw4 b;
    public final tw4 c;
    public final Wt4 d;
    public final Handler e = new Handler(Looper.getMainLooper());

    public Fw4(St4 st4, Bw4 bw4, tw4 tw4Var, Wt4 wt4) {
        this.a = st4;
        this.b = bw4;
        this.c = tw4Var;
        this.d = wt4;
    }

    public static ArrayList h(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).toLanguageTag());
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC2248Rh3
    public final ow4 a(List list) {
        ArrayList h = h(list);
        St4 st4 = this.a;
        Jt4 jt4 = st4.b;
        if (jt4 == null) {
            return St4.c();
        }
        St4.c.b(4, "deferredLanguageInstall(%s)", new Object[]{h});
        Vv4 vv4 = new Vv4();
        jt4.b(new C11244wt4(jt4, vv4, new C8501ot4(st4, vv4, h, vv4)));
        return vv4.a;
    }

    @Override // defpackage.InterfaceC2248Rh3
    public final Set b() {
        return this.c.a();
    }

    @Override // defpackage.InterfaceC2248Rh3
    public final synchronized void c(InterfaceC2768Vh3 interfaceC2768Vh3) {
        Bw4 bw4 = this.b;
        synchronized (bw4) {
            bw4.a.b(4, "unregisterListener", new Object[0]);
            if (interfaceC2768Vh3 == null) {
                throw new NullPointerException("Unregistered Play Core listener should not be null.");
            }
            bw4.d.remove(interfaceC2768Vh3);
            bw4.b();
        }
    }

    @Override // defpackage.InterfaceC2248Rh3
    public final ow4 d(List list) {
        St4 st4 = this.a;
        Jt4 jt4 = st4.b;
        if (jt4 == null) {
            return St4.c();
        }
        St4.c.b(4, "deferredInstall(%s)", new Object[]{list});
        Vv4 vv4 = new Vv4();
        jt4.b(new C11244wt4(jt4, vv4, new C7469lt4(st4, vv4, list, vv4)));
        return vv4.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:            if (r1.containsAll(r4) != false) goto L164;     */
    @Override // defpackage.InterfaceC2248Rh3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ow4 e(defpackage.C2638Uh3 r10) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Fw4.e(Uh3):ow4");
    }

    @Override // defpackage.InterfaceC2248Rh3
    public final Set f() {
        HashSet b = this.c.b();
        return b == null ? Collections.emptySet() : b;
    }

    @Override // defpackage.InterfaceC2248Rh3
    public final synchronized void g(InterfaceC2768Vh3 interfaceC2768Vh3) {
        Bw4 bw4 = this.b;
        synchronized (bw4) {
            bw4.a.b(4, "registerListener", new Object[0]);
            if (interfaceC2768Vh3 == null) {
                throw new NullPointerException("Registered Play Core listener should not be null.");
            }
            bw4.d.add(interfaceC2768Vh3);
            bw4.b();
        }
    }
}
