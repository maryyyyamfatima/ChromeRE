package defpackage;

import J.N;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModelJniBridge;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.content_public.common.ResourceRequestBody;
import org.chromium.url.GURL;
import org.chromium.url.Origin;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nz3 */
/* loaded from: classes.dex */
public final class C8190nz3 extends TabModelJniBridge {
    public final ArrayList i;
    public final AbstractC10569uv3 j;
    public final AbstractC10569uv3 k;
    public final InterfaceC9904sz3 l;
    public final TabContentManager m;
    public final InterfaceC6814jz3 n;
    public final C12157za2 o;
    public final InterfaceC3751b42 p;
    public final C10505ul q;
    public final C8830pr2 r;
    public int s;
    public boolean t;

    public C8190nz3(Profile profile, int i, AbstractC10569uv3 abstractC10569uv3, AbstractC10569uv3 abstractC10569uv32, InterfaceC9904sz3 interfaceC9904sz3, TabContentManager tabContentManager, InterfaceC3751b42 interfaceC3751b42, C10505ul c10505ul, InterfaceC6814jz3 interfaceC6814jz3, boolean z) {
        super(i, profile);
        this.i = new ArrayList();
        this.s = -1;
        this.j = abstractC10569uv3;
        this.k = abstractC10569uv32;
        this.l = interfaceC9904sz3;
        this.m = tabContentManager;
        this.p = interfaceC3751b42;
        this.q = c10505ul;
        this.n = interfaceC6814jz3;
        if (z && !this.a) {
            this.r = new C8830pr2(this, interfaceC6814jz3, new C7846mz3(this));
        }
        this.o = new C12157za2();
        this.h = N.M15HofTq(this, profile, this.g);
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void n(Tab tab) {
        D(tab, null, 0, false, true);
        Iterator it = this.o.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).J(tab);
            }
        }
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModelJniBridge, org.chromium.chrome.browser.tabmodel.TabModel
    public final void destroy() {
        l();
        ArrayList arrayList = this.i;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Tab tab = (Tab) it.next();
            if (((AbstractC11276wz3) this.n).k) {
                if (this.q.a.get(tab.getId()) != null) {
                }
            }
            if (tab.isInitialized()) {
                tab.destroy();
            }
        }
        C8830pr2 c8830pr2 = this.r;
        if (c8830pr2 != null) {
            C8143nr2 c8143nr2 = c8830pr2.e;
            if (!((AbstractC11276wz3) c8143nr2.g.b).k) {
                ArrayList arrayList2 = c8143nr2.a;
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Tab tab2 = (Tab) it2.next();
                    if (tab2.isInitialized()) {
                        tab2.destroy();
                    }
                }
                arrayList2.clear();
            }
            c8830pr2.d.clear();
        }
        arrayList.clear();
        this.o.clear();
        super.destroy();
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void g(InterfaceC8876pz3 interfaceC8876pz3) {
        this.o.a(interfaceC8876pz3);
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void i(InterfaceC8876pz3 interfaceC8876pz3) {
        this.o.d(interfaceC8876pz3);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:3:0x0009, B:4:0x0010, B:6:0x0019, B:8:0x0023, B:11:0x0030, B:17:0x003d, B:19:0x0049, B:21:0x004e, B:24:0x0055, B:26:0x005c, B:27:0x0063, B:29:0x0067, B:30:0x006f, B:32:0x0075, B:33:0x007a, B:37:0x008a, B:38:0x008d, B:39:0x0091, B:41:0x009a, B:44:0x00a6, B:49:0x0060, B:50:0x00ae, B:51:0x00b5), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:3:0x0009, B:4:0x0010, B:6:0x0019, B:8:0x0023, B:11:0x0030, B:17:0x003d, B:19:0x0049, B:21:0x004e, B:24:0x0055, B:26:0x005c, B:27:0x0063, B:29:0x0067, B:30:0x006f, B:32:0x0075, B:33:0x007a, B:37:0x008a, B:38:0x008d, B:39:0x0091, B:41:0x009a, B:44:0x00a6, B:49:0x0060, B:50:0x00ae, B:51:0x00b5), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:3:0x0009, B:4:0x0010, B:6:0x0019, B:8:0x0023, B:11:0x0030, B:17:0x003d, B:19:0x0049, B:21:0x004e, B:24:0x0055, B:26:0x005c, B:27:0x0063, B:29:0x0067, B:30:0x006f, B:32:0x0075, B:33:0x007a, B:37:0x008a, B:38:0x008d, B:39:0x0091, B:41:0x009a, B:44:0x00a6, B:49:0x0060, B:50:0x00ae, B:51:0x00b5), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:3:0x0009, B:4:0x0010, B:6:0x0019, B:8:0x0023, B:11:0x0030, B:17:0x003d, B:19:0x0049, B:21:0x004e, B:24:0x0055, B:26:0x005c, B:27:0x0063, B:29:0x0067, B:30:0x006f, B:32:0x0075, B:33:0x007a, B:37:0x008a, B:38:0x008d, B:39:0x0091, B:41:0x009a, B:44:0x00a6, B:49:0x0060, B:50:0x00ae, B:51:0x00b5), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a A[Catch: all -> 0x00b6, LOOP:1: B:39:0x0091->B:41:0x009a, LOOP_END, TryCatch #0 {all -> 0x00b6, blocks: (B:3:0x0009, B:4:0x0010, B:6:0x0019, B:8:0x0023, B:11:0x0030, B:17:0x003d, B:19:0x0049, B:21:0x004e, B:24:0x0055, B:26:0x005c, B:27:0x0063, B:29:0x0067, B:30:0x006f, B:32:0x0075, B:33:0x007a, B:37:0x008a, B:38:0x008d, B:39:0x0091, B:41:0x009a, B:44:0x00a6, B:49:0x0060, B:50:0x00ae, B:51:0x00b5), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4 A[EDGE_INSN: B:42:0x00a4->B:43:0x00a4 BREAK  A[LOOP:1: B:39:0x0091->B:41:0x009a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6 A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #0 {all -> 0x00b6, blocks: (B:3:0x0009, B:4:0x0010, B:6:0x0019, B:8:0x0023, B:11:0x0030, B:17:0x003d, B:19:0x0049, B:21:0x004e, B:24:0x0055, B:26:0x005c, B:27:0x0063, B:29:0x0067, B:30:0x006f, B:32:0x0075, B:33:0x007a, B:37:0x008a, B:38:0x008d, B:39:0x0091, B:41:0x009a, B:44:0x00a6, B:49:0x0060, B:50:0x00ae, B:51:0x00b5), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae A[Catch: all -> 0x00b6, TRY_ENTER, TryCatch #0 {all -> 0x00b6, blocks: (B:3:0x0009, B:4:0x0010, B:6:0x0019, B:8:0x0023, B:11:0x0030, B:17:0x003d, B:19:0x0049, B:21:0x004e, B:24:0x0055, B:26:0x005c, B:27:0x0063, B:29:0x0067, B:30:0x006f, B:32:0x0075, B:33:0x007a, B:37:0x008a, B:38:0x008d, B:39:0x0091, B:41:0x009a, B:44:0x00a6, B:49:0x0060, B:50:0x00ae, B:51:0x00b5), top: B:2:0x0009 }] */
    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(org.chromium.chrome.browser.tab.Tab r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            boolean r0 = r10.a
            sz3 r1 = r10.l
            za2 r2 = r10.o
            java.lang.String r3 = "TabModelImpl.addTab"
            r4 = 0
            org.chromium.base.TraceEvent.b(r3, r4)     // Catch: java.lang.Throwable -> Lb6
            java.util.Iterator r4 = r2.iterator()     // Catch: java.lang.Throwable -> Lb6
        L10:
            r5 = r4
            ya2 r5 = (defpackage.C11814ya2) r5     // Catch: java.lang.Throwable -> Lb6
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> Lb6
            if (r6 == 0) goto L23
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> Lb6
            pz3 r5 = (defpackage.InterfaceC8876pz3) r5     // Catch: java.lang.Throwable -> Lb6
            r5.X(r13, r11)     // Catch: java.lang.Throwable -> Lb6
            goto L10
        L23:
            r4 = r1
            tz3 r4 = (defpackage.C10247tz3) r4     // Catch: java.lang.Throwable -> Lb6
            boolean r4 = r4.b(r13, r0)     // Catch: java.lang.Throwable -> Lb6
            java.util.ArrayList r5 = r10.i
            r6 = 0
            r7 = 1
            if (r4 != 0) goto L3c
            int r4 = r5.size()     // Catch: java.lang.Throwable -> Lb6
            if (r4 != 0) goto L3a
            r4 = 5
            if (r13 != r4) goto L3a
            goto L3c
        L3a:
            r4 = r6
            goto L3d
        L3c:
            r4 = r7
        L3d:
            tz3 r1 = (defpackage.C10247tz3) r1     // Catch: java.lang.Throwable -> Lb6
            int r12 = r1.a(r13, r12, r11)     // Catch: java.lang.Throwable -> Lb6
            boolean r1 = r11.isIncognito()     // Catch: java.lang.Throwable -> Lb6
            if (r1 != r0) goto Lae
            r10.l()     // Catch: java.lang.Throwable -> Lb6
            if (r12 < 0) goto L60
            int r0 = r5.size()     // Catch: java.lang.Throwable -> Lb6
            if (r12 <= r0) goto L55
            goto L60
        L55:
            r5.add(r12, r11)     // Catch: java.lang.Throwable -> Lb6
            int r0 = r10.s     // Catch: java.lang.Throwable -> Lb6
            if (r12 > r0) goto L63
            int r0 = r0 + r7
            r10.s = r0     // Catch: java.lang.Throwable -> Lb6
            goto L63
        L60:
            r5.add(r11)     // Catch: java.lang.Throwable -> Lb6
        L63:
            boolean r12 = r10.t     // Catch: java.lang.Throwable -> Lb6
            if (r12 != 0) goto L6f
            int r12 = r10.s     // Catch: java.lang.Throwable -> Lb6
            int r12 = java.lang.Math.max(r12, r6)     // Catch: java.lang.Throwable -> Lb6
            r10.s = r12     // Catch: java.lang.Throwable -> Lb6
        L6f:
            boolean r12 = r10.v()     // Catch: java.lang.Throwable -> Lb6
            if (r12 == 0) goto L7a
            pr2 r12 = r10.r     // Catch: java.lang.Throwable -> Lb6
            r12.c()     // Catch: java.lang.Throwable -> Lb6
        L7a:
            int r12 = r10.s(r11)     // Catch: java.lang.Throwable -> Lb6
            long r0 = r10.h     // Catch: java.lang.Throwable -> Lb6
            r8 = 0
            int r5 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r5 == 0) goto L87
            goto L88
        L87:
            r7 = r6
        L88:
            if (r7 == 0) goto L8d
            J.N.M2Pb3$9r(r0, r10, r11)     // Catch: java.lang.Throwable -> Lb6
        L8d:
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> Lb6
        L91:
            r1 = r0
            ya2 r1 = (defpackage.C11814ya2) r1     // Catch: java.lang.Throwable -> Lb6
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lb6
            if (r2 == 0) goto La4
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> Lb6
            pz3 r1 = (defpackage.InterfaceC8876pz3) r1     // Catch: java.lang.Throwable -> Lb6
            r1.a0(r13, r14, r11)     // Catch: java.lang.Throwable -> Lb6
            goto L91
        La4:
            if (r4 == 0) goto Laa
            r11 = 2
            r10.q(r12, r11, r6)     // Catch: java.lang.Throwable -> Lb6
        Laa:
            org.chromium.base.TraceEvent.c(r3)
            return
        Lae:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r12 = "Attempting to open tab in wrong model"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Lb6
            throw r11     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r11 = move-exception
            org.chromium.base.TraceEvent.c(r3)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8190nz3.e(org.chromium.chrome.browser.tab.Tab, int, int, int):void");
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void t(int i, int i2) {
        ArrayList arrayList = this.i;
        int c = JM1.c(i2, 0, arrayList.size());
        int d = AbstractC1558Lz3.d(this, i);
        if (d == -1 || d == c || d + 1 == c) {
            return;
        }
        l();
        Tab tab = (Tab) arrayList.remove(d);
        if (d < c) {
            c--;
        }
        arrayList.add(c, tab);
        int i3 = this.s;
        if (d == i3) {
            this.s = c;
        } else if (d < i3 && c >= i3) {
            this.s = i3 - 1;
        } else if (d > i3 && c <= i3) {
            this.s = i3 + 1;
        }
        if (v()) {
            this.r.c();
        }
        Iterator it = this.o.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).Y(c, d, tab);
            }
        }
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final boolean f(Tab tab) {
        return k(tab, true, false);
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final Tab c(int i, boolean z) {
        Tab c = AbstractC1558Lz3.c(this, i);
        Tab a = AbstractC1558Lz3.a(this);
        if (c == null) {
            return a;
        }
        int s = s(c);
        Tab tabAt = getTabAt(s != 0 ? s - 1 : 1);
        int i2 = C1695Nb0.m(c).q;
        InterfaceC6814jz3 interfaceC6814jz3 = this.n;
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC6814jz3;
        boolean z2 = this.a;
        Tab c2 = AbstractC1558Lz3.c(abstractC11276wz3.j(z2), i2);
        if (c2 == null) {
            c2 = AbstractC1558Lz3.c(abstractC11276wz3.j(!z2), i2);
        }
        Tab b = z ? AbstractC1558Lz3.b(this, i) : null;
        if (!this.t) {
            a = AbstractC1558Lz3.a(((AbstractC11276wz3) interfaceC6814jz3).g());
        } else if (c == a || a == null || a.p()) {
            if (b != null && !b.p()) {
                a = b;
            } else if (c2 != null && !c2.p() && ((Integer) this.p.get()).intValue() == 0) {
                a = c2;
            } else if (tabAt == null || tabAt.p()) {
                a = z2 ? AbstractC1558Lz3.a(((AbstractC11276wz3) interfaceC6814jz3).j(false)) : null;
            } else {
                a = tabAt;
            }
        }
        if (a == null || !a.p()) {
            return a;
        }
        return null;
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final boolean z(int i) {
        return v() && this.r.e.o(i) != null;
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final boolean v() {
        return this.r != null;
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final InterfaceC1548Lx3 h() {
        return !v() ? this : this.r.e;
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void m(int i) {
        if (v()) {
            C8830pr2 c8830pr2 = this.r;
            Tab o = c8830pr2.e.o(i);
            if (o == null) {
                return;
            }
            ListIterator listIterator = c8830pr2.d.listIterator();
            while (listIterator.hasNext()) {
                C8487or2 c8487or2 = (C8487or2) listIterator.next();
                boolean remove = c8487or2.b.remove(o);
                if (remove) {
                    c8487or2.a.remove(o);
                }
                if (remove) {
                    c8830pr2.a(o);
                    if (c8487or2.b.isEmpty()) {
                        listIterator.remove();
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void C(int i) {
        if (v()) {
            C8830pr2 c8830pr2 = this.r;
            Tab o = c8830pr2.e.o(i);
            if (o == null) {
                return;
            }
            ListIterator listIterator = c8830pr2.d.listIterator();
            while (listIterator.hasNext()) {
                C8487or2 c8487or2 = (C8487or2) listIterator.next();
                if (c8487or2.b.remove(o)) {
                    if (c8487or2.b.isEmpty()) {
                        listIterator.remove();
                        c8830pr2.b(c8487or2.a);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void l() {
        if (!v()) {
            return;
        }
        C8830pr2 c8830pr2 = this.r;
        ListIterator listIterator = c8830pr2.d.listIterator();
        while (listIterator.hasNext()) {
            C8487or2 c8487or2 = (C8487or2) listIterator.next();
            listIterator.remove();
            c8830pr2.b(c8487or2.a);
        }
        Iterator it = this.o.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).u(this.a);
            }
        }
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void x() {
        if (!v()) {
            return;
        }
        Iterator it = this.r.c.a.o.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).B();
            }
        }
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final boolean k(Tab tab, boolean z, boolean z2) {
        return u(tab, null, z, false, z2, z2, true);
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final boolean d(Tab tab, Tab tab2, boolean z, boolean z2) {
        return u(tab, tab2, false, z, z2, z2, true);
    }

    public final boolean u(Tab tab, Tab tab2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (tab == null || !this.i.contains(tab)) {
            return false;
        }
        boolean v = z3 & v();
        tab.I(true);
        C12157za2 c12157za2 = this.o;
        Iterator it = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                break;
            }
            ((InterfaceC8876pz3) c11814ya2.next()).D(tab, z);
        }
        D(tab, tab2, z2 ? 1 : 0, v, !v);
        if (z4 && v) {
            this.r.d.add(new C8487or2(Collections.singletonList(tab)));
            Iterator it2 = c12157za2.iterator();
            while (true) {
                C11814ya2 c11814ya22 = (C11814ya2) it2;
                if (!c11814ya22.hasNext()) {
                    break;
                }
                ((InterfaceC8876pz3) c11814ya22.next()).I(tab);
            }
        }
        if (!v) {
            if (z5) {
                B(Collections.singletonList(tab));
            }
            y(tab, false);
        }
        return true;
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void p(List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Tab tab = (Tab) it.next();
            if (this.i.contains(tab)) {
                tab.I(true);
            }
        }
        boolean z = v();
        if (!z) {
            B(list);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            u((Tab) it2.next(), null, false, false, true, false, false);
        }
        if (!z) {
            return;
        }
        this.r.d.add(new C8487or2(list));
        Iterator it3 = this.o.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it3;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).O(list, false);
            }
        }
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void j() {
        w(false);
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void w(boolean z) {
        C12157za2 c12157za2 = this.o;
        Iterator it = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                break;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).V(this.a);
            }
        }
        ArrayList arrayList = this.i;
        if (!z) {
            if (!(C10648v91.d() && !T34.j(C10648v91.b()))) {
                for (int i = 0; i < getCount(); i++) {
                    getTabAt(i).I(true);
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                if (!v()) {
                    B(arrayList2);
                }
                while (getCount() > 0) {
                    u(getTabAt(0), null, false, false, true, false, false);
                }
                if (!v()) {
                    return;
                }
                this.r.d.add(new C8487or2(arrayList2));
                Iterator it2 = c12157za2.iterator();
                while (true) {
                    C11814ya2 c11814ya22 = (C11814ya2) it2;
                    if (!c11814ya22.hasNext()) {
                        return;
                    } else {
                        ((InterfaceC8876pz3) c11814ya22.next()).O(arrayList2, true);
                    }
                }
            }
        }
        l();
        for (int i2 = 0; i2 < getCount(); i2++) {
            getTabAt(i2).I(true);
        }
        B(arrayList);
        while (getCount() > 0) {
            u(getTabAt(0), null, true, z, false, false, false);
        }
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModelJniBridge, defpackage.InterfaceC1548Lx3
    public final Tab getTabAt(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.i;
        if (i >= arrayList.size()) {
            return null;
        }
        return (Tab) arrayList.get(i);
    }

    @Override // defpackage.InterfaceC1548Lx3
    public final int s(Tab tab) {
        int indexOf;
        if (tab == null || (indexOf = this.i.indexOf(tab)) == -1) {
            return -1;
        }
        return indexOf;
    }

    public final boolean A() {
        ArrayList arrayList = this.i;
        if (arrayList.size() <= 0) {
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (!((Tab) arrayList.get(i)).p()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModelJniBridge, org.chromium.chrome.browser.tabmodel.TabModel
    public final boolean isActiveModel() {
        return this.t;
    }

    public final void D(Tab tab, Tab tab2, int i, boolean z, boolean z2) {
        WebContents b;
        int id = tab.getId();
        int s = s(tab);
        Tab a = AbstractC1558Lz3.a(this);
        Tab tabAt = getTabAt(s == 0 ? 1 : s - 1);
        if (tab2 == null) {
            tab2 = c(id, false);
        }
        if (z2) {
            l();
        }
        if (z && (b = tab.b()) != null) {
            b.e1();
            b.V(true);
        }
        this.i.remove(tab);
        boolean isIncognito = tab2 == null ? false : tab2.isIncognito();
        int id2 = tab2 == null ? -1 : tab2.getId();
        InterfaceC6814jz3 interfaceC6814jz3 = this.n;
        int d = tab2 != null ? AbstractC1558Lz3.d(((AbstractC11276wz3) interfaceC6814jz3).j(isIncognito), id2) : -1;
        if (tab2 != a) {
            if (isIncognito != this.a) {
                this.s = s(tabAt);
            }
            ((AbstractC11276wz3) interfaceC6814jz3).j(isIncognito).q(d, i, false);
        } else {
            this.s = d;
        }
        if (z2 && v()) {
            this.r.c();
        }
    }

    public final void y(Tab tab, boolean z) {
        this.m.h(tab.getId());
        C12157za2 c12157za2 = this.o;
        Iterator it = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                break;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).y(tab);
            }
        }
        if (z) {
            Iterator it2 = c12157za2.iterator();
            while (true) {
                C11814ya2 c11814ya22 = (C11814ya2) it2;
                if (!c11814ya22.hasNext()) {
                    break;
                } else {
                    ((InterfaceC8876pz3) c11814ya22.next()).Z(tab);
                }
            }
        }
        tab.destroy();
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModelJniBridge
    public final boolean closeTabAt(int i) {
        return f(getTabAt(i));
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModelJniBridge
    public final AbstractC10569uv3 o(boolean z) {
        return z ? this.k : this.j;
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModelJniBridge
    public final boolean createTabWithWebContents(Tab tab, Profile profile, WebContents webContents) {
        AbstractC10569uv3 o = o(profile.i());
        o.getClass();
        return o.c(tab, webContents, 17, webContents.u());
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModelJniBridge
    public final void openNewTab(Tab tab, GURL gurl, Origin origin, String str, ResourceRequestBody resourceRequestBody, int i, boolean z, boolean z2) {
        int i2;
        if (tab.p()) {
            return;
        }
        boolean isIncognito = tab.isIncognito();
        int i3 = 4;
        if (i != 3) {
            if (i == 4 || i == 5) {
                i3 = 5;
            } else if (i != 6 && i == 8) {
                isIncognito = true;
            }
        }
        C4692dp1 c4692dp1 = (C4692dp1) tab.F().b(C4692dp1.class);
        C4349cp1 c4349cp1 = c4692dp1 == null ? null : c4692dp1.a;
        if (c4349cp1 != null) {
            i2 = 0;
            if (c4349cp1.c.v(new BG0(gurl, isIncognito, null, 0, false, false, null, true, false, false, true, false, null, z2, origin)).a != 3) {
                return;
            }
        } else {
            i2 = 0;
        }
        LoadUrlParams loadUrlParams = new LoadUrlParams(gurl.i(), i2);
        loadUrlParams.b = origin;
        loadUrlParams.g = str;
        loadUrlParams.b(resourceRequestBody);
        loadUrlParams.n = z2;
        o(isIncognito).b(i3, z ? tab : null, loadUrlParams);
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModelJniBridge, defpackage.InterfaceC1548Lx3
    public final int getCount() {
        return this.i.size();
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModelJniBridge, defpackage.InterfaceC1548Lx3
    public final int index() {
        return this.s;
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModelJniBridge
    public final boolean isSessionRestoreInProgress() {
        return ((C0129Az3) this.n).m.get();
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void a() {
        boolean z;
        if (v()) {
            C8830pr2 c8830pr2 = this.r;
            LinkedList linkedList = c8830pr2.d;
            if (linkedList.isEmpty()) {
                z = false;
            } else {
                Iterator it = ((C8487or2) linkedList.removeLast()).a.iterator();
                while (it.hasNext()) {
                    c8830pr2.a((Tab) it.next());
                }
                z = true;
            }
            if (z) {
                return;
            }
        }
        N.MhbdtZVX(((C0129Az3) this.n).t.a, this);
        if (getCount() == 1) {
            q(0, 2, false);
        }
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void q(int i, int i2, boolean z) {
        Tab a;
        try {
            TraceEvent.b("TabModelImpl.setIndex", null);
            InterfaceC6814jz3 interfaceC6814jz3 = this.n;
            boolean z2 = true;
            int id = (i2 == 0 || i2 == 1 || (a = AbstractC1558Lz3.a(((AbstractC11276wz3) interfaceC6814jz3).g())) == null) ? -1 : a.getId();
            if (!this.t) {
                ((C0129Az3) interfaceC6814jz3).t(this.a);
            }
            if (!A()) {
                this.s = -1;
            } else {
                this.s = JM1.c(i, 0, this.i.size() - 1);
            }
            Tab a2 = AbstractC1558Lz3.a(this);
            if (!z || a2 == null) {
                ((C0129Az3) interfaceC6814jz3).u(i2, a2);
            }
            if (a2 != null) {
                Iterator it = this.o.iterator();
                while (true) {
                    C11814ya2 c11814ya2 = (C11814ya2) it;
                    if (!c11814ya2.hasNext()) {
                        break;
                    } else {
                        ((InterfaceC8876pz3) c11814ya2.next()).R(i2, id, a2);
                    }
                }
                if (a2.getId() != id) {
                    z2 = false;
                }
                if (!z2 && i2 == 3) {
                    FI2.a("MobileTabSwitched");
                }
            }
        } finally {
            TraceEvent.c("TabModelImpl.setIndex");
        }
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void r(boolean z) {
        this.t = z;
    }

    public final void B(List list) {
        Iterator it = this.o.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).A(list);
            }
        }
    }
}
