package defpackage;

import org.chromium.media.MediaCodecBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class VM1 implements Runnable {
    public final int a;
    public final /* synthetic */ MediaCodecBridge g;

    public VM1(MediaCodecBridge mediaCodecBridge, int i) {
        this.g = mediaCodecBridge;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaCodecBridge mediaCodecBridge = this.g;
        int i = this.a;
        synchronized (mediaCodecBridge) {
            if (mediaCodecBridge.j != i) {
                return;
            }
            mediaCodecBridge.h = false;
        }
    }
}
