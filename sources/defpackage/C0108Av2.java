package defpackage;

import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Av2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0108Av2 {
    public final C12283zv2 a;
    public HashMap b;

    public C0108Av2(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        this.a = new C12283zv2(contentCaptureSession, autofillId);
    }

    public final HashMap a() {
        if (this.b == null) {
            this.b = new HashMap();
        }
        return this.b;
    }
}
