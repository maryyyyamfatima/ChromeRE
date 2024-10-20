package defpackage;

import android.nfc.tech.TagTechnology;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class J42 {
    public final TagTechnology a;
    public final I42 b;
    public boolean c;
    public final String d;

    public J42(TagTechnology tagTechnology, I42 i42, byte[] bArr) {
        String sb;
        this.a = tagTechnology;
        this.b = i42;
        if (bArr.length < 0) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder(bArr.length * 3);
            for (byte b : bArr) {
                if (sb2.length() > 0) {
                    sb2.append(":");
                }
                sb2.append(String.format("%02x", Integer.valueOf(b & 255)));
            }
            sb = sb2.toString();
        }
        this.d = sb;
    }

    public final void a() {
        TagTechnology tagTechnology = this.a;
        if (tagTechnology.isConnected()) {
            return;
        }
        tagTechnology.connect();
        this.c = true;
    }
}
