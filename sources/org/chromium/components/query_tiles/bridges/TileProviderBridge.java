package org.chromium.components.query_tiles.bridges;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TileProviderBridge {
    public long a;

    public static TileProviderBridge create(long j) {
        return new TileProviderBridge(j);
    }

    public TileProviderBridge(long j) {
        this.a = j;
    }

    public final void clearNativePtr() {
        this.a = 0L;
    }
}
