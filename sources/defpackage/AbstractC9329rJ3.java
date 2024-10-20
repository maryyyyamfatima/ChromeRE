package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rJ3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9329rJ3 {
    public static final Typeface a;
    public static final ColorStateList b;
    public static final int c;
    public static final Typeface d;
    public static final K84 e;
    public static final Path f;
    public static final Rect g;
    public static final RectF h;

    static {
        Typeface typeface = Typeface.DEFAULT;
        a = typeface;
        b = new ColorStateList(new int[][]{new int[]{0}}, new int[]{-16777216});
        c = typeface.getStyle();
        d = typeface;
        e = K84.TOP;
        f = new Path();
        g = new Rect();
        h = new RectF();
    }

    public static int b(Layout layout, int i, Layout layout2) {
        if (layout2 == null) {
            return 0;
        }
        Rect rect = new Rect();
        layout.getLineBounds(i, rect);
        Rect rect2 = new Rect();
        layout2.getLineBounds(layout2.getLineCount() - 1, rect2);
        return Math.max(0, rect2.height() - rect.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x034a, code lost:            if (r0 != null) goto L180;     */
    /* JADX WARN: Removed duplicated region for block: B:181:0x048c A[LOOP:0: B:160:0x0409->B:181:0x048c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.Layout a(defpackage.C7849n00 r16, int r17, android.text.TextUtils.TruncateAt r18, boolean r19, int r20, float r21, float r22, float r23, int r24, boolean r25, java.lang.CharSequence r26, android.content.res.ColorStateList r27, int r28, int r29, float r30, float r31, int r32, android.graphics.Typeface r33, defpackage.UG3 r34, defpackage.EnumC9866ss4 r35, int r36, int r37, int r38, int r39, float r40, int r41, int r42, int r43, float r44) {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9329rJ3.a(n00, int, android.text.TextUtils$TruncateAt, boolean, int, float, float, float, int, boolean, java.lang.CharSequence, android.content.res.ColorStateList, int, int, float, float, int, android.graphics.Typeface, UG3, ss4, int, int, int, int, float, int, int, int, float):android.text.Layout");
    }
}
