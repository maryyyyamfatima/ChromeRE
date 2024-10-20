package defpackage;

import android.graphics.Rect;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2911Wk1 {
    public final int a;
    public Rect b;
    public final Rect c;
    public final C2911Wk1 d;

    public C2911Wk1(long j, int i, Rect rect, C2911Wk1 c2911Wk1) {
        this.a = i;
        this.c = new Rect(rect);
        this.d = c2911Wk1;
        if (c2911Wk1 != null) {
            a(this, c2911Wk1);
        }
    }

    public static void a(C2911Wk1 c2911Wk1, C2911Wk1 c2911Wk12) {
        boolean z;
        if (c2911Wk12 == null) {
            return;
        }
        Rect rect = c2911Wk1.c;
        int i = rect.top;
        Rect rect2 = c2911Wk12.c;
        boolean z2 = true;
        if (i < rect2.top) {
            b(c2911Wk12);
            rect2.top = rect.top;
            z = true;
        } else {
            z = false;
        }
        if (rect.bottom > rect2.bottom) {
            b(c2911Wk12);
            rect2.bottom = rect.bottom;
            z = true;
        }
        if (rect.left < rect2.left) {
            b(c2911Wk12);
            rect2.left = rect.left;
            z = true;
        }
        if (rect.right > rect2.right) {
            b(c2911Wk12);
            rect2.right = rect.right;
        } else {
            z2 = z;
        }
        if (z2) {
            a(c2911Wk12, c2911Wk12.d);
        }
    }

    public static void b(C2911Wk1 c2911Wk1) {
        if (c2911Wk1.b == null) {
            c2911Wk1.b = new Rect(c2911Wk1.c);
        }
    }
}
