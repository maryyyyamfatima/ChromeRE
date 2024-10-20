package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e84, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4807e84 {
    public boolean a;
    public String b;

    public void b() {
    }

    public void c() {
        if (this.a && this.b == null) {
            return;
        }
        this.a = true;
        C4120c84 c4120c84 = new C4120c84(this);
        String str = this.b;
        if (str != null) {
            c4120c84.onResult(str);
        } else {
            a(new C4464d84(this, c4120c84));
        }
    }

    public void a(C4464d84 c4464d84) {
        c4464d84.onResult("");
    }
}
