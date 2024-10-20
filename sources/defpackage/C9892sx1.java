package defpackage;

import android.graphics.Bitmap;
import android.util.LruCache;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sx1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9892sx1 extends LruCache {
    public C9892sx1(int i) {
        super(i);
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        Bitmap bitmap = ((C10578ux1) obj2).a;
        return Math.max(1024, bitmap == null ? 0 : bitmap.getByteCount());
    }
}
