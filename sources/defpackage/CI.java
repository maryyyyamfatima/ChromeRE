package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CI extends Property {
    public CI() {
        super(PointF.class, "topLeft");
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
        ji.a = Math.round(pointF.x);
        int round = Math.round(pointF.y);
        ji.b = round;
        int i = ji.f + 1;
        ji.f = i;
        if (i == ji.g) {
            De4.a(ji.e, ji.a, round, ji.c, ji.d);
            ji.f = 0;
            ji.g = 0;
        }
    }
}
