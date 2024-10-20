package org.chromium.media;

import J.N;
import android.hardware.display.DisplayManager;
import defpackage.V60;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class VideoCapture {
    public int a;
    public boolean b;
    public VideoCaptureFormat c;
    public final int d;
    public final long e;

    public abstract boolean allocate(int i, int i2, int i3, boolean z);

    public abstract void deallocate();

    public abstract void getPhotoCapabilitiesAsync(long j);

    public abstract void setPhotoOptions(double d, int i, double d2, int i2, double d3, double d4, double[] dArr, boolean z, double d5, double d6, int i3, double d7, boolean z2, boolean z3, int i4, boolean z4, boolean z5, double d8);

    public final void setTestMode() {
    }

    public abstract boolean startCaptureMaybeAsync();

    public abstract boolean stopCaptureAndBlockUntilStopped();

    public abstract void takePhotoAsync(long j);

    public VideoCapture(int i, long j) {
        this.d = i;
        this.e = j;
    }

    public static int b() {
        int rotation = ((DisplayManager) V60.a.getSystemService("display")).getDisplay(0).getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    public final int queryWidth() {
        return this.c.a;
    }

    public final int queryHeight() {
        return this.c.b;
    }

    public final int queryFrameRate() {
        return this.c.c;
    }

    public final int getColorspace() {
        int i = this.c.d;
        int i2 = 17;
        if (i != 17) {
            i2 = 35;
            if (i != 35) {
                i2 = 842094169;
                if (i != 842094169) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public final int a() {
        return (this.a + (this.b ? 360 - b() : b())) % 360;
    }

    public final void d(long j) {
        N.MdZBZ$ST(this.e, this, j, null);
    }

    public static int[] c(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        return iArr;
    }
}
