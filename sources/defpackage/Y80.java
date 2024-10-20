package defpackage;

import J.N;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import org.chromium.chrome.browser.cookies.CanonicalCookie;
import org.chromium.chrome.browser.cookies.CookiesFetcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Y80 extends AbstractC1649Ms {
    public final /* synthetic */ CanonicalCookie[] h;

    public Y80(CanonicalCookie[] canonicalCookieArr) {
        this.h = canonicalCookieArr;
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        DataOutputStream dataOutputStream;
        CanonicalCookie[] canonicalCookieArr = this.h;
        try {
            try {
                Cipher a = ZR.a.a(1);
                if (a != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    dataOutputStream = new DataOutputStream(new CipherOutputStream(byteArrayOutputStream, a));
                    try {
                        CanonicalCookie.b(dataOutputStream, canonicalCookieArr);
                        dataOutputStream.close();
                        N.MsOKBrZ5(CookiesFetcher.a(), byteArrayOutputStream.toByteArray());
                    } catch (IOException unused) {
                        AbstractC4851eH1.f("CookiesFetcher", "IOException during Cookie Fetch", new Object[0]);
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.close();
                            } catch (IOException unused2) {
                                AbstractC4851eH1.f("CookiesFetcher", "IOException during Cookie Fetch", new Object[0]);
                            }
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        AbstractC4851eH1.f("CookiesFetcher", "Error storing cookies.", th);
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.close();
                            } catch (IOException unused3) {
                                AbstractC4851eH1.f("CookiesFetcher", "IOException during Cookie Fetch", new Object[0]);
                            }
                        }
                        return null;
                    }
                }
            } catch (IOException unused4) {
                dataOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = null;
            }
            return null;
        } catch (Throwable th3) {
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.close();
                } catch (IOException unused5) {
                    AbstractC4851eH1.f("CookiesFetcher", "IOException during Cookie Fetch", new Object[0]);
                }
            }
            throw th3;
        }
    }
}
