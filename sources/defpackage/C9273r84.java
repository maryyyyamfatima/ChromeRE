package defpackage;

import android.graphics.Paint;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: r84, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9273r84 extends AbstractC10302u84 {
    public RZ e;
    public float f;
    public RZ g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public Paint.Cap m;
    public Paint.Join n;
    public float o;

    public C9273r84() {
        this.f = 0.0f;
        this.h = 1.0f;
        this.i = 1.0f;
        this.j = 0.0f;
        this.k = 1.0f;
        this.l = 0.0f;
        this.m = Paint.Cap.BUTT;
        this.n = Paint.Join.MITER;
        this.o = 4.0f;
    }

    public C9273r84(C9273r84 c9273r84) {
        super(c9273r84);
        this.f = 0.0f;
        this.h = 1.0f;
        this.i = 1.0f;
        this.j = 0.0f;
        this.k = 1.0f;
        this.l = 0.0f;
        this.m = Paint.Cap.BUTT;
        this.n = Paint.Join.MITER;
        this.o = 4.0f;
        this.e = c9273r84.e;
        this.f = c9273r84.f;
        this.h = c9273r84.h;
        this.g = c9273r84.g;
        this.c = c9273r84.c;
        this.i = c9273r84.i;
        this.j = c9273r84.j;
        this.k = c9273r84.k;
        this.l = c9273r84.l;
        this.m = c9273r84.m;
        this.n = c9273r84.n;
        this.o = c9273r84.o;
    }

    @Override // defpackage.AbstractC9959t84
    public final boolean a() {
        return this.g.b() || this.e.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.AbstractC9959t84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            RZ r0 = r6.g
            boolean r1 = r0.b()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            android.content.res.ColorStateList r1 = r0.b
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.c
            if (r1 == r4) goto L1c
            r0.c = r1
            r0 = r2
            goto L1d
        L1c:
            r0 = r3
        L1d:
            RZ r1 = r6.e
            boolean r4 = r1.b()
            if (r4 == 0) goto L36
            android.content.res.ColorStateList r4 = r1.b
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.c
            if (r7 == r4) goto L36
            r1.c = r7
            goto L37
        L36:
            r2 = r3
        L37:
            r7 = r2 | r0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9273r84.b(int[]):boolean");
    }

    public int getStrokeColor() {
        return this.e.c;
    }

    public void setStrokeColor(int i) {
        this.e.c = i;
    }

    public float getStrokeWidth() {
        return this.f;
    }

    public void setStrokeWidth(float f) {
        this.f = f;
    }

    public float getStrokeAlpha() {
        return this.h;
    }

    public void setStrokeAlpha(float f) {
        this.h = f;
    }

    public int getFillColor() {
        return this.g.c;
    }

    public void setFillColor(int i) {
        this.g.c = i;
    }

    public float getFillAlpha() {
        return this.i;
    }

    public void setFillAlpha(float f) {
        this.i = f;
    }

    public float getTrimPathStart() {
        return this.j;
    }

    public void setTrimPathStart(float f) {
        this.j = f;
    }

    public float getTrimPathEnd() {
        return this.k;
    }

    public void setTrimPathEnd(float f) {
        this.k = f;
    }

    public float getTrimPathOffset() {
        return this.l;
    }

    public void setTrimPathOffset(float f) {
        this.l = f;
    }
}
