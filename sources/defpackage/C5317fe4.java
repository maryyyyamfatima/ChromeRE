package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fe4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5317fe4 implements XV3 {
    public final KH a;
    public C8067ne4 b;

    public C5317fe4(KH kh) {
        this.a = kh;
    }

    @Override // defpackage.XV3
    public final OV3 a(EnumC9447rg0 enumC9447rg0, boolean z) {
        if (enumC9447rg0 == EnumC9447rg0.MEMORY_CACHE || !z) {
            return C11654y52.a;
        }
        if (this.b == null) {
            this.b = new C8067ne4(this.a);
        }
        return this.b;
    }
}
