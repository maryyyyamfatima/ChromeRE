package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import org.chromium.media.MediaCodecBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class WM1 extends MediaCodec.Callback {
    public final MediaCodecBridge a;

    public WM1(MediaCodecBridge mediaCodecBridge) {
        this.a = mediaCodecBridge;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        AbstractC4851eH1.a("MediaCodecBridge", "MediaCodec.onError: %s", codecException.getDiagnosticInfo());
        MediaCodecBridge mediaCodecBridge = this.a;
        synchronized (mediaCodecBridge) {
            mediaCodecBridge.g = true;
            mediaCodecBridge.k.clear();
            mediaCodecBridge.l.clear();
            mediaCodecBridge.c();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        MediaCodecBridge mediaCodecBridge = this.a;
        synchronized (mediaCodecBridge) {
            if (mediaCodecBridge.h) {
                return;
            }
            mediaCodecBridge.k.add(new MediaCodecBridge.DequeueInputResult(0, i));
            mediaCodecBridge.c();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        MediaCodecBridge mediaCodecBridge = this.a;
        synchronized (mediaCodecBridge) {
            if (mediaCodecBridge.h) {
                return;
            }
            mediaCodecBridge.l.add(new MediaCodecBridge.DequeueOutputResult(0, i, bufferInfo.flags, bufferInfo.offset, bufferInfo.presentationTimeUs, bufferInfo.size));
            mediaCodecBridge.c();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        MediaCodecBridge mediaCodecBridge = this.a;
        synchronized (mediaCodecBridge) {
            mediaCodecBridge.l.add(new MediaCodecBridge.DequeueOutputResult(3, -1, 0, 0, 0L, 0));
            mediaCodecBridge.e.add(new MediaCodecBridge.MediaFormatWrapper(mediaFormat));
            mediaCodecBridge.c();
        }
    }
}
