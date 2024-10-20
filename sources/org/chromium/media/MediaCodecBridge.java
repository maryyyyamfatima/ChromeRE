package org.chromium.media;

import J.N;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import defpackage.AbstractC0535Ed;
import defpackage.AbstractC4851eH1;
import defpackage.VM1;
import defpackage.WM1;
import java.nio.ByteBuffer;
import java.util.LinkedList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MediaCodecBridge {
    public static HandlerThread m;
    public static Handler n;
    public MediaCodec a;
    public final int b;
    public int c;
    public final boolean d;
    public LinkedList e;
    public MediaFormatWrapper f;
    public boolean g;
    public boolean h;
    public long i;
    public int j;
    public LinkedList k;
    public LinkedList l;

    public final void setVideoBitrate(int i, int i2) {
        int i3 = this.b;
        if (i3 != 0) {
            if (i3 != 1) {
                i = 0;
            } else if (i2 != 0) {
                i = (i * 30) / i2;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("video-bitrate", i);
        try {
            this.a.setParameters(bundle);
        } catch (IllegalStateException e) {
            AbstractC4851eH1.a("MediaCodecBridge", "Failed to set MediaCodec parameters", e);
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public class DequeueInputResult {
        public final int a;
        public final int b;

        public DequeueInputResult(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final int status() {
            return this.a;
        }

        public final int index() {
            return this.b;
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public class DequeueOutputResult {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final long e;
        public final int f;

        public DequeueOutputResult(int i, int i2, int i3, int i4, long j, int i5) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = j;
            this.f = i5;
        }

        public final int status() {
            return this.a;
        }

        public final int index() {
            return this.b;
        }

        public final int flags() {
            return this.c;
        }

        public final int offset() {
            return this.d;
        }

        public final long presentationTimeMicroseconds() {
            return this.e;
        }

        public final int numBytes() {
            return this.f;
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public class MediaFormatWrapper {
        public final MediaFormat a;

        public MediaFormatWrapper(MediaFormat mediaFormat) {
            this.a = mediaFormat;
        }

        public final boolean a() {
            MediaFormat mediaFormat = this.a;
            return mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        }

        public final int width() {
            boolean a = a();
            MediaFormat mediaFormat = this.a;
            if (a) {
                return (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            }
            return mediaFormat.getInteger("width");
        }

        public final int height() {
            boolean a = a();
            MediaFormat mediaFormat = this.a;
            if (a) {
                return (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            }
            return mediaFormat.getInteger("height");
        }

        public final int sampleRate() {
            return this.a.getInteger("sample-rate");
        }

        public final int channelCount() {
            return this.a.getInteger("channel-count");
        }

        public final int stride() {
            MediaFormat mediaFormat = this.a;
            return !mediaFormat.containsKey("stride") ? width() : mediaFormat.getInteger("stride");
        }

        public final int yPlaneHeight() {
            MediaFormat mediaFormat = this.a;
            return !mediaFormat.containsKey("slice-height") ? height() : mediaFormat.getInteger("slice-height");
        }

        public final int colorStandard() {
            MediaFormat mediaFormat = this.a;
            if (mediaFormat.containsKey("color-standard")) {
                return mediaFormat.getInteger("color-standard");
            }
            return -1;
        }

        public final int colorRange() {
            MediaFormat mediaFormat = this.a;
            if (mediaFormat.containsKey("color-range")) {
                return mediaFormat.getInteger("color-range");
            }
            return -1;
        }

        public final int colorTransfer() {
            MediaFormat mediaFormat = this.a;
            if (mediaFormat.containsKey("color-transfer")) {
                return mediaFormat.getInteger("color-transfer");
            }
            return -1;
        }
    }

    public MediaCodecBridge(MediaCodec mediaCodec, int i, boolean z) {
        this.a = mediaCodec;
        this.b = i;
        this.d = z;
        if (z) {
            this.g = false;
            this.e = new LinkedList();
            this.k = new LinkedList();
            this.l = new LinkedList();
            this.a.setCallback(new WM1(this), n);
            d();
        }
    }

    public final synchronized void d() {
        this.e.clear();
        this.k.clear();
        this.l.clear();
        this.h = true;
        this.f = null;
        this.j++;
    }

    public final synchronized void setBuffersAvailableListener(long j) {
        this.i = j;
        if (!this.k.isEmpty() || !this.l.isEmpty() || this.g) {
            c();
        }
    }

    public final synchronized void c() {
        long j = this.i;
        if (j != 0) {
            N.MNqjfk23(j, this);
        }
    }

    public void release() {
        if (this.d) {
            synchronized (this) {
                this.i = 0L;
            }
        }
        try {
            AbstractC4851eH1.f("MediaCodecBridge", "Releasing: %s", this.a.getName());
            this.a.release();
            AbstractC4851eH1.f("MediaCodecBridge", "Codec released", new Object[0]);
        } catch (IllegalStateException e) {
            AbstractC4851eH1.a("MediaCodecBridge", "Cannot release media codec", e);
        }
        this.a = null;
    }

    public final boolean e() {
        try {
            if (this.d) {
                synchronized (this) {
                    if (this.g) {
                        return false;
                    }
                    Handler handler = n;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                    }
                    handler.post(new VM1(this, this.j));
                }
            }
            this.a.start();
            return true;
        } catch (IllegalArgumentException e) {
            AbstractC4851eH1.a("MediaCodecBridge", "Cannot start the media codec", e);
            return false;
        } catch (IllegalStateException e2) {
            AbstractC4851eH1.a("MediaCodecBridge", "Cannot start the media codec", e2);
            return false;
        }
    }

    public final DequeueInputResult dequeueInputBuffer(long j) {
        int i = 5;
        int i2 = -1;
        if (this.d) {
            synchronized (this) {
                if (this.g) {
                    return new DequeueInputResult(5, -1);
                }
                if (!this.h && !this.k.isEmpty()) {
                    return (DequeueInputResult) this.k.remove();
                }
                return new DequeueInputResult(1, -1);
            }
        }
        try {
            int dequeueInputBuffer = this.a.dequeueInputBuffer(j);
            if (dequeueInputBuffer >= 0) {
                i2 = dequeueInputBuffer;
                i = 0;
            } else if (dequeueInputBuffer == -1) {
                i = 1;
            } else {
                AbstractC4851eH1.a("MediaCodecBridge", "Unexpected index_or_status: %d", Integer.valueOf(dequeueInputBuffer));
            }
        } catch (Exception e) {
            AbstractC4851eH1.a("MediaCodecBridge", "Failed to dequeue input buffer", e);
        }
        return new DequeueInputResult(i, i2);
    }

    public final int flush() {
        try {
            this.a.flush();
            if (this.d) {
                d();
                if (!e()) {
                    return 5;
                }
            }
            return 0;
        } catch (Exception e) {
            AbstractC4851eH1.a("MediaCodecBridge", "Failed to flush MediaCodec", e);
            return 5;
        }
    }

    public final void stop() {
        try {
            this.a.stop();
            if (this.d) {
                d();
            }
        } catch (IllegalStateException e) {
            AbstractC4851eH1.a("MediaCodecBridge", "Failed to stop MediaCodec", e);
        }
    }

    public final String getName() {
        try {
            return this.a.getName();
        } catch (IllegalStateException e) {
            AbstractC4851eH1.a("MediaCodecBridge", "Cannot get codec name", e);
            return "unknown";
        }
    }

    public final MediaFormatWrapper getOutputFormat() {
        MediaFormatWrapper mediaFormatWrapper;
        if (this.d && (mediaFormatWrapper = this.f) != null) {
            return mediaFormatWrapper;
        }
        try {
            MediaFormat outputFormat = this.a.getOutputFormat();
            if (outputFormat != null) {
                return new MediaFormatWrapper(outputFormat);
            }
            return null;
        } catch (IllegalStateException e) {
            AbstractC4851eH1.a("MediaCodecBridge", "Failed to get output format", e);
            return null;
        }
    }

    public final MediaFormatWrapper getInputFormat() {
        try {
            MediaFormat inputFormat = this.a.getInputFormat();
            if (inputFormat != null) {
                return new MediaFormatWrapper(inputFormat);
            }
            return null;
        } catch (IllegalStateException e) {
            AbstractC4851eH1.a("MediaCodecBridge", "Failed to get input format", e);
            return null;
        }
    }

    public final ByteBuffer getInputBuffer(int i) {
        if (this.d) {
            synchronized (this) {
                if (this.g) {
                    return null;
                }
            }
        }
        try {
            return this.a.getInputBuffer(i);
        } catch (IllegalStateException e) {
            AbstractC4851eH1.a("MediaCodecBridge", "Failed to get input buffer", e);
            return null;
        }
    }

    public ByteBuffer getOutputBuffer(int i) {
        try {
            return this.a.getOutputBuffer(i);
        } catch (IllegalStateException e) {
            AbstractC4851eH1.a("MediaCodecBridge", "Failed to get output buffer", e);
            return null;
        }
    }

    public final int queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        try {
            this.a.queueInputBuffer(i, i2, i3, j, i4);
            return 0;
        } catch (Exception e) {
            AbstractC4851eH1.a("MediaCodecBridge", "Failed to queue input buffer", e);
            return 5;
        }
    }

    public final void requestKeyFrameSoon() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        try {
            this.a.setParameters(bundle);
        } catch (IllegalStateException e) {
            AbstractC4851eH1.a("MediaCodecBridge", "Failed to set MediaCodec parameters", e);
        }
    }

    public static int f(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        AbstractC4851eH1.a("MediaCodecBridge", "Unsupported cipher mode: %d", Integer.valueOf(i));
        return -1;
    }

    public final int queueSecureInputBuffer(int i, int i2, byte[] bArr, byte[] bArr2, int[] iArr, int[] iArr2, int i3, int i4, int i5, int i6, long j) {
        try {
            int f = f(i4);
            if (f == -1) {
                return 5;
            }
            boolean z = f == 2;
            if (z && !MediaCodecUtil.platformSupportsCbcsEncryption(Build.VERSION.SDK_INT)) {
                AbstractC4851eH1.a("MediaCodecBridge", "Encryption scheme 'cbcs' not supported on this platform.", new Object[0]);
                return 5;
            }
            MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
            cryptoInfo.set(i3, iArr, iArr2, bArr2, bArr, f);
            if (i5 != 0 && i6 != 0) {
                if (!z) {
                    AbstractC4851eH1.a("MediaCodecBridge", "Pattern encryption only supported for 'cbcs' scheme (CBC mode).", new Object[0]);
                    return 5;
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    AbstractC0535Ed.a(cryptoInfo, i5, i6);
                }
            }
            try {
                this.a.queueSecureInputBuffer(i, i2, cryptoInfo, j, 0);
                return 0;
            } catch (MediaCodec.CryptoException e) {
                e = e;
                if (e.getErrorCode() == 1) {
                    return 4;
                }
                AbstractC4851eH1.a("MediaCodecBridge", "Failed to queue secure input buffer. Error code %d", Integer.valueOf(e.getErrorCode()), e);
                return 5;
            } catch (IllegalArgumentException e2) {
                e = e2;
                AbstractC4851eH1.a("MediaCodecBridge", "Failed to queue secure input buffer.", e);
                return 5;
            } catch (IllegalStateException e3) {
                e = e3;
                AbstractC4851eH1.a("MediaCodecBridge", "Failed to queue secure input buffer.", e);
                return 5;
            }
        } catch (MediaCodec.CryptoException e4) {
            e = e4;
        } catch (IllegalArgumentException e5) {
            e = e5;
        } catch (IllegalStateException e6) {
            e = e6;
        }
    }

    public void releaseOutputBuffer(int i, boolean z) {
        try {
            this.a.releaseOutputBuffer(i, z);
        } catch (IllegalStateException e) {
            AbstractC4851eH1.a("MediaCodecBridge", "Failed to release output buffer", e);
        }
    }

    public final DequeueOutputResult dequeueOutputBuffer(long j) {
        int i;
        int i2;
        int i3 = 3;
        if (this.d) {
            synchronized (this) {
                if (this.g) {
                    return new DequeueOutputResult(5, -1, 0, 0, 0L, 0);
                }
                if (!this.l.isEmpty()) {
                    if (((DequeueOutputResult) this.l.peek()).status() == 3) {
                        this.f = (MediaFormatWrapper) this.e.remove();
                    }
                    return (DequeueOutputResult) this.l.remove();
                }
                return new DequeueOutputResult(1, -1, 0, 0, 0L, 0);
            }
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int i4 = -1;
        try {
            int b = b(bufferInfo, j);
            if (b >= 0) {
                i4 = b;
                i3 = 0;
            } else if (b == -3) {
                i3 = 2;
            } else if (b == -2) {
                this.a.getOutputFormat();
            } else if (b == -1) {
                i3 = 1;
            } else {
                AbstractC4851eH1.a("MediaCodecBridge", "Unexpected index_or_status: %d", Integer.valueOf(b));
                i3 = 5;
            }
            i2 = i3;
            i = i4;
        } catch (IllegalStateException e) {
            AbstractC4851eH1.a("MediaCodecBridge", "Failed to dequeue output buffer", e);
            i = -1;
            i2 = 5;
        }
        return new DequeueOutputResult(i2, i, bufferInfo.flags, bufferInfo.offset, bufferInfo.presentationTimeUs, bufferInfo.size);
    }

    public int b(MediaCodec.BufferInfo bufferInfo, long j) {
        return this.a.dequeueOutputBuffer(bufferInfo, j);
    }

    public final boolean a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        try {
            this.a.configure(mediaFormat, surface, mediaCrypto, i);
            if (mediaFormat.containsKey("max-input-size")) {
                this.c = mediaFormat.getInteger("max-input-size");
                return true;
            }
        } catch (MediaCodec.CryptoException e) {
            AbstractC4851eH1.a("MediaCodecBridge", "Cannot configure the video codec: DRM error", e);
        } catch (IllegalArgumentException e2) {
            AbstractC4851eH1.a("MediaCodecBridge", "Cannot configure the video codec, wrong format or surface", e2);
        } catch (IllegalStateException e3) {
            AbstractC4851eH1.a("MediaCodecBridge", "Cannot configure the video codec", e3);
        } catch (Exception e4) {
            AbstractC4851eH1.a("MediaCodecBridge", "Cannot configure the video codec", e4);
        }
        return false;
    }

    public final boolean setSurface(Surface surface) {
        try {
            this.a.setOutputSurface(surface);
            return true;
        } catch (IllegalArgumentException | IllegalStateException e) {
            AbstractC4851eH1.a("MediaCodecBridge", "Cannot set output surface", e);
            return false;
        }
    }

    public final int getMaxInputSize() {
        return this.c;
    }

    public static void createCallbackHandlerForTesting() {
        if (m != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("TestCallbackThread");
        m = handlerThread;
        handlerThread.start();
        n = new Handler(m.getLooper());
    }
}
