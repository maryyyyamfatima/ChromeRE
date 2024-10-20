package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sP2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9701sP2 {
    public static C9701sP2 i;
    public WeakHashMap a;
    public C1439Lb3 b;
    public C1593Mg3 c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue e;
    public boolean f;
    public C1065If g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final C8330oP2 j = new C8330oP2();

    public static synchronized C9701sP2 d() {
        C9701sP2 c9701sP2;
        synchronized (C9701sP2.class) {
            if (i == null) {
                C9701sP2 c9701sP22 = new C9701sP2();
                i = c9701sP22;
                j(c9701sP22);
            }
            c9701sP2 = i;
        }
        return c9701sP2;
    }

    public static void j(C9701sP2 c9701sP2) {
        if (Build.VERSION.SDK_INT < 24) {
            c9701sP2.a("vector", new C9358rP2());
            c9701sP2.a("animated-vector", new C7986nP2());
            c9701sP2.a("animated-selector", new C7642mP2());
            c9701sP2.a("drawable", new C8673pP2());
        }
    }

    public final synchronized Drawable g(Context context, int i2) {
        return f(i2, context, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable c(android.content.Context r8, int r9) {
        /*
            r7 = this;
            android.util.TypedValue r0 = r7.e
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r7.e = r0
        Lb:
            android.util.TypedValue r0 = r7.e
            android.content.res.Resources r1 = r8.getResources()
            r2 = 1
            r1.getValue(r9, r0, r2)
            int r1 = r0.assetCookie
            long r3 = (long) r1
            r1 = 32
            long r3 = r3 << r1
            int r1 = r0.data
            long r5 = (long) r1
            long r3 = r3 | r5
            android.graphics.drawable.Drawable r1 = r7.e(r3, r8)
            if (r1 == 0) goto L26
            return r1
        L26:
            If r1 = r7.g
            if (r1 != 0) goto L2b
            goto L73
        L2b:
            r1 = 2131296342(0x7f090056, float:1.8210598E38)
            if (r9 != r1) goto L4c
            android.graphics.drawable.LayerDrawable r9 = new android.graphics.drawable.LayerDrawable
            r1 = 2
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            r5 = 2131296341(0x7f090055, float:1.8210596E38)
            android.graphics.drawable.Drawable r5 = r7.g(r8, r5)
            r6 = 0
            r1[r6] = r5
            r5 = 2131296343(0x7f090057, float:1.82106E38)
            android.graphics.drawable.Drawable r5 = r7.g(r8, r5)
            r1[r2] = r5
            r9.<init>(r1)
            goto L74
        L4c:
            r1 = 2131296377(0x7f090079, float:1.8210669E38)
            if (r9 != r1) goto L59
            r9 = 2131230779(0x7f08003b, float:1.807762E38)
            android.graphics.drawable.LayerDrawable r9 = defpackage.C1065If.c(r7, r8, r9)
            goto L74
        L59:
            r1 = 2131296376(0x7f090078, float:1.8210667E38)
            if (r9 != r1) goto L66
            r9 = 2131230780(0x7f08003c, float:1.8077622E38)
            android.graphics.drawable.LayerDrawable r9 = defpackage.C1065If.c(r7, r8, r9)
            goto L74
        L66:
            r1 = 2131296378(0x7f09007a, float:1.821067E38)
            if (r9 != r1) goto L73
            r9 = 2131230781(0x7f08003d, float:1.8077624E38)
            android.graphics.drawable.LayerDrawable r9 = defpackage.C1065If.c(r7, r8, r9)
            goto L74
        L73:
            r9 = 0
        L74:
            if (r9 == 0) goto L7e
            int r0 = r0.changingConfigurations
            r9.setChangingConfigurations(r0)
            r7.b(r8, r3, r9)
        L7e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9701sP2.c(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable e(long j2, Context context) {
        C3487aJ1 c3487aJ1 = (C3487aJ1) this.d.get(context);
        if (c3487aJ1 == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c3487aJ1.d(j2);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c3487aJ1.j(j2);
        }
        return null;
    }

    public final synchronized void b(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C3487aJ1 c3487aJ1 = (C3487aJ1) this.d.get(context);
            if (c3487aJ1 == null) {
                c3487aJ1 = new C3487aJ1();
                this.d.put(context, c3487aJ1);
            }
            c3487aJ1.i(j2, new WeakReference(constantState));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(int r7, android.content.Context r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            If r0 = r6.g
            r1 = 0
            if (r0 == 0) goto L6e
            android.graphics.PorterDuff$Mode r2 = defpackage.C1195Jf.b
            int[] r3 = r0.a
            boolean r3 = defpackage.C1065If.a(r3, r7)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L15
            r7 = 2131034388(0x7f050114, float:1.7679292E38)
            goto L48
        L15:
            int[] r3 = r0.c
            boolean r3 = defpackage.C1065If.a(r3, r7)
            if (r3 == 0) goto L21
            r7 = 2131034386(0x7f050112, float:1.7679288E38)
            goto L48
        L21:
            int[] r0 = r0.d
            boolean r0 = defpackage.C1065If.a(r0, r7)
            if (r0 == 0) goto L2c
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L45
        L2c:
            r0 = 2131296363(0x7f09006b, float:1.821064E38)
            if (r7 != r0) goto L40
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r2
            r2 = r0
            r0 = r7
            r7 = r4
            goto L50
        L40:
            r0 = 2131296345(0x7f090059, float:1.8210604E38)
            if (r7 != r0) goto L4b
        L45:
            r7 = 16842801(0x1010031, float:2.3693695E-38)
        L48:
            r0 = r7
            r7 = r4
            goto L4d
        L4b:
            r7 = r1
            r0 = r7
        L4d:
            r3 = r2
            r2 = r0
            r0 = r5
        L50:
            if (r7 == 0) goto L6a
            int[] r7 = defpackage.AbstractC3085Xt0.a
            android.graphics.drawable.Drawable r7 = r9.mutate()
            int r8 = defpackage.AbstractC3838bK3.c(r8, r2)
            android.graphics.PorterDuffColorFilter r8 = defpackage.C1195Jf.c(r8, r3)
            r7.setColorFilter(r8)
            if (r0 == r5) goto L68
            r7.setAlpha(r0)
        L68:
            r7 = r4
            goto L6b
        L6a:
            r7 = r1
        L6b:
            if (r7 == 0) goto L6e
            r1 = r4
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9701sP2.k(int, android.content.Context, android.graphics.drawable.Drawable):boolean");
    }

    public final void a(String str, InterfaceC9016qP2 interfaceC9016qP2) {
        if (this.b == null) {
            this.b = new C1439Lb3(0);
        }
        this.b.put(str, interfaceC9016qP2);
    }

    public final synchronized ColorStateList i(Context context, int i2) {
        ColorStateList colorStateList;
        C1593Mg3 c1593Mg3;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (c1593Mg3 = (C1593Mg3) weakHashMap.get(context)) == null) ? null : (ColorStateList) c1593Mg3.d(i2);
        if (colorStateList == null) {
            C1065If c1065If = this.g;
            if (c1065If != null) {
                colorStateList2 = c1065If.d(context, i2);
            }
            if (colorStateList2 != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                C1593Mg3 c1593Mg32 = (C1593Mg3) this.a.get(context);
                if (c1593Mg32 == null) {
                    c1593Mg32 = new C1593Mg3();
                    this.a.put(context, c1593Mg32);
                }
                c1593Mg32.a(i2, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C9701sP2.class) {
            C8330oP2 c8330oP2 = j;
            c8330oP2.getClass();
            int i3 = (i2 + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) c8330oP2.b(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                c8330oP2.getClass();
            }
        }
        return porterDuffColorFilter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x002b, code lost:            if (r0 == false) goto L100;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0115, code lost:            r14.setTintMode(r3);     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ea A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:6:0x002d, B:8:0x0032, B:10:0x0038, B:12:0x003e, B:15:0x004c, B:18:0x005d, B:20:0x0061, B:21:0x0068, B:25:0x00ea, B:27:0x00f0, B:29:0x00f8, B:31:0x00fe, B:35:0x0115, B:40:0x0111, B:41:0x011b, B:45:0x0132, B:56:0x0168, B:57:0x0192, B:62:0x019f, B:66:0x0082, B:68:0x0086, B:71:0x0092, B:72:0x009a, B:78:0x00a6, B:80:0x00b9, B:82:0x00c3, B:83:0x00cf, B:84:0x00d6, B:87:0x00d8, B:89:0x00e1, B:90:0x0056, B:92:0x0008, B:94:0x0013, B:96:0x0017, B:102:0x01a4, B:103:0x01ad), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f0 A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:6:0x002d, B:8:0x0032, B:10:0x0038, B:12:0x003e, B:15:0x004c, B:18:0x005d, B:20:0x0061, B:21:0x0068, B:25:0x00ea, B:27:0x00f0, B:29:0x00f8, B:31:0x00fe, B:35:0x0115, B:40:0x0111, B:41:0x011b, B:45:0x0132, B:56:0x0168, B:57:0x0192, B:62:0x019f, B:66:0x0082, B:68:0x0086, B:71:0x0092, B:72:0x009a, B:78:0x00a6, B:80:0x00b9, B:82:0x00c3, B:83:0x00cf, B:84:0x00d6, B:87:0x00d8, B:89:0x00e1, B:90:0x0056, B:92:0x0008, B:94:0x0013, B:96:0x0017, B:102:0x01a4, B:103:0x01ad), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f8 A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:6:0x002d, B:8:0x0032, B:10:0x0038, B:12:0x003e, B:15:0x004c, B:18:0x005d, B:20:0x0061, B:21:0x0068, B:25:0x00ea, B:27:0x00f0, B:29:0x00f8, B:31:0x00fe, B:35:0x0115, B:40:0x0111, B:41:0x011b, B:45:0x0132, B:56:0x0168, B:57:0x0192, B:62:0x019f, B:66:0x0082, B:68:0x0086, B:71:0x0092, B:72:0x009a, B:78:0x00a6, B:80:0x00b9, B:82:0x00c3, B:83:0x00cf, B:84:0x00d6, B:87:0x00d8, B:89:0x00e1, B:90:0x0056, B:92:0x0008, B:94:0x0013, B:96:0x0017, B:102:0x01a4, B:103:0x01ad), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019f A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:6:0x002d, B:8:0x0032, B:10:0x0038, B:12:0x003e, B:15:0x004c, B:18:0x005d, B:20:0x0061, B:21:0x0068, B:25:0x00ea, B:27:0x00f0, B:29:0x00f8, B:31:0x00fe, B:35:0x0115, B:40:0x0111, B:41:0x011b, B:45:0x0132, B:56:0x0168, B:57:0x0192, B:62:0x019f, B:66:0x0082, B:68:0x0086, B:71:0x0092, B:72:0x009a, B:78:0x00a6, B:80:0x00b9, B:82:0x00c3, B:83:0x00cf, B:84:0x00d6, B:87:0x00d8, B:89:0x00e1, B:90:0x0056, B:92:0x0008, B:94:0x0013, B:96:0x0017, B:102:0x01a4, B:103:0x01ad), top: B:2:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.drawable.Drawable f(int r13, android.content.Context r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9701sP2.f(int, android.content.Context, boolean):android.graphics.drawable.Drawable");
    }
}
