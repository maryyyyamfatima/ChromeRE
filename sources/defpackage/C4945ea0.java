package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ea0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4945ea0 implements Comparable {
    public final byte[] a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return C6663ja0.s.compare(this.a, ((C4945ea0) obj).a);
    }

    public C4945ea0(byte[] bArr) {
        this.a = bArr == null ? C6663ja0.p : bArr;
    }

    public final String toString() {
        return new String(this.a, C6663ja0.o);
    }
}
