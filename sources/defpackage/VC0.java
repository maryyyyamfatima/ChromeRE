package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class VC0 extends C6206iD0 implements InterfaceC4449d61, InterfaceC4487dD0 {
    @Override // defpackage.InterfaceC4449d61
    public final InterfaceC4487dD0 b() {
        return this;
    }

    @Override // defpackage.C6206iD0
    public final void d(Object obj) {
        c(this, (UC0) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VC0() {
        super(null, -1048037474, null);
        C12046zE1 c12046zE1 = AbstractC10593v00.g;
        this.a = this;
    }

    @Override // defpackage.InterfaceC4487dD0
    public final Object c(C6206iD0 c6206iD0, Object obj) {
        int i = c6206iD0.g;
        C12046zE1 c12046zE1 = AbstractC10593v00.g;
        if (i != -1048037474) {
            return null;
        }
        Exception exc = ((UC0) obj).a;
        if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        }
        throw new RuntimeException(exc);
    }
}
