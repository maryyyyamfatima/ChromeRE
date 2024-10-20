package defpackage;

import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import org.chromium.components.content_capture.ContentCaptureFrame;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class NN3 extends R72 {
    public final ContentCaptureFrame k;

    public NN3(ContentCaptureFrame contentCaptureFrame, C0108Av2 c0108Av2) {
        super(null, c0108Av2);
        this.k = contentCaptureFrame;
    }

    @Override // defpackage.R72
    public final void r() {
        AutofillId newAutofillId;
        R72.p("TitleUpdateTask.updateTitle");
        C12283zv2 n = n();
        AbstractC2572Tu2 b = AbstractC2572Tu2.b();
        ContentCaptureSession contentCaptureSession = n.a;
        AutofillId autofillId = this.i.a.b;
        ContentCaptureFrame contentCaptureFrame = this.k;
        long j = contentCaptureFrame.a;
        ((C4043bv2) b).getClass();
        newAutofillId = contentCaptureSession.newAutofillId(autofillId, j);
        ((C4043bv2) AbstractC2572Tu2.b()).getClass();
        n.a.notifyViewTextChanged(newAutofillId, contentCaptureFrame.e);
    }
}
