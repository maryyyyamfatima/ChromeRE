package defpackage;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import org.chromium.components.content_capture.ContentCaptureFrame;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class R72 extends AbstractC0185Bl {
    public static Boolean j;
    public final C10753vU0 h;
    public final C0108Av2 i;

    public abstract void r();

    @Override // defpackage.AbstractC0185Bl
    public final /* bridge */ /* synthetic */ void k(Object obj) {
    }

    public R72(C10753vU0 c10753vU0, C0108Av2 c0108Av2) {
        this.h = c10753vU0;
        this.i = c0108Av2;
        if (j == null) {
            j = Boolean.valueOf(AX.e().g("dump-captured-content-to-logcat-for-testing"));
        }
    }

    public final C12283zv2 n() {
        C0108Av2 c0108Av2 = this.i;
        C10753vU0 c10753vU0 = this.h;
        if (c10753vU0 == null || c10753vU0.isEmpty()) {
            return c0108Av2.a;
        }
        C12283zv2 c12283zv2 = c0108Av2.a;
        int size = c10753vU0.size();
        do {
            size--;
            if (size < 0) {
                break;
            }
            c12283zv2 = o(c12283zv2, (ContentCaptureFrame) c10753vU0.get(size));
        } while (c12283zv2 != null);
        return c12283zv2;
    }

    public static AutofillId q(C12283zv2 c12283zv2, AbstractC3755b50 abstractC3755b50) {
        ViewStructure newVirtualViewStructure;
        AutofillId autofillId;
        AbstractC2572Tu2 b = AbstractC2572Tu2.b();
        ContentCaptureSession contentCaptureSession = c12283zv2.a;
        long j2 = abstractC3755b50.a;
        ((C4043bv2) b).getClass();
        newVirtualViewStructure = contentCaptureSession.newVirtualViewStructure(c12283zv2.b, j2);
        newVirtualViewStructure.setText(abstractC3755b50.a());
        Rect rect = abstractC3755b50.b;
        newVirtualViewStructure.setDimens(rect.left, rect.top, 0, 0, rect.width(), rect.height());
        ((C4043bv2) AbstractC2572Tu2.b()).getClass();
        c12283zv2.a.notifyViewAppeared(newVirtualViewStructure);
        autofillId = newVirtualViewStructure.getAutofillId();
        return autofillId;
    }

    public final C12283zv2 o(C12283zv2 c12283zv2, ContentCaptureFrame contentCaptureFrame) {
        C0108Av2 c0108Av2 = this.i;
        C12283zv2 c12283zv22 = (C12283zv2) c0108Av2.a().get(Long.valueOf(contentCaptureFrame.a));
        if (c12283zv22 != null) {
            return c12283zv22;
        }
        String str = contentCaptureFrame.d;
        if (TextUtils.isEmpty(str)) {
            return c12283zv22;
        }
        ContentCaptureSession a = AbstractC2572Tu2.b().a(c12283zv2.a, str, contentCaptureFrame.f);
        AbstractC2572Tu2 b = AbstractC2572Tu2.b();
        AutofillId autofillId = c0108Av2.a.b;
        ((C4043bv2) b).getClass();
        ContentCaptureSession contentCaptureSession = c12283zv2.a;
        long j2 = contentCaptureFrame.a;
        contentCaptureSession.newAutofillId(autofillId, j2);
        C12283zv2 c12283zv23 = new C12283zv2(a, q(c12283zv2, contentCaptureFrame));
        c0108Av2.a().put(Long.valueOf(j2), c12283zv23);
        return c12283zv23;
    }

    public static void p(String str) {
        if (j.booleanValue()) {
            AbstractC4851eH1.d("ContentCapture", str, new Object[0]);
        }
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        boolean z;
        try {
            r();
        } catch (NullPointerException e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (stackTraceElement.getClassName().startsWith("android.view.contentcapture.MainContentCaptureSession") && stackTraceElement.getMethodName().startsWith("sendEvent")) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                AbstractC4851eH1.a("ContentCapture", "PlatformException", e);
            } else {
                throw e;
            }
        }
        return Boolean.TRUE;
    }
}
