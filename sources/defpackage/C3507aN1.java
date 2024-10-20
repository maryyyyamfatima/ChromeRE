package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aN1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3507aN1 implements Iterator, j$.util.Iterator {
    public int a;
    public final /* synthetic */ C3851bN1 g;

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public C3507aN1(C3851bN1 c3851bN1) {
        this.g = c3851bN1;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2 = this.a;
        MediaCodecInfo[] mediaCodecInfoArr = this.g.a;
        if (mediaCodecInfoArr != null) {
            i = mediaCodecInfoArr.length;
        } else {
            try {
                i = MediaCodecList.getCodecCount();
            } catch (RuntimeException unused) {
                i = 0;
            }
        }
        return i2 < i;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        int i;
        int i2 = this.a;
        C3851bN1 c3851bN1 = this.g;
        MediaCodecInfo[] mediaCodecInfoArr = c3851bN1.a;
        if (mediaCodecInfoArr != null) {
            i = mediaCodecInfoArr.length;
        } else {
            try {
                i = MediaCodecList.getCodecCount();
            } catch (RuntimeException unused) {
                i = 0;
            }
        }
        if (i2 == i) {
            throw new NoSuchElementException();
        }
        int i3 = this.a;
        this.a = i3 + 1;
        MediaCodecInfo[] mediaCodecInfoArr2 = c3851bN1.a;
        if (mediaCodecInfoArr2 != null) {
            return mediaCodecInfoArr2[i3];
        }
        return MediaCodecList.getCodecInfoAt(i3);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
