package defpackage;

import org.chromium.device.nfc.NfcDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: s42, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9590s42 implements InterfaceC8474op1 {
    public final NfcDelegate a;

    public C9590s42(NfcDelegate nfcDelegate) {
        this.a = nfcDelegate;
    }

    @Override // defpackage.InterfaceC8474op1
    public final InterfaceC7786mp1 a() {
        return new C9933t42(this.a);
    }
}
