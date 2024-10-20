package com.google.research.ink.core.jni;

import android.graphics.Matrix;
import android.graphics.RectF;
import defpackage.AbstractC3176Yl1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class EngineState {
    public final Matrix a = new Matrix();
    public final RectF b = new RectF();
    public final RectF c = new RectF();
    public final RectF d = new RectF();

    public void setCropToolEnabled(boolean z) {
    }

    public void setHasAnimatedElements(boolean z) {
    }

    public void setSelectionIsLive(boolean z) {
    }

    static {
        AbstractC3176Yl1.a();
    }

    public final void a(EngineState engineState) {
        engineState.a.set(this.a);
        engineState.b.set(this.b);
        engineState.c.set(this.c);
        engineState.d.set(this.d);
    }

    public void setScreenToWorldTransform(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.a.setValues(new float[]{f, f2, f3, f4, f5, f6, f7, f8, f9});
    }

    public void setPageBounds(float f, float f2, float f3, float f4) {
        this.b.set(f, f2, f3, f4);
    }

    public void setMbr(float f, float f2, float f3, float f4) {
        this.c.set(f, f2, f3, f4);
    }

    public void setCropRegion(float f, float f2, float f3, float f4) {
        this.d.set(f, f2, f3, f4);
    }
}
