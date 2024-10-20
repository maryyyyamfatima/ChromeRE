package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class M92 extends AbstractC6816k0 {
    public final QR2 g;

    public M92(C7561m92 c7561m92, QR2 qr2) {
        super(c7561m92);
        this.g = qr2;
    }

    @Override // defpackage.X82
    public final void i(InterfaceC11128wa2 interfaceC11128wa2) {
        QR2 qr2 = this.g;
        try {
            qr2.getClass();
            PR2 pr2 = new PR2(qr2, interfaceC11128wa2);
            String valueOf = String.valueOf(qr2);
            StringBuilder sb = new StringBuilder("Operator ");
            sb.append(valueOf);
            sb.append(" returned a null Observer");
            this.a.a(pr2);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            MR2.b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
