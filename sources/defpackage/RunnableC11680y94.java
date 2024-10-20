package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y94, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC11680y94 implements Runnable {
    public final C11337x94 a;
    public final /* synthetic */ B94 g;

    public RunnableC11680y94(B94 b94, C11337x94 c11337x94) {
        this.g = b94;
        this.a = c11337x94;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B94 b94 = this.g;
        CameraCharacteristics i = B94.i(b94.d);
        if (i == null) {
            return;
        }
        Rect rect = (Rect) i.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        C11337x94 c11337x94 = this.a;
        double d = c11337x94.a;
        if (d != 0.0d) {
            float max = Math.max(1.0f, Math.min((float) d, b94.p));
            float f = (max - 1.0f) / (max * 2.0f);
            float f2 = 1.0f - f;
            b94.q = new Rect(Math.round(rect.width() * f), Math.round(rect.height() * f), Math.round(rect.width() * f2), Math.round(rect.height() * f2));
            b94.q.toString();
        }
        int i2 = c11337x94.b;
        if (i2 != 0) {
            b94.t = i2;
        }
        double d2 = c11337x94.c;
        if (d2 != 0.0d) {
            b94.u = (float) d2;
        }
        int i3 = c11337x94.d;
        if (i3 != 0) {
            b94.v = i3;
        }
        double d3 = c11337x94.j;
        if (d3 != 0.0d) {
            b94.w = (long) (d3 * 100000.0d);
        }
        int i4 = c11337x94.k;
        if (i4 != 0) {
            b94.z = i4;
        }
        double d4 = c11337x94.e;
        if (d4 > 0.0d) {
            b94.r = (int) Math.round(d4);
        }
        double d5 = c11337x94.f;
        if (d5 > 0.0d) {
            b94.s = (int) Math.round(d5);
        }
        MeteringRectangle meteringRectangle = b94.x;
        if (meteringRectangle != null && !meteringRectangle.getRect().isEmpty() && c11337x94.a > 0.0d) {
            b94.x = null;
        }
        if (b94.t == 1 || b94.v == 1) {
            b94.x = null;
        }
        if ((((Integer) i.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0 || ((Integer) i.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() > 0 || ((Integer) i.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB)).intValue() > 0) && c11337x94.g.length > 0) {
            Rect rect2 = b94.q.isEmpty() ? rect : b94.q;
            int round = (int) Math.round(c11337x94.g[0] * rect2.width());
            int round2 = (int) Math.round(c11337x94.g[1] * rect2.height());
            if (rect2.equals(b94.q)) {
                round += (rect.width() - rect2.width()) / 2;
                round2 += (rect.height() - rect2.height()) / 2;
            }
            int width = rect2.width() / 8;
            int height = rect2.height() / 8;
            b94.x = new MeteringRectangle(Math.max(0, round - (width / 2)), Math.max(0, round2 - (height / 2)), width, height, 1000);
            double d6 = c11337x94.g[0];
            double d7 = c11337x94.g[1];
            rect2.toString();
            rect.toString();
            b94.x.toString();
        }
        if (c11337x94.h) {
            b94.y = (int) Math.round(c11337x94.i / ((Rational) i.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP)).floatValue());
        }
        double d8 = c11337x94.l;
        if (d8 > 0.0d) {
            b94.B = (int) Math.round(d8);
        }
        double d9 = c11337x94.r;
        if (d9 > 0.0d) {
            b94.A = (int) Math.round(d9);
        }
        if (c11337x94.m) {
            b94.C = c11337x94.n;
        }
        int i5 = c11337x94.o;
        if (i5 != 0) {
            b94.D = i5;
        }
        if (c11337x94.p) {
            b94.E = c11337x94.q;
        }
        if (b94.h != null) {
            b94.g(b94.j);
            if (c11337x94.o != 0) {
                b94.j.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            }
            b94.i = b94.j.build();
            try {
                b94.h.setRepeatingRequest(b94.i, null, null);
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException | SecurityException e) {
                AbstractC4851eH1.a("VideoCapture", "setRepeatingRequest: ", e);
            }
        }
    }
}
