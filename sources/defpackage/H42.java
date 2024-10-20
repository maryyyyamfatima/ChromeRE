package defpackage;

import android.nfc.NdefMessage;
import android.nfc.tech.Ndef;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class H42 implements I42 {
    public final Ndef a;

    public H42(Ndef ndef) {
        this.a = ndef;
    }

    @Override // defpackage.I42
    public final void a(NdefMessage ndefMessage) {
        this.a.writeNdefMessage(ndefMessage);
    }

    @Override // defpackage.I42
    public final boolean b() {
        return this.a.makeReadOnly();
    }

    @Override // defpackage.I42
    public final NdefMessage read() {
        return this.a.getNdefMessage();
    }

    @Override // defpackage.I42
    public final boolean c() {
        return this.a.getNdefMessage() == null;
    }
}
