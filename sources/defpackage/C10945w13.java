package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w13 */
/* loaded from: classes.dex */
public final class C10945w13 extends GK3 {
    public final InterfaceC6554jE1 g;
    public boolean h;
    public int i = -1;
    public String j;
    public final /* synthetic */ A13 k;

    public C10945w13(A13 a13, InterfaceC6554jE1 interfaceC6554jE1) {
        this.k = a13;
        this.g = interfaceC6554jE1;
    }

    public final synchronized void b(int i, String str) {
        if (!this.h) {
            this.h = true;
            Throwable th = this.a;
            if (th != null) {
                th.fillInStackTrace();
            }
            this.g.a();
            this.g.b(this, "");
            this.i = i;
            this.j = str;
        }
    }

    @Override // defpackage.GK3
    public final void a(GK3 gk3) {
        synchronized (this) {
            if (this.h) {
                int i = this.i;
                String str = this.j;
                this.i = -1;
                this.j = null;
                this.h = false;
                try {
                    this.k.d(i, str, gk3);
                } catch (IndexOutOfBoundsException e) {
                    throw new RuntimeException(AbstractC4199cO1.a("Index out of bounds while applying a new section. This indicates a bad diff was sent to the RecyclerBinder. See https://bit.ly/39Oq0Hs for more information. Debug info: ", A13.k(this.k), e.getMessage()), e);
                }
            }
        }
    }
}
