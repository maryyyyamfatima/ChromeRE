package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mH3 */
/* loaded from: classes.dex */
public abstract class AbstractC7603mH3 {
    public static final Map a = Collections.synchronizedMap(new HashMap());
    public static final Map b = Collections.synchronizedMap(new HashMap());

    public static CharSequence d(U80 u80, C7849n00 c7849n00, C5704gm c5704gm, InterfaceC9738sX interfaceC9738sX, HZ3 hz3, AbstractC9896sy0 abstractC9896sy0, Map map, InterfaceC1915Ot0 interfaceC1915Ot0, boolean z, boolean z2, boolean z3, boolean z4) {
        return e(u80, c7849n00.a, c5704gm, interfaceC9738sX, hz3, abstractC9896sy0, map, interfaceC1915Ot0, z, z2, z3, z4);
    }

    public static CharSequence f(U80 u80, Context context, C5704gm c5704gm, InterfaceC9738sX interfaceC9738sX, HZ3 hz3, AbstractC9896sy0 abstractC9896sy0, Map map, boolean z) {
        return e(u80, context, c5704gm, interfaceC9738sX, hz3, abstractC9896sy0, map, InterfaceC1915Ot0.a, z, false, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:339:0x0659, code lost:            if (r5 < 0) goto L1393;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.CharSequence e(defpackage.U80 r25, final android.content.Context r26, defpackage.C5704gm r27, defpackage.InterfaceC9738sX r28, final defpackage.HZ3 r29, defpackage.AbstractC9896sy0 r30, java.util.Map r31, defpackage.InterfaceC1915Ot0 r32, boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1997
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7603mH3.e(U80, android.content.Context, gm, sX, HZ3, sy0, java.util.Map, Ot0, boolean, boolean, boolean, boolean):java.lang.CharSequence");
    }

    public static void h(SpannableString spannableString, Object obj, int i, int i2) {
        int min = i < 0 ? 0 : Math.min(i, spannableString.length());
        int length = i2 <= 0 ? spannableString.length() : Math.min(i2 + min, spannableString.length());
        if (min == length) {
            return;
        }
        spannableString.setSpan(obj, min, length, 18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:            if ((r14.b(22) != 0) == false) goto L204;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(final android.content.Context r13, final defpackage.C9841so3 r14, final defpackage.HZ3 r15, defpackage.AbstractC9896sy0 r16, defpackage.U80 r17) {
        /*
            r7 = r14
            java.lang.String r8 = r14.m()
            if (r8 == 0) goto Lc0
            r0 = 20
            int r1 = r14.b(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L13
            r1 = r2
            goto L14
        L13:
            r1 = r3
        L14:
            if (r1 != 0) goto L24
            r1 = 22
            int r1 = r14.b(r1)
            if (r1 == 0) goto L20
            r1 = r2
            goto L21
        L20:
            r1 = r3
        L21:
            if (r1 != 0) goto L24
            goto L55
        L24:
            int r0 = r14.b(r0)
            if (r0 == 0) goto L2b
            goto L2c
        L2b:
            r2 = r3
        L2c:
            if (r2 == 0) goto L35
            long r0 = r14.w()
            int r0 = (int) r0
        L33:
            r3 = r13
            goto L58
        L35:
            int r0 = r14.x()
            switch(r0) {
                case 1: goto L52;
                case 2: goto L4f;
                case 3: goto L4c;
                case 4: goto L3c;
                case 5: goto L49;
                case 6: goto L46;
                case 7: goto L43;
                case 8: goto L40;
                case 9: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L55
        L3d:
            r0 = 900(0x384, float:1.261E-42)
            goto L33
        L40:
            r0 = 800(0x320, float:1.121E-42)
            goto L33
        L43:
            r0 = 700(0x2bc, float:9.81E-43)
            goto L33
        L46:
            r0 = 600(0x258, float:8.41E-43)
            goto L33
        L49:
            r0 = 500(0x1f4, float:7.0E-43)
            goto L33
        L4c:
            r0 = 300(0x12c, float:4.2E-43)
            goto L33
        L4f:
            r0 = 200(0xc8, float:2.8E-43)
            goto L33
        L52:
            r0 = 100
            goto L33
        L55:
            r0 = 400(0x190, float:5.6E-43)
            goto L33
        L58:
            int r9 = b(r13, r0)
            boolean r0 = r14.p()
            Go r10 = new Go
            r10.<init>(r8, r9, r0)
            java.util.Map r11 = defpackage.AbstractC7603mH3.b
            monitor-enter(r11)
            java.lang.Object r0 = r11.get(r10)     // Catch: java.lang.Throwable -> Lbd
            java.util.concurrent.FutureTask r0 = (java.util.concurrent.FutureTask) r0     // Catch: java.lang.Throwable -> Lbd
            if (r0 != 0) goto L83
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask     // Catch: java.lang.Throwable -> Lbd
            jH3 r12 = new jH3     // Catch: java.lang.Throwable -> Lbd
            r1 = r12
            r2 = r15
            r3 = r13
            r4 = r8
            r5 = r9
            r6 = r14
            r1.<init>()     // Catch: java.lang.Throwable -> Lbd
            r0.<init>(r12)     // Catch: java.lang.Throwable -> Lbd
            r11.put(r10, r0)     // Catch: java.lang.Throwable -> Lbd
        L83:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lbd
            r0.run()
            java.lang.Object r0 = r0.get()     // Catch: java.util.concurrent.ExecutionException -> L8e java.lang.InterruptedException -> L90
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0     // Catch: java.util.concurrent.ExecutionException -> L8e java.lang.InterruptedException -> L90
            return r0
        L8e:
            r0 = move-exception
            goto L91
        L90:
            r0 = move-exception
        L91:
            xU r1 = defpackage.EnumC11438xU.A
            boolean r2 = r14.p()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = " Font fetching future task failed"
            r3.<init>(r4)
            r3.append(r8)
            java.lang.String r4 = "with weight= "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r4 = "italic= "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r3 = r16
            r4 = r17
            r3.d(r1, r2, r4, r0)
            goto Lc0
        Lbd:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lbd
            throw r0
        Lc0:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7603mH3.a(android.content.Context, so3, HZ3, sy0, U80):android.graphics.Typeface");
    }

    public static int c(Context context) {
        int i;
        if (Build.VERSION.SDK_INT >= 31 && (i = context.getResources().getConfiguration().fontWeightAdjustment) != Integer.MAX_VALUE) {
            return i;
        }
        return 0;
    }

    public static int b(Context context, int i) {
        if (Build.VERSION.SDK_INT < 31) {
            return i;
        }
        int i2 = context.getResources().getConfiguration().fontWeightAdjustment;
        if (i2 != Integer.MAX_VALUE) {
            i += i2;
        }
        return Math.min(Math.max(i, 1), 1000);
    }

    public static Typeface g(Context context, Typeface typeface) {
        int weight;
        Typeface create;
        if (typeface == null) {
            typeface = Typeface.defaultFromStyle(0);
        }
        if (Build.VERSION.SDK_INT < 31) {
            return typeface;
        }
        weight = typeface.getWeight();
        if (weight == 0) {
            weight = typeface.isBold() ? 700 : 400;
        }
        int b2 = b(context, weight);
        if (b2 == weight) {
            return typeface;
        }
        create = Typeface.create(typeface, b2, typeface.isItalic());
        return create;
    }
}
