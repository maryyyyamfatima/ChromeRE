package org.chromium.components.signin.base;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class CoreAccountId {
    public final String a;

    public CoreAccountId(String str) {
        this.a = str;
    }

    public String getId() {
        return this.a;
    }

    public final String toString() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CoreAccountId) {
            return this.a.equals(((CoreAccountId) obj).a);
        }
        return false;
    }
}
