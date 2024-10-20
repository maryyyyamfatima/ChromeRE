package org.chromium.components.content_capture;

import android.graphics.Rect;
import defpackage.AbstractC3755b50;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ContentCaptureFrame extends AbstractC3755b50 {
    public final String d;
    public final String e;
    public final String f;

    public static ContentCaptureFrame createContentCaptureFrame(long j, String str, int i, int i2, int i3, int i4, String str2, String str3) {
        return new ContentCaptureFrame(j, str, i, i2, i3, i4, str2, str3);
    }

    public ContentCaptureFrame(long j, String str, int i, int i2, int i3, int i4, String str2, String str3) {
        super(j, new Rect(i, i2, i3 + i, i4 + i2));
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // defpackage.AbstractC3755b50
    public final String toString() {
        return super.toString() + " Url:" + this.d + " Title:" + this.e;
    }

    @Override // defpackage.AbstractC3755b50
    public final String a() {
        return this.e;
    }
}
