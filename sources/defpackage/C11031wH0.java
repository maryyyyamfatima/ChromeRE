package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wH0 */
/* loaded from: classes.dex */
public final class C11031wH0 extends QV3 {
    public static final String[] D = {"android:visibility:visibility", "android:visibility:parent"};
    public int C;

    @Override // defpackage.QV3
    public final /* bridge */ /* synthetic */ String[] q() {
        return D;
    }

    public C11031wH0() {
        this.C = 3;
    }

    public C11031wH0(int i) {
        this.C = 3;
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.C = i;
    }

    public final ObjectAnimator J(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        De4.a.c(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, De4.b, f2);
        ofFloat.addListener(new C10688vH0(view));
        a(new C10345uH0(view));
        return ofFloat;
    }

    public final void I(C10766vW3 c10766vW3) {
        View view = c10766vW3.b;
        int visibility = view.getVisibility();
        HashMap hashMap = c10766vW3.a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    @Override // defpackage.QV3
    public final void h(C10766vW3 c10766vW3) {
        I(c10766vW3);
        c10766vW3.a.put("android:fade:transitionAlpha", Float.valueOf(De4.a.b(c10766vW3.b)));
    }

    @Override // defpackage.QV3
    public final void e(C10766vW3 c10766vW3) {
        I(c10766vW3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C8073nf4 K(defpackage.C10766vW3 r8, defpackage.C10766vW3 r9) {
        /*
            nf4 r0 = new nf4
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.c = r7
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L33
        L2f:
            r0.c = r4
            r0.e = r3
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r3 = r6.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.d = r3
            java.lang.Object r2 = r6.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L56
        L52:
            r0.d = r4
            r0.f = r3
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.b = r1
            r0.a = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.b = r2
            r0.a = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L81
            r0.b = r1
            r0.a = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L9f
            r0.b = r2
            r0.a = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.d
            if (r8 != 0) goto L95
            r0.b = r2
            r0.a = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.c
            if (r8 != 0) goto L9f
            r0.b = r1
            r0.a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11031wH0.K(vW3, vW3):nf4");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:            if (K(o(r3, false), r(r3, false)).a != false) goto L413;     */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f2  */
    @Override // defpackage.QV3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator l(android.view.ViewGroup r23, defpackage.C10766vW3 r24, defpackage.C10766vW3 r25) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11031wH0.l(android.view.ViewGroup, vW3, vW3):android.animation.Animator");
    }

    @Override // defpackage.QV3
    public final boolean s(C10766vW3 c10766vW3, C10766vW3 c10766vW32) {
        if ((c10766vW3 != null || c10766vW32 != null) && (c10766vW3 == null || c10766vW32 == null || c10766vW32.a.containsKey("android:visibility:visibility") == c10766vW3.a.containsKey("android:visibility:visibility"))) {
            C8073nf4 K = K(c10766vW3, c10766vW32);
            if (K.a && (K.c == 0 || K.d == 0)) {
                return true;
            }
        }
        return false;
    }
}
