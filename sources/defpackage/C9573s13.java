package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: s13 */
/* loaded from: classes.dex */
public final class C9573s13 extends GK3 {
    public final /* synthetic */ A13 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9573s13(A13 a13, GK3 gk3) {
        super(gk3);
        this.g = a13;
    }

    @Override // defpackage.GK3
    public final void a(GK3 gk3) {
        A13 a13 = this.g;
        try {
            a13.b();
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException(AbstractC4199cO1.a("Index out of bounds while applying a new section. This indicates a bad diff was sent to the RecyclerBinder. See https://bit.ly/39Oq0Hs for more information. Debug info: ", A13.k(a13), e.getMessage()), e);
        }
    }
}
