package com.google.vr.ndk.base;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class DaydreamCompatibility {
    private final int supportedHeadsets;

    public DaydreamCompatibility(int i) {
        this.supportedHeadsets = i;
    }

    public DaydreamCompatibility() {
        this(0);
    }

    public int getSupportedHeadsets() {
        return this.supportedHeadsets;
    }

    public boolean supportsDaydream() {
        return (this.supportedHeadsets & 5) != 0;
    }

    public boolean requiresDaydream() {
        return supportsDaydream() && !supportsCardboard();
    }

    public int toDeprecated() {
        if (requiresDaydream()) {
            return 3;
        }
        return supportsDaydream() ? 2 : 1;
    }

    private boolean supportsCardboard() {
        return (this.supportedHeadsets & 2) != 0;
    }
}
