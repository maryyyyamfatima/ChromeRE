package org.chromium.media;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import defpackage.AbstractC4851eH1;
import defpackage.UN1;
import defpackage.XM1;
import defpackage.ZM1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MediaCodecBridgeBuilder {
    public static MediaCodecBridge createVideoDecoder(String str, int i, MediaCrypto mediaCrypto, int i2, int i3, Surface surface, byte[] bArr, byte[] bArr2, HdrMetadata hdrMetadata, boolean z, boolean z2) {
        try {
            AbstractC4851eH1.d("MediaCodecBridge", "create MediaCodec video decoder, mime %s", str);
            ZM1 c = MediaCodecUtil.c(str, i, mediaCrypto);
            MediaCodec mediaCodec = c.a;
            if (mediaCodec == null) {
                return null;
            }
            MediaCodecBridge mediaCodecBridge = new MediaCodecBridge(mediaCodec, c.c, z2);
            if (!mediaCodecBridge.a(UN1.b(str, i2, i3, new byte[][]{bArr, bArr2}, hdrMetadata, c.b && z), surface, mediaCrypto, 0)) {
                return null;
            }
            if (mediaCodecBridge.e()) {
                return mediaCodecBridge;
            }
            mediaCodecBridge.release();
            return null;
        } catch (Exception e) {
            AbstractC4851eH1.a("MediaCodecBridge", "Failed to create MediaCodec video decoder: %s, codecType: %d", str, Integer.valueOf(i), e);
            return null;
        }
    }

    public static MediaCodecBridge createVideoEncoder(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        MediaCodecBridge mediaCodecBridge;
        ZM1 zm1 = new ZM1();
        int i8 = 0;
        try {
            AbstractC4851eH1.d("MediaCodecBridge", "create MediaCodec video encoder, mime %s", str);
            zm1 = MediaCodecUtil.d(str);
        } catch (Exception e) {
            AbstractC4851eH1.a("MediaCodecBridge", "Failed to create MediaCodec video encoder: %s", str, e);
        }
        if (zm1.a == null) {
            return null;
        }
        if (str.equals("video/avc")) {
            mediaCodecBridge = new XM1(zm1.a, zm1.c);
        } else {
            mediaCodecBridge = new MediaCodecBridge(zm1.a, zm1.c, false);
        }
        int i9 = zm1.c;
        if (i9 == 0) {
            i8 = Math.min(i5, 30);
        } else if (i9 == 1) {
            i8 = 30;
        }
        boolean z = zm1.b;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, i, i2);
        createVideoFormat.setInteger("bitrate", i4);
        createVideoFormat.setInteger("frame-rate", i8);
        createVideoFormat.setInteger("i-frame-interval", i6);
        createVideoFormat.setInteger("color-format", i7);
        createVideoFormat.setInteger("bitrate-mode", i3);
        UN1.a(createVideoFormat, z);
        if (!mediaCodecBridge.a(createVideoFormat, null, null, 1)) {
            return null;
        }
        if (mediaCodecBridge.e()) {
            return mediaCodecBridge;
        }
        mediaCodecBridge.release();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.chromium.media.MediaCodecBridge createAudioDecoder(java.lang.String r11, android.media.MediaCrypto r12, int r13, int r14, byte[] r15, byte[] r16, byte[] r17, boolean r18, boolean r19) {
        /*
            r1 = r11
            r2 = r12
            java.lang.String r3 = "MediaCodecBridge"
            ZM1 r4 = new ZM1
            r4.<init>()
            r5 = 2
            r6 = 1
            r7 = 0
            java.lang.String r0 = "create MediaCodec audio decoder, mime %s"
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L1a
            r8[r7] = r1     // Catch: java.lang.Exception -> L1a
            defpackage.AbstractC4851eH1.d(r3, r0, r8)     // Catch: java.lang.Exception -> L1a
            ZM1 r4 = org.chromium.media.MediaCodecUtil.c(r11, r7, r12)     // Catch: java.lang.Exception -> L1a
            goto L26
        L1a:
            r0 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r5]
            r8[r7] = r1
            r8[r6] = r0
            java.lang.String r0 = "Failed to create MediaCodec audio decoder: %s"
            defpackage.AbstractC4851eH1.a(r3, r0, r8)
        L26:
            android.media.MediaCodec r0 = r4.a
            r8 = 0
            if (r0 != 0) goto L2c
            return r8
        L2c:
            org.chromium.media.MediaCodecBridge r9 = new org.chromium.media.MediaCodecBridge
            int r4 = r4.c
            r10 = r19
            r9.<init>(r0, r4, r10)
            r0 = 3
            byte[][] r0 = new byte[r0]
            r0[r7] = r15
            r0[r6] = r16
            r0[r5] = r17
            r4 = r13
            r5 = r14
            android.media.MediaFormat r1 = android.media.MediaFormat.createAudioFormat(r11, r13, r14)
            defpackage.UN1.c(r1, r0)
            if (r18 == 0) goto L4e
            java.lang.String r0 = "is-adts"
            r1.setInteger(r0, r6)
        L4e:
            java.lang.String r4 = "Cannot configure the audio codec"
            android.media.MediaCodec r0 = r9.a     // Catch: java.lang.Exception -> L56 android.media.MediaCodec.CryptoException -> L5f java.lang.IllegalStateException -> L6a java.lang.IllegalArgumentException -> L73
            r0.configure(r1, r8, r12, r7)     // Catch: java.lang.Exception -> L56 android.media.MediaCodec.CryptoException -> L5f java.lang.IllegalStateException -> L6a java.lang.IllegalArgumentException -> L73
            goto L7c
        L56:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r7] = r0
            defpackage.AbstractC4851eH1.a(r3, r4, r1)
            goto L7b
        L5f:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r7] = r0
            java.lang.String r0 = "Cannot configure the audio codec: DRM error"
            defpackage.AbstractC4851eH1.a(r3, r0, r1)
            goto L7b
        L6a:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r7] = r0
            defpackage.AbstractC4851eH1.a(r3, r4, r1)
            goto L7b
        L73:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r7] = r0
            defpackage.AbstractC4851eH1.a(r3, r4, r1)
        L7b:
            r6 = r7
        L7c:
            if (r6 != 0) goto L7f
            return r8
        L7f:
            boolean r0 = r9.e()
            if (r0 != 0) goto L89
            r9.release()
            return r8
        L89:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.media.MediaCodecBridgeBuilder.createAudioDecoder(java.lang.String, android.media.MediaCrypto, int, int, byte[], byte[], byte[], boolean, boolean):org.chromium.media.MediaCodecBridge");
    }
}
