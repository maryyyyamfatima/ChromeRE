package com.google.chrome.elements.video.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.C9156qo3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VideoFrameLayout extends FrameLayout {
    public float a;
    public C9156qo3 g;
    public int h;
    public int i;
    public float[] j;
    public final Path k;

    public VideoFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.g = C9156qo3.o;
        this.k = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setClipChildren(true);
        setClipToOutline(true);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.h = i;
        this.i = i2;
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Path path = this.k;
        if (!path.isEmpty()) {
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
    }

    public final void a() {
        float[] fArr;
        boolean z;
        Path path = this.k;
        path.reset();
        if (this.a == 0.0f) {
            fArr = null;
        } else {
            fArr = new float[8];
            if (!this.g.equals(C9156qo3.o)) {
                C9156qo3 c9156qo3 = this.g;
                if (!c9156qo3.k || !c9156qo3.l || !c9156qo3.n || !c9156qo3.m) {
                    z = false;
                    if (!z || this.g.k) {
                        float f = this.a;
                        fArr[0] = f;
                        fArr[1] = f;
                    }
                    if (!z || this.g.l) {
                        float f2 = this.a;
                        fArr[2] = f2;
                        fArr[3] = f2;
                    }
                    if (!z || this.g.n) {
                        float f3 = this.a;
                        fArr[4] = f3;
                        fArr[5] = f3;
                    }
                    if (!z || this.g.m) {
                        float f4 = this.a;
                        fArr[6] = f4;
                        fArr[7] = f4;
                    }
                }
            }
            z = true;
            if (!z) {
            }
            float f5 = this.a;
            fArr[0] = f5;
            fArr[1] = f5;
            if (!z) {
            }
            float f22 = this.a;
            fArr[2] = f22;
            fArr[3] = f22;
            if (!z) {
            }
            float f32 = this.a;
            fArr[4] = f32;
            fArr[5] = f32;
            if (!z) {
            }
            float f42 = this.a;
            fArr[6] = f42;
            fArr[7] = f42;
        }
        this.j = fArr;
        if (fArr != null) {
            path.addRoundRect(new RectF(0.0f, 0.0f, this.h, this.i), this.j, Path.Direction.CW);
        }
    }
}
