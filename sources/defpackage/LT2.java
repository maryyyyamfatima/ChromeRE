package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LT2 {
    public final C4866eK1 a = new C4866eK1(1000);
    public final C8974qH0 b = AbstractC10002tH0.a(10, new JT2());

    public final String a(InterfaceC6098hu1 interfaceC6098hu1) {
        String str;
        synchronized (this.a) {
            str = (String) this.a.a(interfaceC6098hu1);
        }
        if (str == null) {
            KT2 kt2 = (KT2) this.b.b();
            AbstractC6464iy2.b(kt2);
            try {
                interfaceC6098hu1.a(kt2.a);
                byte[] digest = kt2.a.digest();
                char[] cArr = AbstractC10296u74.b;
                synchronized (cArr) {
                    for (int i = 0; i < digest.length; i++) {
                        int i2 = digest[i] & 255;
                        int i3 = i * 2;
                        char[] cArr2 = AbstractC10296u74.a;
                        cArr[i3] = cArr2[i2 >>> 4];
                        cArr[i3 + 1] = cArr2[i2 & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                this.b.a(kt2);
            }
        }
        synchronized (this.a) {
            this.a.d(interfaceC6098hu1, str);
        }
        return str;
    }
}
