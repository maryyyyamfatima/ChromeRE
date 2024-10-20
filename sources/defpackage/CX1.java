package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class CX1 {
    public static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static int c(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static void d(C8847pu1 c8847pu1, int i, ArrayList arrayList, C8847pu1 c8847pu12, InterfaceC9532ru1 interfaceC9532ru1) {
        if (c8847pu1.a(i, interfaceC9532ru1.getName())) {
            String name = interfaceC9532ru1.getName();
            c8847pu12.getClass();
            C8847pu1 c8847pu13 = new C8847pu1(c8847pu12);
            c8847pu13.a.add(name);
            C8847pu1 c8847pu14 = new C8847pu1(c8847pu13);
            c8847pu14.b = interfaceC9532ru1;
            arrayList.add(c8847pu14);
        }
    }
}
