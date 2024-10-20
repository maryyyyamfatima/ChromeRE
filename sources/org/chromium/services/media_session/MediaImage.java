package org.chromium.services.media_session;

import android.graphics.Rect;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class MediaImage {
    public final GURL a;
    public final String b;
    public final List c;

    public MediaImage(GURL gurl, String str, List list) {
        this.c = new ArrayList();
        this.a = gurl;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaImage)) {
            return false;
        }
        MediaImage mediaImage = (MediaImage) obj;
        return this.a.equals(mediaImage.a) && TextUtils.equals(this.b, mediaImage.b) && this.c.equals(mediaImage.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public static MediaImage create(GURL gurl, String str, Rect[] rectArr) {
        return new MediaImage(gurl, str, Arrays.asList(rectArr));
    }

    public static Rect createRect(int i, int i2) {
        return new Rect(0, 0, i, i2);
    }
}
