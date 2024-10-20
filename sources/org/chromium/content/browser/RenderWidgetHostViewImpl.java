package org.chromium.content.browser;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class RenderWidgetHostViewImpl {
    public long a;
    public RuntimeException b;

    public static RenderWidgetHostViewImpl create(long j) {
        return new RenderWidgetHostViewImpl(j);
    }

    public RenderWidgetHostViewImpl(long j) {
        this.a = j;
    }

    public final void clearNativePtr() {
        this.a = 0L;
        this.b = new RuntimeException("clearNativePtr");
    }
}
