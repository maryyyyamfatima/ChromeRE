package defpackage;

import J.N;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.chromium.chrome.browser.AppHooks;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hj2 */
/* loaded from: classes.dex */
public final class C0958Hj2 extends AbstractC0185Bl {
    public final Object h = new Object();
    public final /* synthetic */ C1088Ij2 i;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        C1088Ij2 c1088Ij2 = this.i;
        if (c1088Ij2.a == null) {
            c1088Ij2.a = new C0308Cj2();
        }
        InterfaceC0048Aj2 x = AppHooks.get().x();
        if (x == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashSet hashSet = new HashSet();
        C0178Bj2 c0178Bj2 = new C0178Bj2();
        c0178Bj2.a = 0L;
        c0178Bj2.e = "[IMPLIED_ROOT]";
        c0178Bj2.h = -1L;
        c0178Bj2.b = 0L;
        c0178Bj2.c = true;
        linkedHashMap.put(0L, c0178Bj2);
        while (x.hasNext()) {
            C0178Bj2 c0178Bj22 = (C0178Bj2) x.next();
            if (c0178Bj22 != null) {
                if (linkedHashMap.containsKey(Long.valueOf(c0178Bj22.a))) {
                    AbstractC4851eH1.d("PartnerBMReader", "Duplicate bookmark id: " + c0178Bj22.a + ". Dropping bookmark.", new Object[0]);
                } else if (!c0178Bj22.c && hashSet.contains(c0178Bj22.d)) {
                    AbstractC4851eH1.d("PartnerBMReader", Y5.a(new StringBuilder("More than one bookmark pointing to "), c0178Bj22.d, ". Keeping only the first one for consistency with Chromium."), new Object[0]);
                } else {
                    linkedHashMap.put(Long.valueOf(c0178Bj22.a), c0178Bj22);
                    hashSet.add(c0178Bj22.d);
                }
            }
        }
        x.close();
        EI2.d(hashSet.size(), "PartnerBookmark.Count2");
        for (C0178Bj2 c0178Bj23 : linkedHashMap.values()) {
            if (c0178Bj23.a != 0) {
                if (linkedHashMap.containsKey(Long.valueOf(c0178Bj23.b))) {
                    long j = c0178Bj23.b;
                    if (j != c0178Bj23.a) {
                        C0178Bj2 c0178Bj24 = (C0178Bj2) linkedHashMap.get(Long.valueOf(j));
                        c0178Bj23.i = c0178Bj24;
                        c0178Bj24.j.add(c0178Bj23);
                    }
                }
                C0178Bj2 c0178Bj25 = (C0178Bj2) linkedHashMap.get(0L);
                c0178Bj23.i = c0178Bj25;
                c0178Bj25.j.add(c0178Bj23);
            }
        }
        ArrayList arrayList = c0178Bj2.j;
        if (arrayList.size() == 0) {
            AbstractC4851eH1.a("PartnerBMReader", "ATTENTION: not using partner bookmarks as none were provided", new Object[0]);
            return null;
        }
        if (arrayList.size() != 1) {
            AbstractC4851eH1.a("PartnerBMReader", "ATTENTION: more than one top-level partner bookmarks, ignored", new Object[0]);
            return null;
        }
        n(c0178Bj2, new HashSet());
        return null;
    }

    public C0958Hj2(C1088Ij2 c1088Ij2) {
        this.i = c1088Ij2;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        synchronized (this.h) {
            C1088Ij2 c1088Ij2 = this.i;
            boolean z = true;
            c1088Ij2.h = true;
            if (c1088Ij2.i) {
                N.MZy4XMIu(c1088Ij2.b, c1088Ij2);
            }
            synchronized (c1088Ij2.d) {
                if (c1088Ij2.e != 0 || !c1088Ij2.h || !c1088Ij2.i) {
                    z = false;
                }
                if (z) {
                    c1088Ij2.a();
                }
            }
        }
    }

    public final void n(C0178Bj2 c0178Bj2, HashSet hashSet) {
        if (hashSet.contains(c0178Bj2)) {
            return;
        }
        hashSet.add(c0178Bj2);
        if (c0178Bj2.a != 0) {
            try {
                synchronized (this.h) {
                    C1088Ij2 c1088Ij2 = this.i;
                    String str = c0178Bj2.d;
                    String str2 = c0178Bj2.e;
                    boolean z = c0178Bj2.c;
                    long j = c0178Bj2.b;
                    byte[] bArr = c0178Bj2.f;
                    byte[] bArr2 = c0178Bj2.g;
                    c1088Ij2.getClass();
                    c0178Bj2.h = N.M1QiERX9(c1088Ij2.b, c1088Ij2, str, str2, z, j, bArr, bArr2, c1088Ij2.a.c(str), Ge4.b(c1088Ij2.c, 16.0f), new C0698Fj2(c1088Ij2, str));
                }
            } catch (IllegalArgumentException e) {
                AbstractC4851eH1.f("PartnerBMReader", "Error inserting bookmark " + c0178Bj2.e, e);
            }
            if (c0178Bj2.h == -1) {
                AbstractC4851eH1.a("PartnerBMReader", Y5.a(new StringBuilder("Error creating bookmark '"), c0178Bj2.e, "'."), new Object[0]);
                return;
            }
        }
        if (c0178Bj2.c) {
            Iterator it = c0178Bj2.j.iterator();
            while (it.hasNext()) {
                C0178Bj2 c0178Bj22 = (C0178Bj2) it.next();
                if (c0178Bj22.i != c0178Bj2) {
                    AbstractC4851eH1.f("PartnerBMReader", Y5.a(new StringBuilder("Hierarchy error in bookmark '"), c0178Bj2.e, "'. Skipping."), new Object[0]);
                } else {
                    c0178Bj22.b = c0178Bj2.h;
                    n(c0178Bj22, hashSet);
                }
            }
        }
    }
}
