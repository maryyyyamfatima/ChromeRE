package defpackage;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DQ1 {
    public final CQ1 a;
    public final String b;
    public final String c;
    public String d;
    public String e;
    public Uri f;
    public boolean g;
    public int h;
    public boolean i;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public Bundle r;
    public IntentSender s;
    public TP1 t;
    public C4317ck v;
    public final ArrayList j = new ArrayList();
    public int q = -1;
    public ArrayList u = new ArrayList();

    public DQ1(CQ1 cq1, String str, String str2) {
        this.a = cq1;
        this.b = str;
        this.c = str2;
    }

    public final boolean g() {
        MQ1.b();
        return MQ1.c().f() == this;
    }

    public final boolean d() {
        MQ1.b();
        DQ1 dq1 = MQ1.c().r;
        if (dq1 != null) {
            if ((dq1 == this) || this.m == 3) {
                return true;
            }
            return TextUtils.equals(b().g.a.getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO");
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }

    public final boolean h(C6614jQ1 c6614jQ1) {
        if (c6614jQ1 == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        MQ1.b();
        ArrayList arrayList = this.j;
        if (arrayList == null) {
            return false;
        }
        c6614jQ1.a();
        if (c6614jQ1.b.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = (IntentFilter) it.next();
            if (intentFilter != null) {
                Iterator it2 = c6614jQ1.b.iterator();
                while (it2.hasNext()) {
                    if (intentFilter.hasCategory((String) it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean m(String str) {
        MQ1.b();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((IntentFilter) arrayList.get(i)).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.t != null && this.g;
    }

    public final int c() {
        if (!e() || MQ1.h()) {
            return this.n;
        }
        return 0;
    }

    public final void j(int i) {
        AbstractC4896eQ1 abstractC4896eQ1;
        AbstractC4896eQ1 abstractC4896eQ12;
        MQ1.b();
        C11420xQ1 c = MQ1.c();
        int min = Math.min(this.p, Math.max(0, i));
        if (this == c.t && (abstractC4896eQ12 = c.u) != null) {
            abstractC4896eQ12.f(min);
            return;
        }
        HashMap hashMap = c.x;
        if (hashMap.isEmpty() || (abstractC4896eQ1 = (AbstractC4896eQ1) hashMap.get(this.c)) == null) {
            return;
        }
        abstractC4896eQ1.f(min);
    }

    public final void k(int i) {
        AbstractC4896eQ1 abstractC4896eQ1;
        AbstractC4896eQ1 abstractC4896eQ12;
        MQ1.b();
        if (i != 0) {
            C11420xQ1 c = MQ1.c();
            if (this == c.t && (abstractC4896eQ12 = c.u) != null) {
                abstractC4896eQ12.i(i);
                return;
            }
            HashMap hashMap = c.x;
            if (hashMap.isEmpty() || (abstractC4896eQ1 = (AbstractC4896eQ1) hashMap.get(this.c)) == null) {
                return;
            }
            abstractC4896eQ1.i(i);
        }
    }

    public final void l() {
        MQ1.b();
        MQ1.c().k(this, 3);
    }

    public final boolean e() {
        return a().size() >= 1;
    }

    public final List a() {
        return Collections.unmodifiableList(this.u);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", iconUri=");
        sb.append(this.f);
        sb.append(", enabled=");
        sb.append(this.g);
        sb.append(", connectionState=");
        sb.append(this.h);
        sb.append(", canDisconnect=");
        sb.append(this.i);
        sb.append(", playbackType=");
        sb.append(this.k);
        sb.append(", playbackStream=");
        sb.append(this.l);
        sb.append(", deviceType=");
        sb.append(this.m);
        sb.append(", volumeHandling=");
        sb.append(this.n);
        sb.append(", volume=");
        sb.append(this.o);
        sb.append(", volumeMax=");
        sb.append(this.p);
        sb.append(", presentationDisplayId=");
        sb.append(this.q);
        sb.append(", extras=");
        sb.append(this.r);
        sb.append(", settingsIntent=");
        sb.append(this.s);
        sb.append(", providerPackageName=");
        sb.append(this.a.c.a.getPackageName());
        if (e()) {
            sb.append(", members=[");
            int size = this.u.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (this.u.get(i) != this) {
                    sb.append(((DQ1) this.u.get(i)).c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fa, code lost:            if (r5.hasNext() == false) goto L65;     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe A[EDGE_INSN: B:54:0x00fe->B:64:0x00fe BREAK  A[LOOP:0: B:25:0x008a->B:55:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[LOOP:0: B:25:0x008a->B:55:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(defpackage.TP1 r14) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DQ1.i(TP1):int");
    }

    public final AbstractC5584gQ1 b() {
        CQ1 cq1 = this.a;
        cq1.getClass();
        MQ1.b();
        return cq1.a;
    }

    public final void n(Collection collection) {
        this.u.clear();
        if (this.v == null) {
            this.v = new C4317ck();
        }
        this.v.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C3522aQ1 c3522aQ1 = (C3522aQ1) it.next();
            DQ1 a = this.a.a(c3522aQ1.a.d());
            if (a != null) {
                this.v.put(a.c, c3522aQ1);
                int i = c3522aQ1.b;
                if (i == 2 || i == 3) {
                    this.u.add(a);
                }
            }
        }
        MQ1.c().n.b(259, this);
    }
}
