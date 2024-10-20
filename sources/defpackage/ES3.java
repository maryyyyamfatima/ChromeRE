package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ES3 {
    public final DS3 a;
    public final C7638mO3 b = new C7638mO3(new Runnable() { // from class: CS3
        @Override // java.lang.Runnable
        public final void run() {
            ES3 es3 = ES3.this;
            boolean b = es3.b.b();
            DS3 ds3 = es3.a;
            if (b) {
                ds3.a(false);
            } else {
                ds3.a(true);
            }
        }
    });

    public ES3(DS3 ds3) {
        this.a = ds3;
    }
}
