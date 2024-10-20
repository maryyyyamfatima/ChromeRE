package defpackage;

import android.os.Build;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Ip4 extends Up4 {
    public static boolean h = false;
    public static Method i;
    public static Class j;
    public static Field k;
    public static Field l;
    public final WindowInsets c;
    public C2141Qm1[] d;
    public C2141Qm1 e;
    public C5389fq4 f;
    public C2141Qm1 g;

    @Override // defpackage.Up4
    public C5389fq4 l(int i2, int i3, int i4, int i5) {
        Hp4 c11563xp4;
        C5389fq4 g = C5389fq4.g(null, this.c);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            c11563xp4 = new Gp4(g);
        } else if (i6 >= 29) {
            c11563xp4 = new Ep4(g);
        } else {
            c11563xp4 = new C11563xp4(g);
        }
        c11563xp4.g(C5389fq4.e(j(), i2, i3, i4, i5));
        c11563xp4.e(C5389fq4.e(h(), i2, i3, i4, i5));
        return c11563xp4.b();
    }

    public Ip4(C5389fq4 c5389fq4, WindowInsets windowInsets) {
        super(c5389fq4);
        this.e = null;
        this.c = windowInsets;
    }

    @Override // defpackage.Up4
    public final boolean n() {
        return this.c.isRound();
    }

    @Override // defpackage.Up4
    public C2141Qm1 f(int i2) {
        C2141Qm1 b;
        C2141Qm1 h2;
        int i3;
        C3065Xp0 e;
        C2141Qm1 c2141Qm1 = C2141Qm1.e;
        C2141Qm1 c2141Qm12 = c2141Qm1;
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i2 & i4) != 0) {
                if (i4 == 1) {
                    b = C2141Qm1.b(0, j().b, 0, 0);
                } else if (i4 == 2) {
                    C2141Qm1 j2 = j();
                    C5389fq4 c5389fq4 = this.f;
                    h2 = c5389fq4 != null ? c5389fq4.a.h() : null;
                    int i5 = j2.d;
                    if (h2 != null) {
                        i5 = Math.min(i5, h2.d);
                    }
                    b = C2141Qm1.b(j2.a, 0, j2.c, i5);
                } else if (i4 == 8) {
                    C2141Qm1[] c2141Qm1Arr = this.d;
                    h2 = c2141Qm1Arr != null ? c2141Qm1Arr[Vp4.a(8)] : null;
                    if (h2 != null) {
                        b = h2;
                    } else {
                        C2141Qm1 j3 = j();
                        C5389fq4 c5389fq42 = this.f;
                        C2141Qm1 h3 = c5389fq42 != null ? c5389fq42.a.h() : c2141Qm1;
                        int i6 = j3.d;
                        if (i6 > h3.d) {
                            b = C2141Qm1.b(0, 0, 0, i6);
                        } else {
                            C2141Qm1 c2141Qm13 = this.g;
                            if (c2141Qm13 != null && !c2141Qm13.equals(c2141Qm1) && (i3 = this.g.d) > h3.d) {
                                b = C2141Qm1.b(0, 0, 0, i3);
                            }
                            b = c2141Qm1;
                        }
                    }
                } else if (i4 == 16) {
                    b = i();
                } else if (i4 == 32) {
                    b = g();
                } else if (i4 != 64) {
                    if (i4 == 128) {
                        C5389fq4 c5389fq43 = this.f;
                        if (c5389fq43 != null) {
                            e = c5389fq43.a.e();
                        } else {
                            e = e();
                        }
                        if (e != null) {
                            int i7 = Build.VERSION.SDK_INT;
                            DisplayCutout displayCutout = e.a;
                            b = C2141Qm1.b(i7 >= 28 ? displayCutout.getSafeInsetLeft() : 0, i7 >= 28 ? displayCutout.getSafeInsetTop() : 0, i7 >= 28 ? displayCutout.getSafeInsetRight() : 0, i7 >= 28 ? displayCutout.getSafeInsetBottom() : 0);
                        }
                    }
                    b = c2141Qm1;
                } else {
                    b = k();
                }
                c2141Qm12 = C2141Qm1.a(c2141Qm12, b);
            }
        }
        return c2141Qm12;
    }

    @Override // defpackage.Up4
    public final C2141Qm1 j() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = C2141Qm1.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.Up4
    public final void p(C5389fq4 c5389fq4) {
        this.f = c5389fq4;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    @Override // defpackage.Up4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(android.view.View r8) {
        /*
            r7 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto Lb4
            boolean r0 = defpackage.Ip4.h
            r1 = 0
            java.lang.String r2 = "Failed to get visible insets. (Reflection error). "
            java.lang.String r3 = "WindowInsetsCompat"
            if (r0 != 0) goto L5b
            r0 = 1
            java.lang.Class<android.view.View> r4 = android.view.View.class
            java.lang.String r5 = "getViewRootImpl"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r6)     // Catch: java.lang.ReflectiveOperationException -> L45
            defpackage.Ip4.i = r4     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.String r4 = "android.view.View$AttachInfo"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.ReflectiveOperationException -> L45
            defpackage.Ip4.j = r4     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.String r5 = "mVisibleInsets"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch: java.lang.ReflectiveOperationException -> L45
            defpackage.Ip4.k = r4     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.String r4 = "android.view.ViewRootImpl"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.String r5 = "mAttachInfo"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch: java.lang.ReflectiveOperationException -> L45
            defpackage.Ip4.l = r4     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.reflect.Field r4 = defpackage.Ip4.k     // Catch: java.lang.ReflectiveOperationException -> L45
            r4.setAccessible(r0)     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.reflect.Field r4 = defpackage.Ip4.l     // Catch: java.lang.ReflectiveOperationException -> L45
            r4.setAccessible(r0)     // Catch: java.lang.ReflectiveOperationException -> L45
            goto L59
        L45:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            java.lang.String r6 = r4.getMessage()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r3, r5, r4)
        L59:
            defpackage.Ip4.h = r0
        L5b:
            java.lang.reflect.Method r0 = defpackage.Ip4.i
            if (r0 == 0) goto Lac
            java.lang.Class r4 = defpackage.Ip4.j
            if (r4 == 0) goto Lac
            java.lang.reflect.Field r4 = defpackage.Ip4.k
            if (r4 != 0) goto L68
            goto Lac
        L68:
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.ReflectiveOperationException -> L98
            java.lang.Object r8 = r0.invoke(r8, r1)     // Catch: java.lang.ReflectiveOperationException -> L98
            if (r8 != 0) goto L7b
            java.lang.String r8 = "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.ReflectiveOperationException -> L98
            r0.<init>()     // Catch: java.lang.ReflectiveOperationException -> L98
            android.util.Log.w(r3, r8, r0)     // Catch: java.lang.ReflectiveOperationException -> L98
            goto Lac
        L7b:
            java.lang.reflect.Field r0 = defpackage.Ip4.l     // Catch: java.lang.ReflectiveOperationException -> L98
            java.lang.Object r8 = r0.get(r8)     // Catch: java.lang.ReflectiveOperationException -> L98
            java.lang.reflect.Field r0 = defpackage.Ip4.k     // Catch: java.lang.ReflectiveOperationException -> L98
            java.lang.Object r8 = r0.get(r8)     // Catch: java.lang.ReflectiveOperationException -> L98
            android.graphics.Rect r8 = (android.graphics.Rect) r8     // Catch: java.lang.ReflectiveOperationException -> L98
            if (r8 == 0) goto Lac
            int r0 = r8.left     // Catch: java.lang.ReflectiveOperationException -> L98
            int r1 = r8.top     // Catch: java.lang.ReflectiveOperationException -> L98
            int r4 = r8.right     // Catch: java.lang.ReflectiveOperationException -> L98
            int r8 = r8.bottom     // Catch: java.lang.ReflectiveOperationException -> L98
            Qm1 r8 = defpackage.C2141Qm1.b(r0, r1, r4, r8)     // Catch: java.lang.ReflectiveOperationException -> L98
            goto Lad
        L98:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.String r1 = r8.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r3, r0, r8)
        Lac:
            r8 = 0
        Lad:
            if (r8 != 0) goto Lb1
            Qm1 r8 = defpackage.C2141Qm1.e
        Lb1:
            r7.g = r8
            return
        Lb4:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Ip4.d(android.view.View):void");
    }

    @Override // defpackage.Up4
    public final void o(C2141Qm1[] c2141Qm1Arr) {
        this.d = c2141Qm1Arr;
    }

    @Override // defpackage.Up4
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.g, ((Ip4) obj).g);
        }
        return false;
    }
}
