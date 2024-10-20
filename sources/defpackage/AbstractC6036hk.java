package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6036hk extends AbstractC5692gk {
    public static /* synthetic */ void d(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        c(i, i2, i3, objArr, objArr2);
    }

    public static final void c(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        AbstractC0087Ar1.e(objArr, "<this>");
        AbstractC0087Ar1.e(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static final void a(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        AbstractC0087Ar1.e(bArr, "<this>");
        AbstractC0087Ar1.e(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static final void b(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        AbstractC0087Ar1.e(iArr, "<this>");
        AbstractC0087Ar1.e(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }
}
