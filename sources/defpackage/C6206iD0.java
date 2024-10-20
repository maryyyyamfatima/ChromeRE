package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6206iD0 implements InterfaceC11101wV0, SC0 {
    public InterfaceC4449d61 a;
    public final int g;
    public final Object[] h;

    public C6206iD0(InterfaceC4449d61 interfaceC4449d61, int i, Object[] objArr) {
        this.a = interfaceC4449d61;
        this.g = i;
        this.h = objArr;
    }

    public void d(Object obj) {
        this.a.b().c(this, obj);
    }

    @Override // defpackage.SC0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean a(C6206iD0 c6206iD0) {
        if (this == c6206iD0) {
            return true;
        }
        if (c6206iD0 == null || c6206iD0.getClass() != getClass() || this.g != c6206iD0.g) {
            return false;
        }
        Object[] objArr = this.h;
        Object[] objArr2 = c6206iD0.h;
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        for (int i = 1; i < objArr.length; i++) {
            Object obj = objArr[i];
            Object obj2 = objArr2[i];
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else {
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final String toString() {
        InterfaceC4449d61 interfaceC4449d61 = this.a;
        if (interfaceC4449d61 != null && interfaceC4449d61 != this) {
            return interfaceC4449d61.toString();
        }
        return super.toString();
    }
}
