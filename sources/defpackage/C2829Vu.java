package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2829Vu extends C3089Xu {
    public final char[] d;

    public C2829Vu(C2699Uu c2699Uu) {
        super(c2699Uu, null);
        this.d = new char[512];
        int length = c2699Uu.b.length;
        for (int i = 0; i < 256; i++) {
            char[] cArr = this.d;
            char[] cArr2 = c2699Uu.b;
            cArr[i] = cArr2[i >>> 4];
            cArr[i | 256] = cArr2[i & 15];
        }
    }
}
