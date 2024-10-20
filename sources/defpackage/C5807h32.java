package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h32, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5807h32 {
    public int a;
    public final byte[] b;
    public int c;
    public final int[] e = new int[256];
    public final int[] f = new int[256];
    public final int[] g = new int[256];
    public final int[] h = new int[32];
    public final int[][] d = new int[256];

    public C5807h32(byte[] bArr, int i, int i2) {
        this.b = bArr;
        this.c = i2;
        for (int i3 = 0; i3 < 256; i3++) {
            int[] iArr = new int[4];
            this.d[i3] = iArr;
            int i4 = (i3 << 12) / 256;
            iArr[2] = i4;
            iArr[1] = i4;
            iArr[0] = i4;
            this.g[i3] = 256;
            this.f[i3] = 0;
        }
    }
}
