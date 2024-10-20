package defpackage;

import android.nfc.FormatException;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.tech.NdefFormatable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class G42 implements I42 {
    public final NdefFormatable a;

    @Override // defpackage.I42
    public final boolean c() {
        return true;
    }

    public G42(NdefFormatable ndefFormatable) {
        this.a = ndefFormatable;
    }

    @Override // defpackage.I42
    public final void a(NdefMessage ndefMessage) {
        this.a.format(ndefMessage);
    }

    @Override // defpackage.I42
    public final boolean b() {
        try {
            this.a.formatReadOnly(new NdefMessage(new NdefRecord((short) 0, null, null, null), new NdefRecord[0]));
            return true;
        } catch (FormatException unused) {
            return false;
        }
    }

    @Override // defpackage.I42
    public final NdefMessage read() {
        return new NdefMessage(new NdefRecord((short) 0, null, null, null), new NdefRecord[0]);
    }
}
