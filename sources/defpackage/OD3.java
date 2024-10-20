package defpackage;

import android.util.SparseBooleanArray;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OD3 implements InterfaceC2728Uz3 {
    public static final Object h = new Object();
    public static final Object i = new Object();
    public static final AtomicBoolean j = new AtomicBoolean();
    public static MD3 k;
    public static AbstractC0185Bl l;
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public TabContentManager f;
    public boolean g;

    @Override // defpackage.InterfaceC2728Uz3
    public final /* synthetic */ void k(N33 n33) {
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final boolean m() {
        return true;
    }

    public OD3(int i2, int i3, boolean z, boolean z2) {
        this.a = i2;
        this.b = i2 == 0 ? 1 : 0;
        this.c = z;
        this.d = z2;
        this.e = i3;
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final File n() {
        return OA3.a();
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final String d() {
        return q(this.a);
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final boolean l() {
        return this.c;
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final List j() {
        ArrayList arrayList = new ArrayList();
        if (this.c || this.d) {
            arrayList.add(q(this.b));
        }
        return arrayList;
    }

    public static String q(int i2) {
        String num = Integer.toString(i2);
        Object obj = C9284rA3.z;
        return AbstractC4809e90.a("tab_state", num);
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final boolean g(N33 n33) {
        Object obj = ThreadUtils.a;
        Q83 q83 = O83.a;
        boolean e = q83.e("org.chromium.chrome.browser.tabmodel.TabPersistentStore.HAS_RUN_FILE_MIGRATION", false);
        boolean e2 = q83.e("org.chromium.chrome.browser.tabmodel.TabPersistentStore.HAS_RUN_MULTI_INSTANCE_FILE_MIGRATION", false);
        if (e && e2) {
            return false;
        }
        synchronized (h) {
            if (k != null) {
                return true;
            }
            MD3 md3 = new MD3(this, e, e2);
            md3.d(n33);
            k = md3;
            return true;
        }
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final void e() {
        MD3 md3 = k;
        if (md3 == null) {
            return;
        }
        try {
            md3.f();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final boolean f() {
        return j.get();
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final void c(boolean z) {
        j.set(z);
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final void o() {
        synchronized (i) {
            AbstractC0185Bl abstractC0185Bl = l;
            if (abstractC0185Bl != null) {
                abstractC0185Bl.a(true);
            }
        }
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final void a(C5506gA3 c5506gA3) {
        synchronized (i) {
            AbstractC0185Bl abstractC0185Bl = l;
            if (abstractC0185Bl != null) {
                abstractC0185Bl.a(true);
            }
            ND3 nd3 = new ND3(this, c5506gA3, new InterfaceC0079Ap3() { // from class: KD3
                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    OD3 od3 = OD3.this;
                    return od3.p(od3.a);
                }
            });
            l = nd3;
            nd3.c(AbstractC0185Bl.e);
        }
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final void i(C5850hA3 c5850hA3, final int i2) {
        InterfaceC10590uz3 interfaceC10590uz3 = (InterfaceC10590uz3) ED3.a().i.get(i2);
        if (interfaceC10590uz3 != null) {
            int i3 = 0;
            while (true) {
                AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
                if (i3 >= abstractC11276wz3.a.size()) {
                    break;
                }
                TabModel tabModel = (TabModel) abstractC11276wz3.a.get(i3);
                while (tabModel.getCount() > 0) {
                    tabModel.n(tabModel.getTabAt(0));
                }
                i3++;
            }
        }
        synchronized (i) {
            AbstractC0185Bl abstractC0185Bl = l;
            if (abstractC0185Bl != null) {
                abstractC0185Bl.a(true);
            }
            ND3 nd3 = new ND3(this, c5850hA3, new InterfaceC0079Ap3() { // from class: LD3
                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    return OD3.this.p(i2);
                }
            });
            l = nd3;
            nd3.c(AbstractC0185Bl.e);
        }
    }

    public final SparseBooleanArray p(int i2) {
        DataInputStream dataInputStream;
        Exception e;
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i3 = 0; i3 < this.e; i3++) {
            if (i3 != i2) {
                File file = new File(OA3.a(), q(i3));
                if (file.exists()) {
                    DataInputStream dataInputStream2 = null;
                    try {
                        dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
                        try {
                            C9284rA3.m(dataInputStream, null, sparseBooleanArray);
                        } catch (Exception e2) {
                            e = e2;
                            try {
                                AbstractC4851eH1.a("tabmodel", "Unable to read state for " + file.getName() + ": " + e, new Object[0]);
                                AbstractC2663Um3.a(dataInputStream);
                            } catch (Throwable th) {
                                th = th;
                                dataInputStream2 = dataInputStream;
                                dataInputStream = dataInputStream2;
                                AbstractC2663Um3.a(dataInputStream);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            AbstractC2663Um3.a(dataInputStream);
                            throw th;
                        }
                    } catch (Exception e3) {
                        dataInputStream = null;
                        e = e3;
                    } catch (Throwable th3) {
                        th = th3;
                        dataInputStream = dataInputStream2;
                        AbstractC2663Um3.a(dataInputStream);
                        throw th;
                    }
                    AbstractC2663Um3.a(dataInputStream);
                } else {
                    continue;
                }
            }
        }
        return sparseBooleanArray;
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final void b(TabContentManager tabContentManager) {
        this.f = tabContentManager;
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final void h(int i2) {
        EI2.e(i2, "Tabs.CountAtStartup");
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final void destroy() {
        this.f = null;
        this.g = true;
    }
}
