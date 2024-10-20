package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MV3 extends PV3 {
    public BV3 c;
    public EV3 d;
    public C5583gQ0 f;
    public C5583gQ0 g;
    public final ArrayList b = new ArrayList();
    public IV3 e = PV3.a;

    public MV3(int i, String str) {
        this.c = new BV3(i, str);
    }

    public final void a() {
        EV3 ev3 = this.d;
        if (ev3 == null) {
            return;
        }
        this.b.add(new LV3(new AV3(this.c, ev3), this.e, this.f, this.g, null, null));
        this.d = null;
        this.e = PV3.a;
        this.f = null;
        this.g = null;
    }
}
