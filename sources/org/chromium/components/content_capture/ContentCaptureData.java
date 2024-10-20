package org.chromium.components.content_capture;

import android.graphics.Rect;
import defpackage.AbstractC3755b50;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ContentCaptureData extends AbstractC3755b50 {
    public final String d;

    public static ContentCaptureData createContentCaptureData(Object obj, long j, String str, int i, int i2, int i3, int i4) {
        ContentCaptureData contentCaptureData = new ContentCaptureData(str, j, i, i2, i3, i4);
        if (obj != null) {
            AbstractC3755b50 abstractC3755b50 = (AbstractC3755b50) obj;
            if (abstractC3755b50.c == null) {
                abstractC3755b50.c = new ArrayList();
            }
            abstractC3755b50.c.add(contentCaptureData);
        }
        return contentCaptureData;
    }

    public ContentCaptureData(String str, long j, int i, int i2, int i3, int i4) {
        super(j, new Rect(i, i2, i3 + i, i4 + i2));
        this.d = str;
    }

    @Override // defpackage.AbstractC3755b50
    public final String toString() {
        return super.toString() + " value:" + this.d;
    }

    @Override // defpackage.AbstractC3755b50
    public final String a() {
        return this.d;
    }
}
