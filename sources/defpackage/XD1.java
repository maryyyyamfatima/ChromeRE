package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class XD1 implements Runnable {
    public final /* synthetic */ C3462aE1 a;
    public final /* synthetic */ ZD1 g;

    public /* synthetic */ XD1(C3462aE1 c3462aE1, ZD1 zd1) {
        this.a = c3462aE1;
        this.g = zd1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3462aE1 c3462aE1 = this.a;
        ZD1 zd1 = this.g;
        Object obj = c3462aE1.b;
        if (obj == null) {
            zd1.b();
            return;
        }
        try {
            zd1.a(obj);
        } catch (RuntimeException e) {
            zd1.b();
            throw e;
        }
    }
}
