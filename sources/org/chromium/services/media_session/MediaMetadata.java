package org.chromium.services.media_session;

import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class MediaMetadata {
    public String a;
    public String b;
    public String c;

    public static MediaMetadata create(String str, String str2, String str3) {
        return new MediaMetadata(str, str2, str3);
    }

    public MediaMetadata(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaMetadata)) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        return TextUtils.equals(this.a, mediaMetadata.a) && TextUtils.equals(this.b, mediaMetadata.b) && TextUtils.equals(this.c, mediaMetadata.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
