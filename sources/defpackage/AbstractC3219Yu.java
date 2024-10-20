package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3219Yu {
    public final int a;
    public final Class b;
    public final C7580mD0 c;

    public abstract void b(InterfaceC9040qU1 interfaceC9040qU1);

    public AbstractC3219Yu(C4979ef4 c4979ef4, int i, Class cls) {
        this.a = i;
        this.b = cls;
        this.c = c4979ef4.a;
    }

    public void a(Cdo cdo, InterfaceC9040qU1 interfaceC9040qU1) {
        if (cdo.a == this.a) {
            if (interfaceC9040qU1 == null || this.b.isInstance(interfaceC9040qU1)) {
                b(interfaceC9040qU1);
            }
        }
    }
}
