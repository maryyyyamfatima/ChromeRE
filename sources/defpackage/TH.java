package defpackage;

import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class TH extends AbstractC6450iw {
    public final ArrayList f;
    public final SH g;

    public TH(HE he) {
        super(he);
        this.f = new ArrayList();
        this.g = new SH(this);
        new PE(this);
    }

    @Override // defpackage.AbstractC6450iw
    public final void b() {
        if (this.a == null) {
            return;
        }
        this.f.clear();
        QH qh = this.a;
        SH sh = this.g;
        if (sh == null) {
            qh.getClass();
        } else {
            qh.d.remove(sh);
        }
        super.b();
    }

    public static void k(TH th) {
        th.m();
        HE he = th.b;
        ((KE) he).j.a("update_session", ((KE) he).j.b());
    }

    public final void m() {
        if (!g() || this.a.g() == null || Collections.unmodifiableList(this.a.g().h) == null) {
            return;
        }
        HashSet hashSet = new HashSet(Collections.unmodifiableList(this.a.g().h));
        ArrayList arrayList = this.f;
        HashSet hashSet2 = new HashSet(arrayList);
        hashSet2.removeAll(hashSet);
        hashSet.removeAll(arrayList);
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (g()) {
                try {
                    C8136nq1 c8136nq1 = this.a.g;
                    if (c8136nq1 != null) {
                        c8136nq1.m(str);
                    }
                    arrayList.remove(str);
                } catch (Exception e) {
                    AbstractC4851eH1.a("CafSessionCtrl", "Failed to remove the namespace listener for %s", str, e);
                }
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (g()) {
                try {
                    QH qh = this.a;
                    ZG zg = new ZG() { // from class: RH
                        @Override // defpackage.ZG
                        public final void a(CastDevice castDevice, String str3, String str4) {
                            TH.this.l(castDevice, str3, str4);
                        }
                    };
                    C8136nq1 c8136nq12 = qh.g;
                    if (c8136nq12 != null && c8136nq12.k()) {
                        qh.g.o(str2, zg);
                    }
                    arrayList.add(str2);
                } catch (Exception e2) {
                    AbstractC4851eH1.a("CafSessionCtrl", "Failed to register namespace listener for %s", str2, e2);
                }
            }
        }
    }

    @Override // defpackage.AbstractC6450iw
    public final void a(QH qh) {
        C6108hw c6108hw;
        this.a = qh;
        KM2 km2 = qh.h;
        if (km2 != null && (c6108hw = this.d) != null) {
            km2.i.add(c6108hw);
        }
        QH qh2 = this.a;
        SH sh = this.g;
        if (sh == null) {
            qh2.getClass();
        } else {
            qh2.d.add(sh);
        }
        m();
    }

    @Override // defpackage.AbstractC6450iw
    public final void h() {
        OE oe = ((KE) this.b).j;
        for (String str : oe.e.i.keySet()) {
            C4317ck c4317ck = oe.b;
            Queue queue = (Queue) c4317ck.get(str);
            TH th = oe.d;
            if (queue == null) {
                oe.g(str, -1, "remove_session", th.f());
            } else {
                Iterator it = queue.iterator();
                while (it.hasNext()) {
                    oe.g(str, ((Integer) it.next()).intValue(), "remove_session", th.f());
                }
                c4317ck.remove(str);
            }
        }
        super.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(com.google.android.gms.cast.CastDevice r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r6 = "urn:x-cast:com.google.cast.media"
            boolean r0 = r6.equals(r7)
            if (r0 == 0) goto L18
            boolean r0 = r5.g()
            if (r0 != 0) goto Lf
            goto L18
        Lf:
            QH r0 = r5.a
            KM2 r1 = r0.h
            com.google.android.gms.cast.CastDevice r0 = r0.i
            r1.a(r0, r6, r8)
        L18:
            HE r0 = r5.b
            KE r0 = (defpackage.KE) r0
            OE r0 = r0.j
            r0.getClass()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3e
            r1.<init>(r8)     // Catch: org.json.JSONException -> L3e
            java.lang.String r2 = "requestId"
            int r1 = r1.getInt(r2)     // Catch: org.json.JSONException -> L3e
            android.util.SparseArray r2 = r0.a
            int r3 = r2.indexOfKey(r1)     // Catch: org.json.JSONException -> L3e
            if (r3 < 0) goto L3e
            java.lang.Object r3 = r2.get(r1)     // Catch: org.json.JSONException -> L3e
            NE r3 = (defpackage.NE) r3     // Catch: org.json.JSONException -> L3e
            r2.delete(r1)     // Catch: org.json.JSONException -> L3f
            goto L3f
        L3e:
            r3 = 0
        L3f:
            boolean r6 = r6.equals(r7)
            r1 = 0
            if (r6 == 0) goto L8d
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L57
            r6.<init>(r8)     // Catch: org.json.JSONException -> L57
            java.lang.String r7 = "MEDIA_STATUS"
            java.lang.String r2 = "type"
            java.lang.String r6 = r6.getString(r2)     // Catch: org.json.JSONException -> L57
            boolean r1 = r7.equals(r6)     // Catch: org.json.JSONException -> L57
        L57:
            java.lang.String r6 = "v2_message"
            if (r1 == 0) goto L83
            KE r7 = r0.e
            java.util.HashMap r7 = r7.i
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L67:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L83
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r3 == 0) goto L7e
            java.lang.String r2 = r3.a
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L7e
            goto L67
        L7e:
            r2 = -1
            r0.g(r1, r2, r6, r8)
            goto L67
        L83:
            if (r3 == 0) goto Lcc
            java.lang.String r7 = r3.a
            int r1 = r3.b
            r0.g(r7, r1, r6, r8)
            goto Lcc
        L8d:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lbf
            r6.<init>()     // Catch: org.json.JSONException -> Lbf
            java.lang.String r2 = "sessionId"
            TH r4 = r0.d     // Catch: org.json.JSONException -> Lbf
            java.lang.String r4 = r4.f()     // Catch: org.json.JSONException -> Lbf
            r6.put(r2, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r2 = "namespaceName"
            r6.put(r2, r7)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r7 = "message"
            r6.put(r7, r8)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r7 = "app_message"
            if (r3 == 0) goto Lb7
            java.lang.String r8 = r3.a     // Catch: org.json.JSONException -> Lbf
            java.lang.String r6 = r6.toString()     // Catch: org.json.JSONException -> Lbf
            int r2 = r3.b     // Catch: org.json.JSONException -> Lbf
            r0.g(r8, r2, r7, r6)     // Catch: org.json.JSONException -> Lbf
            goto Lcc
        Lb7:
            java.lang.String r6 = r6.toString()     // Catch: org.json.JSONException -> Lbf
            r0.a(r7, r6)     // Catch: org.json.JSONException -> Lbf
            goto Lcc
        Lbf:
            r6 = move-exception
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r1] = r6
            java.lang.String r6 = "CafMR"
            java.lang.String r8 = "Failed to create the message wrapper"
            defpackage.AbstractC4851eH1.a(r6, r8, r7)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.TH.l(com.google.android.gms.cast.CastDevice, java.lang.String, java.lang.String):void");
    }
}
