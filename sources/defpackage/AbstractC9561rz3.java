package defpackage;

import J.N;
import android.os.StrictMode;
import android.util.Pair;
import android.util.SparseIntArray;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.ntp.RecentlyClosedBridge;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rz3 */
/* loaded from: classes.dex */
public abstract class AbstractC9561rz3 {
    public C9284rA3 a;
    public AbstractC11276wz3 b;
    public InterfaceC2728Uz3 c;
    public boolean d;

    public void a(int i) {
    }

    public final void b() {
        ArrayList arrayList;
        if (this.d) {
            C9284rA3 c9284rA3 = this.a;
            int i = 0;
            if (c9284rA3 != null) {
                c9284rA3.m = true;
                if (c9284rA3.a != null) {
                    AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) c9284rA3.c;
                    abstractC11276wz3.j(false).i(c9284rA3.a);
                    abstractC11276wz3.j(true).i(c9284rA3.a);
                    c9284rA3.a = null;
                }
                c9284rA3.b.destroy();
                C8256oA3 c8256oA3 = c9284rA3.j;
                if (c8256oA3 != null) {
                    C6536jA3 c6536jA3 = c8256oA3.b;
                    if (c6536jA3 != null) {
                        c6536jA3.a(true);
                    }
                    c8256oA3.c.a();
                }
                c9284rA3.f.clear();
                c9284rA3.h.clear();
                C7568mA3 c7568mA3 = c9284rA3.k;
                if (c7568mA3 != null) {
                    c7568mA3.a(false);
                }
                C7224lA3 c7224lA3 = c9284rA3.l;
                if (c7224lA3 != null) {
                    c7224lA3.a(true);
                }
            }
            AbstractC11276wz3 abstractC11276wz32 = this.b;
            if (abstractC11276wz32 != null) {
                C0129Az3 c0129Az3 = (C0129Az3) abstractC11276wz32;
                C7502lz3 c7502lz3 = c0129Az3.c;
                c0129Az3.s(c7502lz3);
                for (int i2 = 0; i2 < c7502lz3.a.size(); i2++) {
                    ((AbstractC7158kz3) c7502lz3.a.get(i2)).g.clear();
                }
                c7502lz3.g.clear();
                InterfaceC12216zk1 interfaceC12216zk1 = c0129Az3.b;
                if (interfaceC12216zk1 != null) {
                    ((C0182Bk1) interfaceC12216zk1).h.d(c0129Az3);
                }
                while (true) {
                    arrayList = c0129Az3.a;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    ((TabModel) arrayList.get(i)).destroy();
                    i++;
                }
                arrayList.clear();
                RecentlyClosedBridge recentlyClosedBridge = c0129Az3.t;
                if (recentlyClosedBridge != null) {
                    N.MN6LZLAP(recentlyClosedBridge.a);
                    recentlyClosedBridge.a = 0L;
                    recentlyClosedBridge.c = null;
                }
            }
        }
    }

    public final void d(TabContentManager tabContentManager) {
        AbstractC7158kz3 aa0;
        C0129Az3 c0129Az3 = (C0129Az3) this.b;
        InterfaceC10912vv3 interfaceC10912vv3 = c0129Az3.l;
        C8332oQ c8332oQ = (C8332oQ) interfaceC10912vv3.b(false);
        C8332oQ c8332oQ2 = (C8332oQ) interfaceC10912vv3.b(true);
        c0129Az3.t = new RecentlyClosedBridge(Profile.d(), c0129Az3);
        Profile d = Profile.d();
        int i = c0129Az3.o;
        C10247tz3 c10247tz3 = c0129Az3.p;
        C8190nz3 c8190nz3 = new C8190nz3(d, i, c8332oQ, c8332oQ2, c10247tz3, tabContentManager, c0129Az3.r, c0129Az3.q, c0129Az3, c0129Az3.n);
        c8332oQ.d = c8190nz3;
        c8332oQ.e = c10247tz3;
        C0182Bk1 c0182Bk1 = new C0182Bk1(new C0312Ck1(c0129Az3.v, c8332oQ, c8332oQ2, c10247tz3, tabContentManager, c0129Az3.r, c0129Az3.q, c0129Az3.o, c0129Az3));
        c8332oQ2.d = c0182Bk1;
        c8332oQ2.e = c10247tz3;
        c0129Az3.s = tabContentManager;
        ArrayList arrayList = c0129Az3.a;
        arrayList.add(c8190nz3);
        arrayList.add(c0182Bk1);
        c0129Az3.b = c0182Bk1;
        c0129Az3.e = c0129Az3.l(c0129Az3.j);
        C7502lz3 c7502lz3 = c0129Az3.c;
        c7502lz3.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TabModel tabModel = (TabModel) arrayList.get(i2);
            if (!AbstractC5177fD3.e(c0129Az3.d.a) || AbstractC3722az3.a() == null) {
                aa0 = new AA0(tabModel);
            } else {
                aa0 = new C1024Hw3(tabModel, CachedFeatureFlags.b(AbstractC6265iP.d.b("TabGridLayoutAndroid:enable_tab_group_auto_creation"), true));
            }
            arrayList2.add(aa0);
        }
        c7502lz3.a = Collections.unmodifiableList(arrayList2);
        ArrayList arrayList3 = c7502lz3.g;
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            InterfaceC8876pz3 interfaceC8876pz3 = (InterfaceC8876pz3) it.next();
            Iterator it2 = c7502lz3.a.iterator();
            while (it2.hasNext()) {
                ((AbstractC7158kz3) it2.next()).g.a(interfaceC8876pz3);
            }
        }
        arrayList3.clear();
        c0129Az3.c(c7502lz3);
        c7502lz3.b(new C10933vz3(c0129Az3));
        ((C0182Bk1) c0129Az3.b).h.a(c0129Az3);
        c0182Bk1.r(c0129Az3.j);
        c8190nz3.t = !c0129Az3.j;
        c0129Az3.q();
        c0129Az3.c(new C11619xz3(c0129Az3));
        new C11962yz3(c0129Az3, c0129Az3);
        this.c.b(tabContentManager);
        C9284rA3 c9284rA3 = this.a;
        c9284rA3.getClass();
        C3444aA3 c3444aA3 = new C3444aA3(c9284rA3);
        InterfaceC10590uz3 interfaceC10590uz3 = c9284rA3.c;
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
        abstractC11276wz3.c(c3444aA3);
        new C3788bA3(c9284rA3, interfaceC10590uz3);
        c9284rA3.a = new C4131cA3(c9284rA3);
        abstractC11276wz3.j(false).g(c9284rA3.a);
        abstractC11276wz3.j(true).g(c9284rA3.a);
    }

    public final void f() {
        this.b.f();
        C9284rA3 c9284rA3 = this.a;
        InterfaceC10590uz3 interfaceC10590uz3 = c9284rA3.c;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            C7224lA3 c7224lA3 = c9284rA3.l;
            if (c7224lA3 != null) {
                c7224lA3.a(true);
            }
            try {
                c9284rA3.q(c9284rA3.t().a);
            } catch (IOException e) {
                AbstractC4851eH1.f("tabmodel", "Error while saving tabs state; will attempt to continue...", e);
            }
            c9284rA3.b(AbstractC1558Lz3.a(((AbstractC11276wz3) interfaceC10590uz3).j(false)));
            c9284rA3.b(AbstractC1558Lz3.a(((AbstractC11276wz3) interfaceC10590uz3).j(true)));
            C7568mA3 c7568mA3 = c9284rA3.k;
            if (c7568mA3 != null) {
                if (c7568mA3.a(false)) {
                    C7568mA3 c7568mA32 = c9284rA3.k;
                    if (!c7568mA32.l) {
                        c9284rA3.b(c7568mA32.h);
                    }
                }
                c9284rA3.k = null;
            }
            ArrayDeque arrayDeque = c9284rA3.f;
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                Tab tab = (Tab) it.next();
                int id = tab.getId();
                boolean isIncognito = tab.isIncognito();
                try {
                    IA3 a = PA3.a(tab);
                    if (a != null) {
                        QA3.e(new File(c9284rA3.g(), QA3.a(id, isIncognito)), a, isIncognito);
                    }
                } catch (OutOfMemoryError unused) {
                    AbstractC4851eH1.a("tabmodel", "Out of memory error while attempting to save tab state.  Erasing.", new Object[0]);
                    c9284rA3.f(id, isIncognito);
                }
            }
            arrayDeque.clear();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    public final void c(boolean z) {
        HashSet hashSet;
        DataInputStream dataInputStream;
        C9284rA3 c9284rA3 = this.a;
        ArrayDeque arrayDeque = c9284rA3.h;
        InterfaceC2728Uz3 interfaceC2728Uz3 = c9284rA3.b;
        interfaceC2728Uz3.o();
        interfaceC2728Uz3.e();
        AbstractC4851eH1.d("tabmodel", "#loadState, ignoreIncognitoFiles? " + z, new Object[0]);
        c9284rA3.n = false;
        c9284rA3.o = z;
        c9284rA3.p = new SparseIntArray();
        c9284rA3.q = new SparseIntArray();
        try {
            C9284rA3.c();
            C3118Xz3 c3118Xz3 = c9284rA3.s;
            InterfaceC10590uz3 interfaceC10590uz3 = c9284rA3.c;
            if (c3118Xz3 != null && (dataInputStream = (DataInputStream) c3118Xz3.f()) != null) {
                c9284rA3.w = true;
                C9284rA3.m(dataInputStream, new C4818eA3(c9284rA3, false, ((AbstractC11276wz3) interfaceC10590uz3).o()), null);
            }
            ArrayList arrayList = c9284rA3.t;
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = c9284rA3.u;
                    if (!hasNext) {
                        break;
                    }
                    Pair pair = (Pair) it.next();
                    DataInputStream dataInputStream2 = (DataInputStream) ((AbstractC0185Bl) pair.first).f();
                    if (dataInputStream2 != null) {
                        hashSet.add((String) pair.second);
                        interfaceC2728Uz3.c(true);
                        C9284rA3.m(dataInputStream2, new C4818eA3(c9284rA3, arrayDeque.size() != 0, ((AbstractC11276wz3) interfaceC10590uz3).o()), null);
                    }
                }
                if (!hashSet.isEmpty()) {
                    FI2.a("Android.MergeState.ColdStart");
                }
                arrayList.clear();
            }
        } catch (Exception e) {
            AbstractC4851eH1.d("tabmodel", "loadState exception: " + e.toString(), e);
        }
        interfaceC2728Uz3.h(arrayDeque.size());
        Iterator it2 = c9284rA3.e.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it2;
            if (!c11814ya2.hasNext()) {
                return;
            }
            C9219qz3 c9219qz3 = (C9219qz3) c11814ya2.next();
            arrayDeque.size();
            c9219qz3.getClass();
        }
    }

    public final void e(boolean z) {
        C9284rA3 c9284rA3 = this.a;
        if (z) {
            while (true) {
                ArrayDeque arrayDeque = c9284rA3.h;
                if (arrayDeque.isEmpty() || c9284rA3.p.size() != 0 || c9284rA3.q.size() != 0) {
                    break;
                }
                TraceEvent i = TraceEvent.i("LoadFirstTabState", null);
                try {
                    c9284rA3.o((C8942qA3) arrayDeque.removeFirst(), true);
                    if (i != null) {
                        i.close();
                    }
                } catch (Throwable th) {
                    if (i != null) {
                        try {
                            i.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th;
                }
            }
        }
        c9284rA3.k();
    }
}
