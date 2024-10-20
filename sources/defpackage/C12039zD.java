package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12039zD implements InterfaceC3145Yf0 {
    public final byte[] a;
    public final InterfaceC11696yD g;

    @Override // defpackage.InterfaceC3145Yf0
    public final void b() {
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void cancel() {
    }

    public C12039zD(byte[] bArr, InterfaceC11696yD interfaceC11696yD) {
        this.a = bArr;
        this.g = interfaceC11696yD;
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void c(EnumC7567mA2 enumC7567mA2, InterfaceC3015Xf0 interfaceC3015Xf0) {
        interfaceC3015Xf0.f(this.g.b(this.a));
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final Class a() {
        return this.g.a();
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final EnumC9447rg0 e() {
        return EnumC9447rg0.LOCAL;
    }
}
