package defpackage;

import android.os.Handler;
import android.util.Size;
import android.widget.OverScroller;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sw2 */
/* loaded from: classes2.dex */
public final class C9888sw2 {
    public C1802Nw2 a;
    public boolean b;
    public float c;
    public final OverScroller d;
    public final C11603xw2 f;
    public final Size g;
    public final InterfaceC8517ow2 h;
    public final Runnable i;
    public final Runnable j;
    public Runnable l;
    public final Handler e = new Handler();
    public boolean k = true;

    public C9888sw2(OverScroller overScroller, C8173nw2 c8173nw2, RunnableC6111hw2 runnableC6111hw2, RunnableC6453iw2 runnableC6453iw2) {
        this.d = overScroller;
        this.f = c8173nw2.i;
        this.g = c8173nw2.b;
        this.h = c8173nw2;
        this.i = runnableC6111hw2;
        this.j = runnableC6453iw2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(float r11, float r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9888sw2.b(float, float):boolean");
    }

    public static void a(C9888sw2 c9888sw2) {
        OverScroller overScroller = c9888sw2.d;
        if (overScroller.isFinished()) {
            return;
        }
        boolean computeScrollOffset = overScroller.computeScrollOffset();
        int currX = overScroller.getCurrX();
        C11603xw2 c11603xw2 = c9888sw2.f;
        c9888sw2.b(currX - Math.round(c11603xw2.c()), overScroller.getCurrY() - Math.round(c11603xw2.d()));
        if (computeScrollOffset) {
            c9888sw2.e.post(new RunnableC9545rw2(c9888sw2));
        }
    }
}
