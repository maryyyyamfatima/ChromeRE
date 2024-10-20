package defpackage;

import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import org.chromium.components.content_capture.ContentCaptureData;
import org.chromium.components.content_capture.ContentCaptureFrame;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class P50 extends AbstractC5166fB2 {
    public P50(C10753vU0 c10753vU0, ContentCaptureFrame contentCaptureFrame, C0108Av2 c0108Av2) {
        super(c10753vU0, contentCaptureFrame, c0108Av2);
    }

    @Override // defpackage.AbstractC5166fB2
    public final AutofillId s(C12283zv2 c12283zv2, AbstractC3755b50 abstractC3755b50) {
        AutofillId newAutofillId;
        ContentCaptureData contentCaptureData = (ContentCaptureData) abstractC3755b50;
        AbstractC2572Tu2 b = AbstractC2572Tu2.b();
        AutofillId autofillId = this.i.a.b;
        long j = contentCaptureData.a;
        ((C4043bv2) b).getClass();
        ContentCaptureSession contentCaptureSession = c12283zv2.a;
        newAutofillId = contentCaptureSession.newAutofillId(autofillId, j);
        ((C4043bv2) AbstractC2572Tu2.b()).getClass();
        contentCaptureSession.notifyViewTextChanged(newAutofillId, contentCaptureData.d);
        return newAutofillId;
    }
}
