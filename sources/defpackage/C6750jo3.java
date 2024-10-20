package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jo3 */
/* loaded from: classes.dex */
public final class C6750jo3 extends AbstractC7482lw {
    public final AbstractC11937yv o;
    public final String p;
    public final boolean q;
    public final DW r;
    public J74 s;

    @Override // defpackage.AbstractC7482lw, defpackage.InterfaceC3345Zt0
    public final void g(Canvas canvas, Matrix matrix, int i) {
        if (this.q) {
            return;
        }
        DW dw = this.r;
        int l = dw.l(dw.b(), dw.d());
        C3356Zv1 c3356Zv1 = this.i;
        c3356Zv1.setColor(l);
        J74 j74 = this.s;
        if (j74 != null) {
            c3356Zv1.setColorFilter((ColorFilter) j74.f());
        }
        super.g(canvas, matrix, i);
    }

    @Override // defpackage.Z40
    public final String getName() {
        return this.p;
    }

    @Override // defpackage.AbstractC7482lw, defpackage.InterfaceC9190qu1
    public final void f(TJ1 tj1, Object obj) {
        super.f(tj1, obj);
        Integer num = NJ1.b;
        DW dw = this.r;
        if (obj == num) {
            dw.k(tj1);
            return;
        }
        if (obj == NJ1.E) {
            J74 j74 = this.s;
            AbstractC11937yv abstractC11937yv = this.o;
            if (j74 != null) {
                abstractC11937yv.n(j74);
            }
            if (tj1 != null) {
                J74 j742 = new J74(tj1, null);
                this.s = j742;
                j742.a(this);
                abstractC11937yv.e(dw);
                return;
            }
            this.s = null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C6750jo3(defpackage.JJ1 r14, defpackage.AbstractC11937yv r15, defpackage.C8232o63 r16) {
        /*
            r13 = this;
            r10 = r13
            r11 = r15
            r12 = r16
            int r0 = r12.g
            r1 = 0
            if (r0 == 0) goto L5e
            int r0 = r0 + (-1)
            r2 = 1
            if (r0 == 0) goto L16
            if (r0 == r2) goto L13
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
            goto L18
        L13:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            goto L18
        L16:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
        L18:
            r3 = r0
            int r0 = r12.h
            if (r0 == 0) goto L5d
            int r0 = r0 + (-1)
            if (r0 == 0) goto L2e
            if (r0 == r2) goto L2b
            r2 = 2
            if (r0 == r2) goto L28
            r4 = r1
            goto L31
        L28:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
            goto L30
        L2b:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            goto L30
        L2e:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
        L30:
            r4 = r0
        L31:
            float r5 = r12.i
            ib r6 = r12.e
            gb r7 = r12.f
            java.util.List r8 = r12.c
            gb r9 = r12.b
            r0 = r13
            r1 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.o = r11
            java.lang.String r0 = r12.a
            r10.p = r0
            boolean r0 = r12.j
            r10.q = r0
            fb r0 = r12.d
            wv r0 = r0.a()
            r1 = r0
            DW r1 = (defpackage.DW) r1
            r10.r = r1
            r0.a(r13)
            r15.e(r0)
            return
        L5d:
            throw r1
        L5e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6750jo3.<init>(JJ1, yv, o63):void");
    }
}
