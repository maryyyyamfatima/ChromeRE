package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qt3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9186qt3 {
    public static final C9186qt3 d = new C9186qt3(-1, -1, -1);
    public final int a;
    public final long b;
    public final long c;

    public C9186qt3(int i, long j, long j2) {
        if (i == -1 || i != 0) {
        }
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final String toString() {
        int i = this.a;
        if (i == -1) {
            return "SyncQuery[type=Unrecognized]";
        }
        return "SyncQuery[type=" + (i == 0 ? "Documents" : "Tags") + ", lastSeqNo=" + this.b + ", limit=" + this.c + "]";
    }
}
