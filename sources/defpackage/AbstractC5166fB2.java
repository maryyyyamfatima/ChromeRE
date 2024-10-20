package defpackage;

import android.view.autofill.AutofillId;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.components.content_capture.ContentCaptureData;
import org.chromium.components.content_capture.ContentCaptureFrame;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fB2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5166fB2 extends R72 {
    public final ContentCaptureFrame k;

    public abstract AutofillId s(C12283zv2 c12283zv2, AbstractC3755b50 abstractC3755b50);

    public AbstractC5166fB2(C10753vU0 c10753vU0, ContentCaptureFrame contentCaptureFrame, C0108Av2 c0108Av2) {
        super(c10753vU0, c0108Av2);
        this.k = contentCaptureFrame;
    }

    public final boolean t(C12283zv2 c12283zv2, ContentCaptureData contentCaptureData) {
        if (contentCaptureData == null) {
            return false;
        }
        ArrayList arrayList = contentCaptureData.c;
        if (!((arrayList == null || arrayList.isEmpty()) ? false : true)) {
            return s(c12283zv2, contentCaptureData) != null;
        }
        AutofillId s = s(c12283zv2, contentCaptureData);
        if (s == null) {
            return false;
        }
        C12283zv2 c12283zv22 = new C12283zv2(c12283zv2.a, s);
        Iterator it = contentCaptureData.c.iterator();
        while (it.hasNext()) {
            if (!t(c12283zv22, (ContentCaptureData) ((AbstractC3755b50) it.next()))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.R72
    public final void r() {
        ContentCaptureFrame contentCaptureFrame;
        C12283zv2 o;
        R72.p("ProcessContentTaskBase.processContent");
        C12283zv2 n = n();
        if (n == null || (contentCaptureFrame = this.k) == null || contentCaptureFrame.d == null || (o = o(n, contentCaptureFrame)) == null) {
            return;
        }
        Iterator it = contentCaptureFrame.c.iterator();
        while (it.hasNext() && t(o, (ContentCaptureData) ((AbstractC3755b50) it.next()))) {
        }
    }
}
