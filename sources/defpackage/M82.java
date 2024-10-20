package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class M82 extends C02 {
    public final Object a;
    public int b;
    public final /* synthetic */ N82 c;

    public M82(N82 n82, int i) {
        this.c = n82;
        this.a = n82.a[i];
        this.b = i;
    }

    @Override // defpackage.C02
    public final int a() {
        int i = this.b;
        N82 n82 = this.c;
        Object obj = this.a;
        if (i == -1 || i >= n82.c || !V82.a(obj, n82.a[i])) {
            this.b = n82.a(obj);
        }
        int i2 = this.b;
        if (i2 == -1) {
            return 0;
        }
        return n82.b[i2];
    }
}
