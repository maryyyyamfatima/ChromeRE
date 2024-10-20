package defpackage;

import J.N;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import org.chromium.chrome.browser.cookies.CanonicalCookie;
import org.chromium.chrome.browser.cookies.CookiesFetcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class W80 extends AbstractC0185Bl {
    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        for (Iterator it = ((List) obj).iterator(); it.hasNext(); it = it) {
            CanonicalCookie canonicalCookie = (CanonicalCookie) it.next();
            N.McZsSVxA(canonicalCookie.a, canonicalCookie.b, canonicalCookie.c, canonicalCookie.d, canonicalCookie.e, canonicalCookie.f, canonicalCookie.g, canonicalCookie.h, canonicalCookie.i, canonicalCookie.j, canonicalCookie.k, canonicalCookie.l, canonicalCookie.m, canonicalCookie.n, canonicalCookie.o, canonicalCookie.p);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        DataInputStream dataInputStream;
        Object th;
        IOException e;
        String th2 = "IOException during Cooke Restore";
        String str = "Error restoring cookies.";
        ArrayList arrayList = new ArrayList();
        int i = 1;
        i = 1;
        i = 1;
        i = 1;
        i = 1;
        i = 1;
        i = 1;
        try {
            try {
                Cipher a = ZR.a.a(2);
                if (a != null) {
                    File file = new File(CookiesFetcher.a());
                    if (file.exists()) {
                        dataInputStream = new DataInputStream(new CipherInputStream(new FileInputStream(file), a));
                        try {
                            arrayList = CanonicalCookie.a(dataInputStream);
                            new X80().c(AbstractC0185Bl.f);
                            try {
                                dataInputStream.close();
                            } catch (IOException unused) {
                                AbstractC4851eH1.f("CookiesFetcher", "IOException during Cooke Restore", new Object[0]);
                            } catch (Throwable th3) {
                                AbstractC4851eH1.f("CookiesFetcher", "Error restoring cookies.", th3);
                            }
                        } catch (IOException e2) {
                            e = e2;
                            AbstractC4851eH1.f("CookiesFetcher", "IOException during Cookie Restore", e);
                            str = str;
                            if (dataInputStream != null) {
                                try {
                                    dataInputStream.close();
                                    str = str;
                                } catch (IOException unused2) {
                                    Object[] objArr = new Object[0];
                                    AbstractC4851eH1.f("CookiesFetcher", "IOException during Cooke Restore", objArr);
                                    str = objArr;
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    Object[] objArr2 = {th2};
                                    AbstractC4851eH1.f("CookiesFetcher", "Error restoring cookies.", objArr2);
                                    str = str;
                                    i = objArr2;
                                }
                            }
                            return arrayList;
                        } catch (Throwable th5) {
                            th = th5;
                            AbstractC4851eH1.f("CookiesFetcher", "Error restoring cookies.", th);
                            str = str;
                            if (dataInputStream != null) {
                                try {
                                    dataInputStream.close();
                                    str = str;
                                } catch (IOException unused3) {
                                    Object[] objArr3 = new Object[0];
                                    AbstractC4851eH1.f("CookiesFetcher", "IOException during Cooke Restore", objArr3);
                                    str = objArr3;
                                } catch (Throwable th6) {
                                    th2 = th6;
                                    Object[] objArr4 = {th2};
                                    AbstractC4851eH1.f("CookiesFetcher", "Error restoring cookies.", objArr4);
                                    str = str;
                                    i = objArr4;
                                }
                            }
                            return arrayList;
                        }
                    }
                }
            } catch (IOException e3) {
                dataInputStream = null;
                e = e3;
            } catch (Throwable th7) {
                dataInputStream = null;
                th = th7;
            }
            return arrayList;
        } catch (Throwable th8) {
            if (dataInputStream != null) {
                try {
                    dataInputStream.close();
                } catch (IOException unused4) {
                    AbstractC4851eH1.f("CookiesFetcher", th2, new Object[0]);
                } catch (Throwable th9) {
                    Object[] objArr5 = new Object[i];
                    objArr5[0] = th9;
                    AbstractC4851eH1.f("CookiesFetcher", str, objArr5);
                }
            }
            throw th8;
        }
    }
}
