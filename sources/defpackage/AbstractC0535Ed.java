package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodec$CryptoInfo$Pattern;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ed, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0535Ed {
    public static void a(MediaCodec.CryptoInfo cryptoInfo, int i, int i2) {
        cryptoInfo.setPattern(new MediaCodec$CryptoInfo$Pattern(i, i2));
    }
}
