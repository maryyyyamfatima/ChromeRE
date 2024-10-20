package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LX0 extends JX0 implements InterfaceC7327lV1 {
    public LX0(MX0 mx0) {
        super(mx0);
    }

    @Override // defpackage.JX0
    public final void l() {
        super.l();
        QX0 qx0 = this.g;
        ((MX0) qx0).j = ((MX0) qx0).j.clone();
    }

    @Override // defpackage.JX0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final MX0 b1() {
        if (this.h) {
            return (MX0) this.g;
        }
        ((MX0) this.g).j.i();
        return (MX0) super.b1();
    }

    public final void p(VF0 vf0, Object obj) {
        vf0.getClass();
        OX0 ox0 = (OX0) vf0;
        if (ox0.a == this.a) {
            if (this.h) {
                l();
                this.h = false;
            }
            C5563gM0 c5563gM0 = ((MX0) this.g).j;
            if (c5563gM0.b) {
                c5563gM0 = c5563gM0.clone();
                ((MX0) this.g).j = c5563gM0;
            }
            NX0 nx0 = ox0.d;
            nx0.getClass();
            if (nx0.g.a == EnumC10883vq4.n) {
                obj = Integer.valueOf(((InterfaceC0467Dp1) obj).a());
            }
            c5563gM0.k(nx0, obj);
            return;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }
}
