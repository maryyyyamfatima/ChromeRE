package org.chromium.components.segmentation_platform;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SegmentationPlatformServiceImpl {
    public long a;

    public static SegmentationPlatformServiceImpl create(long j) {
        return new SegmentationPlatformServiceImpl(j);
    }

    public SegmentationPlatformServiceImpl(long j) {
        this.a = j;
    }

    public final void clearNativePtr() {
        this.a = 0L;
    }
}
