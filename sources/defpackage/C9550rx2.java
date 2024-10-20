package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rx2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9550rx2 implements InterfaceC9208qx2 {
    public final Object[] a;
    public int b;

    public C9550rx2(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[i];
    }

    @Override // defpackage.InterfaceC9208qx2
    public Object b() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.b = i - 1;
        return obj;
    }

    @Override // defpackage.InterfaceC9208qx2
    public boolean a(Object obj) {
        int i;
        Object[] objArr;
        boolean z;
        int i2 = 0;
        while (true) {
            i = this.b;
            objArr = this.a;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (objArr[i2] == obj) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = obj;
        this.b = i + 1;
        return true;
    }
}
