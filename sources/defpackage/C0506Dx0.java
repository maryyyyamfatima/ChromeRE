package defpackage;

import android.util.Pair;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dx0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0506Dx0 {
    public final /* synthetic */ C0766Fx0 a;

    public /* synthetic */ C0506Dx0(C0766Fx0 c0766Fx0) {
        this.a = c0766Fx0;
    }

    public final Pair a(Object obj, Object obj2) {
        Object obj3;
        C0766Fx0 c0766Fx0 = this.a;
        C0070Ao c0070Ao = (C0070Ao) obj;
        C7849n00 c7849n00 = (C7849n00) obj2;
        if (c0070Ao == null) {
            c0766Fx0.a.d(EnumC11438xU.B, "Template produced null Element", c0766Fx0.h, null);
            obj3 = C6533jA0.p0(c7849n00).i;
        } else {
            C1680My0 e = ((C10049tQ2) c0766Fx0.g).e(c7849n00, c0766Fx0.h, c0070Ao.a, c0766Fx0.i, c0766Fx0.j);
            if (c0070Ao.b != null) {
                Sq4 p0 = Tq4.p0(c7849n00);
                p0.x(e);
                ((BY) p0.h.b0()).l = c0070Ao.b;
                obj3 = p0.d();
            } else {
                obj3 = e;
            }
        }
        return Pair.create(obj3, c7849n00);
    }
}
