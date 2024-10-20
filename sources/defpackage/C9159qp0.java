package defpackage;

import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9159qp0 {
    public final String a;
    public final long[] b;
    public final File[] c;
    public final File[] d;
    public boolean e;
    public C8816pp0 f;
    public final /* synthetic */ C9844sp0 g;

    public C9159qp0(C9844sp0 c9844sp0, String str) {
        this.g = c9844sp0;
        this.a = str;
        int i = c9844sp0.l;
        this.b = new long[i];
        this.c = new File[i];
        this.d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < c9844sp0.l; i2++) {
            sb.append(i2);
            File[] fileArr = this.c;
            String sb2 = sb.toString();
            File file = c9844sp0.a;
            fileArr[i2] = new File(file, sb2);
            sb.append(".tmp");
            this.d[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.b) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
