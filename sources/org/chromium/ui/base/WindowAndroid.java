package org.chromium.ui.base;

import J.N;
import android.R;
import android.animation.Animator;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import defpackage.AbstractC1895Op0;
import defpackage.AbstractC3017Xf2;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC9771sd;
import defpackage.C0056Al0;
import defpackage.C0565Ej;
import defpackage.C11814ya2;
import defpackage.C11939yv1;
import defpackage.C12157za2;
import defpackage.C1861Oi1;
import defpackage.C2021Po1;
import defpackage.C3665ap4;
import defpackage.C5727gp4;
import defpackage.C8385oa2;
import defpackage.InterfaceC0218Br2;
import defpackage.InterfaceC1765Np0;
import defpackage.InterfaceC4352cp4;
import defpackage.InterfaceC5039ep4;
import defpackage.InterfaceC7697ma2;
import defpackage.J14;
import defpackage.K14;
import defpackage.V60;
import defpackage.ZX1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.chromium.chrome.browser.compositor.CompositorView;
import org.chromium.ui.permissions.AndroidPermissionDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class WindowAndroid implements AndroidPermissionDelegate, InterfaceC1765Np0 {
    public static final C1861Oi1 B = new C1861Oi1(null);
    public final C12157za2 A;
    public final C2021Po1 a;
    public C11939yv1 g;
    public long h;
    public final AbstractC1895Op0 i;
    public final C1861Oi1 j;
    public final HashSet k;
    public View l;
    public final AccessibilityManager m;
    public final C0565Ej n;
    public boolean o;
    public C5727gp4 p;
    public AndroidPermissionDelegate q;
    public boolean r;
    public ArrayList s;
    public final J14 t;
    public float u;
    public boolean v;
    public final C12157za2 w;
    public boolean x;
    public final C12157za2 y;
    public final boolean z;

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void l(float f) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void m(int i) {
    }

    public int q() {
        return 6;
    }

    public ZX1 s() {
        return null;
    }

    public View t() {
        return null;
    }

    public final float getRefreshRate() {
        return this.i.h;
    }

    public WindowAndroid(Context context) {
        this(context, AbstractC1895Op0.b(context));
    }

    public WindowAndroid(Context context, C2021Po1 c2021Po1) {
        this(context, AbstractC1895Op0.b(context));
        this.a = c2021Po1;
    }

    public final void w() {
        AbstractC1895Op0 abstractC1895Op0 = this.i;
        Display.Mode mode = abstractC1895Op0.i;
        List list = abstractC1895Op0.j;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (mode.equals(list.get(i))) {
                arrayList.add((Display.Mode) list.get(i));
            } else if (mode.getPhysicalWidth() == ((Display.Mode) list.get(i)).getPhysicalWidth() && mode.getPhysicalHeight() == ((Display.Mode) list.get(i)).getPhysicalHeight() && mode.getRefreshRate() != ((Display.Mode) list.get(i)).getRefreshRate()) {
                arrayList.add((Display.Mode) list.get(i));
            }
        }
        if (!arrayList.equals(this.s)) {
            this.s = arrayList;
            long j = this.h;
            if (j != 0) {
                N.MTDQeb$o(j, this, getSupportedRefreshRates());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x005e, code lost:            if ((r2 != null && r2.getCurrentModeType() == 4) == false) goto L149;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public WindowAndroid(android.content.Context r12, defpackage.AbstractC1895Op0 r13) {
        /*
            r11 = this;
            r11.<init>()
            yv1 r0 = defpackage.C11939yv1.g
            r11.g = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r11.k = r0
            Ej r0 = new Ej
            r0.<init>()
            r11.n = r0
            J14 r0 = new J14
            r0.<init>()
            r11.t = r0
            r0 = 1
            r11.v = r0
            za2 r1 = new za2
            r1.<init>()
            r11.w = r1
            za2 r1 = new za2
            r1.<init>()
            r11.y = r1
            za2 r1 = new za2
            r1.<init>()
            r11.A = r1
            Oi1 r1 = new Oi1
            r1.<init>(r12)
            r11.j = r1
            r11.i = r13
            java.util.WeakHashMap r1 = r13.a
            r2 = 0
            r1.put(r11, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            r3 = 0
            if (r1 < r2) goto L61
            java.lang.String r2 = "uimode"
            java.lang.Object r2 = r12.getSystemService(r2)
            android.app.UiModeManager r2 = (android.app.UiModeManager) r2
            if (r2 == 0) goto L5d
            int r2 = r2.getCurrentModeType()
            r4 = 4
            if (r2 != r4) goto L5d
            r2 = r0
            goto L5e
        L5d:
            r2 = r3
        L5e:
            if (r2 != 0) goto L61
            goto L62
        L61:
            r0 = r3
        L62:
            r11.z = r0
            r11.w()
            ln3 r0 = defpackage.C7432ln3.c()
            android.content.Context r2 = defpackage.V60.a     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = "accessibility"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch: java.lang.Throwable -> Lac
            android.view.accessibility.AccessibilityManager r2 = (android.view.accessibility.AccessibilityManager) r2     // Catch: java.lang.Throwable -> Lac
            r11.m = r2     // Catch: java.lang.Throwable -> Lac
            r0.close()
            r0 = 26
            if (r1 < r0) goto Lab
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            java.lang.String r1 = "8.0.0"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lab
            android.app.Activity r0 = defpackage.V60.a(r12)
            if (r0 == 0) goto Lab
            android.content.res.Resources r12 = r12.getResources()
            android.content.res.Configuration r12 = r12.getConfiguration()
            boolean r12 = defpackage.AbstractC1964Pd.a(r12)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r12)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r0 = r13
            r0.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        Lab:
            return
        Lac:
            r12 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.ui.base.WindowAndroid.<init>(android.content.Context, Op0):void");
    }

    public static long createForTesting() {
        return new WindowAndroid(V60.a).getNativePointer();
    }

    public final void clearNativePointer() {
        this.h = 0L;
    }

    public final void A(PendingIntent pendingIntent, InterfaceC4352cp4 interfaceC4352cp4, Integer num) {
        C2021Po1 c2021Po1 = this.a;
        if (c2021Po1 == null) {
            Objects.toString(pendingIntent);
        } else {
            c2021Po1.a(pendingIntent, interfaceC4352cp4, num);
        }
    }

    public final boolean B(Intent intent, InterfaceC4352cp4 interfaceC4352cp4, Integer num) {
        C2021Po1 c2021Po1 = this.a;
        if (c2021Po1 != null) {
            return c2021Po1.b(intent, interfaceC4352cp4, num) >= 0;
        }
        Objects.toString(intent);
        return false;
    }

    public int y(PendingIntent pendingIntent, InterfaceC4352cp4 interfaceC4352cp4, Integer num) {
        C2021Po1 c2021Po1 = this.a;
        if (c2021Po1 == null) {
            Objects.toString(pendingIntent);
            return -1;
        }
        return c2021Po1.a(pendingIntent, interfaceC4352cp4, num);
    }

    public int z(Intent intent, InterfaceC4352cp4 interfaceC4352cp4, Integer num) {
        C2021Po1 c2021Po1 = this.a;
        if (c2021Po1 == null) {
            Objects.toString(intent);
            return -1;
        }
        return c2021Po1.b(intent, interfaceC4352cp4, num);
    }

    @Override // org.chromium.ui.permissions.AndroidPermissionDelegate
    public boolean hasPermission(String str) {
        AndroidPermissionDelegate androidPermissionDelegate = this.q;
        if (androidPermissionDelegate != null) {
            return androidPermissionDelegate.hasPermission(str);
        }
        return AbstractC9771sd.a(Process.myPid(), Process.myUid(), V60.a, str) == 0;
    }

    @Override // org.chromium.ui.permissions.AndroidPermissionDelegate
    public boolean canRequestPermission(String str) {
        AndroidPermissionDelegate androidPermissionDelegate = this.q;
        if (androidPermissionDelegate != null) {
            return androidPermissionDelegate.canRequestPermission(str);
        }
        AbstractC4851eH1.f("WindowAndroid", "Cannot determine the request permission state as the context is not an Activity", new Object[0]);
        return false;
    }

    @Override // org.chromium.ui.permissions.AndroidPermissionDelegate
    public final boolean h(String str) {
        AndroidPermissionDelegate androidPermissionDelegate = this.q;
        if (androidPermissionDelegate != null) {
            return androidPermissionDelegate.h(str);
        }
        AbstractC4851eH1.f("WindowAndroid", "Cannot determine the policy permission state as the context is not an Activity", new Object[0]);
        return false;
    }

    @Override // org.chromium.ui.permissions.AndroidPermissionDelegate
    public final void b(String[] strArr, InterfaceC0218Br2 interfaceC0218Br2) {
        AndroidPermissionDelegate androidPermissionDelegate = this.q;
        if (androidPermissionDelegate != null) {
            androidPermissionDelegate.b(strArr, interfaceC0218Br2);
        } else {
            AbstractC4851eH1.f("WindowAndroid", "Cannot request permissions as the context is not an Activity", new Object[0]);
        }
    }

    @Override // org.chromium.ui.permissions.AndroidPermissionDelegate
    public final boolean f(int i, String[] strArr, int[] iArr) {
        AndroidPermissionDelegate androidPermissionDelegate = this.q;
        if (androidPermissionDelegate != null) {
            return androidPermissionDelegate.f(i, strArr, iArr);
        }
        return false;
    }

    @Override // org.chromium.ui.permissions.AndroidPermissionDelegate
    public final boolean e(String str) {
        AndroidPermissionDelegate androidPermissionDelegate = this.q;
        return androidPermissionDelegate != null && androidPermissionDelegate.e(str);
    }

    public WeakReference k() {
        return B;
    }

    private void onSelectionHandlesStateChanged(boolean z) {
        this.x = z;
        Iterator it = this.y.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((CompositorView) ((InterfaceC5039ep4) c11814ya2.next())).e(z);
            }
        }
    }

    public static boolean i(Intent intent) {
        return !AbstractC3017Xf2.b(intent, 0).isEmpty();
    }

    public void destroy() {
        long j = this.h;
        if (j != 0) {
            N.MV00Qksi(j, this);
        }
        J14 j14 = this.t;
        j14.a.getClass();
        C0056Al0 c0056Al0 = j14.b;
        if (!c0056Al0.a) {
            Iterator it = new HashSet(j14.d.keySet()).iterator();
            while (it.hasNext()) {
                ((K14) it.next()).c(j14);
            }
            j14.d = null;
            j14.c = null;
            c0056Al0.a = true;
        }
        C5727gp4 c5727gp4 = this.p;
        if (c5727gp4 != null) {
            c5727gp4.b.m.removeTouchExplorationStateChangeListener(c5727gp4.a);
        }
        C0565Ej c0565Ej = this.n;
        HashSet hashSet = c0565Ej.i;
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            ((C8385oa2) ((InterfaceC7697ma2) it2.next())).n(c0565Ej.j);
        }
        hashSet.clear();
    }

    private long getNativePointer() {
        Window u;
        if (this.h == 0) {
            int i = this.i.b;
            TypedValue typedValue = new TypedValue();
            Context context = (Context) this.j.get();
            float dimension = (context == null || !context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) ? 0.0f : typedValue.getDimension(context.getResources().getDisplayMetrics());
            boolean z = false;
            if (Build.VERSION.SDK_INT >= 29 && (u = u()) != null) {
                z = u.isWideColorGamut();
            }
            long MFjTMMS_ = N.MFjTMMS_(this, i, dimension, z);
            this.h = MFjTMMS_;
            N.MotttR54(MFjTMMS_, this, this.r);
        }
        return this.h;
    }

    private Window u() {
        Activity a = V60.a((Context) this.j.get());
        if (a == null || a.isFinishing()) {
            return null;
        }
        return a.getWindow();
    }

    public C11939yv1 r() {
        return this.g;
    }

    public final void C(Animator animator) {
        if (this.l == null) {
            return;
        }
        if (animator.isStarted()) {
            throw new IllegalArgumentException("Already started.");
        }
        if (!this.k.add(animator)) {
            throw new IllegalArgumentException("Already Added.");
        }
        animator.start();
        x();
        animator.addListener(new C3665ap4(this));
    }

    public final IBinder v() {
        View peekDecorView;
        Window u = u();
        if (u == null || (peekDecorView = u.peekDecorView()) == null) {
            return null;
        }
        return peekDecorView.getWindowToken();
    }

    public final void x() {
        boolean z = !this.o && this.k.isEmpty();
        if (this.l.willNotDraw() != z) {
            this.l.setWillNotDraw(z);
        }
    }

    @Override // defpackage.InterfaceC1765Np0
    public final void p(float f) {
        long j = this.h;
        if (j != 0) {
            N.MWNjxKcW(j, this, f);
        }
    }

    @Override // defpackage.InterfaceC1765Np0
    public final void c() {
        w();
    }

    @Override // defpackage.InterfaceC1765Np0
    public final void n() {
        w();
    }

    public void setWideColorEnabled(boolean z) {
        Window u;
        if (Build.VERSION.SDK_INT >= 29 && (u = u()) != null) {
            u.setColorMode(z ? 1 : 0);
        }
    }

    public final float[] getSupportedRefreshRates() {
        ArrayList arrayList = this.s;
        if (arrayList == null || !this.z) {
            return null;
        }
        float[] fArr = new float[arrayList.size()];
        for (int i = 0; i < this.s.size(); i++) {
            fArr[i] = ((Display.Mode) this.s.get(i)).getRefreshRate();
        }
        return fArr;
    }

    public final void setPreferredRefreshRate(float f) {
        this.u = f;
        if (this.v) {
            j(f);
        }
    }

    public final void j(float f) {
        if (this.s == null || !this.z) {
            return;
        }
        int i = 0;
        if (f != 0.0f) {
            Display.Mode mode = null;
            float f2 = Float.MAX_VALUE;
            for (int i2 = 0; i2 < this.s.size(); i2++) {
                Display.Mode mode2 = (Display.Mode) this.s.get(i2);
                float abs = Math.abs(f - mode2.getRefreshRate());
                if (abs < f2) {
                    mode = mode2;
                    f2 = abs;
                }
            }
            if (f2 > 2.0f) {
                AbstractC4851eH1.a("WindowAndroid", "Refresh rate not supported : " + f, new Object[0]);
            } else {
                i = mode.getModeId();
            }
        }
        Window u = u();
        if (u == null) {
            return;
        }
        WindowManager.LayoutParams attributes = u.getAttributes();
        if (attributes.preferredDisplayModeId == i) {
            return;
        }
        attributes.preferredDisplayModeId = i;
        u.setAttributes(attributes);
    }
}
