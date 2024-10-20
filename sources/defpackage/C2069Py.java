package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Py, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2069Py implements Qj4 {
    public final /* synthetic */ C2199Qy a;

    @Override // defpackage.Qj4
    public final void a(int i) {
        C2199Qy c2199Qy = this.a;
        if (c2199Qy.l == null) {
            return;
        }
        if (i == 0) {
            c2199Qy.c();
        } else {
            c2199Qy.e(i, "Watcher reported error.");
        }
    }

    public C2069Py(C2199Qy c2199Qy) {
        this.a = c2199Qy;
    }
}
