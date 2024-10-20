package org.chromium.content.browser;

import android.view.MotionEvent;
import android.view.View;
import defpackage.C8379oZ1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SyntheticGestureTarget {
    public final C8379oZ1 a;

    public static SyntheticGestureTarget create(View view) {
        return new SyntheticGestureTarget(view);
    }

    public SyntheticGestureTarget(View view) {
        this.a = new C8379oZ1(view);
    }

    public final void inject(int i, int i2, long j) {
        this.a.a(i, i2, j);
    }

    public final void setPointer(int i, float f, float f2, int i2) {
        this.a.b(i, f, f2, i2, 0);
    }

    public final void setScrollDeltas(float f, float f2, float f3, float f4) {
        C8379oZ1 c8379oZ1 = this.a;
        c8379oZ1.b(0, f, f2, 0, 0);
        MotionEvent.PointerCoords[] pointerCoordsArr = c8379oZ1.b;
        pointerCoordsArr[0].setAxisValue(10, f3);
        pointerCoordsArr[0].setAxisValue(9, f4);
    }
}
