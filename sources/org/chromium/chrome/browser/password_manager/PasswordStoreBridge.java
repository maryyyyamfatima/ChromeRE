package org.chromium.chrome.browser.password_manager;

import J.N;
import defpackage.C10069tU2;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import java.util.Iterator;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PasswordStoreBridge {
    public int c = -1;
    public long a = N.MgZAkbOC(this);
    public final C12157za2 b = new C12157za2();

    public static PasswordStoreCredential createPasswordStoreCredential(GURL gurl, String str, String str2) {
        return new PasswordStoreCredential(gurl, str, str2);
    }

    public final void passwordListAvailable(int i) {
        this.c = i;
        Iterator it = this.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((C10069tU2) c11814ya2.next()).h();
            }
        }
    }

    public final void onEditCredential(PasswordStoreCredential passwordStoreCredential) {
        Iterator it = this.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((C10069tU2) c11814ya2.next()).getClass();
            }
        }
    }

    public static void insertCredential(PasswordStoreCredential[] passwordStoreCredentialArr, int i, GURL gurl, String str, String str2) {
        passwordStoreCredentialArr[i] = new PasswordStoreCredential(gurl, str, str2);
    }
}
