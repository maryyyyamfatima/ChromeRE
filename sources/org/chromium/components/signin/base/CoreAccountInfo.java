package org.chromium.components.signin.base;

import android.accounts.Account;
import defpackage.B4;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class CoreAccountInfo {
    public final CoreAccountId a;
    public final String b;
    public final String c;

    public CoreAccountInfo(CoreAccountId coreAccountId, String str, String str2) {
        this.a = coreAccountId;
        this.b = str;
        this.c = str2;
    }

    public CoreAccountId getId() {
        return this.a;
    }

    public String getEmail() {
        return this.b;
    }

    public String getGaiaId() {
        return this.c;
    }

    public final String toString() {
        return String.format("CoreAccountInfo{id[%s], name[%s]}", getId(), getEmail());
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CoreAccountInfo)) {
            return false;
        }
        CoreAccountInfo coreAccountInfo = (CoreAccountInfo) obj;
        return this.a.equals(coreAccountInfo.a) && this.b.equals(coreAccountInfo.b) && this.c.equals(coreAccountInfo.c);
    }

    public static Account a(CoreAccountInfo coreAccountInfo) {
        if (coreAccountInfo == null) {
            return null;
        }
        return B4.c(coreAccountInfo.getEmail());
    }

    public static String b(CoreAccountInfo coreAccountInfo) {
        if (coreAccountInfo == null) {
            return null;
        }
        return coreAccountInfo.getEmail();
    }
}
