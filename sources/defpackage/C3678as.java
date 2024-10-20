package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: as */
/* loaded from: classes.dex */
public final class C3678as implements InterfaceC3204Yr {
    public final WB2 a;
    public final Q94 b;
    public final Xe4 c;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public View h;
    public View i;
    public final String j;
    public boolean k;

    public C3678as(String str, WB2 wb2, Q94 q94, Xe4 xe4) {
        this.a = wb2;
        this.b = q94;
        this.c = xe4;
        this.j = str;
        this.k = AbstractC2442Su2.a(str);
    }

    @Override // defpackage.InterfaceC4365cs
    public final void f() {
        if (this.k) {
            return;
        }
        this.k = true;
        c(this.i);
    }

    @Override // defpackage.InterfaceC4365cs
    public final void stop() {
        if (this.k) {
            this.k = false;
            c(null);
        }
    }

    public final void b(FrameLayout frameLayout) {
        Ga4 ga4;
        HashMap hashMap = this.d;
        if (hashMap.containsKey(frameLayout)) {
            RecyclerView recyclerView = null;
            if (frameLayout == this.h) {
                c(null);
            }
            if (frameLayout == this.i) {
                this.i = null;
            }
            HashSet hashSet = this.g;
            boolean contains = hashSet.contains(frameLayout);
            HashMap hashMap2 = this.e;
            if (contains && (ga4 = (Ga4) hashMap2.get(frameLayout)) != null) {
                ((Ha4) ga4).a(2);
            }
            Xe4 xe4 = this.c;
            HashMap hashMap3 = xe4.h;
            hashMap3.remove(frameLayout);
            xe4.i = true;
            xe4.a();
            if (hashMap3.isEmpty()) {
                ViewParent parent = frameLayout.getParent();
                while (true) {
                    if (parent == null) {
                        break;
                    }
                    if (parent instanceof RecyclerView) {
                        recyclerView = (RecyclerView) parent;
                        break;
                    }
                    parent = parent.getParent();
                }
                if (recyclerView != null) {
                    recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(xe4);
                    recyclerView.getViewTreeObserver().removeOnScrollChangedListener(xe4);
                }
            }
            hashMap.remove(frameLayout);
            hashMap2.remove(frameLayout);
            this.f.remove(frameLayout);
            hashSet.remove(frameLayout);
            if (hashMap.isEmpty()) {
                xe4.g.remove(this);
            }
        }
    }

    public final void c(final View view) {
        View view2 = this.h;
        if (view2 == view) {
            return;
        }
        HashMap hashMap = this.d;
        if (view2 != null && hashMap.containsKey(view2)) {
            ((InterfaceC4365cs) hashMap.get(this.h)).stop();
        }
        this.h = view;
        if (view == null || !hashMap.containsKey(view)) {
            return;
        }
        if (AbstractC2442Su2.a(this.j)) {
            ((NJ0) this.a).a(new Runnable() { // from class: Zr
                @Override // java.lang.Runnable
                public final void run() {
                    C3678as c3678as = C3678as.this;
                    if (c3678as.h == view) {
                        c3678as.a();
                    }
                }
            }, 250L);
        } else {
            a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r8 = this;
            Q94 r0 = r8.b
            R94 r0 = (defpackage.R94) r0
            android.net.ConnectivityManager r1 = r0.c
            r2 = 1
            r3 = 0
            if (r1 != 0) goto Lb
            goto L3a
        Lb:
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            if (r1 != 0) goto L12
            goto L3a
        L12:
            int r1 = r1.getType()
            Wp3 r4 = r0.a
            TK0 r4 = (defpackage.TK0) r4
            r4.getClass()
            int r4 = J.N.MC3MPpYa()
            r5 = 2
            r6 = 3
            if (r4 == 0) goto L2b
            if (r4 == r5) goto L29
            r4 = r5
            goto L2c
        L29:
            r4 = r6
            goto L2c
        L2b:
            r4 = r2
        L2c:
            if (r1 == 0) goto L36
            if (r1 == r2) goto L31
            goto L3a
        L31:
            if (r4 == r5) goto L38
            if (r4 != r6) goto L3a
            goto L38
        L36:
            if (r4 != r6) goto L3a
        L38:
            r1 = r2
            goto L3b
        L3a:
            r1 = r3
        L3b:
            j31 r4 = defpackage.R94.d
            java.lang.String r5 = "VideoEligibilityCheckerImpl.java"
            java.lang.String r6 = "isAutoplayEligible"
            java.lang.String r7 = "com/google/chrome/elements/video/eligibility/VideoEligibilityCheckerImpl"
            if (r1 != 0) goto L57
            g31 r0 = r4.d()
            r1 = 50
            kI1 r0 = r0.g(r7, r1, r6, r5)
            g31 r0 = (defpackage.InterfaceC5462g31) r0
            java.lang.String r1 = "No network connection or not meet the requirements of user setting."
            r0.h(r1)
            goto L7d
        L57:
            android.view.accessibility.AccessibilityManager r0 = r0.b
            if (r0 == 0) goto L69
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L69
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto L69
            r0 = r2
            goto L6a
        L69:
            r0 = r3
        L6a:
            if (r0 == 0) goto L7e
            g31 r0 = r4.d()
            r1 = 55
            kI1 r0 = r0.g(r7, r1, r6, r5)
            g31 r0 = (defpackage.InterfaceC5462g31) r0
            java.lang.String r1 = "YouTube does not allow muted autoplay for devices where touch exploration is enabled, so we will not play YouTube or 3P videos."
            r0.h(r1)
        L7d:
            r2 = r3
        L7e:
            if (r2 != 0) goto L81
            return
        L81:
            java.util.HashMap r0 = r8.d
            android.view.View r1 = r8.h
            java.lang.Object r0 = r0.get(r1)
            cs r0 = (defpackage.InterfaceC4365cs) r0
            r0.f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3678as.a():void");
    }
}
