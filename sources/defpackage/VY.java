package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class VY implements AZ {
    public abstract void d(InterfaceC10434uZ interfaceC10434uZ);

    public final C5847hA0 c() {
        C5847hA0 c5847hA0 = new C5847hA0();
        b(c5847hA0);
        return c5847hA0;
    }

    @Override // defpackage.AZ
    public final void b(InterfaceC10434uZ interfaceC10434uZ) {
        if (interfaceC10434uZ == null) {
            throw new NullPointerException("observer is null");
        }
        try {
            d(interfaceC10434uZ);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            MR2.b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final CZ e(AbstractC10422uW2 abstractC10422uW2) {
        if (abstractC10422uW2 == null) {
            throw new NullPointerException("scheduler is null");
        }
        return new CZ(this, abstractC10422uW2);
    }
}
