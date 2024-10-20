package defpackage;

import org.chromium.device.nfc.NfcDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t42, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9933t42 implements InterfaceC9247r42 {
    public final NfcDelegate a;
    public C8905q42 g;

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
    }

    public C9933t42(NfcDelegate nfcDelegate) {
        this.a = nfcDelegate;
    }

    @Override // defpackage.InterfaceC7786mp1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C8905q42 c8905q42 = this.g;
        if (c8905q42 != null) {
            C9026qR2 c9026qR2 = c8905q42.h;
            if (c9026qR2 != null) {
                c9026qR2.close();
                c8905q42.h = null;
            }
            this.g = null;
        }
    }

    @Override // defpackage.InterfaceC9247r42
    public final void M0(int i, C0207Bp1 c0207Bp1) {
        C9026qR2 c9026qR2;
        C8905q42 c8905q42 = this.g;
        if (c8905q42 != null && (c9026qR2 = c8905q42.h) != null) {
            c9026qR2.close();
            c8905q42.h = null;
        }
        this.g = new C8905q42(i, this.a, c0207Bp1);
    }

    @Override // defpackage.InterfaceC9247r42
    public final void x0() {
        C8905q42 c8905q42 = this.g;
        if (c8905q42 != null) {
            c8905q42.m = true;
            c8905q42.f();
            c8905q42.e0();
            c8905q42.N();
        }
    }

    @Override // defpackage.InterfaceC9247r42
    public final void O0() {
        C8905q42 c8905q42 = this.g;
        if (c8905q42 != null) {
            c8905q42.m = false;
            c8905q42.i();
        }
    }
}
