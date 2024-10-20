package defpackage;

import J.N;
import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lB3 */
/* loaded from: classes.dex */
public final class C7229lB3 {
    public final C8168nv3 a;
    public final C8512ov3 b;
    public final InterfaceC10590uz3 c;
    public final /* synthetic */ C7573mB3 d;

    public C7229lB3(C7573mB3 c7573mB3, InterfaceC10590uz3 interfaceC10590uz3) {
        this.d = c7573mB3;
        this.a = new C8168nv3(this, interfaceC10590uz3);
        C8512ov3 c8512ov3 = new C8512ov3(this);
        this.b = c8512ov3;
        ((AbstractC11276wz3) interfaceC10590uz3).c.b(c8512ov3);
        this.c = interfaceC10590uz3;
    }

    public final void a() {
        boolean z;
        synchronized (this.d.j) {
            C7573mB3 c7573mB3 = this.d;
            if (c7573mB3.k != null) {
                Iterator it = c7573mB3.m.iterator();
                while (true) {
                    C11814ya2 c11814ya2 = (C11814ya2) it;
                    if (!c11814ya2.hasNext()) {
                        break;
                    } else {
                        ((C4136cB3) ((InterfaceC5855hB3) c11814ya2.next())).d();
                    }
                }
            }
        }
        C7573mB3 c7573mB32 = this.d;
        synchronized (c7573mB32.h) {
            long j = c7573mB32.h.getLong("LastTimestamp", -1L);
            if (j != -1) {
                long j2 = c7573mB32.h.getLong("BackoffCountKey", -1L);
                if (j2 > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = j2 - (currentTimeMillis - j);
                    SharedPreferences.Editor edit = c7573mB32.h.edit();
                    edit.putLong("LastTimestamp", currentTimeMillis);
                    edit.putLong("BackoffCountKey", j3);
                    edit.apply();
                    z = j3 > 0;
                }
            }
            z = false;
        }
        if (z) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime < c7573mB32.o) {
            return;
        }
        int i = c7573mB32.p;
        C7928nE c7928nE = UN.a;
        c7573mB32.o = elapsedRealtime + N.M37SqSAy("CloseTabSuggestions", "min_time_between_prefetches", i);
        AbstractC7158kz3 d = ((AbstractC11276wz3) c7573mB32.l).c.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < d.getCount(); i2++) {
            Tab tabAt = d.getTabAt(i2);
            if (tabAt != null) {
                List G = d.G(tabAt.getId());
                if (G.size() <= 1) {
                    if (!tabAt.p()) {
                        arrayList.add(C6106hv3.a(tabAt));
                    }
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (int i3 = 0; i3 < G.size(); i3++) {
                        Tab tab = (Tab) G.get(i3);
                        if (!tab.p()) {
                            arrayList3.add(tab);
                        }
                    }
                    int i4 = C1695Nb0.m(tabAt).r;
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(C6106hv3.a((Tab) it2.next()));
                    }
                    arrayList2.add(new C5762gv3(i4, arrayList4));
                }
            }
        }
        C6448iv3 c6448iv3 = new C6448iv3(arrayList, arrayList2);
        synchronized (c7573mB32.j) {
            c7573mB32.n = 0;
            c7573mB32.k = c6448iv3;
            c7573mB32.j = new LinkedList();
            for (InterfaceC5167fB3 interfaceC5167fB3 : c7573mB32.i) {
                if (interfaceC5167fB3.isEnabled()) {
                    c7573mB32.n++;
                    interfaceC5167fB3.a(c6448iv3, new C6199iB3(c7573mB32));
                }
            }
        }
    }
}
