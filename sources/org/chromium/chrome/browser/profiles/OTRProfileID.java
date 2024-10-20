package org.chromium.chrome.browser.profiles;

import J.N;
import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class OTRProfileID {
    public static final OTRProfileID b = new OTRProfileID("profile::primary_otr");
    public final String a;

    public OTRProfileID(String str) {
        this.a = str;
    }

    public final String getProfileID() {
        return this.a;
    }

    public static String serialize(OTRProfileID oTRProfileID) {
        if (oTRProfileID == null) {
            return null;
        }
        return oTRProfileID.toString();
    }

    public static OTRProfileID a(String str) {
        OTRProfileID deserializeWithoutVerify = deserializeWithoutVerify(str);
        if (deserializeWithoutVerify != null) {
            Profile d = Profile.d();
            if (!N.MQioXkwA(d.b, d, deserializeWithoutVerify)) {
                throw new IllegalStateException("The OTR profile should exist for otr profile id.");
            }
        }
        return deserializeWithoutVerify;
    }

    public static OTRProfileID deserializeWithoutVerify(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new OTRProfileID(str.substring(13, str.length() - 1));
    }

    public final String toString() {
        return String.format("OTRProfileID{%s}", this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OTRProfileID) {
            return this.a.equals(((OTRProfileID) obj).a);
        }
        return false;
    }
}
