package org.chromium.chrome.browser.offlinepages;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ClientId {
    public final String a;
    public final String b;

    public ClientId(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ClientId)) {
            return false;
        }
        ClientId clientId = (ClientId) obj;
        if (clientId.a.equals(this.a)) {
            return clientId.b.equals(this.b);
        }
        return false;
    }

    public final int hashCode() {
        return (this.a + ":" + this.b).hashCode();
    }
}
