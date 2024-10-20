package defpackage;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6119hy extends C5210fK1 {
    @Override // defpackage.C5210fK1
    public final Object a(Object obj) {
        WeakReference weakReference = (WeakReference) C6461iy.d.get((String) obj);
        if (weakReference == null) {
            return null;
        }
        return (Bitmap) weakReference.get();
    }

    @Override // defpackage.C5210fK1
    public final int e(Object obj, Object obj2) {
        return ((Bitmap) obj2).getByteCount();
    }

    public C6119hy(int i) {
        super(i);
    }
}
