package defpackage;

import android.content.LocusId;
import android.os.Bundle;
import android.view.contentcapture.ContentCaptureContext;
import android.view.contentcapture.ContentCaptureSession;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bv2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4043bv2 extends AbstractC2572Tu2 {
    @Override // defpackage.AbstractC2572Tu2
    public final ContentCaptureSession a(ContentCaptureSession contentCaptureSession, String str, String str2) {
        Bundle bundle = new Bundle();
        if (str2 != null) {
            bundle.putCharSequence("favicon", str2);
        }
        return contentCaptureSession.createContentCaptureSession(new ContentCaptureContext.Builder(new LocusId(str)).setExtras(bundle).build());
    }

    @Override // defpackage.AbstractC2572Tu2
    public final void c(ContentCaptureSession contentCaptureSession, String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putCharSequence("favicon", str);
        }
        contentCaptureSession.setContentCaptureContext(new ContentCaptureContext.Builder(contentCaptureSession.getContentCaptureContext().getLocusId()).setExtras(bundle).build());
    }
}
