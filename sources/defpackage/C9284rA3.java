package defpackage;

import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rA3 */
/* loaded from: classes.dex */
public final class C9284rA3 {
    public C4131cA3 a;
    public final InterfaceC2728Uz3 b;
    public final InterfaceC10590uz3 c;
    public final InterfaceC10912vv3 d;
    public C8256oA3 j;
    public C7568mA3 k;
    public C7224lA3 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public SparseIntArray p;
    public SparseIntArray q;
    public final N33 r;
    public final C3118Xz3 s;
    public final ArrayList t;
    public final HashSet u;
    public byte[] v;
    public boolean w;
    public C3378Zz3 x;
    public C3248Yz3 y;
    public static final Object z = new Object();
    public static final C7569mB A = new C7569mB("CriticalPersistedTabData", "critical_persisted_tab_data_save_only", false);
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();
    public final ArrayDeque h = new ArrayDeque();
    public final HashSet i = new HashSet();
    public final C12157za2 e = new C12157za2();

    public static void c() {
        File[] listFiles;
        DataInputStream dataInputStream;
        int i = 0;
        if (O83.a.e("org.chromium.chrome.browser.tabmodel.TabPersistentStore.HAS_COMPUTED_MAX_ID", false)) {
            return;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Object obj = OA3.a;
            File[] listFiles2 = NA3.a.listFiles();
            if (listFiles2 != null) {
                int i2 = 0;
                for (File file : listFiles2) {
                    if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                        for (File file2 : listFiles) {
                            Pair b = QA3.b(file2.getName());
                            if (b != null) {
                                i2 = Math.max(i2, ((Integer) b.first).intValue());
                            } else if (file2.getName().startsWith("tab_state")) {
                                DataInputStream dataInputStream2 = null;
                                try {
                                    dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file2)));
                                } catch (Throwable th) {
                                    th = th;
                                }
                                try {
                                    i2 = Math.max(i2, m(dataInputStream, null, null));
                                    AbstractC2663Um3.a(dataInputStream);
                                } catch (Throwable th2) {
                                    th = th2;
                                    dataInputStream2 = dataInputStream;
                                    AbstractC2663Um3.a(dataInputStream2);
                                    throw th;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i = i2;
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            C8180nx3 a = C8180nx3.a();
            AtomicInteger atomicInteger = a.a;
            int i3 = i - atomicInteger.get();
            if (i3 >= 0) {
                atomicInteger.addAndGet(i3);
                a.b.q(atomicInteger.get(), "org.chromium.chrome.browser.tab.TabIdManager.NEXT_ID");
            }
            O83.a.p("org.chromium.chrome.browser.tabmodel.TabPersistentStore.HAS_COMPUTED_MAX_ID", true);
        } catch (Throwable th3) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th3;
        }
    }

    public static void a(C9284rA3 c9284rA3, C8942qA3 c8942qA3, IA3 ia3, C6844k43 c6844k43) {
        c9284rA3.getClass();
        boolean j = j(c8942qA3, ia3, c6844k43);
        if (j) {
            AbstractC4851eH1.d("tabmodel", "Finishing tab restore, isIncognito: " + j + " cancelIncognito: " + c9284rA3.o, new Object[0]);
        }
        if (!((j && c9284rA3.o) || (!j && c9284rA3.n))) {
            c9284rA3.n(c8942qA3, ia3, c6844k43, false);
        }
        c9284rA3.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7, types: [MF3] */
    public C9284rA3(InterfaceC2728Uz3 interfaceC2728Uz3, AbstractC11276wz3 abstractC11276wz3, InterfaceC10912vv3 interfaceC10912vv3) {
        this.b = interfaceC2728Uz3;
        this.c = abstractC11276wz3;
        this.d = interfaceC10912vv3;
        QF3 qf3 = QF3.l;
        N33 a = PostTask.a(qf3);
        this.r = a;
        this.t = new ArrayList();
        this.u = new HashSet();
        boolean g = interfaceC2728Uz3.g(a);
        interfaceC2728Uz3.k(a);
        N33 a2 = a;
        if (interfaceC2728Uz3.f()) {
            return;
        }
        a2 = g ? a2 : ((InterfaceC8967qF3) PostTask.e.get(qf3.d)).a(qf3);
        C3118Xz3 c3118Xz3 = new C3118Xz3(this, interfaceC2728Uz3.d());
        c3118Xz3.d(a2);
        this.s = c3118Xz3;
        int f = O83.a.f(-1, "org.chromium.chrome.browser.tabmodel.TabPersistentStore.ACTIVE_TAB_ID");
        if (f != -1) {
            if (h()) {
                C3248Yz3 c3248Yz3 = new C3248Yz3(this, SM0.j(f), f, a2);
                c3248Yz3.d(a2);
                this.y = c3248Yz3;
            } else {
                C3378Zz3 c3378Zz3 = new C3378Zz3(this, f);
                c3378Zz3.d(a2);
                this.x = c3378Zz3;
            }
        }
        if (interfaceC2728Uz3.l()) {
            for (String str : interfaceC2728Uz3.j()) {
                C3118Xz3 c3118Xz32 = new C3118Xz3(this, str);
                c3118Xz32.d(a2);
                this.t.add(Pair.create(c3118Xz32, str));
            }
        }
        if (i() || h()) {
            return;
        }
        boolean[] zArr = {false, true};
        for (int i = 0; i < 2; i++) {
            boolean z2 = zArr[i];
            AbstractC11276wz3 abstractC11276wz32 = (AbstractC11276wz3) this.c;
            int count = abstractC11276wz32.j(z2).getCount();
            for (int i2 = 0; i2 < count; i2++) {
                C1695Nb0.m(abstractC11276wz32.j(z2).getTabAt(i2)).a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(int r6, java.lang.String r7) {
        /*
            r5 = this;
            oA3 r0 = r5.j
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L2e
            qA3 r0 = r0.a
            if (r7 != 0) goto Le
            int r3 = r0.a
            if (r3 == r6) goto L18
        Le:
            if (r7 == 0) goto L2e
            java.lang.String r0 = r0.c
            boolean r0 = android.text.TextUtils.equals(r0, r7)
            if (r0 == 0) goto L2e
        L18:
            oA3 r0 = r5.j
            jA3 r3 = r0.b
            if (r3 == 0) goto L21
            r3.a(r1)
        L21:
            dF r0 = r0.c
            r0.a()
            oA3 r0 = r5.j
            qA3 r0 = r0.a
            r5.k()
            goto L2f
        L2e:
            r0 = r2
        L2f:
            java.util.ArrayDeque r3 = r5.h
            if (r0 != 0) goto L65
            if (r7 != 0) goto L4c
            java.util.Iterator r7 = r3.iterator()
        L39:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r7.next()
            qA3 r0 = (defpackage.C8942qA3) r0
            int r4 = r0.a
            if (r4 != r6) goto L39
        L49:
            r2 = r0
        L4a:
            r0 = r2
            goto L65
        L4c:
            java.util.Iterator r6 = r3.iterator()
        L50:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r6.next()
            qA3 r0 = (defpackage.C8942qA3) r0
            java.lang.String r4 = r0.c
            boolean r4 = android.text.TextUtils.equals(r4, r7)
            if (r4 == 0) goto L50
            goto L49
        L65:
            if (r0 == 0) goto L6d
            r3.remove(r0)
            r5.o(r0, r1)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9284rA3.p(int, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:6:0x000c, B:10:0x0055, B:12:0x005b, B:17:0x007f, B:24:0x0065, B:26:0x0069, B:28:0x006d, B:29:0x0075, B:30:0x001d, B:32:0x0021, B:34:0x0025, B:35:0x002c, B:37:0x0030, B:39:0x003b), top: B:5:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(defpackage.C8942qA3 r11, boolean r12) {
        /*
            r10 = this;
            java.lang.String r0 = "loadTabs exception: "
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()
            r2 = 1
            r3 = 0
            ln3 r4 = defpackage.C7432ln3.f()     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            Q83 r5 = defpackage.O83.a     // Catch: java.lang.Throwable -> L35
            java.lang.String r6 = "org.chromium.chrome.browser.tabmodel.TabPersistentStore.ACTIVE_TAB_ID"
            r7 = -1
            int r5 = r5.f(r7, r6)     // Catch: java.lang.Throwable -> L35
            boolean r6 = h()     // Catch: java.lang.Throwable -> L35
            r7 = 0
            if (r6 != 0) goto L1d
            goto L39
        L1d:
            int r6 = r11.a     // Catch: java.lang.Throwable -> L35
            if (r5 != r6) goto L2c
            Yz3 r8 = r10.y     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L2c
            java.lang.Object r6 = r8.f()     // Catch: java.lang.Throwable -> L35
            k43 r6 = (defpackage.C6844k43) r6     // Catch: java.lang.Throwable -> L35
            goto L55
        L2c:
            java.lang.Boolean r8 = r11.d     // Catch: java.lang.Throwable -> L35
            if (r8 != 0) goto L37
            java.lang.Boolean r8 = defpackage.SM0.j(r6)     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r11 = move-exception
            goto L86
        L37:
            if (r8 != 0) goto L3b
        L39:
            r6 = r7
            goto L55
        L3b:
            int r6 = r11.a     // Catch: java.lang.Throwable -> L35
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L35
            Lb0 r9 = defpackage.C1695Nb0.B     // Catch: java.lang.Throwable -> L35
            java.lang.Class<Nb0> r9 = defpackage.C1695Nb0.class
            js2 r8 = defpackage.EnumC6773js2.a(r9, r8)     // Catch: java.lang.Throwable -> L35
            ms2 r9 = r8.b()     // Catch: java.lang.Throwable -> L35
            java.lang.String r8 = r8.a     // Catch: java.lang.Throwable -> L35
            ls2 r6 = r9.c(r6, r8)     // Catch: java.lang.Throwable -> L35
            k43 r6 = (defpackage.C6844k43) r6     // Catch: java.lang.Throwable -> L35
        L55:
            boolean r8 = h()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L65
            Lb0 r8 = defpackage.C1695Nb0.B     // Catch: java.lang.Throwable -> L35
            if (r6 != 0) goto L61
            r8 = r2
            goto L62
        L61:
            r8 = r3
        L62:
            if (r8 != 0) goto L65
            goto L7f
        L65:
            int r7 = r11.a     // Catch: java.lang.Throwable -> L35
            if (r5 != r7) goto L75
            Zz3 r5 = r10.x     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L75
            java.lang.Object r5 = r5.f()     // Catch: java.lang.Throwable -> L35
            r7 = r5
            IA3 r7 = (defpackage.IA3) r7     // Catch: java.lang.Throwable -> L35
            goto L7f
        L75:
            java.io.File r5 = r10.g()     // Catch: java.lang.Throwable -> L35
            int r7 = r11.a     // Catch: java.lang.Throwable -> L35
            IA3 r7 = defpackage.QA3.d(r5, r7)     // Catch: java.lang.Throwable -> L35
        L7f:
            r10.n(r11, r7, r6, r12)     // Catch: java.lang.Throwable -> L35
            r4.close()     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            goto La6
        L86:
            r4.close()     // Catch: java.lang.Throwable -> L89
        L89:
            throw r11     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
        L8a:
            r11 = move-exception
            goto Laa
        L8c:
            r11 = move-exception
            java.lang.String r12 = "tabmodel"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Throwable -> L8a
            r4.append(r0)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L8a
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L8a
            r2[r3] = r11     // Catch: java.lang.Throwable -> L8a
            defpackage.AbstractC4851eH1.d(r12, r0, r2)     // Catch: java.lang.Throwable -> L8a
        La6:
            android.os.StrictMode.setThreadPolicy(r1)
            return
        Laa:
            android.os.StrictMode.setThreadPolicy(r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9284rA3.o(qA3, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(defpackage.C8942qA3 r20, defpackage.IA3 r21, defpackage.C6844k43 r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9284rA3.n(qA3, IA3, k43, boolean):void");
    }

    public final void b(Tab tab) {
        if (tab == null || tab.isDestroyed()) {
            return;
        }
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.contains(tab) || !JA3.a(tab).a) {
            return;
        }
        GURL url = tab.getUrl();
        if (url != null && url.h().equals("content")) {
            return;
        }
        if (!T34.k(tab.getUrl()) || tab.h() || tab.j()) {
            arrayDeque.addLast(tab);
        }
    }

    public final C8599pA3 t() {
        ArrayList arrayList = new ArrayList();
        C8256oA3 c8256oA3 = this.j;
        if (c8256oA3 != null) {
            arrayList.add(c8256oA3.a);
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            arrayList.add((C8942qA3) it.next());
        }
        Object obj = ThreadUtils.a;
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) this.c;
        int i = 1;
        TabModel j = abstractC11276wz3.j(true);
        int index = j.index();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < j.getCount(); i2++) {
            arrayList2.add(Integer.valueOf(j.getTabAt(i2).getId()));
            arrayList3.add(j.getTabAt(i2).getUrl().i());
        }
        TabModel j2 = abstractC11276wz3.j(false);
        int index2 = j2.index();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (int i3 = 0; i3 < j2.getCount(); i3++) {
            arrayList4.add(Integer.valueOf(j2.getTabAt(i3).getId()));
            arrayList5.add(j2.getTabAt(i3).getUrl().i());
        }
        int index3 = j2.index();
        int i4 = -1;
        if (index3 != -1) {
            Tab tabAt = j2.getTabAt(index3);
            i4 = tabAt.getId();
            if (!T34.k(tabAt.getUrl())) {
                i = 2;
            }
        } else {
            i = 0;
        }
        Q83 q83 = O83.a;
        q83.q(i4, "org.chromium.chrome.browser.tabmodel.TabPersistentStore.ACTIVE_TAB_ID");
        q83.q(i, "Chrome.AppLaunch.LastKnownActiveTabState");
        AbstractC4851eH1.d("tabmodel", "Appending tabs being restored to metadata lists, " + arrayList.size() + ", startingNormalCount: " + arrayList4.size() + ", startingIncognitoCount: " + arrayList2.size(), new Object[0]);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C8942qA3 c8942qA3 = (C8942qA3) it2.next();
            Boolean bool = c8942qA3.d;
            String str = c8942qA3.c;
            int i5 = c8942qA3.a;
            if (bool == null || bool.booleanValue()) {
                arrayList2.add(Integer.valueOf(i5));
                arrayList3.add(str);
            } else {
                arrayList4.add(Integer.valueOf(i5));
                arrayList5.add(str);
            }
        }
        int size = arrayList4.size();
        int size2 = arrayList2.size();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(5);
        dataOutputStream.writeInt(size2 + size);
        dataOutputStream.writeInt(size2);
        dataOutputStream.writeInt(index);
        dataOutputStream.writeInt(index2 + size2);
        AbstractC4851eH1.d("tabmodel", "Serializing tab lists; counts: " + size + ", " + size2, new Object[0]);
        Q83 q832 = O83.a;
        q832.q(size, "Chrome.StartSurface.RegularTabCount");
        q832.q(size2, "Chrome.StartSurface.IncognitoTabCount");
        for (int i6 = 0; i6 < size2; i6++) {
            dataOutputStream.writeInt(((Integer) arrayList2.get(i6)).intValue());
            dataOutputStream.writeUTF((String) arrayList3.get(i6));
        }
        for (int i7 = 0; i7 < size; i7++) {
            dataOutputStream.writeInt(((Integer) arrayList4.get(i7)).intValue());
            dataOutputStream.writeUTF((String) arrayList5.get(i7));
        }
        dataOutputStream.close();
        return new C8599pA3(byteArrayOutputStream.toByteArray());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(byte[] r8) {
        /*
            r7 = this;
            byte[] r0 = r7.v
            boolean r0 = java.util.Arrays.equals(r0, r8)
            if (r0 == 0) goto L9
            return
        L9:
            java.io.File r0 = r7.g()
            Uz3 r1 = r7.b
            java.lang.String r1 = r1.d()
            java.lang.String r2 = "Failed to write file: "
            java.lang.Object r3 = defpackage.C9284rA3.z
            monitor-enter(r3)
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L5e
            r4.<init>(r0, r1)     // Catch: java.lang.Throwable -> L5e
            El r0 = new El     // Catch: java.lang.Throwable -> L5e
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L5e
            r1 = 0
            java.io.FileOutputStream r5 = r0.f()     // Catch: java.io.IOException -> L2f java.lang.Throwable -> L5e
            int r6 = r8.length     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L5e
            r5.write(r8, r1, r6)     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L5e
            r0.b(r5)     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L5e
            goto L4c
        L2f:
            r5 = 0
        L30:
            if (r5 == 0) goto L35
            r0.a(r5)     // Catch: java.lang.Throwable -> L5e
        L35:
            java.lang.String r0 = "tabmodel"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L5e
            r5.append(r2)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L5e
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L5e
            defpackage.AbstractC4851eH1.a(r0, r2, r1)     // Catch: java.lang.Throwable -> L5e
        L4c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5e
            r7.v = r8
            org.chromium.base.library_loader.b r0 = org.chromium.base.library_loader.b.n
            boolean r0 = r0.f()
            if (r0 == 0) goto L5d
            java.lang.String r0 = "Android.TabPersistentStore.MetadataFileSize"
            int r8 = r8.length
            defpackage.EI2.e(r8, r0)
        L5d:
            return
        L5e:
            r8 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9284rA3.q(byte[]):void");
    }

    public static int m(DataInputStream dataInputStream, InterfaceC6880kA3 interfaceC6880kA3, SparseBooleanArray sparseBooleanArray) {
        boolean z2;
        boolean z3;
        Boolean valueOf;
        int readInt = dataInputStream.readInt();
        if (readInt == 5) {
            z2 = false;
            z3 = false;
        } else {
            if (readInt < 3) {
                return 0;
            }
            z3 = readInt < 5;
            z2 = readInt < 4;
        }
        int readInt2 = dataInputStream.readInt();
        int readInt3 = z3 ? -1 : dataInputStream.readInt();
        AbstractC4851eH1.d("tabmodel", "Tab metadata, skipIncognitoCount? " + z3 + " incognitoCount: " + readInt3 + " totalCount: " + readInt2, new Object[0]);
        int readInt4 = dataInputStream.readInt();
        int readInt5 = dataInputStream.readInt();
        if (readInt2 < 0 || readInt4 >= readInt2 || readInt5 >= readInt2) {
            throw new IOException();
        }
        int i = 0;
        int i2 = 0;
        while (i2 < readInt2) {
            int readInt6 = dataInputStream.readInt();
            String readUTF = z2 ? "" : dataInputStream.readUTF();
            if (readInt6 >= i) {
                i = readInt6 + 1;
            }
            int i3 = i;
            if (sparseBooleanArray != null) {
                sparseBooleanArray.append(readInt6, true);
            }
            if (readInt3 < 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(i2 < readInt3);
            }
            Boolean bool = valueOf;
            if (interfaceC6880kA3 != null) {
                interfaceC6880kA3.a(i2, readInt6, bool, readUTF, i2 == readInt5, i2 == readInt4);
            }
            i2++;
            i = i3;
        }
        return i;
    }

    public final void r() {
        if (this.k != null) {
            return;
        }
        ArrayDeque arrayDeque = this.f;
        if (!arrayDeque.isEmpty()) {
            C7568mA3 c7568mA3 = new C7568mA3(this, (Tab) arrayDeque.removeFirst());
            this.k = c7568mA3;
            c7568mA3.d(this.r);
            return;
        }
        s();
    }

    public final void s() {
        C7224lA3 c7224lA3 = this.l;
        if (c7224lA3 != null) {
            c7224lA3.a(true);
        }
        C7224lA3 c7224lA32 = new C7224lA3(this);
        this.l = c7224lA32;
        c7224lA32.d(this.r);
    }

    public final File g() {
        return this.b.n();
    }

    public final void f(int i, boolean z2) {
        File file = new File(g(), QA3.a(i, z2));
        if (!file.exists() || file.delete()) {
            return;
        }
        AbstractC4851eH1.a("TabState", TM0.a("Failed to delete TabState: ", file), new Object[0]);
    }

    public final void l() {
        Iterator it = this.e.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            }
            final C9219qz3 c9219qz3 = (C9219qz3) c11814ya2.next();
            PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: Vz3
                @Override // java.lang.Runnable
                public final void run() {
                    C9219qz3.this.a.b.p();
                }
            });
        }
    }

    public final void k() {
        if (this.m) {
            return;
        }
        ArrayDeque arrayDeque = this.h;
        if (arrayDeque.isEmpty()) {
            this.p = null;
            this.q = null;
            this.w = false;
            InterfaceC2728Uz3 interfaceC2728Uz3 = this.b;
            if (interfaceC2728Uz3.f()) {
                PostTask.c(AbstractC5103f04.a, new RunnableC5162fA3(this));
                Iterator it = new HashSet(this.u).iterator();
                while (it.hasNext()) {
                    d((String) it.next(), true);
                }
                Iterator it2 = this.e.iterator();
                while (true) {
                    C11814ya2 c11814ya2 = (C11814ya2) it2;
                    if (!c11814ya2.hasNext()) {
                        break;
                    } else {
                        ((C9219qz3) c11814ya2.next()).getClass();
                    }
                }
            }
            interfaceC2728Uz3.a(new C5506gA3(this));
            ArrayList arrayList = new ArrayList();
            AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) this.c;
            int count = abstractC11276wz3.j(false).getCount();
            for (int i = 0; i < count; i++) {
                arrayList.add(Integer.valueOf(abstractC11276wz3.j(false).getTabAt(i).getId()));
            }
            HashMap hashMap = AbstractC4368cs2.m;
            Object obj = ThreadUtils.a;
            Iterator it3 = AbstractC4368cs2.n.iterator();
            while (it3.hasNext()) {
                EnumC6773js2 a = EnumC6773js2.a((Class) it3.next(), false);
                a.b().e(a.a, arrayList);
            }
            l();
            this.j = null;
            EI2.e(abstractC11276wz3.j(false).getCount(), "Tabs.Startup.TabCount.Regular");
            EI2.e(abstractC11276wz3.j(true).getCount(), "Tabs.Startup.TabCount.Incognito");
            AbstractC4851eH1.d("tabmodel", "Loaded tab lists; counts: " + abstractC11276wz3.j(false).getCount() + "," + abstractC11276wz3.j(true).getCount(), new Object[0]);
            return;
        }
        final C8256oA3 c8256oA3 = new C8256oA3(this, (C8942qA3) arrayDeque.removeFirst());
        this.j = c8256oA3;
        if (h()) {
            C8942qA3 c8942qA3 = c8256oA3.a;
            Boolean bool = c8942qA3.d;
            if (bool == null) {
                bool = SM0.j(c8942qA3.a);
            }
            if (bool == null) {
                c8256oA3.a();
                return;
            }
            int i2 = c8942qA3.a;
            TraceEvent.j(i2, "LoadCriticalPersistedTabData");
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean booleanValue = bool.booleanValue();
            C3809bF b = c8256oA3.c.b(new Callback() { // from class: nA3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj2) {
                    return new ZE(this, obj2);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj2) {
                    C6844k43 c6844k43 = (C6844k43) obj2;
                    C8256oA3 c8256oA32 = C8256oA3.this;
                    C8942qA3 c8942qA32 = c8256oA32.a;
                    TraceEvent.e(c8942qA32.a, "LoadCriticalPersistedTabData");
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[1];
                    objArr[0] = c6844k43 == null ? "Null" : "Exists";
                    EI2.n(SystemClock.elapsedRealtime() - elapsedRealtime, String.format(locale, "Tabs.SavedTabLoadTime.CriticalPersistedTabData.%s", objArr));
                    C1436Lb0 c1436Lb0 = C1695Nb0.B;
                    if (c6844k43 == null) {
                        c8256oA32.a();
                    } else {
                        C9284rA3.a(c8256oA32.d, c8942qA32, null, c6844k43);
                    }
                }
            });
            C1436Lb0 c1436Lb0 = C1695Nb0.B;
            EnumC6773js2 a2 = EnumC6773js2.a(C1695Nb0.class, booleanValue);
            a2.b().d(i2, a2.a, b);
            return;
        }
        c8256oA3.a();
    }

    public final void d(final String str, boolean z2) {
        if (z2) {
            new C6194iA3(this, str).d(this.r);
        } else {
            PostTask.d(QF3.h, new Runnable() { // from class: Wz3
                @Override // java.lang.Runnable
                public final void run() {
                    C9284rA3.this.e(str);
                }
            });
        }
    }

    public final void e(String str) {
        Object obj = ThreadUtils.a;
        File file = new File(g(), str);
        if (file.exists()) {
            if (!file.delete()) {
                AbstractC4851eH1.a("tabmodel", TM0.a("Failed to delete file: ", file), new Object[0]);
            }
            HashSet hashSet = this.u;
            if (hashSet.remove(str) && hashSet.isEmpty()) {
                this.b.c(false);
            }
        }
    }

    public static boolean h() {
        return UN.r.a() && !A.c();
    }

    public static boolean i() {
        return UN.r.a() && A.c();
    }

    public static boolean j(C8942qA3 c8942qA3, IA3 ia3, C6844k43 c6844k43) {
        if (ia3 != null) {
            AbstractC4851eH1.d("tabmodel", "#isIncognitoTabBeingRestored from tabState:  " + ia3.h, new Object[0]);
            return ia3.h;
        }
        if (c8942qA3.d != null) {
            StringBuilder sb = new StringBuilder("#isIncognitoTabBeingRestored from tabDetails:  ");
            Boolean bool = c8942qA3.d;
            sb.append(bool);
            AbstractC4851eH1.d("tabmodel", sb.toString(), new Object[0]);
            return bool.booleanValue();
        }
        C1436Lb0 c1436Lb0 = C1695Nb0.B;
        if (!(c6844k43 == null)) {
            return SM0.j(c8942qA3.a).booleanValue();
        }
        AbstractC4851eH1.d("tabmodel", "#isIncognitoTabBeingRestored defaulting to false", new Object[0]);
        return false;
    }
}
