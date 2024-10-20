package org.chromium.chrome.browser.password_manager;

import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PasswordStoreCredential {
    public final GURL a;
    public final String b;
    public final String c;

    public PasswordStoreCredential(GURL gurl, String str, String str2) {
        this.a = gurl;
        this.b = str;
        this.c = str2;
    }

    public GURL getUrl() {
        return this.a;
    }

    public String getUsername() {
        return this.b;
    }

    public String getPassword() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PasswordStoreCredential passwordStoreCredential = (PasswordStoreCredential) obj;
        return this.a.equals(passwordStoreCredential.a) && this.b.equals(passwordStoreCredential.b) && this.c.equals(passwordStoreCredential.c);
    }

    public final String toString() {
        return "PasswordStoreCredential{url=" + this.a.i() + ", username=" + this.b + ", password=" + this.c + '}';
    }
}
