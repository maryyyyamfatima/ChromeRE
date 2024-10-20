package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DI extends Property {
    public DI() {
        super(PointF.class, "bottomRight");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        JI ji = (JI) obj;
        PointF pointF = (PointF) obj2;
        ji.getClass();
        ji.c = Math.round(pointF.x);
        int round = Math.round(pointF.y);
        ji.d = round;
        int i = ji.g + 1;
        ji.g = i;
        if (ji.f == i) {
            De4.a(ji.e, ji.a, ji.b, ji.c, round);
            ji.f = 0;
            ji.g = 0;
        }
    }
}
