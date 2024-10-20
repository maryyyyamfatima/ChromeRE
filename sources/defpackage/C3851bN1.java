package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bN1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3851bN1 implements Iterable {
    public final MediaCodecInfo[] a;

    public C3851bN1() {
        try {
            this.a = new MediaCodecList(1).getCodecInfos();
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3507aN1(this);
    }
}
