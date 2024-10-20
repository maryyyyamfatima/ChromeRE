package defpackage;

import android.view.contentcapture.ContentCaptureSession;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tu2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2572Tu2 {
    public static C4043bv2 a;

    public abstract ContentCaptureSession a(ContentCaptureSession contentCaptureSession, String str, String str2);

    public abstract void c(ContentCaptureSession contentCaptureSession, String str);

    public static AbstractC2572Tu2 b() {
        if (a == null) {
            a = new C4043bv2();
        }
        return a;
    }
}
