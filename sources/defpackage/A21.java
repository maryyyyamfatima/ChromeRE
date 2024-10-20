package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class A21 extends AbstractBinderC11635y21 {
    public static final WeakReference i = new WeakReference(null);
    public WeakReference h;

    public abstract byte[] j1();

    public A21(byte[] bArr) {
        super(bArr);
        this.h = i;
    }

    @Override // defpackage.AbstractBinderC11635y21
    public final byte[] i1() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.h.get();
            if (bArr == null) {
                bArr = j1();
                this.h = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
