package org.chromium.chrome.browser.password_check;

import J.N;
import defpackage.C11814ya2;
import defpackage.C2392Sk2;
import defpackage.InterfaceC0833Gk2;
import java.util.Iterator;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PasswordCheckBridge {
    public long a = N.MC$M7l1y(this);
    public final C2392Sk2 b;

    public PasswordCheckBridge(C2392Sk2 c2392Sk2) {
        this.b = c2392Sk2;
    }

    public void onCompromisedCredentialsFetched(int i) {
        C2392Sk2 c2392Sk2 = this.b;
        c2392Sk2.d = true;
        Iterator it = c2392Sk2.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC0833Gk2) c11814ya2.next()).b();
            }
        }
    }

    public void onSavedPasswordsFetched(int i) {
        C2392Sk2 c2392Sk2 = this.b;
        c2392Sk2.e = true;
        Iterator it = c2392Sk2.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC0833Gk2) c11814ya2.next()).c();
            }
        }
    }

    public void onPasswordCheckStatusChanged(int i) {
        C2392Sk2 c2392Sk2 = this.b;
        c2392Sk2.f = i;
        Iterator it = c2392Sk2.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC0833Gk2) c11814ya2.next()).a(i);
            }
        }
    }

    public void onPasswordCheckProgressChanged(int i, int i2) {
        Iterator it = this.b.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC0833Gk2) c11814ya2.next()).d(i, i2);
            }
        }
    }

    public static void insertCredential(CompromisedCredential[] compromisedCredentialArr, int i, String str, GURL gurl, String str2, String str3, String str4, String str5, String str6, String str7, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        compromisedCredentialArr[i] = new CompromisedCredential(str, gurl, str2, str3, str4, str5, str6, str7, j, j2, z, z2, z3, z4);
    }
}
